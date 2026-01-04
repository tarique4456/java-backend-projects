package com.hcl.spring_boot_crud_with_mysql_database.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@GetMapping("/getHome")
	public String home() {
		return "Welcome to User Management System";
	}
}
