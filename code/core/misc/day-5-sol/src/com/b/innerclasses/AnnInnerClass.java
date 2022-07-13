package com.b.innerclasses;

interface Cookable {
	public void cook();
}

public class AnnInnerClass {

	public static void main(String[] args) {
		
		
		Cookable cookable3 =() ->{
				System.out.println("hotel food :)");
		
		};

		Cookable cookable4 =() ->System.out.println("hotel food :)");
	
		cookable3.cook();
	
//		
//		
//		
//		Cookable cookable = new Cookable() {
//
//			@Override
//			public void cook() {
//				System.out.println("hotel food :)");
//			}
//		};
//
//		Cookable cookable2 = new Cookable() {
//
//			@Override
//			public void cook() {
//				System.out.println("home food :)");
//			}
//		};

	}
}
