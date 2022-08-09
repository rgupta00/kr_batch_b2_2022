package com.empapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.empapp.dao.Employee;
import com.empapp.dao.EmployeeDao;

@SpringBootApplication
public class EmpappV1Application implements CommandLineRunner {

	@Autowired
	private EmployeeDao employeeDao;
	
	public static void main(String[] args) {
		SpringApplication.run(EmpappV1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//employeeDao.save(new Employee("raj", 5000));
		//employeeDao.save(new Employee("ekta", 6000));
		System.out.println("emp are added...");
	}
}
