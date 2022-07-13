package com.b.innerclasses;

class A{
	
	void foo() {
		int i=9;// effectivly final
		class B {
			void fooB() {
				System.out.println("fooB"+i);
				//i++;
			}
		}
		
		B b=new B();
		b.fooB();
	}
}

public class C_MethodLocalInnerClass {
	
	public static void main(String[] args) {
		
	}

}
