package com.tcs.hibernate_mapping.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Person {
	@Id
	private int id;
	private String name;
	private String email;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="adharNumber")
	private Adhar adhar;

}
