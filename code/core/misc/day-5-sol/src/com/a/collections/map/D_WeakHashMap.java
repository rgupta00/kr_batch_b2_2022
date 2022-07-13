package com.a.collections.map;

import java.util.*;

class Key {
	private int k;

	public Key(int k) {
		this.k = k;
	}

	public int getK() {
		return k;
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("finalize is called...");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Key [k=").append(k).append("]");
		return builder.toString();
	}

	
}

public class D_WeakHashMap {

	public static void main(String[] args) throws InterruptedException {
		//WeakHashMap
		HashMap<Key, String>map=new HashMap<Key, String>();
		Key key=new Key(22);
		map.put(key, "22");
		key=null;
		System.gc();
		Thread.sleep(2000);
		
		System.out.println(map);
	}
}
