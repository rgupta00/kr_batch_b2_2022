package com.c.juc_threads;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.Thread.UncaughtExceptionHandler;

//u can not throw checked ex...only trick is to wrap into unchecked ex and  throw
//how to handle ex in classical thread
class MyJob implements Runnable {

	@Override
	public void run() {
		// file handing code
		if (1 == 1)
			throw new RuntimeException(new FileNotFoundException());
	}

}

class ExceptionHandler implements UncaughtExceptionHandler {
	@Override
	public void uncaughtException(Thread thread, Throwable e) {
		System.out.println(thread + ": " + e);
	}
}

public class A_HandleE_Ex_In_Classical_Threads {

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {

			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println(t + ": " + e+" default wala");
			}
		});
		
		
		MyJob job = new MyJob();
		Thread thread = new Thread(job, "A");

		thread.setUncaughtExceptionHandler(new ExceptionHandler());
		thread.start();

		Thread thread2 = new Thread(job, "A");

		thread.start();

		System.out.println("end");
	}
}
