package com.hcl.spring_boot_crud_with_mysql_database.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Data
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,
	generator = "product_seq")
	@SequenceGenerator(name = "product_seq",schema = "product.product_seq"
	,initialValue = 1001,allocationSize = 1)
	private int id;
	private String name;
	private String color;
	private double price;
	private LocalDate mfd;
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
		return "Product [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + ", mfd=" + mfd
				+ ", expd=" + expd + "]";
	}
	
	
}
