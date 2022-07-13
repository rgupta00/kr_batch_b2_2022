package com.a.classical_threads;
//Job and worker analogy 
//Thread and Runnable
 class MyJob implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is running");
	}
	 
 }
public class A_CreatingThread_Extending_Thread_Class {
	
	public static void main(String[] args) {
		System.out.println("main is started");
		MyJob job=new MyJob();
		Thread thread=new Thread(job,"A");
		thread.start();
		System.out.println("main is end");
	}

}
