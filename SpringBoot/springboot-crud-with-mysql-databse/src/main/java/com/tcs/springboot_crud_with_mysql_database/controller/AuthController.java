//package com.tcs.springboot_crud_with_mysql_database.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.tcs.springboot_crud_with_mysql_database.entity.User;
//import com.tcs.springboot_crud_with_mysql_database.repository.UserRepository;
//
//@RestController
//@RequestMapping("/auth")
//public class AuthController {
//	
//	@Autowired
//	private UserRepository userRepository;
//	
//	@Autowired
//	private PasswordEncoder passwordEncoder;
//	
//	@PostMapping("/register")
//	public ResponseEntity<?> register(@RequestBody User user){
//		
//		user.setPassword(passwordEncoder.encode(user.getPassword()));
//		user.setRole("USER");
//		
//		userRepository.save(user);
//		
//		return ResponseEntity.ok("User Registered Succcessfully");
//		
//	}
//
//}
