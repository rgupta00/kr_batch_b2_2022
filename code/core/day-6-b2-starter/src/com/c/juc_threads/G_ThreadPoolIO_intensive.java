package com.c.juc_threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Runnable vs Callable
class IoIntensiveJob implements Runnable{

	@Override
	public void run() {
		System.out.println("cpu intensive job..."+ Thread.currentThread().getName());
	}
	
}
public class G_ThreadPoolIO_intensive {
	
	public static void main(String[] args) {
		
		ExecutorService executorService=Executors.newFixedThreadPool(100);
		
		for(int i=0;i<100;i++) {
			executorService.execute(new IoIntensiveJob());
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
