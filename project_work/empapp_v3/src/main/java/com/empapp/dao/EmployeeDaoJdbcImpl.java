package com.empapp.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.empapp.exceptions.EmployeeNotFoundException;
import com.empapp.util.ConnectionFactory;
@Repository
@Primary
public class EmployeeDaoJdbcImpl implements EmployeeDao {

	private Connection connection;

	public EmployeeDaoJdbcImpl() {
		connection = ConnectionFactory.getConnection();
	}

	@Override
	public List<Employee> getAll() {
		System.out.println("-------jdbc wala dao layer----------");
		//how to get auto gen id from db
		Statement statement;
		List<Employee> employees = new ArrayList<Employee>();
		try {
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from emp");

			while (rs.next()) {
				employees.add(new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3)));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return employees;
	}

	@Override
	public Employee getById(int id) {

		Employee employee = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement("select * from emp where id=?");
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				employee = new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3));
			} else {
				throw new EmployeeNotFoundException("emp with id " + id + " is not found");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employee;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		PreparedStatement pstmt;
		try {
			pstmt = connection.prepareStatement
					("insert into emp(name,salary) values(?,?)", 
							Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, employee.getName());
			pstmt.setDouble(2, employee.getSalary());
			
			pstmt.executeUpdate();
			
			ResultSet rs = pstmt.getGeneratedKeys();
			if(rs.next()) {
				int id=rs.getInt(1);
				System.out.println(id);
				employee.setId(id);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return employee;
	}

	@Override
	public Employee updateEmployee(int id, double salary) {
		Employee employee = getById(id);
		PreparedStatement pstmt;
		try {
			pstmt = connection.prepareStatement("update emp set salary=? where id=?");

			pstmt.setDouble(1, salary);
			pstmt.setInt(2, id);

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		employee.setSalary(salary);
		return employee;

	}

	@Override
	public void deleteEmployee(int id) {
		try {
			Connection connection = ConnectionFactory.getConnection();
			PreparedStatement pstmt = connection.prepareStatement("delete from emp where id=?");
			pstmt.setInt(1, id);

			int noOfRows = pstmt.executeUpdate();
			System.out.println(noOfRows);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
