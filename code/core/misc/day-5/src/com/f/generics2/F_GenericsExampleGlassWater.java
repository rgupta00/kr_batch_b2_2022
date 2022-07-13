package com.f.generics2;

// i want a glass that can hold any drinkable liquid
class Flowable{}

interface Drinkable{}

class Petrol extends Flowable {
}
class Water extends Flowable implements Drinkable {
}

class Juice extends Flowable implements Drinkable {
}

class Cake {
}

class Glass<T extends Flowable & Drinkable> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

public class F_GenericsExampleGlassWater {

	public static void main(String[] args) {
		Glass<Juice> glass = new Glass<>();

//		glass.setT(new Petrol());
//
//		Petrol juice = glass.getT();

	}
}
