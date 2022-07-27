package com.empapp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.empapp.dao.Employee;
// 
@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Override
	public List<Employee> getAll() {
		return Arrays.asList(new Employee(12, "Raj", 56000),new Employee(129, "Sanjeev", 46000));
	}

}
