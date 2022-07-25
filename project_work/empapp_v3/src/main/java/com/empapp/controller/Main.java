package com.empapp.controller;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.empapp.config.AppConfig;
import com.empapp.dao.Employee;
import com.empapp.service.EmployeeService;
import com.empapp.service.EmployeeServiceImpl;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		EmployeeService employeeService=ctx.getBean("employeeService", EmployeeService.class);
		
		List<Employee> employees=employeeService.getAll();
		employees.stream().forEach(en-> System.out.println(en));
		
		//add new employee
		//Employee employee=new Employee("nitin kumar", 50000);
		//Employee addEmployee = employeeService.addEmployee(employee);
//		System.out.println(addEmployee);
		
		//update
		//employeeService.updateEmployee(10, 60000);
		
		//delete
		//employeeService.deleteEmployee(100);
	}

}
