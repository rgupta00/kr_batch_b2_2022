package com.assignment;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;
public class A_Freq {
	
	public static void main(String[] args) {
		//to print word --> fred
		/*
		 * i love java java love me java
		 * i comes 1 time
		 * love come 2 time
		 *....
		 */
		Map<String, Integer>map=new HashMap<String, Integer>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("ali.txt"));
			String line = null;
			while ((line = br.readLine()) != null) {
				String []tokens=line.split(" ");
				for(String token: tokens) {
					
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}







