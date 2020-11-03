package com.cashapona.springboothelloworld.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping("/helloo")
	public String hello()   
	{  
	return "Hello World";  
	}

	@RequestMapping("/welocme")
	public String welcomeSpringBoot()   
	{  
	return "Welcome to spring boot application";  
	}
}
