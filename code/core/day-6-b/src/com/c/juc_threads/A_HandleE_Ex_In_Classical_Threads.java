package com.c.juc_threads;

import java.io.IOException;
import java.lang.Thread.UncaughtExceptionHandler;
//u can not throw checked ex...only trick is to wrap into unchecked ex and  throw
//how to handle ex in classical thread
class MyJob implements Runnable {

	@Override
	public void run() {
		// u can not throw checked ex...only trick is to wrap into unchecked ex and
		// throw
	}

}

public class A_HandleE_Ex_In_Classical_Threads {

	public static void main(String[] args) {
		MyJob job = new MyJob();
		Thread thread = new Thread(job,"A");
		Thread thread2 = new Thread(job,"B");
		
		thread.start();
		thread2.start();
		try {
			Thread.sleep(10000);
		} catch (Exception e) {

		}
		System.out.println("end");
	}
}
