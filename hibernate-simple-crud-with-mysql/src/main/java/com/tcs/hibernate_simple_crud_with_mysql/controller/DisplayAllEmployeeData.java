package com.tcs.hibernate_simple_crud_with_mysql.controller;

import java.util.List;

import com.tcs.hibernate_simple_crud_with_mysql.dao.EmployeeDao;
import com.tcs.hibernate_simple_crud_with_mysql.entity.Employee;

public class DisplayAllEmployeeData {
	public static void main(String[] args) {
		List<Employee> employees=new EmployeeDao().getAllEmployeeDao();
		for(Employee employee:employees) {
			System.out.println(employee);
		}
	}
	

}
