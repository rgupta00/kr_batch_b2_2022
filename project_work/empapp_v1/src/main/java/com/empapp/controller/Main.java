package com.empapp.controller;
import java.util.*;

import com.empapp.dao.Employee;
import com.empapp.service.EmployeeService;
import com.empapp.service.EmployeeServiceImpl;

public class Main {
	
	public static void main(String[] args) {
		EmployeeService employeeService=new EmployeeServiceImpl();
		//List<Employee> employees=employeeService.getAll();
		//employees.forEach(e-> System.out.println(e));
		
		//add new employee
//		Employee employee=new Employee("sanjeev", 50000);
//		Employee addEmployee = employeeService.addEmployee(employee);
//		System.out.println(addEmployee);
		
		//update
		//employeeService.updateEmployee(7, 60000);
		
		//delete
		employeeService.deleteEmployee(6);
	}

}
