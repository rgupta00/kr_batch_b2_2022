package com.day1.session1.ex1;

import java.util.Comparator;

@FunctionalInterface
interface Foof {

	void foo();


	default void bar() {
		System.out.println("default bar");
	}

	static void barStatic() {
		System.out.println("barStatic bar");
	}

}

@FunctionalInterface
interface Cal{
	public int add(int a, int b);
}

public class DemoFuncationalInterface {

	public static void main(String[] args) {

		Cal cal=(a, b)-> a+b;
		
			
		
		
		
		
		
		// What is functional interface? SAM (single abstract method )

		//lamabda is suppored by funcation interface
		
		//java 8----> Java 9 ---> "type inference"
		
		Runnable runnable=() ->System.out.println("run method of runnable");
			
		Foof f=() ->System.out.println("foo of Foo");
			
		Comparator<String> comparator=( o1,  o2)-> o1.compareTo(o2);
			
		
		
		
		
		
		/*
		 * What is functional interface?
		 * 
		 * @FunctionalInterface Interface and diamond problem and solution Interface
		 * evolution: default method , static method examples
		 */
	}
}
