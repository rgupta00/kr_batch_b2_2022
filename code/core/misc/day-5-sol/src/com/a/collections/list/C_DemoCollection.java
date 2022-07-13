package com.a.collections.list;
import java.util.*;

public class C_DemoCollection {

	public static void main(String[] args) {
		
		List<Integer>  list=new ArrayList<Integer>();
		
		list.add(55);
		list.add(5);
		list.add(8);
		list.add(90);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
	}
}
