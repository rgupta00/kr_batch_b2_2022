package com.day3.session1.a.oo;
//compile time per resolve hota hey: fast : not that flexiable

class Cal {
	static double add(int a, double b) {
		System.out.println("static double add(int a, double b)");
		return a + b;
	}

	static double add(double a, int b) {
		System.out.println("static int add(double a, int b)");
		return a + b;
	}

//	static int add(int a, int b, int c) {
//		System.out.println("static int add(int a, int b, int c)");
//		return a + b + c;
//	}
}
public class F_FuncationOverloading {
	public static void main(String[] args) {
		double sum = Cal.add(2, 23.5);
	}
}
