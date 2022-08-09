package com.empapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Empappv3Application {

	public static void main(String[] args) {
		SpringApplication.run(Empappv3Application.class, args);
	}

	@GetMapping(path = "hello")
	public String hello() {
		return "hello...";
	}
}
