package com.tcs.springboot_crud_with_mysql_database.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Entity
@Data
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE ,generator = "product_seq")
	@SequenceGenerator(name="product_seq", schema="product.product_seq",
	initialValue = 101,allocationSize = 1)
	private int id;
	@NotEmpty (message="Product name must not be Empty!!")
	private String name;
	private String color;
	private double price;
	private LocalDate mfd;
	private LocalDate expd;
	

}
