package com.demo;

import java.sql.*;

public class HelloWorld {
	
	public static void main(String[] args) {
		///1. load the driver
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("driver is loaded");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//2. we have to get the connection object: TCP/IP : ip port server, un password
		Connection connection=null;
		try {
			 connection=DriverManager
					.getConnection("jdbc:postgresql://localhost:5432/krbatch2", 
					"postgres", "raj123");
			System.out.println("conn is done");
			
			//3. using connection we get something called "Statement"
			
			Statement statement=connection.createStatement();
			
			//4. from Statement we get resultset (rs aka pointer)
			ResultSet rs=statement.executeQuery("select * from emp");	
			//executeQuery vs executeUpdate
			
			//5. till it is not finish we will print all the records
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+":"+rs.getString(2)+": "+rs.getDouble(3));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		//6. close the connection
	}

}











