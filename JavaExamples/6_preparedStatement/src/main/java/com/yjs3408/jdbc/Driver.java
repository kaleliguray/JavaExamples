package com.yjs3408.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Driver {

	private static final String DB_URL = "jdbc:mysql://35.187.20.173/ba";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "1234-asd";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Employee ID: ");
		int employeeId = scanner.nextInt();
		scanner.close();
		
		try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {
			try (PreparedStatement statement = connection.prepareStatement("SELECT * FROM employees WHERE employee_id = ? OR first_name LIKE ?")) {
				statement.setInt(1, employeeId);
				statement.setString(2, "%B");
				try (ResultSet resultSet = statement.executeQuery()) {
					while (resultSet.next()) {
						System.out.println(resultSet.getString("first_name") + " " + resultSet.getString("last_name"));
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
