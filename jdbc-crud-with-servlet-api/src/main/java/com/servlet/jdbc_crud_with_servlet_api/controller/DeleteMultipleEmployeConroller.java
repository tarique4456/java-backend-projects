package com.servlet.jdbc_crud_with_servlet_api.controller;

import java.util.Arrays;
import java.util.List;

import com.servlet.jdbc_crud_with_servlet_api.dao.EmployeDao;

public class DeleteMultipleEmployeConroller {
	
	public static void main(String[] args) {
		
		List<Integer> integers = Arrays.asList(1009,1005,1007);
		
		boolean b=new EmployeDao().deleteMultipleEmploye(integers);
		
		String msg=b?"All passed employe deleted ":" Something went wrong";
		
		System.out.println(msg);
		
	}

}
