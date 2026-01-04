package com.tcs.hibernate_mapping_One_To_One_Bidirectional.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person1 {
	
	@Id
	private int id;
	private String name;
	private String email;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="adhar_id")
	private Adhar1 adhar;

}
