package com.productapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.productapp.dao.Product;

@RestController
public class ProuductController {
	@GetMapping(path = "products/{id}")
	public Product getProductById(@PathVariable(name = "id")int id) {
		return new Product(id, "laptop", 67000);
	}
}


