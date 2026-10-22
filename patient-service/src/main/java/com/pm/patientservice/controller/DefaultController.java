package com.pm.patientservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DefaultController {
	@GetMapping
	ResponseEntity<String> sayHello() {
		String helloString = "Hello, the server is running!";
		return ResponseEntity.ok().body(helloString);
	}
}
