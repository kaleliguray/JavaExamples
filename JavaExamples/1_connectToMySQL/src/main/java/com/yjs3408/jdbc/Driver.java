package com.yjs3408.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Driver {

	private static final String DB_URL = "jdbc:mysql://35.187.20.173/ba";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "1234-asd";

	public static void main(String[] args) {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
			System.out.println("Connection success");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
