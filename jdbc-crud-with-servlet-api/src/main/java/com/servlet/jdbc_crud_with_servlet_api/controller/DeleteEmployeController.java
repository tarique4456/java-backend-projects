package com.servlet.jdbc_crud_with_servlet_api.controller;

import com.servlet.jdbc_crud_with_servlet_api.dao.EmployeDao;

public class DeleteEmployeController {
	
	public static void main(String[] args) {
		int idToDelete=1008;
		
		EmployeDao employee=new EmployeDao();
		
		boolean isDeleted=employee.deleteEmployeByIdDao(idToDelete);
		
		if(isDeleted) {
			System.out.println("Employe deleted successfully with ID: "+idToDelete);
		}else {
			System.out.println("No employe deleted with id :"+idToDelete);
		}
	}

}
