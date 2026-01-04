package com.tcs.SpringBootProject3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class myController {
	
	@GetMapping("/")
	@ResponseBody
	public String name() {
		return "Tarique";
	}

}
