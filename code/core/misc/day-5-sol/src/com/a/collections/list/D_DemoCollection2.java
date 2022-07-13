package com.a.collections.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class D_DemoCollection2 {

	public static void main(String[] args) {
		//Comparable vs Comparator
		List<Employee>  list=new ArrayList<Employee>();
		
		list.add(new Employee(12, "raj", 568000.0));
		list.add(new Employee(1, "ekta", 673454.0));
		list.add(new Employee(129, "keshav", 45555.0));
		list.add(new Employee(122, "rashim", 790000.0));
		
		System.out.println("---before sorting----");
		printAll(list);
		
		Collections.sort(list);
		System.out.println("---after sorting as per id----");
		printAll(list);
		
		Collections.sort(list, new EmpNameSorter());
		System.out.println("---after sorting as per name----");
		printAll(list);
		
		Collections.sort(list, new EmpSalarySorter());
		System.out.println("---after sorting as per salary(desc)----");
		printAll(list);
		
	}

	private static void printAll(List<Employee> list) {
		for(Employee employee: list) {
			System.out.println(employee);
		}
	}
}
