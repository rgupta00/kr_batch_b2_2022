package com.day3.session1.c.interface_break_hierarchy2;

import java.util.UUID;

public class Invoice implements Payable {

	private String invoiceId;
	private String consulantName;
	private double pricePerDay;
	private int noOfDays;

	///
	public Invoice(String consulantName, double pricePerDay, int noOfDays) {
		this.invoiceId = UUID.randomUUID().toString();
		this.consulantName = consulantName;
		this.pricePerDay = pricePerDay;
		this.noOfDays = noOfDays;
	}

	@Override
	public String toString() {
		return "Invoice [invoiceId=" + invoiceId + ", consulantName=" + consulantName + ", pricePerDay=" + pricePerDay
				+ ", noOfDays=" + noOfDays + "]";
	}

	@Override
	public double getPay() {
		return pricePerDay * noOfDays * 0.8;
	}

}
