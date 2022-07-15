package com.c.juc_threads;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

//BlockingQueue ise mordern ways to solve P and C
public class C_Blocking_Queue {
	// better way to handler P and C problem wait notify
	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

	public static void main(String[] args) {

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		thread1.start();
		thread2.start();
		
	}

	 static void consumer() throws InterruptedException {
		while(true) {
			Thread.sleep(100);
			Integer val= queue.take();
			System.out.println(val+": "+ queue.size());
		}
	}

	static void produce() throws InterruptedException {
		Random random = new Random();
		while (true) {
			queue.put(random.nextInt(100));
		}
	}

}
