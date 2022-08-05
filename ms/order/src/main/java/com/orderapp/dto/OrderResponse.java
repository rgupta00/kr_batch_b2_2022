package com.orderapp.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderResponse {
	private String id;
	private double totalAmount;
	private LocalDate orderDate;
	private String vendorName;
	private Customer customer;
	private Product product;
	
}





