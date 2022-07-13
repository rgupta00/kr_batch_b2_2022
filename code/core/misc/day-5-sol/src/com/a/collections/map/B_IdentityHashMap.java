package com.a.collections.map;

import java.util.IdentityHashMap;

public class B_IdentityHashMap {
	
	public static void main(String[] args) {
		//IdentityHash vs Normal Map
		
		Integer it1=10;
		Integer it2=10;
		
		IdentityHashMap<Integer, String>map=new IdentityHashMap<Integer, String>();
		map.put(it1, "raj");
		map.put(it2, "manoj");
		
		System.out.println(map);
		
		
		
	}

}
