package com.tcs.hibernate_simple_crud_with_mysql.controller;

import com.tcs.hibernate_simple_crud_with_mysql.dao.EmployeeDao;
import com.tcs.hibernate_simple_crud_with_mysql.entity.Employee;

public class GetEmployeeByEmailController {
	public static void main(String[] args) {
		Employee employee=new EmployeeDao().getEmployeeByEmailDao("Tarique123@gmail.com");
		if(employee!=null) {
			System.out.println(employee);
		}
		else {
			System.out.println("Given Employee Not Found....");
		}
	}

}
