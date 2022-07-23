package com.empapp.service;

import java.util.List;

import com.empapp.dao.Employee;

public interface EmployeeService {
	public List<Employee> getAll();
	public Employee getById(int id);
	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(int id, double salary);
	public void deleteEmployee(int id);
}
