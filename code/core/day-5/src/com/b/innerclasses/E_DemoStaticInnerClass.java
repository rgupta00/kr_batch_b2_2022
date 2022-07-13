package com.b.innerclasses;

class X{
	private static int i=77;
	
	static class Y{
		void foo() {
			System.out.println("hello"+ i);
		}
	}
	
	public static void foof() {
		Y y=new Y();
		y.foo();
	}
}

public class E_DemoStaticInnerClass {

}
