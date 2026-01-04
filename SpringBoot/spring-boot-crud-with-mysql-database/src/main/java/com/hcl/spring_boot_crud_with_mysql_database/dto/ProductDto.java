package com.hcl.spring_boot_crud_with_mysql_database.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class ProductDto {

	private int id;
	@NotEmpty(message = "Product name must not be empty")
	private String name;
	private String color;
	@Positive(message = "Price must be greater than zero")
	private double price;
	@PastOrPresent(message = "Manufacturing date must be in the past or present")
	private LocalDate mfd;
	@FutureOrPresent(message = "Expiry date must be in the present or future")
	private LocalDate expd;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getMfd() {
		return mfd;
	}
	public void setMfd(LocalDate mfd) {
		this.mfd = mfd;
	}
	public LocalDate getExpd() {
		return expd;
	}
	public void setExpd(LocalDate expd) {
		this.expd = expd;
	}
	@Override
	public String toString() {
		return "ProductDto [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + ", mfd=" + mfd
				+ ", expd=" + expd + "]";
	}

	
}
