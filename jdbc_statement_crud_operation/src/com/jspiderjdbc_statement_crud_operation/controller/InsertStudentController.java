package com.jspiderjdbc_statement_crud_operation.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.jspiderjdbc_statement_crud_operation.connection.StudentConnection;

public class InsertStudentController {
	
	public static void main(String[] args) {
		// step1 : Load/ Register the driver
		Connection connection=null;
		Statement statement=null;
		
			try {
//				Class.forName("com.mysql.cj.jdbc.Driver");
//				
//
//				// step2: Create connection with database
//				
//				String url="jdbc:mysql://localhost:3306/jdbc";
//				String username="root";
//				String password="root";
//				
//				connection=DriverManager.getConnection(url, username, password);
//				System.out.println(connection);
				
				connection =StudentConnection.getStudentConnection();
				
				//step 3: Create statement (I) object 
				
				statement =connection.createStatement();
				
				String insertStudentQuery="insert into students(id,name,email,phone,dob) values(112,'KL Rahul','rahul948@gmail.com',9556795984,'2004-05-23')" ;	
		
				// step4: Execute Query
				
				int a=statement.executeUpdate(insertStudentQuery);
				
				if(a>0) {
					System.out.println("Data Registered");
					
				}else {
					System.out.println("Registration failed");
				}
				
				
//				statement.execute(insertStudentQuery);
			
			
				
			} catch ( SQLException e) {
				System.out.println(	e.getMessage());
			}
			finally {
				///step 5: close created connection
				
				try {
					
					if(statement!=null) {
						System.out.println("statement closed !!!");
						statement.close();
						
					}
					if(connection!=null) {
						System.out.println("connection closed!!!");
						connection.close();
						
					}
				
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			}
			
			
			
		
	}

}
