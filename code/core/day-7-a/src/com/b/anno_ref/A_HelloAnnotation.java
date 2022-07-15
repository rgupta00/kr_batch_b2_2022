package com.b.anno_ref;
import java.util.*;

class A{
	void itIsAVerySimpleMethod() {
		System.out.println("itIsAVerySimpleMethod....");
	}
	//Hey DONT USE IT 
	@Deprecated
	void oldApi() {
		System.out.println("old and gray code...");
	}
	
	
	void someRandomStuff() {
		
		@SuppressWarnings("rawtypes")
		List list=new ArrayList();
		list.add("foo");
	}
}
class B extends A {
	@Override
	void itIsAVerySimpleMethod() {
		System.out.println("itIsAVerySimpleMethod is overriden...");
	}
}
public class A_HelloAnnotation {

	public static void main(String[] args) {
		//What is annotation? why i should care about it
		A a=new B();
		a.itIsAVerySimpleMethod();
		a.oldApi();
	}
}
