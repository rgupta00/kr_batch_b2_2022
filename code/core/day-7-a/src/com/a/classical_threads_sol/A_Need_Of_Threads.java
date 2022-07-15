package com.a.classical_threads_sol;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

//-----to read details of file to downlaod----
// file donwload manager 


public class A_Need_Of_Threads {

	public static void main(String[] args) {
		List<String>photoUrl= FileUtil.readFile("download.txt");
		for(String url: photoUrl) {
			FIleDownloaderTask task=new FIleDownloaderTask(url);
			Thread thread=new Thread(task);
			thread.start();
		}
	}
}
