package com.empapp.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	private static Connection connection = null;

	public static Connection getConnection() {

		InputStream is = null;
		Properties properties = null;
		try {
			is = new FileInputStream("db.properties");
			// string spit
			properties = new Properties();// used to the read the prop file :) no need of using manual split

			properties.load(is);

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		// now try to get value from the property file
		String url = properties.getProperty("jdbc.url");
		String driver = properties.getProperty("jdbc.drivername");
		String username = properties.getProperty("jdbc.username");
		String password = properties.getProperty("jdbc.password");

		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			connection = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;
	}
}
