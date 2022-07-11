package com.day3.session2.exception_handling;
import java.util.*;
import java.io.*;//Decorator dp*

public class B_DemoCheckedEx {

	public static void main(String[] args) {
		// FileHanding: u want to read a file
		Set<String> words= new LinkedHashSet<String>();
		
		BufferedReader br =null;
		try {
			 br = new BufferedReader(new FileReader(new File("data.txt")));
			// let we print all the stuff
			String line = null;
			while ((line = br.readLine()) != null) {
					String tokens[]=line.split(" ");
					for(String token: tokens) {
						words.add(token.toLowerCase());
					}
			}

		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		} catch (IOException e) {
			System.out.println("some io ex");
		}
		finally {
			if(br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		System.out.println("-------all unique words--------");
		for(String word: words) {
			System.out.println(word);
		}
	}

}
