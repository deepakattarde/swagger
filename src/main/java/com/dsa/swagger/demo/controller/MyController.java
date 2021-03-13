package com.dsa.swagger.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/something")
	public String getSomething() {
		System.out.println("In  something endpoint");
		return "Blah blah blah";
	}
}
