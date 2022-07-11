package com.day3.session1.e.mcq;
//kapil --> 
abstract class A{
	public abstract void foo() ;
}

//amit--
abstract class B extends A{
	public abstract void bar() ;
}

//ravi
  class C extends B{

	@Override
	public void foo() {
		System.out.println("foo implemented by class C");
	}

	@Override
	public void bar() {
		System.out.println("bar implemented by class C");
	}
	
}



public class DemoExp {
	public static void main(String[] args) {
		
	}
}
