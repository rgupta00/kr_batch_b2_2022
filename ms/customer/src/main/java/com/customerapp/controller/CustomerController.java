package com.customerapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.customerapp.dao.Customer;

@RestController
public class CustomerController {

	@GetMapping("customers/{id}")
	public Customer getCustomer(@PathVariable(name = "id") int id) {
		return new Customer(id, "foo "+ id, "foo@gmail");
		
	}
}
