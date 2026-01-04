package com.tcs.hibernate_mapping.one_to_many_Bidirectional.controller;

import java.util.ArrayList;
import java.util.List;

import com.tcs.hibernate_mapping.one_to_many_Bidirectional.dao.Country1State1Dao;
import com.tcs.hibernate_mapping.one_to_many_Bidirectional.entity.Country1;
import com.tcs.hibernate_mapping.one_to_many_Bidirectional.entity.States1;



public class InsertCountry1State1Controller {
public static void main(String[] args) {
		
		States1 state1=new States1();
		state1.setId(103);
		state1.setName("Utter Pradesh");
		state1.setCapital("Lucknow");
		state1.setPopulation(646746824);
		
		States1 state2=new States1();
		state2.setId(104);
		state2.setName("Jharkhand");
		state2.setCapital("Ranchi");
		state2.setPopulation(4500000);
		
		List<States1> states=new ArrayList<States1>();
		states.add(state1);
		states.add(state2);
		
		Country1 country =new Country1();
		country.setId(92);
		country.setName("INDIA");
		country.setCapital("New-Delhi");
		country.setStates(states);
		
		state1.setCountry(country);
		state2.setCountry(country);
		
		
		new Country1State1Dao().saveCountry1State1Dao(country, states);
	}

}
