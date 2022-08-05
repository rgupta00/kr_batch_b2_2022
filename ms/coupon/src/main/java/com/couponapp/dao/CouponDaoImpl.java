package com.couponapp.dao;

import java.time.LocalDateTime;
import java.util.*;

import org.springframework.stereotype.Repository;
@Repository
public class CouponDaoImpl implements CouponDao {

	@Override
	public Coupon getCoupon(String couponCode) {
		Coupon coupon = new Coupon(UUID.randomUUID().toString(), couponCode, 0, LocalDateTime.now());

		if (couponCode.equalsIgnoreCase("SUP20")) {
			coupon.setDiscount(20);
		} else if (couponCode.equalsIgnoreCase("SUP10")) {
			coupon.setDiscount(10);
		} else if (couponCode.equalsIgnoreCase("SUP05")) {
			coupon.setDiscount(5);
		} else {
			coupon.setDiscount(2);
		}

		return coupon;
	}

}
