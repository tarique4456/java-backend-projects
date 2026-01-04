package com.tcs.hibernate_mapping.one_to_many.controller;

import java.util.ArrayList;
import java.util.List;

import com.tcs.hibernate_mapping.one_to_many.dao.CountryStateDao;
import com.tcs.hibernate_mapping.one_to_many.entity.State;

public class InsertNewStateToExistingCountryController {
	
	public static void main(String[] args) {
		
		State state1=new State();
		state1.setId(107);
        state1.setName("Punjab");
        state1.setCapital("Chandigarh");
        state1.setPupulation(30000000);

        State state2 = new State();
        state2.setId(108);
        state2.setName("Kerala");
        state2.setCapital("Thiruvananthapuram");
        state2.setPupulation(35000000);
        
        List<State>states=new ArrayList<>();
        states.add(state1);
        states.add(state2);
        
        int ExistingCountryId=91;
        
        CountryStateDao dao=new CountryStateDao();
        
        dao.saveStatesAndConnectToCountryDao(ExistingCountryId, states);
        
        System.out.println("New States successfully added to country id "+ExistingCountryId);
        
	}

}
