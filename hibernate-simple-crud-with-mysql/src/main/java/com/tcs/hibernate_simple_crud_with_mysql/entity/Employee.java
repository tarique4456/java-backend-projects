package com.tcs.hibernate_simple_crud_with_mysql.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
	
	@Id
	private int id;
	private String name;
	@Column(unique=true,nullable=false)
	private String email;
	private String password;
	private double salary;
	private LocalDate doj;
	

}
