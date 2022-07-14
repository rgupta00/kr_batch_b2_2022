package com.b.collections.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class C_TreeSetUserDefineObject {

	public static void main(String[] args) {

		Set<Employee> set = new TreeSet<>(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return Double.compare(o2.getSalary(), o1.getSalary());
			}
		});
		
		set.add(new Employee(70, "ekta", 700000));
		set.add(new Employee(1, "raja", 500000));
		set.add(new Employee(18, "amit", 590000));
		
		System.out.println("printing emp");
		Iterator<Employee> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
