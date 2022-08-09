package com.empapp.api;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.empapp.dao.Employee;
import com.empapp.dao.EmployeeDao;
import com.empapp.service.EmployeeService;
@WebMvcTest(controllers = EmployeeApi.class)
class EmployeeApiTest {

	@Autowired
	private MockMvc mockMvc;
	
	//service layer
	@MockBean //add mock to spring app context 
	private EmployeeService employeeService;
	
	@MockBean //add mock to spring app context 
	private EmployeeDao employeeDao;
	
	
	@Test
	void givenListOfEmployees_whenGetAllEmployee_thenRetunListOfEmployee() throws Exception {
		Employee employee = new Employee("raj", 6000);
		Employee employee2 = new Employee("ekta", 6000);
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(employee2);
		employees.add(employee);
		
		when(employeeService.getAll()).thenReturn(employees);
		
		ResultActions resultAction = mockMvc.perform(get("/api/employees"));
		
//		resultAction.andExpect(status().isOk()).andDo(print());
		
		resultAction.andExpect(status().isOk())
		.andDo(print())
		.andExpect(jsonPath("$.size()", is(employees.size())));
		
	}



}










