package com.a.collections.list;
//default	 ---sec sorting 
//Comparable vs Comparator

import java.util.Comparator;
import java.util.Objects;

class EmpSalarySorter implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return Double.compare(o2.getSalary(), o1.getSalary());
	}
	
}

class EmpNameSorter implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.getName().compareTo(o1.getName());
	}
	
}

final public class Employee implements Comparable<Employee>{
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
		//why i am using builder here? + vs .append() method
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=").append(id).append(", name=").append(name).append(", salary=").append(salary)
				.append("]");
		return builder.toString();
	}
	@Override
	public int compareTo(Employee o) {
		return Integer.compare(this.getId(), o.getId());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}
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
	
	
}
