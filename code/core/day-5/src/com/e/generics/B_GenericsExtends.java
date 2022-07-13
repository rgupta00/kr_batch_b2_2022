package com.e.generics;
import java.util.*;
public class B_GenericsExtends {

	public static void main(String[] args) {
		//<? extends xxx>
		//<? super xxx>
		
		List<Integer> list=new ArrayList<>();
		list.add(44);
		list.add(4);
		list.add(64);
		list.add(7);
		
		List<Double> dlist=new ArrayList<>();
		dlist.add(44.99);
		dlist.add(4.8);
		dlist.add(64.3);
		dlist.add(7.4);
		
		printList(list);
		
		
		printList(dlist);
		
		List<String> stringlist=new ArrayList<>();
		stringlist.add("foo");
		stringlist.add("bar");
		
		
		printList(list);
		printList(stringlist);
		
	}
	//NO POLYMOR... IS SUPPPRTED BY GENERICS THEN : extends
	// Extends--->Producer or print the data
	
	static  void printList(List<? extends Object> list) {
		
		for(Object temp: list) {
			System.out.println(temp);
		}
	}

//static  void printList(List<?> list) {
//		
//		for(Object temp: list) {
//			System.out.println(temp);
//		}
//	}


}











