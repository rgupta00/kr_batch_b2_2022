package com.b.doubts2;

import java.util.Scanner;

public class BinarySearch {
	static int Search(int a[], int n, int key) {
		int start = 0;
		int end = n - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (a[mid] == key) {
				return mid;
			} else if (a[mid] < key) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		for (int j = 0; j < t; j++) {
			int n;
			n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			int key = sc.nextInt();
//            sc.close();
			int result = Search(a, n, key);
			if (result == -1) {
				System.out.println("Not Found");
			} else {
				System.out.println("Found");
			}
		}

	}
}