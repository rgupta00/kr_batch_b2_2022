package com.b.innerclasses;
interface Cookable{
	void cook();
}
public class D_AnnInnerClass {
	
	public static void main(String[] args) {
		
		Cookable cookable=new Cookable() {
			@Override
			public void cook() {
				System.out.println("street food ...");
			}
		};
		cookable.cook();
		
		//lamda expression========== Java 8 stream processing: declaritive data procssing FI
		
		//most of the time u can replace ann inner class lambda (dont think it is a syntex suger)
		
		Cookable cookable2=() -> System.out.println("street food ...");
			
		
		cookable2.cook();
		
		
		
//		Cookable cookable2=new Cookable() {
//			@Override
//			public void cook() {
//				System.out.println("hotel food ...");
//			}
//		};
//		cookable2.cook();
//		
//		Cookable cookable3=new Cookable() {
//			@Override
//			public void cook() {
//				System.out.println("home food ...");
//			}
//		};
//		cookable3.cook();
	}

}
