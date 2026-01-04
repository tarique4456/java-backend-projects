package com.tcs.hibernate_mapping_One_To_One_Bidirectional.controller;

import com.tcs.hibernate_mapping_One_To_One_Bidirectional.dao.Person1Adhar1Dao;
import com.tcs.hibernate_mapping_One_To_One_Bidirectional.entity.Adhar1;

public class FetchFromAdhar1Controller {
	public static void main(String[] args) {
		Person1Adhar1Dao dao=new Person1Adhar1Dao();
		Adhar1 adhar=dao.getAdhar(65653708);
		if(adhar==null) {
			System.out.println("Person not Found");
		}
		else {
			System.out.println(adhar);
		}
	}

}
