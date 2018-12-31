package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test_jdbc {

	public static void main(String[] args) {
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user = "hbstudent";
		String pass = "hbstudent";
		try {
			
			System.out.println("Connecting to database");
			
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			
			System.out.println("Connection successful !!");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}