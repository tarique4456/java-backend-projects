package com.hcl.spring_boot_crud_with_mysql_database.mapping.one_to_one.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.spring_boot_crud_with_mysql_database.mapping.one_to_one.dao.PersonAdharDao;
import com.hcl.spring_boot_crud_with_mysql_database.mapping.one_to_one.entity.Person;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/personadhar")
@Tag(name = "PersonAdharController", description = "Operations related to Person and Adhar details")  
public class PersonAdharController {

	private final PersonAdharDao personAdharDao;
	
	
	
	public PersonAdharController(PersonAdharDao personAdharDao) {
		super();
		this.personAdharDao = personAdharDao;
	}



	@PostMapping("/savePersonAdhar")
	 // Example of an endpoint to get a Person by ID
    @Operation(
        summary = "Get a Person by ID",
        description = "Fetches a person and their Adhar details using the person's ID",
        tags = { "PersonAdhar" },  // Optional: you can add tags here too
        parameters = {
            @Parameter(name = "id", description = "ID of the person to retrieve", required = true)
        })
	public Person savePersonDao(@RequestBody Person person) {
		return personAdharDao.savePersonDao(person);
	}
	
	@GetMapping("/getPersonById/{id}")
	public Person getPersonById(@PathVariable(name = "id") int id) {
		return personAdharDao.getPersonById(id);
	}
}
