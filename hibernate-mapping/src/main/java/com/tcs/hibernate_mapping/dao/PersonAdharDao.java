package com.tcs.hibernate_mapping.dao;

import com.tcs.hibernate_mapping.entity.Adhar;
import com.tcs.hibernate_mapping.entity.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class PersonAdharDao {
	
	EntityManager em=Persistence.createEntityManagerFactory("jpa").createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public Person savePersonAdharDao(Person person ,Adhar adhar) {
		if(person==null||adhar==null) {
			return null;
		}
		et.begin();
		em.persist(adhar);
		em.persist(person);
		et.commit();
		
		return person;
	}
	
	public Person getPersonByIdDao(int personId) {
		return em.find(Person.class, personId);
	}
	
	public boolean deleteAdharByAdharNumberDao(long adharNumber) {
		
		Adhar adhar=em.find(Adhar.class, adharNumber);
		if(adhar==null) {
			return false;
		}
		Query query=em.createNativeQuery("Select * from person where adharNumber=?1",Person.class);
		
		query.setParameter(1, adharNumber);
		
		Person person= (Person) query.getSingleResultOrNull();
		
		if(person==null) {
			return false;
			
		}
		
		person.setAdhar(null);
		
		et.begin();
		em.merge(person);
		em.remove(adhar);
		et.commit();
		System.out.println("Adhar Deleted Successfullly");
		return true;
		
	}
//	public Person getPersonByIdDao1(int personId) {
//		return em.find(Person.class, personId);
//	}

}
