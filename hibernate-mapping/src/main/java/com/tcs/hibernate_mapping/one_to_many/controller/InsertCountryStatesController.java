package com.tcs.hibernate_mapping.one_to_many.controller;

import java.util.ArrayList;
import java.util.List;

import com.tcs.hibernate_mapping.one_to_many.dao.CountryStateDao;
import com.tcs.hibernate_mapping.one_to_many.entity.Country;
import com.tcs.hibernate_mapping.one_to_many.entity.State;

public class InsertCountryStatesController {
	public static void main(String[] args) {
		
		State state1=new State();
		state1.setId(106);
		state1.setName("Utter Pradesh");
		state1.setCapital("Lucknow");
		state1.setPupulation(223344555);
		
		State state2=new State();
		state2.setId(105);
		state2.setName("Jharkhand");
		state2.setCapital("Ranchi");
		state2.setPupulation(4500000);
		
		List<State> states=new ArrayList<State>();
		states.add(state1);
		states.add(state2);
		
		Country country =new Country();
		country.setId(93);
		country.setName("INDIA");
		country.setCapital("New-Delhi");
		country.setStates(states);
		
		new CountryStateDao().saveCountryStateDao(country, states);
	}

}
