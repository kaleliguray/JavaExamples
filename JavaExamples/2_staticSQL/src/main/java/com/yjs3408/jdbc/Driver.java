package com.yjs3408.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Driver {

	private static final String DB_URL = "jdbc:mysql://35.187.20.173/ba";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "1234-asd";

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
			System.out.println("Connection success");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM employees");
			resultSet.last();
			System.out.println("Number of rows: " + resultSet.getRow());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) resultSet.close();
				if (statement != null) statement.close();
				if (connection != null) connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
