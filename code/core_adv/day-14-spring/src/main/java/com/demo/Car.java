package com.demo;

public class Car {
	
	private Engine engine;
	private Tyre tyre;
	
	public Car() {
		engine=new V8Engine();
		tyre=new MrfTyre();
	}
	
	public void drive() {
		engine.move();
		tyre.rotate();
	}
	
}
