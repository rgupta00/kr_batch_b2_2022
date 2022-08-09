package com.orderapp.controller;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.orderapp.dto.Coupon;
import com.orderapp.dto.Customer;
import com.orderapp.dto.OrderRequest;
import com.orderapp.dto.OrderResponse;
import com.orderapp.dto.Product;

@RestController
public class OrderController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	//i want to provide a post method so that user can send a 
	//order req and this will send hime order conf object
	
	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping(path = "order")
	public OrderResponse  addOrder(@RequestBody  OrderRequest orderRequest) {
		//we get customer infor
		Customer customer=restTemplate
				.getForObject("http://CUSTOMER-APP/customerapp/customers/"+orderRequest.getCid(), Customer.class);
		
		//we get product infr
		Product product=restTemplate
				.getForObject("http://PRODUCT-APP/productapp/products/"+orderRequest.getPid(), Product.class);
		
		
		//we get discount coupon
		Coupon coupon=restTemplate
				.getForObject("http://COUPON-APP/couponapp/coupons/"+orderRequest.getDiscountCoupon(), Coupon.class);
		
		OrderResponse orderResponse=new OrderResponse();
		orderResponse.setId(UUID.randomUUID().toString());
		orderResponse.setCustomer(customer);
		orderResponse.setProduct(product);
		//calculate the discounted price
		double discountedPrice=orderRequest.getQty()*product.getPrice()*(100-coupon.getDiscount())/100;
		orderResponse.setTotalAmount(discountedPrice);
		orderResponse.setVendorName("krishna store");
		
		orderResponse.setOrderDate(LocalDate.now());
		return orderResponse;
		
	}

}














