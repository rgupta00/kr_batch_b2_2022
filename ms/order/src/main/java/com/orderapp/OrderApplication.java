package com.orderapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class OrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

	//this project will intract with other using restTemplate.. i need to configre it
	
	@Bean
	public RestTemplate getRestTemplate() {
	 return	new RestTemplate();
	}
}
