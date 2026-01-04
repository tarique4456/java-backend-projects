package com.tcs.hibernate_mapping.one_to_many_Bidirectional.dao;

import java.util.List;

import com.tcs.hibernate_mapping.one_to_many_Bidirectional.entity.Country1;
import com.tcs.hibernate_mapping.one_to_many_Bidirectional.entity.States1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Country1State1Dao {
	public Country1 saveCountry1State1Dao(Country1 country,List<States1>states) {
		EntityManager em=Persistence.createEntityManagerFactory("jpa").createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		if(country==null || states.isEmpty()) {
			return null;
		}
		
		try {
			et.begin();
			em.persist(country);
			et.commit();
			return country;
			
		}catch(Exception e) {
			e.printStackTrace();
			et.rollback();
			return null;
			
		}finally {
			em.close();
		}
			
	}

}
