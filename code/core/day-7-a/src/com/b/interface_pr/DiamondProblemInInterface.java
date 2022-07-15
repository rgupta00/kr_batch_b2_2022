package com.b.interface_pr;

interface X {
	default void foo() {
		System.out.println("default of foo in X");
	}
}

interface Y {
	default void foo() {
		System.out.println("default of foo in Y");
	}
}

class C implements X, Y {

	@Override
	public void foo() {
		X.super.foo();
		Y.super.foo();
	}

}

public class DiamondProblemInInterface {

	public static void main(String[] args) {

	}

}
