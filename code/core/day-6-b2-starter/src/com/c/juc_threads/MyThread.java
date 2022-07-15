package com.c.juc_threads;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyThread extends Thread {

	static CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		list.add("D");
	}

	public static void main(String[] args) throws InterruptedException {

		list.add("A");
		list.add("B");
		list.add("C");

		MyThread thread = new MyThread();
		thread.start();

		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			Thread.sleep(3000);
			
		}
		System.out.println("------------------");
		System.out.println(list);
	}

}
