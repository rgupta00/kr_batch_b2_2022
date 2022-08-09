package com.empapp.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.empapp.dao.Employee;
import com.empapp.dao.EmployeeDao;
@ExtendWith(MockitoExtension.class)
class EmployeeServiceImplTest {

	@Mock	//a fake ob without any behaviour
	private EmployeeDao employeeDao;
	
	@InjectMocks
	private EmployeeServiceImpl employeeService;
	
	private Employee employee;
	@BeforeEach
	void setUp() throws Exception {
		employee=new Employee(1, "raj", 7000);
	}

	@DisplayName("service layer test for insert operation")
	@Test
	void givenEmployeeObject_whenSaved_thenGetSavedObject() {
		when(employeeDao.save(employee)).thenReturn(employee);
		
		Employee savedEmp= employeeService.addEmployee(employee);
		
		assertThat(savedEmp).isNotNull();
		
	}

	@DisplayName("service layer test for insert operation")
	@Test
	void givenEmployeeList_whenGetAllEmployee_thenGetEmployeeList() {
		
		Employee employee = new Employee("raj", 6000);
		Employee employee2 = new Employee("ekta", 6000);
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(employee2);
		employees.add(employee);
		
		when(employeeDao.findAll()).thenReturn(employees);
		
		
		
		List<Employee> employees2=employeeService.getAll();
		
	
		
		assertThat(employees2).isNotNull();
		assertThat(employees2.size()).isEqualTo(2);
		
		
	}
	
	@AfterEach
	void tearDown() throws Exception {
		employee=null;
	}


}
