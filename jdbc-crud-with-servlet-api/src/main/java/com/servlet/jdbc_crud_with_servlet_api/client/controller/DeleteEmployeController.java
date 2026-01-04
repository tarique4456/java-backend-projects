package com.servlet.jdbc_crud_with_servlet_api.client.controller;

import java.io.IOException;
import java.util.*;

import com.servlet.jdbc_crud_with_servlet_api.dao.EmployeDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(value = "/delete")
public class DeleteEmployeController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		int id=Integer.parseInt(req.getParameter("id"));
		
//		List<Integer> integers = new ArrayList<>();
//		integers.add(id);
		
		boolean b=new EmployeDao().deleteEmployeByIdDao(id);
		
		String msg=b?"deleted":"check given id or check your code";
		System.out.println(msg);
		req.getRequestDispatcher("Employe-Display.jsp").forward(req, resp);
		//resp.sendRedirect("Employe-Display.jsp");
	}
	
	

}
