package com.tcs.hibernate_mapping.controller;

import com.tcs.hibernate_mapping.dao.PersonAdharDao;
import com.tcs.hibernate_mapping.entity.Person;

public class GetPersonByIdController {
	public static void main(String[] args) {
		Person person=new PersonAdharDao().getPersonByIdDao(4549);
		
		if(person==null) {
			System.out.println("Person Not Found");
		}
		else {
			System.out.println(person);
		}
	}

}
