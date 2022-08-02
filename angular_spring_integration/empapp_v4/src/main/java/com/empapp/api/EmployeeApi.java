package com.empapp.api;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empapp.dao.Employee;
import com.empapp.service.EmployeeService;
//@CrossOrigin(origins="http://localhost:4200/")
@RestController
public class EmployeeApi {

	private EmployeeService employeeService;

	@Autowired
	public EmployeeApi(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	//-------- for getting all employees
	@GetMapping(path = "employees")
	public List<Employee> getAll(){
		return employeeService.getAll();
	}
	
	//-----------for add--------
	//----------- for getting a particula emp------
	
	//-------------for del
	
	//------------ for updating
}
