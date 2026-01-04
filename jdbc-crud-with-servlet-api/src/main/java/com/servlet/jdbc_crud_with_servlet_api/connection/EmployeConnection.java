package com.servlet.jdbc_crud_with_servlet_api.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class EmployeConnection {
	public static Connection getEmployeConnection() {
		
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
			
		}
		
	}

}
