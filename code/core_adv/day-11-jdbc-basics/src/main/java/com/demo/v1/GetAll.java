package com.demo.v1;

import java.sql.*;

public class GetAll {

	public static void main(String[] args) {

		try (Connection connection = ConnectionFactory.getConnection()) {

			Statement statement = connection.createStatement();

			ResultSet rs = statement.executeQuery("select * from emp");

			while (rs.next()) {
				System.out.println(rs.getInt(1) + ":" + rs.getString(2) + ": " + rs.getDouble(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
