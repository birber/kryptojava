package com.project.kryptojava.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestServiceController {

	@GetMapping("/")  //tillägg till starten
	public ResponseEntity<String> get() {
		return ResponseEntity.ok("Hello World!");
	}
	
	@GetMapping("/hepp")
	public ResponseEntity<String> getHepp() {
		return ResponseEntity.ok("Hepp");
	}
}
