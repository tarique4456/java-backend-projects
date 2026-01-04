package com.servlet.jdbc_crud_with_servlet_api.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Employe implements Serializable{
	
	private int id;
	private String name;
	private String email;
	private String password;
	private long phone;
	private LocalDate doj;
	private String designation;
	private String gender;
	
	
	// to generate parameter and non parameter constructor alt+sa
	public  Employe() {
		super();
	}
	
	public Employe(int id, String name, String email, String password, long phone, LocalDate doj, String designation,
			String gender) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.doj = doj;
		this.designation = designation;
		this.gender = gender;
	}



	// to generate getter and setter alt+shift+sr
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}


	
	// to generate equals and hashcode alt+shift+sh
	@Override
	public int hashCode() {
		return Objects.hash(designation, doj, email, gender, id, name, password, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		return Objects.equals(designation, other.designation) && Objects.equals(doj, other.doj)
				&& Objects.equals(email, other.email) && Objects.equals(gender, other.gender) && id == other.id
				&& Objects.equals(name, other.name) && Objects.equals(password, other.password) && phone == other.phone;
	}
	
	
	// toString alt+shift+ss
	
	@Override
	public String toString() {
		return "Employe [ID=" + id + ", Name=" + name + ", Email=" + email + ", Password=" + password + ", Phone="
				+ phone + ", DOJ=" + doj + ", Designation=" + designation + ", Gender=" + gender + "]";
	}
	
	
	
	
	

	

}
