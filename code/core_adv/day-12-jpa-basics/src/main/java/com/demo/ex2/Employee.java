package com.demo.ex2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="emp_b2_t1")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //?
	@Column(name = "emp_id")
	private int id;
	
	@Column(name = "emp_name", nullable = false, length = 100)
	private String name;
	
	@Column(name = "emp_salary")
	private double salary;
	
	@Temporal(TemporalType.DATE)
	private Date dataOfBith;
	
	@Enumerated(EnumType.STRING)
	private EmpType empType;
	
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "phones_table")
	private List<String> phones=new ArrayList<>();
	
	@Transient	//hey hib dont store in db
	private String tempPassword;
	

	
	public Date getDataOfBith() {
		return dataOfBith;
	}
	public void setDataOfBith(Date dataOfBith) {
		this.dataOfBith = dataOfBith;
	}
	public EmpType getEmpType() {
		return empType;
	}
	public void setEmpType(EmpType empType) {
		this.empType = empType;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public String getTempPassword() {
		return tempPassword;
	}
	public void setTempPassword(String tempPassword) {
		this.tempPassword = tempPassword;
	}
	public void addPhone(String phone) {
		phones.add(phone);
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
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}
