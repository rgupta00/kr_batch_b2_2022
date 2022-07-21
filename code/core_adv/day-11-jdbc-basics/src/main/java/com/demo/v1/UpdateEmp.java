package com.demo.v1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
public class UpdateEmp {

	public static void main(String[] args) {
		
		
		//i want to insert a new record
		try {
			Connection connection=ConnectionFactory.getConnection();
			PreparedStatement pstmt=connection
					.prepareStatement("update emp set salary=? where id=?");
			pstmt.setDouble(1, 77000);
			pstmt.setInt(2,5);
			
			
			int noOfRows = pstmt.executeUpdate();
			System.out.println(noOfRows);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
