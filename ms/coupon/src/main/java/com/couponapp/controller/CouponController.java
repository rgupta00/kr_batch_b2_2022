package com.couponapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.couponapp.dao.Coupon;
import com.couponapp.dao.CouponDao;

@RestController
public class CouponController {

	private CouponDao couponDao;
	
	@Autowired
	public CouponController(CouponDao couponDao) {
		this.couponDao = couponDao;
	}
	
	@GetMapping(path = "coupons/{code}")
	public Coupon getByCode( @PathVariable(name = "code") String couponCode) {
		return couponDao.getCoupon(couponCode);
	}
}














