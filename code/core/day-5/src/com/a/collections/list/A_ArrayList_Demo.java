package com.a.collections.list;
import java.util.*;
/*
 * List: AL, LL, Vector
 * java 5: generics
 */
public class A_ArrayList_Demo {

	public static void main(String[] args) {
		//"generic is a compile time safty net"
		
		List<String>list=new LinkedList<>();		//create ur own groable array
		list.add("foo");
		list.add("bar");
		list.add("jar");
		System.out.println(list.get(2));
		
		Iterator<String> it=list.iterator();
		System.out.println(list);
		it.next();
		it.remove();
		it.next();
		it.remove();
		
		System.out.println(list);
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		
		
		
		
		//iterator design pattern "head first design pattern"
		
		//iterate/delete		curd op, rev iteation
		//Iterator vs ListIterator : cursor to iterate it

		
//		ListIterator<String> it=list.listIterator(list.size());
//		while(it.hasPrevious()) {
//			System.out.println(it.previous());
//		}
//		
		//how to print it?==> syntex suger
//		for(String temp: list) {
//			System.out.println(temp);
//		}
		
		
	}
}
