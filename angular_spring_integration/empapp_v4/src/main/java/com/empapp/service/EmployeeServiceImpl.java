package com.empapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empapp.dao.Employee;
import com.empapp.dao.EmployeeDao;
import com.empapp.exceptions.EmployeeNotFoundException;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDao employeeDao;
	
	
	@Autowired
	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public List<Employee> getAll() {
		return employeeDao.findAll();
	}

	@Override
	public Employee updateEmployee(int id, double salary) {
		Employee empToUpdate= getById(id);
		empToUpdate.setSalary(salary);
		employeeDao.save(empToUpdate);
		return empToUpdate;
	}

	@Override
	public Employee getById(int id) {
		return employeeDao.findById(id)
				.orElseThrow(()-> new EmployeeNotFoundException("emp is not found: "+ id));
	}

	@Override
	public Employee deleteEmployee(int id) {
		Employee empToDelete= getById(id);
		employeeDao.delete(empToDelete);
		return empToDelete;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		employeeDao.save(employee);
		return employee;
	}

}
