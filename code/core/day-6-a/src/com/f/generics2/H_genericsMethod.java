package com.f.generics2;

import java.util.*;
//how to write generics method

public class H_genericsMethod {

	public static void main(String[] args) {

		Integer a = 2;
		Integer b = -6;
		Integer c = 26;

		Integer maxValue = max(a, b, c);

		System.out.println(maxValue);

		Employee e1 = new Employee(121, "ravi", 800000);
		Employee e2 = new Employee(11, "ekta", 830000);
		Employee e3 = new Employee(921, "gunika", 900000);

		Employee maxValueEmp = max(e1, e2, e3);
		
		System.out.println(maxValueEmp);

	}

	private static <T extends Comparable<T>> T max(T a, T b, T c) {
		T max = a;
		if (b.compareTo(a) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;

		return max;
	}

}
