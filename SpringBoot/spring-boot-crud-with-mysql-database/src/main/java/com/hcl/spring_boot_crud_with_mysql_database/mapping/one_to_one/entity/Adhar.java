package com.hcl.spring_boot_crud_with_mysql_database.mapping.one_to_one.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Adhar {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long adharNo;
	private String address;
	
	@OneToOne(mappedBy = "adhar")
	@JsonIgnore
	private Person person;

	public long getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	
	
}
