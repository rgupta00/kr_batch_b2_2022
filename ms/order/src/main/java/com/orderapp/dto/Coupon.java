package com.orderapp.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Coupon {
	
	private String id;
	private String code;
	private int discount;
	private LocalDateTime expriationDate;
	
}
