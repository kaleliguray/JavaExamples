package com.yjs3408.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Driver {

	private static final String DB_URL = "jdbc:mysql://35.187.20.173/baa";
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
			System.out.println("Error message: " + e.getMessage());
			System.out.println("Error code: " + e.getErrorCode());
			System.out.println("SQL state: " + e.getSQLState());
			if ("28000".equals(e.getSQLState())) {
				JOptionPane.showMessageDialog(null, "Username or password incorrect!");
			} else if ("42000".equals(e.getSQLState())) {
				JOptionPane.showMessageDialog(null, "Database doesn't exists!");
			}
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
