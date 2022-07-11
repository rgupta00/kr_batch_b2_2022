package com.day3.session1.d.string_demo;

public class DemoString2 {
	public static void main(String[] args) {

		// Split method

		String data = "Muhammad Ali born Cassius Marcellus Clay was an American professional boxer and activist. Nicknamed The Greatest he is regarded as one of the most significant sports figures of the 20th century, and is frequently ranked as the greatest heavyweight boxer of all time he was named Sportsman of the Century by Sports Illustrated and the Sports Personality of the Century by the BBC.";

		String tokens[]=data.split(" ");
		for(String token: tokens) {
			System.out.println(token.toLowerCase());
		}
		// trim
//		String data="    raj    ";
//		System.out.println(data.trim());

		// revesre a string

//		String data="raj";
//		
//		String dataRev=new StringBuilder().append(data).reverse().toString();
//		
//		System.out.println(dataRev);

	}
}
