package com.day3.session1.b.interface_as_contract;

public class DemoMain {

	public static void main(String[] args) {
		
		RaviStack stack=new RaviStack();
		
		someInternalLogic(stack);
	}
	
	public static void someInternalLogic(RaviStack stack) {
		
		stack.raviPush(44);
		stack.raviPush(404);
		stack.raviPush(64);
		stack.raviPush(4);
		stack.raviPush(41);
	
		
		
		System.out.println(stack.raviPop());
		System.out.println(stack.raviPop());
		System.out.println(stack.raviPop());
		System.out.println(stack.raviPop());
		System.out.println(stack.raviPop());
		
		
	}

}
