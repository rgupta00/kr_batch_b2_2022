package com.a.collections.list;
//extra sort seq: comparator

import java.util.Comparator;

class NameSorter implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

class NameAndThenSalarySorter implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		int value = o1.getName().compareTo(o2.getName()); // strcmp
		if (value == 0) {
			value = Double.compare(o2.getSalary(), o1.getSalary());
		}
		return value;
	}
}

class SalarySorter implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return Double.compare(o2.getSalary(), o1.getSalary());
	}
}

//natural sort
final public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private double salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		// why i am using builder here? + vs .append() method
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=").append(id).append(", name=").append(name).append(", salary=").append(salary)
				.append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Employee o) {
		return Integer.compare(this.getId(), o.getId());
	}

}
