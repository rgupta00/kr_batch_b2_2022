package com.a.collections.map;
import java.util.*;
import java.util.Map.Entry;
public class A_HelloMap {
	
	public static void main(String[] args) {
		//perfromace diff: bw Hashtable and hashmap ?
		//HM, LHM, TM
		Map<String, Integer>map=new HashMap<String, Integer>();
		
		map.put("raj", 90);
		map.put("raj", 95);
		map.put(null, 100);
		map.put("sumit", 78);
		map.put("ekta", 91);
		map.put("gunika", 99);
		
		//can i use iterator for map :NO
		//System.out.println(map);
		
		//keySet vs entrySet
		
		//-------------1 way
//		Set<String> keySet = map.keySet();
//		
//		for(String key: keySet) {
//			System.out.println(key +" : "+ map.get(key));
//		}
		
		//-------------2 way
//		Set<Entry<String, Integer>> entrySet = map.entrySet();
//		for(Entry<String, Integer> entry: entrySet) {
//			System.out.println(entry.getKey() +" : "+ entry.getValue());
//		}
		
		//------3 way
		
		map.forEach((x,y)->System.out.println(x+": "+ y));
	}

}







