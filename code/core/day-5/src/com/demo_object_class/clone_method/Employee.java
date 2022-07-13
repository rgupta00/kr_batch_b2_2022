package com.demo_object_class.clone_method;

import java.util.Date;

public class Employee implements Cloneable {
	private int id;
	private String name;
	private double salary;
	private Date date; // ,mutable object

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

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


	public Employee(int id, String name, double salary, Date date) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.date = date;
	}

	public Employee(Employee employee) {
		this.id = employee.id;
		this.name = employee.name;
		this.salary = employee.salary;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", date=" + date + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee employee=(Employee) super.clone();
		employee.date=(Date) employee.getDate().clone();
		
		return employee;
//		return super.clone();// default clonning . shallow copy vs deep copy*
	}

}
