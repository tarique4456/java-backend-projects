package com.tcs.hibernate_mapping_One_To_One_Bidirectional.controller;

import java.time.LocalDate;

import com.tcs.hibernate_mapping_One_To_One_Bidirectional.dao.Person1Adhar1Dao;
import com.tcs.hibernate_mapping_One_To_One_Bidirectional.entity.Adhar1;
import com.tcs.hibernate_mapping_One_To_One_Bidirectional.entity.Person1;

public class InsertPerson1Adhar1Controller {
	public static void main(String[] args) {
		
		Adhar1 adhar=new Adhar1();
		adhar.setAdharNumber(65653708);
		adhar.setFatherName("Saleem Khan");
		adhar.setDob(LocalDate.parse("1990-09-23"));
		adhar.setAddress("Mumbai");
		
		Person1 person=new Person1();
		person.setId(101);
		person.setName("Salman Khan");
		person.setEmail("salman@gmail.com");
		
		person.setAdhar(adhar);
		
		new Person1Adhar1Dao().SavePerson(person);
		
		
	}
	
	

}
