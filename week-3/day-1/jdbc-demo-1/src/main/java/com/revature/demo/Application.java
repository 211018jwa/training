package com.revature.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.postgresql.Driver;

public class Application {

	public static void main(String[] args) {
		
		// JDBC
		// Stands for Java Database Connectivity
		// It is a part of the standard Java runtime library that is included with the JRE
		// It is an API that allows for you to write code that interacts with a SQL database
		
		// How do we actually connect to the database from our Java application?
		// We need to obtain what is known as a Connection object
		
		// There is a JDBC class called DriverManager that we can use to register our Postgres driver that we obtained from mvnrepository
		// And then provide the credentials to connect to the Postgres database
		
		// Define our credentials to connect to the database
		String url = "jdbc:postgresql://localhost:5432/postgres"; // This is where you provide the "connection string", 
				// which is the location of your database server and the database name
		String username = "postgres";
		String password = "password"; // Change this to whatever your actual database password is

		// 1. Register the driver
		Driver postgresDriver = new Driver(); // This Driver class is from the postgres driver dependency
		
		try {
			DriverManager.registerDriver(postgresDriver);
			
			Connection con = DriverManager.getConnection(url, username, password);
			
			System.out.println(con);
			
			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM students");
			
			ResultSet rs = pstmt.executeQuery();
			
			// Iterate over the ResultSet (which is basically the results from the database query)
			while (rs.next()) {
				int studentId = rs.getInt(1);
				String firstName = rs.getString(2);
				String lastName = rs.getString(3);
				String classification = rs.getString(4);
				int age = rs.getInt(5);
				
				System.out.println("id = " + studentId + " , firstName = " + firstName + " , lastName = " + lastName + " , classification = " + classification
						+ " , age = " + age);
			}
			
		} catch(SQLException e) { // SQLException is a CHECKED exception that is part of JDBC. Because it is checked, are required
			// to handle or declare this exception
			e.printStackTrace();
		}
		
		
	}

}
