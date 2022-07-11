package com.day3.session1.a.oo;

class Shape {
	private String color;

	public Shape(String color) {
		this.color = color;
	}

	public void draw() {
		System.out.println("dont know which shape");
	}
}

class  Square extends Shape {
	private String color;

	public Square(String color) {
		super(color);
	}

	public void draw() {
		System.out.println("b * h");
	}
}

class  Circle extends Shape {
	private String color;

	public Circle(String color) {
		super(color);
	}

	public void draw() {
		System.out.println("PI r* r");
	}
}


public class B_NeedOfAbtractClassAndPolymorphism {

	public static void main(String[] args) {

	}
}
