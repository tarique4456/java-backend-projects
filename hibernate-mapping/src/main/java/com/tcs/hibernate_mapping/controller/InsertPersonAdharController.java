package com.tcs.hibernate_mapping.controller;

import java.time.LocalDate;

import com.tcs.hibernate_mapping.dao.PersonAdharDao;
import com.tcs.hibernate_mapping.entity.Adhar;
import com.tcs.hibernate_mapping.entity.Person;

public class InsertPersonAdharController {
	public static void main(String[] args) {
		Adhar adhar=new Adhar();
		adhar.setAdharNumber(65873437);
		adhar.setFatherName("Salman");
		adhar.setAddress("Mumbai");
		adhar.setDob(LocalDate.parse("1996-08-04"));
		
		Person person=new Person();
		person.setId(4549);
		person.setName("No One");
		person.setEmail("Noone@gmail.com");
		person.setAdhar(adhar);
		
		new PersonAdharDao().savePersonAdharDao(person, adhar);
	}

}
