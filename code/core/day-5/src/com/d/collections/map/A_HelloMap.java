package com.d.collections.map;
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
		
		//how to iterate 
		//System.out.println(map);
//		Set<Entry<String, Integer>> entrySet = map.entrySet();
//		Iterator<Entry<String, Integer>> it = entrySet.iterator();
//		while(it.hasNext()) {
//			Entry<String, Integer> entry= it.next();
//			System.out.println(entry.getKey()+" : "+ entry.getValue());
//		}
		
		//why the performace of entryset is better the keySet *Arch of hashmap
		//entrySet
		System.out.println("--------entryset-----");
		Set<Entry<String, Integer>> entrySet= map.entrySet();
		for(Entry<String, Integer> e: entrySet) {
			System.out.println(e.getKey() + " : "+ e.getValue());
		}
		
		//keyset
		System.out.println("--------keyset-----");
		Set<String> keySet = map.keySet();
		for(String key: keySet) {
			System.out.println(key + " : "+ map.get(key));
		}
	}

}







