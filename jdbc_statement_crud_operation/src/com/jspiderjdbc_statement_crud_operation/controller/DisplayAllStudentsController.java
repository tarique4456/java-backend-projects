package com.jspiderjdbc_statement_crud_operation.controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jspiderjdbc_statement_crud_operation.connection.StudentConnection;

public class DisplayAllStudentsController {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// step1 : Load/ Register the driver
		Connection connection=null;
		Statement statement =null;
		ResultSet resultSet=null;
		
		
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
				
				
				// calling from another class 
				connection = StudentConnection.getStudentConnection();

				
				//step 3: Create statement (I) object 
				
				statement =connection.createStatement();
				
				
		
				// step4: Execute Query
				String displayStudentsQuery="select * from students" ;	
				
				resultSet=statement.executeQuery(displayStudentsQuery);
				
				while(resultSet.next()) {
					int studentID=resultSet.getInt("id");
					String studentName=resultSet.getString("name");
					String studentEmail=resultSet.getString("email");
					long studentMobile=resultSet.getLong("phone");
					Date studentDOB=resultSet.getDate("dob");
					
					System.out.println("Student-ID = "+studentID);
					System.out.println("Student-Name = "+studentName);
					System.out.println("Student-email = "+studentEmail);
					System.out.println("Student-Phone = "+studentMobile);
					System.out.println("Student-DOB = "+studentDOB);
					System.out.println("=========================");
				}
				
				
				
				
			} catch ( SQLException e) {
				System.out.println(	e.getMessage());
			}
			finally {
				///step 5: close created connection
				
				try {
					if(resultSet!=null) {
						System.out.println("Result set closed!!!");
						resultSet.close();
						
					}
					if(statement!=null) {
						System.out.println("statement closed !!!");
						statement.close();
						
					}
					if(connection!=null) {
						System.out.println("connection closed!!!");
						connection.close();
						
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}				
			}
			
			
			
		
	}

}

