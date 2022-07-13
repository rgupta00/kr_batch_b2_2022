package com.f.generics2;

public class I_GenericsStack {

	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<Integer>(Integer.class);
		
		stack.push(33);
		
		
		Stack<Employee> stack2=
				new Stack<Employee>(Employee.class);
		stack2.push(new Employee(0, null, 0));
	}
}
