package com.day1.session2.ex3.more;

public class CalculatorApp {
	
	public static void main(String[] args) {
		
		Operation addMul=(a, b)-> a*b;
		
		int sum= Calculator.applyOp(2, 4, addMul);
		System.out.println(sum);
		
	}

}
