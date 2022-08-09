package com.empapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmpappV1Application implements CommandLineRunner {

	private Logger logger=LoggerFactory.getLogger(EmpappV1Application.class);
	
	public static void main(String[] args) {
		SpringApplication.run(EmpappV1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		logger.info("emp are added...");
	}
}
