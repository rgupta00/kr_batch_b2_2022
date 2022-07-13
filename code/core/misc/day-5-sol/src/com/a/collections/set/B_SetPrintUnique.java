package com.a.collections.set;

import java.util.*;
import java.io.*;

public class B_SetPrintUnique {

	public static void main(String[] args) {
		// we wnat to print all unique words from a file in sorted order
		Set<String> set = new TreeSet<>();
		// 1. read the file ==> make token of each line==> put into set
		try {
			BufferedReader br = new BufferedReader(new FileReader("ali.txt"));
			String line = null;
			while ((line = br.readLine()) != null) {
				String []tokens=line.split(" ");//regex
				for(String token: tokens) {
					set.add(token.toLowerCase());
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		//2. print it
		
		for(String token: set) {
			System.out.println(token);
		}

	}
}
