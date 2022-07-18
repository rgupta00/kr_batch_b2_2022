package com.solid.e.dip.prob1;

public class Car {
	private Engine engine;
	private Tyre tyre;
	
	//pull vs push
	public Car(Engine engine, Tyre tyre) {
		this.engine=engine;
		this.tyre=tyre;
	}
	
	public void drive() {
		engine.move();
		tyre.rotate();
	}
}
