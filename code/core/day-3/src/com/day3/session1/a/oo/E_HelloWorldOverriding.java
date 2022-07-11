package com.day3.session1.a.oo;

class A {
	void foo() {
		System.out.println("method of base class");
	}
}

class B extends A {
	@Override	//* annoation
	void foo() {
		System.out.println("method of drived class");
	}

}

public class E_HelloWorldOverriding {

	public static void main(String[] args) {
		A a=new B();
		a.foo();
	}

}
