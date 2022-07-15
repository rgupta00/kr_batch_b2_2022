package com.c.juc_threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Factorial implements Callable<Long> {
	long n;

	public Factorial(long n) {
		this.n = n;
	}

	@Override
	public Long call() throws Exception {
		if (n < 0)
			throw new IllegalArgumentException("input correct value");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		long fact = 1;
		for (long i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

}

public class E_Thread_Pool {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable<Long> task = new Factorial(5);
		ExecutorService es = Executors.newSingleThreadExecutor();

		// Promises in ui
		System.out.println("**************");
		Future<Long> future = es.submit(task);
		System.out.println("**************");
		long result=future.get();
		System.out.println("^^^^^^^^^^^^^");
		System.out.println(result);
		
		es.shutdown();

	}
}