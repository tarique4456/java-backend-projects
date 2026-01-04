package com.tcs.hibernate_mapping.one_to_many_Bidirectional.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Country1 {
	
	@Id
	private int id;
	private String name;
	private String capital;
	@OneToMany(cascade=(CascadeType.PERSIST) ,mappedBy = "country")
	List<States1>states;
	
	

}
