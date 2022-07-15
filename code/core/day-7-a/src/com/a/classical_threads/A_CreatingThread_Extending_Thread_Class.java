package com.a.classical_threads;
//Job and worker analogy 

//Thread and Runnable

class MyJob implements Runnable {

	@Override
	public void run() {
		System.out.println("job is started: " + Thread.currentThread().getName());
		try {
			Thread.sleep(1000);// wait vs sleep ?
		} catch (InterruptedException e) {
		}
		System.out.println("job is finished: " + Thread.currentThread().getName());
	}
}

public class A_CreatingThread_Extending_Thread_Class {

	public static void main(String[] args) {
		System.out.println("main is started");
		
		MyJob job = new MyJob();

		Thread t1 = new Thread(job, "A");

		Thread t2 = new Thread(job, "B");

		t1.start();
		t2.start();
		
		try {
			t1.join(10000);
			//t1 is saying to the current thread Main : join after me
			t2.join(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main is end");
	}

}
