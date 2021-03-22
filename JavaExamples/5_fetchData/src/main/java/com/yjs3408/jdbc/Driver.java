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
		try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {
			try (Statement statement = connection.createStatement()) {
				try (ResultSet resultSet = statement.executeQuery("SELECT * FROM employees")) {
					while (resultSet.next()) {
						int id = resultSet.getInt(1);
						String firstName = resultSet.getString(2);
						String lastName = resultSet.getString(3);
						String email = resultSet.getString(4);
						double salary = resultSet.getDouble(5);
						
						System.out.println(id);
						System.out.println(firstName);
						System.out.println(lastName);
						System.out.println(email);
						System.out.println(salary);
						System.out.println("-----------------");
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
