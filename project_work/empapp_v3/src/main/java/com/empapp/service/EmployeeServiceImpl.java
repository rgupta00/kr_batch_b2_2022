package com.empapp.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empapp.dao.Employee;
import com.empapp.dao.EmployeeDao;
import com.empapp.dao.EmployeeDaoImplHib;
import com.empapp.dao.EmployeeDaoJdbcImpl;

//Service Layer: BL= FR +NFR
@Service(value = "employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	private Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	private EmployeeDao employeeDao;

	// @Autowired : field vs setter vs construtor
	
	///if dep is optional then go for setter
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	//if dep is mandatory then go for const (90%)
	@Autowired
	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public List<Employee> getAll() {
		long start = System.nanoTime();

		List<Employee> employees = employeeDao.getAll();

		long end = System.nanoTime();

		logger.info("method getAll take :" + (end - start) + " ns to execute");

		return employees;
	}

	@Override
	public Employee getById(int id) {
		return employeeDao.getById(id);
	}

	@Override
	public Employee addEmployee(Employee employee) {
		return employeeDao.addEmployee(employee);
	}

	@Override
	public Employee updateEmployee(int id, double salary) {
		return employeeDao.updateEmployee(id, salary);
	}

	@Override
	public void deleteEmployee(int id) {
		employeeDao.deleteEmployee(id);
	}

}
