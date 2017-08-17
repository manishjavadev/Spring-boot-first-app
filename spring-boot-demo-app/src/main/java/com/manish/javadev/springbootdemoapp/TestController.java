package com.manish.javadev.springbootdemoapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testcontroller")
public class TestController {
	@GetMapping("/welcome")
	public String testMethod() {
		return "manish test";

	}
}
