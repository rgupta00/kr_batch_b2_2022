package com.day3.session2.exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_NeedOfExceptionHandling {

	public static void main(String[] args) {
		// robust
		Scanner scanner = null;
		try {
			int a, b, c;
			scanner = new Scanner(System.in);
			System.out.println("PE value of a");
			a = scanner.nextInt();
			System.out.println("PE value of b");
			b = scanner.nextInt();

			c = a / b;

			System.out.println(c);

		} catch (ArithmeticException ex) {
			System.out.println("arithmatic ex...");

		} catch (InputMismatchException ex) {
			System.out.println("input mis ex");

		} finally {
			scanner.close();
		}

		System.out.println("hello");

	}
}
