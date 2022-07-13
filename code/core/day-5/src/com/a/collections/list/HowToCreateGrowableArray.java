package com.a.collections.list;

class MyArr {
	private int arr[];
	private int size = 10;
	private int index = 0;

	public MyArr() {
		size = 10;
		arr = new int[10];
	}

	public void add(int data) {
		if (index < size) {
			arr[index++] = data;
		}else {
			///
		}
		
	}
}

public class HowToCreateGrowableArray {

}
