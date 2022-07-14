package com.a.classical_threads_sol;

class DownloadManager {
	public static void download(String url) {
		System.out.println(Thread.currentThread().getName()+" is stated downlading "+ url);
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
		
		System.out.println(Thread.currentThread().getName()+" is done downlading "+ url);
	}
}
