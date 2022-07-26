package com.empapp.api;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empapp.dao.Employee;
import com.empapp.service.EmployeeService;
@RestController // @RestController=  @Controller+@ResponseBody
//@ResponseBody: is a annotation that trigger jackson parser to convert java object to json
@RequestMapping(path = "api")
public class EmployeeApi {

	private EmployeeService employeeService;

	@Autowired
	public EmployeeApi(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	//Parser: jackson java <---> json
	
	//-------get all employee--------
	@GetMapping(path = "employees")
	public List<Employee> getAll(){
		return employeeService.getAll();
	}
	
	//-------get an employee by id--------
	@GetMapping(path = "employees/{id}")
	public Employee getAnEmployee(@PathVariable(name = "id") int id){
		return employeeService.getById(id);
	}
	
	//Post: @RequestBody is used to convert json ie coming from another server or postman to java object
	@PostMapping(path = "employees")
	public Employee addAnEmployee( @RequestBody Employee employee){
		return employeeService.addEmployee(employee);
	}
//	
	
	//put
	@PutMapping(path = "employees/{id}")
	public Employee updateAnEmployee( @PathVariable(name = "id") int id,   
			@RequestBody Employee employee){
		return employeeService.updateEmployee(id, employee.getSalary());
	}
	
	
	//delete
	@DeleteMapping(path = "employees/{id}")
	public Employee deleteAnEmployee(@PathVariable(name = "id") int id){
		return employeeService.deleteEmployee(id);
	}
	
}






