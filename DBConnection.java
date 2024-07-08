package com.schoolmanagement;
    import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class DBConnection {
	    private static final String URL = "jdbc:mysql://localhost:3306/school_database";
	    private static final String USERNAME = "root";
	    private static final String PASSWORD = "B.pavithra804";

	    public static Connection getConnection() throws SQLException {
	        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	    }
	}



