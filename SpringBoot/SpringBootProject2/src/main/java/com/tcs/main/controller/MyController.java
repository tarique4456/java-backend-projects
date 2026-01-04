package com.tcs.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	@GetMapping("/myController")
	@ResponseBody
	public String printHello() {
		return "Hello World";
	}

}
