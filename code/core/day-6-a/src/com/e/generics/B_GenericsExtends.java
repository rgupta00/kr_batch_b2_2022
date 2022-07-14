package com.e.generics;

import java.util.*;

public class B_GenericsExtends {

	public static void main(String[] args) {
		// <? extends xxx>
		// <? super xxx>

		List<Integer> list = new ArrayList<>();
		list.add(44);
		list.add(4);
		list.add(64);
		list.add(7);

		printList(list);
		
		List<Double> dlist = new ArrayList<>();
		dlist.add(44.99);
		dlist.add(4.8);
		dlist.add(64.3);
		dlist.add(7.4);

		printList(dlist);
		
		List<String> slist = new ArrayList<>();
		slist.add("foo");
		slist.add("bar");
		
		printList(slist);

	}
	//List<?> list === List<? extends Object> list
	
	static void printList(List<?> list) {
		//u can only print the list can not change it
		//list.add("foo");
		for (Object temp : list) {
			System.out.println(temp);
		}
	}
	
	
	//<? extends xxx>
//	static void printList(List<? extends Object> list) {
//		//u can only print the list can not change it
//		//list.add("foo");
//		for (Object temp : list) {
//			System.out.println(temp);
//		}
//	}

}
