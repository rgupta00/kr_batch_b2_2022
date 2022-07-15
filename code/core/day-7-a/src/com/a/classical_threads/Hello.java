package com.a.classical_threads;

public class Hello {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		//file io
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			
		}
		System.out.println(Thread.currentThread());
	}

}
