package com.empapp.dao;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class EmployeeDaoTest {

	@Autowired
	private EmployeeDao employeeDao;

	// -------add emp ------------
	
	@DisplayName("Dao layer test for insert operation")
	@Test
	void givenEmployeeObject_whenSave_thenReturnSavedObject() {
		Employee employee = new Employee("raj", 6000);

		Employee savedEmployee = employeeDao.save(employee);

		assertThat(savedEmployee).isNotNull();
		assertThat(savedEmployee.getId()).isGreaterThan(0);

	}

	// -------add emp ------------
	@DisplayName("Dao layer test for getAll operation")
	@Test
	void givenEmployeeList_whenFindAll_thenReturnEmployeeList() {
		Employee employee = new Employee("raj", 6000);
		Employee employee2 = new Employee("ekta", 6000);
		
		employeeDao.save(employee);
		employeeDao.save(employee2);
		
		List<Employee> employees=employeeDao.findAll();
//		
//		List<Employee> employees=new ArrayList<Employee>();
//		employees.add(employee2);
//		employees.add(employee);
//		

		assertThat(employees).isNotNull();
		assertThat(employees.size()).isEqualTo(2);

	}

	@DisplayName("Dao layer test for delete operation")
	@Test
	void givenEmployeeObject_whenDeleated_thenRemovedFromDb() {
		Employee employee = new Employee("raj", 6000);

		Employee savedEmployee = employeeDao.save(employee);

		employeeDao.deleteById(savedEmployee.getId());
		//now i want to hit db to find that emp should not be thre
		Optional<Employee> optEmp= employeeDao.findById(savedEmployee.getId());
		
		assertThat(optEmp).isEmpty();
		
	}
}
