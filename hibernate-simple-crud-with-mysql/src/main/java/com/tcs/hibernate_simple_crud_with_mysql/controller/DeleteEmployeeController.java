package com.tcs.hibernate_simple_crud_with_mysql.controller;

import com.tcs.hibernate_simple_crud_with_mysql.dao.EmployeeDao;

public class DeleteEmployeeController {
	public static void main(String[] args) {
		boolean b=new EmployeeDao().deleteEmployeeByIdDao(100);
		
		String msg=b?"deleted ":"given id Not found";
		System.out.println(msg);
	}

}
