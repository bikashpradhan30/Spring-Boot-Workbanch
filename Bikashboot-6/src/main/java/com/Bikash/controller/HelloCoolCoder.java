package com.Bikash.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloCoolCoder {

	@RequestMapping("/Welcome")
	public String wish() {
		return "Welcome To Springboot Api calls..";
	}
	
	@RequestMapping("/Hii")
	public String greet() {
		return "Welcome To Coolcoder Institute..";
	}
}
