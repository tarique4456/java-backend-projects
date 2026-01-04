package com.servlet.jdbc_crud_with_servlet_api.client.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.servlet.jdbc_crud_with_servlet_api.dao.EmployeDao;
import com.servlet.jdbc_crud_with_servlet_api.dto.Employe;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginEmployeController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String email=req.getParameter("empEmail");
		String pass=req.getParameter("empPassword");
		
		Employe employe=new EmployeDao().getEmployeByEmailDao(email);
		
		PrintWriter printWriter=resp.getWriter();
		
		if(employe!=null) {
			
			if(employe.getPassword().equals(pass)) {
				printWriter.write("<html><body><h4 style='color:green';>Employe Login Successfully.!!!</h4></body></html>");
				RequestDispatcher dispatcher=req.getRequestDispatcher("Employe-Home.jsp");
				dispatcher.include(req, resp);
				System.out.println("login Succeesfully");
				
				
			}else {
				printWriter.write("<html><body><h4 style='color:red';>Password is Incorrect.!!!</h4></body></html>");
				RequestDispatcher dispatcher=req.getRequestDispatcher("Employe-Login.jsp");
				dispatcher.include(req, resp);
				System.out.println("Employe Password is Incorrect...");
			}
		}else {
			printWriter.write("<html><body><h4 style='color:red';>Email is Incorrect.!!!</h4></body></html>");
			RequestDispatcher dispatcher=req.getRequestDispatcher("Employe-Login.jsp");
			dispatcher.include(req, resp);
			System.out.println("Employe Email is Incorrect...");
		}
		
	}

}
