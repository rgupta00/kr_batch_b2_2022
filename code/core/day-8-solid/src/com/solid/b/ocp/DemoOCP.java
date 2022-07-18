package com.solid.b.ocp;

import java.util.Collections;

//O:OCP: 
 class Calculator{
	int add ( int a , int b) {
		return a+b;
	}
	int multiply ( int a , int b) {
		return a*b;
	}
	int divide ( int a , int b) {
		return a/b;
	}
}
public class DemoOCP {

	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		System.out.println(calculator.add(2, 2));
		
		//Collections.sort(list);
	}
}
