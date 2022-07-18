package com.dp.creational.c.builder_prob;

public class Vehical {
	//required parameter
	private String engine;
	private int wheel;
	//optional parameter
	private int airbag;
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public int getWheel() {
		return wheel;
	}
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	public int getAirbag() {
		return airbag;
	}
	public void setAirbag(int airbag) {
		this.airbag = airbag;
	}
	public Vehical(String engine, int wheel, int airbag) {
		this.engine = engine;
		this.wheel = wheel;
		this.airbag = airbag;
	}
	public Vehical(String engine, int wheel) {
		this.engine = engine;
		this.wheel = wheel;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vehical [engine=").append(engine).append(", wheel=").append(wheel).append(", airbag=")
				.append(airbag).append("]");
		return builder.toString();
	}
	
	
	
}
