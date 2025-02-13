package com.ust.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
	
	@GetMapping
	public ResponseEntity<?> hello() {
//		return "Hello world by my REST api. Thiis is a change done now";
		return new ResponseEntity<>("Hello world", HttpStatus.OK);
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
