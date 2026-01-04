package com.tcs.hibernate_simple_crud_with_mysql.controller;

import java.time.LocalDate;

import com.tcs.hibernate_simple_crud_with_mysql.dao.EmployeeDao;
import com.tcs.hibernate_simple_crud_with_mysql.entity.Employee;

public class EmployeeInsertController {
	public static void main(String[] args) {
		
		EmployeeDao dao=new EmployeeDao();
		Employee employee=new Employee();
		
		employee.setId(100);
		employee.setName("Tarique");
		employee.setEmail("Tarique123@gmail.com");
		employee.setPassword("Tarique234");
		employee.setSalary(390000);
		employee.setDoj(LocalDate.parse("2004-05-15"));
		
		dao.saveEmployeeDao(employee);
		
		
		
	}

}
