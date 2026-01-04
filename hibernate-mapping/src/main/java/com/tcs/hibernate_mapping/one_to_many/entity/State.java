package com.tcs.hibernate_mapping.one_to_many.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class State {
	
	@Id
	private int id;
	private String name;
	private String capital;
	private long pupulation;

}
