package com.tcs.hibernate_mapping_One_To_One_Bidirectional.dao;

import com.tcs.hibernate_mapping_One_To_One_Bidirectional.entity.Adhar1;
import com.tcs.hibernate_mapping_One_To_One_Bidirectional.entity.Person1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Person1Adhar1Dao {
	
	EntityManager em=Persistence.createEntityManagerFactory("jpa").createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public Person1 SavePerson(Person1 person) {
		et.begin();
		em.persist(person);
		et.commit();
		return person;
		
	}
	public Person1 getPerson(int id) {
		return em.find(Person1.class, id);
		
	}
	public Adhar1 getAdhar(long adharNumber) {
		return em.find(Adhar1.class, adharNumber);
	}
			

}
