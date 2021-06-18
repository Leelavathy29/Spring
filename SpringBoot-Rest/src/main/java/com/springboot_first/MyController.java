package com.springboot_first;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class MyController {

	
	@GetMapping("/user")
	public String sayHello() {
		return "Welcome to Spring Boot Controller ";
	}
	
	
	@GetMapping("/test")
	public String sayTest() {
		return "Welcome to Spring Boot Test Controller ";
	}
	
	
	@GetMapping("/listuser")
	public List<String> listOfUsers() {
		return Arrays.asList("Madhavan", "Damodharan", "Keerthi");
	}
	
	
	@PostMapping("/liststudent")
	public List<String> listOfStudents() {
		return Arrays.asList("Leela", "Abi", "Madhu");
	}
	
	
}
