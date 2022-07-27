package com.empapp.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;

import com.empapp.dao.Employee;
import com.empapp.service.EmployeeService;

@Path("api")
public class EmployeeApi {

	private EmployeeService employeeService;

	@Autowired
	public EmployeeApi(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	//--------get all books-----------------
	@GET
	@Path("employees")
	@Produces("application/json")
	public List<Employee> getAll() {
		if(1==1)
			throw new NullPointerException();
		return employeeService.getAll();
	}
	
	//--------get an book by id-----------------
	@GET
	@Path("employees/{id}")
	@Produces("application/json")
	public Employee getAanEmployee(@PathParam(value = "id")int id) {
		return employeeService.getById(id);
	}

	//--------delete an book by id-----------------
	@DELETE
	@Path("employees/{id}")
	@Produces("application/json")
	public Response deleteAnEmployee(@PathParam(value = "id")int id) {
		Employee empDeleted= employeeService.deleteEmployee(id);
		return Response.status(Status.NO_CONTENT).build();
	}
	
	//--------update an book by id-----------------
	@PUT
	@Path("employees/{id}")
	@Produces("application/json")
	@Consumes("application/json")
	public Employee updateAnEmployee(@PathParam(value = "id")int id, Employee employee) {
		return employeeService.updateEmployee(id, employee.getSalary());
	}
	
	//--------add an book -----------------
	//ResponseEntity<T> vs Response
	@POST
	@Path("employees")
	@Produces("application/json")
	@Consumes("application/json")
	public Response addingAnEmployee( Employee employee) {
		Employee emp= employeeService.addEmployee(employee);
		return Response.status(Status.CREATED).entity(emp).build();
	}
}






