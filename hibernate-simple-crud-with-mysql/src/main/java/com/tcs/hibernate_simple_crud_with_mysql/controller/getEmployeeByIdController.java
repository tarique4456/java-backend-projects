package com.tcs.hibernate_simple_crud_with_mysql.controller;

import com.tcs.hibernate_simple_crud_with_mysql.dao.EmployeeDao;
import com.tcs.hibernate_simple_crud_with_mysql.entity.Employee;

public class getEmployeeByIdController {
	public static void main(String[] args) {
		Employee employee=new EmployeeDao().getEmployeeByIdDao(100);
		if(employee!=null) {
			System.out.println(employee);
		}
		else {
			System.out.println("Employee given id is not found");
		}
		
	}

}
