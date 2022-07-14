package com.f.generics2;

public class I_GenericsStack {

	public static void main(String[] args) {
		Employee e1 = new Employee(121, "ravi", 800000);
		Employee e2 = new Employee(11, "ekta", 830000);
		Employee e3 = new Employee(921, "gunika", 900000);

		//      "Class"
		
		Stack<Employee> stack = new Stack<>(Employee.class);
		stack.push(e1);
		stack.push(e2);
		stack.push(e3);


		System.out.println(stack.pop());
		System.out.println(stack.pop());

		System.out.println(stack.pop());

		
		
		
//		Stack<Integer> stack = new Stack<Integer>(Integer.class);
//		stack.push(22);
//		stack.push(2);
//		stack.push(220);
//
//		stack.push(212);
//
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//
//		System.out.println(stack.pop());
//
//		System.out.println(stack.pop());

	}
}
