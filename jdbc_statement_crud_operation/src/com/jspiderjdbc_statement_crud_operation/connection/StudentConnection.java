package com.jspiderjdbc_statement_crud_operation.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class StudentConnection {
	
	public static Connection getStudentConnection() {
		try {
			// step 1 load/register driver 
			
			Driver driver =new Driver();
			DriverManager.registerDriver(driver);
			
			// step 2 create connection
			
			String url="jdbc:mysql://localhost:3306/jdbc";
			String username="root";
			String password="root";
			
			return DriverManager.getConnection(url,username,password);
			
		}catch(SQLException e) {
			e.printStackTrace();
			
			return null;
		}
		
	}

}
