package com.hcl.spring_boot_crud_with_mysql_database.mapping.one_to_one.dao;

import org.springframework.stereotype.Repository;

import com.hcl.spring_boot_crud_with_mysql_database.mapping.one_to_one.entity.Person;
import com.hcl.spring_boot_crud_with_mysql_database.mapping.one_to_one.repository.AdharRepository;
import com.hcl.spring_boot_crud_with_mysql_database.mapping.one_to_one.repository.PersonRepository;

@Repository
public class PersonAdharDao {

	private final PersonRepository personRepository;
	
	private final AdharRepository adharRepository;

	
	public PersonAdharDao(PersonRepository personRepository, AdharRepository adharRepository) {
		super();
		this.personRepository = personRepository;
		this.adharRepository = adharRepository;
	}

	public Person savePersonDao(Person person) {
		return personRepository.save(person);
	}
	
	public Person getPersonById(int id) {
		return personRepository.findById(id)
				.orElseThrow(()-> new RuntimeException("Person not found with id: " + id));
	}
}
