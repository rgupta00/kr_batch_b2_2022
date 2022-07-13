package com.f.generics2;

import java.util.Comparator;
import java.util.Objects;
//extra sort seq: comparator

class EmpNameSorter implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}

class EmpSalarySorter implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		return Double.compare(o2.getSalary(), o1.getSalary());
	}
	
}

//natural sort: comparable
public class Employee implements Comparable<Employee> {
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
	
	//hashcode is to divide data into the buckets
	@Override
	public int hashCode() {
		return name.length();
	}
	//to search data from the bucket
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	@Override
	public int compareTo(Employee o) {
		return Integer.compare(this.getId(), o.getId());
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=").append(id).append(", name=").append(name).append(", salary=").append(salary)
				.append("]");
		return builder.toString();
	}
	
	
}
