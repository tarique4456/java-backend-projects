package com.servlet.jdbc_crud_with_servlet_api.controller;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.servlet.jdbc_crud_with_servlet_api.dao.EmployeDao;
import com.servlet.jdbc_crud_with_servlet_api.dto.Employe;

public class InsertMultipleEmploye {
	public static void main(String[] args) {
		Employe employe=new Employe();
		
		employe.setId(1563);
		employe.setName("Dhoni");
		employe.setEmail("dhoni12@gmail.com");
		employe.setPassword("dhoni123");
		employe.setPhone(6573484844L);
		employe.setDoj(LocalDate.parse("1991-09-25"));
		employe.setDesignation("Python developer");
		employe.setGender("male");
		
		Employe employe1=new Employe();
		employe1.setId(74556);
		employe1.setName("Kohli");
		employe1.setEmail("kohli455@gmail.com");
		employe1.setPassword("kohli123");
		employe1.setPhone(6723905634L);
		employe1.setDoj(LocalDate.parse("1994-06-12"));
		employe1.setDesignation("SQL developer");
		employe1.setGender("male");
		
		List<Employe> employes=Arrays.asList(employe,employe1);
		
		List<Employe>employe2=new EmployeDao().saveMultipleEmployeDao(employes);
		
	}

}
