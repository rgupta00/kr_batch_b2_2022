package com.d.collections.map;
import java.util.*;
import java.util.Map.Entry;
public class A_HelloMap {
	
	public static void main(String[] args) {
		//perfromace diff: bw Hashtable and hashmap ?
		//HM, LHM, TM
		Map<String, Integer>map=new TreeMap<String, Integer>();
		
		map.put("raj", 90);
		map.put("raj", 95);
		map.put("car", 100);
		map.put("sumit", 78);
		map.put("ekta", 91);
		map.put("gunika", 99);
		
		System.out.println(map);
		//how to iteate through map? entryset and keyset
		
//		Set<Entry<String, Integer>> entrySet = map.entrySet();
//		
//		for(Entry<String, Integer> entry: entrySet) {
//			System.out.println(entry.getKey() +" : "+ entry.getValue());
//		}
		
		Set<String> keySet = map.keySet();
		
		for(String key: keySet) {
			System.out.println(key+": "+ map.get(key));
		}
		
		
		//O(1)---HashMap----------------- O(N)
		
		//map.forEach((k,v)-> System.out.println(k+" : "+ v));
		
	}

}







