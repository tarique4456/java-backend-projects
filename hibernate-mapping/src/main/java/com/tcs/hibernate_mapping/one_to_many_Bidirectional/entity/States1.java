package com.tcs.hibernate_mapping.one_to_many_Bidirectional.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class States1 {
	
	@Id
	private int id;
	private String name;
	private String capital;
	private double population;
	@ManyToOne
	@JoinColumn(name="country_id")
	private Country1 country;

}
