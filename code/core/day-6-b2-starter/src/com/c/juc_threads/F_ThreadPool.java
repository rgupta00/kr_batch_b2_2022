package com.c.juc_threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Runnable vs Callable
class CpuIntensiveJob implements Runnable{

	@Override
	public void run() {
		System.out.println("cpu intensive job...");
	}
	
}
public class F_ThreadPool {
	
	public static void main(String[] args) {
		int noOfCors= Runtime.getRuntime().availableProcessors();
		
		ExecutorService executorService=Executors.newFixedThreadPool(noOfCors);
		
		for(int i=0;i<100;i++) {
			executorService.execute(new CpuIntensiveJob());
		}
		
		executorService.shutdown();
		
		/* cpu bound process and io bound process?
		 * Fixed Thread poool
		 * cached thread....
		 * schedule thread pool
		 * single therad pool
		 * fork and join thread pool
		 * 
		 */
	}

}
