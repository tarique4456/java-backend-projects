package com.tcs.hibernate_mapping.one_to_many.dao;

import java.util.List;

import com.tcs.hibernate_mapping.one_to_many.entity.Country;
import com.tcs.hibernate_mapping.one_to_many.entity.State;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class CountryStateDao {
	
	public Country saveCountryStateDao(Country country,List<State>states) {
		
		EntityManager em=Persistence.createEntityManagerFactory("jpa").createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		if(country==null || states.isEmpty()) {
			return null;
			
		}
		try {
			et.begin();
			
//			for(State state:states) {
//				em.persist(state);
//			}
//			
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
	
	public Country saveStatesAndConnectToCountryDao(int countryId,List<State>states) {
		
		EntityManager em=Persistence.createEntityManagerFactory("jpa").createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		if(states.isEmpty()) {
			return null;
		}
		
		try {
			
			Country country=em.find(Country.class, countryId);
			
			if(country!=null) {
				
				et.begin();
				
				for(State state:states) {
					em.persist(state);
					
					Query query=em.createNativeQuery("Insert into country_state(Country_id,states_id) values(?1,?2)");
					
					query.setParameter(1,country.getId());
					query.setParameter(2,state.getId());
					
					query.executeUpdate();
				}
				et.commit();
				return country;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			et.rollback();
			return null;
			
		}
		finally {
			em.close();
		}
		return null;
	}

}




