package com.b.classical_threads2;

public class C_DemoDeadLock {
	public static void main(String[] args) {
		final Object resource1 = "resource1";
		final Object resource2 = "resource2";

		// Thread dump analysis: jstack pid> dump.txt
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (resource1) {
					System.out.println("t1 get lock on r1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
					synchronized (resource2) {
						System.out.println("t1 get lock in r2");
					}
				}
			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (resource2) {
					System.out.println("t2 get lock on r2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
					synchronized (resource1) {
						System.out.println("t2 get lock in r1");
					}
				}
			}
		});
		thread1.start();
		thread2.start();

	}

}
