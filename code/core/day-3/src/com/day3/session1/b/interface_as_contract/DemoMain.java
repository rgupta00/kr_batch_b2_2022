package com.day3.session1.b.interface_as_contract;

public class DemoMain {

	public static void main(String[] args) {
		
		Stack stack=new RaviStack();
		
		someInternalLogic(stack);
	}
	
	public static void someInternalLogic(Stack stack) {
		
		stack.push(44);
		stack.push(404);
		stack.push(64);
		stack.push(4);
		stack.push(41);
	
		
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
	}

}
