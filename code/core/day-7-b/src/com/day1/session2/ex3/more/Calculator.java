package com.day1.session2.ex3.more;
interface Operation{
	public int apply(int a, int b);
}
//OCP
public class Calculator {
	public static int applyOp(int a, int b, Operation operation) {
		return operation.apply(a, b);
	}
	
}
