package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	
	/*@RequestMapping(value="/hello")
	public String sayHello(){
		System.out.println("at hello level");
		return "hello, People";
	}
	*/
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(){
		System.out.println("at root level");
		return "login";
	}

}
