package com.tcs.hibernate_mapping.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString(exclude=("person"))
public class Adhar {
	@Id
	private long adharNumber;
	private String fatherName;
	private LocalDate dob;
	private String address;
	
	@OneToOne(mappedBy="adhar")
	private Person person;

}
