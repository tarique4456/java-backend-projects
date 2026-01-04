package com.servlet.jdbc_crud_with_servlet_api.controller;

import java.time.LocalDate;

import com.servlet.jdbc_crud_with_servlet_api.dao.EmployeDao;
import com.servlet.jdbc_crud_with_servlet_api.dto.Employe;

public class InsertEmployeController {
	public static void main(String[] args) {
		Employe employe=new Employe();
		
		employe.setId(1006);
		employe.setName("Kk");
		employe.setEmail("kk@gmail.com");
		employe.setPassword("kk123");
		employe.setPhone(8745982348L);
		employe.setDoj(LocalDate.parse("1990-04-22"));
		employe.setDesignation("Python developer");
		employe.setGender("Female");
		
		EmployeDao dao=new EmployeDao();
		
		Employe dbEmploye=dao.saveEmployeDao(employe);
		
		String msg=dbEmploye!=null?"Data Stored" :"Something went wrong";
		System.out.println(msg);
		
	}

}
