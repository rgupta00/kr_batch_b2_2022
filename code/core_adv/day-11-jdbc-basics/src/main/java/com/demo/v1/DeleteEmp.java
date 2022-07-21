package com.demo.v1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
public class DeleteEmp {

	public static void main(String[] args) {
		
		
		//i want to insert a new record
		try {
			Connection connection=ConnectionFactory.getConnection();
			PreparedStatement pstmt=connection
					.prepareStatement("delete from emp where id=?");
			pstmt.setInt(1,5);
			
			
			int noOfRows = pstmt.executeUpdate();
			System.out.println(noOfRows);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
