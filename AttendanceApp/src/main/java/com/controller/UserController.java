package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@RequestMapping(value="/hello")
	public String sayHello(){
		System.out.println("at hello level");
		return "hello, People";
	}
	
	@RequestMapping(value="/")
	public String root(){
		System.out.println("at root level");
		return "Hi, visitor";
	}

}
