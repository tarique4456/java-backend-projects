package com.servlet.jdbc_crud_with_servlet_api.controller;

import java.util.List;

import com.servlet.jdbc_crud_with_servlet_api.dao.EmployeDao;
import com.servlet.jdbc_crud_with_servlet_api.dto.Employe;

public class FetchAllEmployeController {
	public static void main(String[] args) {
		
		EmployeDao dao=new EmployeDao();
		
		List<Employe> employes=dao.fetchAllEmployDataDao();
		
		if(!employes.isEmpty()) {
			for(Employe employe : employes) {
				System.out.println(employe);
			}
			
		}
		else {
			System.out.println("No data Found...!!!");
		}
		
		
	}

}
