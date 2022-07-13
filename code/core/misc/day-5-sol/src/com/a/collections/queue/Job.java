package com.a.collections.queue;

public class Job {
	
	private int id;
	private double pricePerHr;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPricePerHr() {
		return pricePerHr;
	}
	public void setPricePerHr(double pricePerHr) {
		this.pricePerHr = pricePerHr;
	}
	public Job(int id, double pricePerHr) {
		super();
		this.id = id;
		this.pricePerHr = pricePerHr;
	}
	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Job [id=").append(id).append(", pricePerHr=").append(pricePerHr).append("]");
		return builder.toString();
	}
	
	

}
