package com.empapp.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.empapp.dao.Employee;

@RestController
public class EmpController {
	
	@GetMapping(path = "employees/{id}")
	public Employee getById( @PathVariable(name = "id") int id) {
		return new Employee(id, "foo " + id, 6000);
	}
}
