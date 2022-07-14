package com.c.collections.dont_do;

import java.util.*;

//immtable 
class Key implements Comparable<Key>{
	private int k;

	public Key(int k) {
		super();
		this.k = k;
	}

	public int getK() {
		return k;
	}

	@Override
	public String toString() {
		return "Key [k=" + k + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + k;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		if (k != other.k)
			return false;
		return true;
	}

	@Override
	public int compareTo(Key o) {
		return Integer.compare(this.getK(), o.getK());
	}

}

public class A_HashMapUserDefineKey {

	public static void main(String[] args) {
		HashSet<Key>hashset=new HashSet<Key>();
		hashset.add(new Key(44));
		System.out.println(hashset.contains(new Key(44)));
		
//		Map<Key, Integer> map = new TreeMap<Key, Integer>();
//		map.put(new Key(3399), 3399);
//		map.put(new Key(303), 303);
//		
//		System.out.println(map.get(new Key(303)));

	}

}
