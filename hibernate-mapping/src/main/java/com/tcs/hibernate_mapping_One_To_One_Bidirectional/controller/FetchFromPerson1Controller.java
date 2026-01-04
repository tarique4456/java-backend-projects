package com.tcs.hibernate_mapping_One_To_One_Bidirectional.controller;

import com.tcs.hibernate_mapping_One_To_One_Bidirectional.dao.Person1Adhar1Dao;
import com.tcs.hibernate_mapping_One_To_One_Bidirectional.entity.Person1;

public class FetchFromPerson1Controller {
	public static void main(String[] args) {
		Person1Adhar1Dao dao=new Person1Adhar1Dao();
		Person1 person=dao.getPerson(101);
		
		if(person==null) {
			System.out.println("Person Not found");
		}
		else {
			System.out.println(person);
		}
	}

}
