package com.a.collections.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class D_LL_Employee_Sort {

	public static void main(String[] args) {
		
		List<Employee>  list=new ArrayList<Employee>();
		
		list.add(new Employee(1, "raj", 3600000.0));
		list.add(new Employee(12, "raj", 3000000.0));
		list.add(new Employee(129, "keshav", 45555.0));
		list.add(new Employee(122, "rashim", 790000.0));
		
		printList(list);
		System.out.println("-------print as per id-------------");
		Collections.sort(list);
		printList(list);
		
		System.out.println("-------print as per name-------------");
		Collections.sort(list, new NameSorter());
		printList(list);
		

		System.out.println("-------print as per salary-------------");
		Collections.sort(list, new SalarySorter());
		printList(list);
		
		
	}

	private static void printList(List<Employee> list) {
		Iterator<Employee> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
