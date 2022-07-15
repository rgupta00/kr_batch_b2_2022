package com.b.interface_pr;
// interface evaluation
interface ImpContract {
	void foo();
	
	public static void fooStatic() {
		System.out.println("inteface can have static method");
	}
	
	default void bar() {
		System.out.println("bar default method ");
	}
}

class UKG implements ImpContract {
	@Override
	public void foo() {
		System.out.println("UKG imp...");
	}

	public void bar() {
		System.out.println("bar default method ");
	}
}

abstract class Ibm implements ImpContract {
	public abstract void bar();
	
	@Override
	public void foo() {
		System.out.println("ibm imp...");
	}

}

public class InterfaceIsTooRigid {

	public static void main(String[] args) {

	}

}
