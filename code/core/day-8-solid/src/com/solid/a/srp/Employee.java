package com.solid.a.srp;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

//GOD class--- 
class Employee {
	private int id;
	private String name;
	private double salary;

	public Connection getConnection() {
		Connection connection = null;
		Properties prop = new Properties();
		InputStream is;
		try {
			is = new FileInputStream("db.properties");
			prop.load(is);// this will get key and values
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		String driverName = prop.getProperty("jdbc.driver");
		String url = prop.getProperty("jdbc.url");
		String username = prop.getProperty("jdbc.username");
		String password = prop.getProperty("jdbc.password");

		try {
			Class.forName(driverName);// this is dynamic class loading
			System.out.println("driver is loaded");
		} catch (ClassNotFoundException ex) {
			System.out.println("driver loading is not working");
		}

		try {
			connection = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;
	}

	public void addEmployee(Employee emp) throws SQLException {
		System.out.println("adding emp to db using jdbc..");
	}

	public void addBookUsingHibernate(Employee emp) throws HibernateException {
		System.out.println("adding emp to db using hibernate....");
	}
}