package com.tcs.springboot_crud_with_mysql_database.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Data;

@Data
public class ProductDTO {
	
	private int id;
	
	@NotEmpty(message="Product name must not be Empty")
	private String name;
	private String color;
	private double price;
	@PastOrPresent(message="Manufacturing date must be in the past or present")
	private LocalDate mfd;
	@FutureOrPresent (message="Expiry date must be in the present or future")
	private LocalDate expd;
	

}
