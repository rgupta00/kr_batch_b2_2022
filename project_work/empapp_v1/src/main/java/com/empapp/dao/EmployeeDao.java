package com.empapp.dao;
import java.util.*;
public interface EmployeeDao {
	public List<Employee> getAll();
	public Employee getById(int id);
	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(int id, double salary);
	public void deleteEmployee(int id);

}
