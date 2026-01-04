package com.tcs.hibernate_mapping.controller;

import com.tcs.hibernate_mapping.dao.PersonAdharDao;
import com.tcs.hibernate_mapping.entity.Person;

public class GetPersonAdharByPersonController {
	public static void main(String[] args) {
		PersonAdharDao adharDao=new PersonAdharDao();
		
		Person person=adharDao.getPersonByIdDao(4549);
		if(person!=null) {
			System.out.println(person.getId());
		}
	}

}
