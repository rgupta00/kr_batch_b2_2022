package com.day1.session1.ex1.functional_interface;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.a.collections.common.Employee;

public class DemoFI {

	public static void main(String[] args) {
		// Predicate<T>
		// Function<T, R>
		// Supplier<T>
		// Consumer<T>
		/*
		 * 
		 */
		// i want a predicate if name contain raj

		// If emp is getting more then 40L

		BiPredicate<String, String> biPredicate = (name1, name2) -> name1.equals(name2);

		Predicate<Employee> empPredicate = e -> e.getSalary() >= 4000000;

		Predicate<String> sP = name -> name.contains("raj");

		Predicate<String> sP2 = name -> name.equals("raj");

		Predicate<Integer> p1 = no -> no % 2 == 0;

		System.out.println(p1.test(11));

		Predicate<Integer> p2 = no -> no >= 10;

		Predicate<Integer> p3 = p1.and(p2);

		Predicate<Integer> p4 = p1.or(p2);

		Predicate<Integer> p5 = p4.negate();

	}

}
