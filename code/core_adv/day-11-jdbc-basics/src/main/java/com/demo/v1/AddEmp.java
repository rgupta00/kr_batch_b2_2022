package com.demo.v1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
public class AddEmp {

	public static void main(String[] args) {
		
		
		//i want to insert a new record
		try {
			Connection connection=ConnectionFactory.getConnection();
			PreparedStatement pstmt=connection
					.prepareStatement("insert into emp(name,salary) values(?,?)");
			pstmt.setString(1,"nitin");
			pstmt.setDouble(2, 67000);
			
			int noOfRows = pstmt.executeUpdate();
			System.out.println(noOfRows);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
