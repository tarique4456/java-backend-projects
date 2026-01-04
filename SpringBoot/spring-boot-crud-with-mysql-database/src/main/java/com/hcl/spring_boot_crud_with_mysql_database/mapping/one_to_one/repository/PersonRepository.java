package com.hcl.spring_boot_crud_with_mysql_database.mapping.one_to_one.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.spring_boot_crud_with_mysql_database.mapping.one_to_one.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
