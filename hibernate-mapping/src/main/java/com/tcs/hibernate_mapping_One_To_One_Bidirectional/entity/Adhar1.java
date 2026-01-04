package com.tcs.hibernate_mapping_One_To_One_Bidirectional.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude="person")
public class Adhar1 {
	
	@Id
	private long AdharNumber;
	private String fatherName;
	private LocalDate dob;
	private String address;
	
	@OneToOne(mappedBy = "adhar")
	private Person1 person;
	

}
