package com.day3.session2.exception_handling;

import java.util.Scanner;

public class A_NeedOfExceptionHandling {

	
	public static void main(String[] args) {
		
		int a,b , c;
		Scanner scanner=new Scanner(System.in);
		System.out.println("PE value of a");
		a=scanner.nextInt();
		System.out.println("PE value of b");
		b=scanner.nextInt();
		
		c=a/b;
		
		System.out.println(c);
		
		
	}
}
