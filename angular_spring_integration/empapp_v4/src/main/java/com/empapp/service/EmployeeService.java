package com.empapp.service;

import java.util.List;

import com.empapp.dao.Employee;

public interface EmployeeService {
	public List<Employee> getAll();
	public Employee updateEmployee(int id, double salary);
	public Employee getById(int id);
	public Employee deleteEmployee(int id);
	public Employee addEmployee(Employee employee);
}
