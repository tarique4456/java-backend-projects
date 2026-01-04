package com.tcs.hibernate_simple_crud_with_mysql.controller;

import com.tcs.hibernate_simple_crud_with_mysql.dao.EmployeeDao;
import com.tcs.hibernate_simple_crud_with_mysql.entity.Employee;

public class UpdateController {
	public static void main(String[] args) {
		Employee employee=new EmployeeDao().updateEmployeByIdDao(104, 43999);
		
		if(employee!=null) {
			System.out.println("Employee Updated");
		}
		else {
			System.out.println("Given id Not Found");
		}
	}

}
