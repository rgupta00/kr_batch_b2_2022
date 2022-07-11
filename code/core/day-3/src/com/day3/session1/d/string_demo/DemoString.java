package com.day3.session1.d.string_demo;
import java.util.*;
public class DemoString {

	public static void main(String[] args) {
		//What u should avoid
		String data="a"+"b"+"c";//bad code
		//Builder design pattern : design pattern
		
		String data2=new StringBuilder().append("a").append("b").append("c").toString();
		
		System.out.println(data2);
				
		
		//immutable		mutable
		//tp			X
		//String		StringBuilder 	vs StringBuffer
							//java 1.5				//TS syn
		
		
		
		
//		List<String> list=new ArrayList<String>();//growable array!
//		String data="foo";
//		
//		list.add(data);
		
		
		//to compare the contents
//		
		String a = "foo";
		String b =new String("foo");
		if (a.equals(b)) {
			System.out.println("same content");
		} else
			System.out.println("not same");
		
		
		//to check the address
//		String a = "foo";
//		String b ="foo";// new String("foo");
//		if (a == b) {
//			System.out.println("both have same internel address");
//		} else
//			System.out.println("not same");
	}

}
