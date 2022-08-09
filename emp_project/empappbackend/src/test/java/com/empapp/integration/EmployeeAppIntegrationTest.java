package com.empapp.integration;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.empapp.dao.Employee;
import com.empapp.dao.EmployeeDao;
import com.empapp.service.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class EmployeeAppIntegrationTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@Autowired
	private ObjectMapper objectMapper;// it is used to convert java object to json
	
	
	@BeforeEach
	void setUp() throws Exception {
		employeeDao.deleteAll();
	}

	@DisplayName("Integration test test for insert operation")
	@Test
	void givenEmployeeObject_whenCreateEmployee_thenReturnSavedObject() throws Exception {
		Employee employee = new Employee("raj", 6000);
		
		ResultActions response = mockMvc.perform(post("/api/employees")
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(employee)));
		
		response.andDo(print())
		.andExpect((status().isCreated()))
		.andExpect(jsonPath("$.name", is(employee.getName())));
		
				
	}
	
	@AfterEach
	void tearDown() throws Exception {
	}


}
