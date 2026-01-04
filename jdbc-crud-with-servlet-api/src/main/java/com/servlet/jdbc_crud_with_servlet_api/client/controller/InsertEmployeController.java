package com.servlet.jdbc_crud_with_servlet_api.client.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParsePosition;
import java.time.LocalDate;

import com.servlet.jdbc_crud_with_servlet_api.dao.EmployeDao;
import com.servlet.jdbc_crud_with_servlet_api.dto.Employe;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class InsertEmployeController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		String id=req.getParameter("empid");
		int empid=Integer.parseInt(id);
		
		String name=req.getParameter("empName");
		String email=req.getParameter("empEmail");
		String pass=req.getParameter("empPassword");
		
		String phone=req.getParameter("empPhone");
		Long empphone=Long.parseLong(phone);
		
		LocalDate doj=LocalDate.parse(req.getParameter("empDOJ"));
		String desig=req.getParameter("empDesignation");
		String gender=req.getParameter("gender");
		
		
//	
//		System.out.println("Id ="+empid);
//		System.out.println("Name ="+name);
//		System.out.println("Email ="+email);
//		System.out.println("Password ="+pass);
//		System.out.println("Phone ="+empphone);
//		System.out.println("DOJ ="+doj);
//		System.out.println("Designation ="+desig);
//		System.out.println("Gender ="+gender);
//		
		
		Employe employe=new Employe();
		
		employe.setId(empid);
		employe.setName(name);
		employe.setEmail(email);
		employe.setPassword(pass);
		employe.setPhone(empphone);
		employe.setDoj(doj);
		employe.setDesignation(desig);
		employe.setGender(gender);
		
		EmployeDao dao=new EmployeDao();
		
		Employe employe2=dao.saveEmployeDao(employe);
		
		PrintWriter printWriter=resp.getWriter();
		
		if(employe2!=null) {
			printWriter.write("<html><body><h4 style='color:green';>You Are Registered.!!!</h4></body></html>");
			RequestDispatcher dispatcher=req.getRequestDispatcher("Employe-Login.jsp");
			dispatcher.include(req, resp);
			System.out.println("Data Saved...");
		}
		else {
			printWriter.write("<html><body><h4 style='color:red';>Check Your Data,Something Went Wrong.!!!</h4></body></html>");
			RequestDispatcher dispatcher=req.getRequestDispatcher("Employe-Register.jsp");
			dispatcher.include(req, resp);
			System.out.println("Something went wrong...");
		}
		
		
		
		
	}

}
