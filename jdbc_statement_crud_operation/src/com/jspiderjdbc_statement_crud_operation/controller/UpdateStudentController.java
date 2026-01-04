package com.jspiderjdbc_statement_crud_operation.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.jspiderjdbc_statement_crud_operation.connection.StudentConnection;

public class UpdateStudentController {
	public static void main(String[] args) {
		// step1 : Load/ Register the driver
		Connection connection=null;
		Statement statement=null;
		
			try {

				
				connection =StudentConnection.getStudentConnection();
				
				//step 3: Create statement (I) object 
				
				statement =connection.createStatement();
				
				String insertStudentQuery="update students set name='Katrina Kaif',dob='1998-07-25' where id=104";
		
				// step4: Execute Query
				
				int a=statement.executeUpdate(insertStudentQuery);
				
				if(a>0) {
					System.out.println("Data Updated..!!");
					
				}else {
					System.out.println("Something went wrong or Data not updated ..!!!");
				}
				
				
				statement.execute(insertStudentQuery);
			
			
				
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
