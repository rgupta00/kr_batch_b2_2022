package com.c.juc_threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

//can u make a normal hm thread safe
public class H_NeedOfBetterThreadSafeDS {
	public static void main(String[] args) {
		//Vector, Hashtable
		//Map<String, Integer>map=Collections.synchronizedMap(new HashMap<String, Integer>());
		//List<String> list=Collections.synchronizedList(new ArrayList<>());
		
		//ConcurrentModificationException: "fail fast ds"
		
		
		
		//Use specilized java 5 thread safe ds...
		ConcurrentHashMap<String, Integer>map=new ConcurrentHashMap<String, Integer>();

		//CopyOnWriteArrayList<String> list=new CopyOnWriteArrayList<String>();
		
		//
		
	}
}







