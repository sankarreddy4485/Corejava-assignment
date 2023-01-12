package com.assignment5.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnection {
	Connection myConn = null;
	
	public Connection getConnection() throws SQLException {
		try {
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "DataGuard432$");

			System.out.println("Database connection successful!\n");

		} catch (SQLException e) {
			throw new SQLException(e.getMessage());
		}
		return myConn;
	}


}
