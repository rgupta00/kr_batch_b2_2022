package com.f.generics2;
import java.util.*;
//how to write generics method

public class H_genericsMethod {
	
	public static void main(String[] args) {

		Integer a=2;
		Integer b=-6;
		Integer c=26;
		
		Integer maxValue=max(a, b , c);
		
		System.out.println(maxValue);
	}

	private static Integer max(Integer a, Integer b, Integer c) {
		Integer max=a;
		if(b.compareTo(a)>0)
			max=b;
		if(c.compareTo(max)>0)
			max=c;
			
		return max;
	}

}
