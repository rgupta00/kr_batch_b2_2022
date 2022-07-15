package com.a.classical_threads_sol;

public class FIleDownloaderTask implements Runnable {
	private String url;

	public FIleDownloaderTask(String url) {
		this.url = url;
	}

	@Override
	public void run() {
		DownloadManager.download(url);
	}

}
