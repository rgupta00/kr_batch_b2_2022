package com.day3.session1.a.oo;

import java.util.Scanner;

abstract class Shape {
	
	private String color;

	public Shape(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	
	public abstract void draw();
}

class  Square extends Shape {
	private String color;

	public Square(String color) {
		super(color);
	}

	public void draw() {
		System.out.println("b * h"+" color of shape : "+ super.getColor());
	}
}

class  Circle extends Shape {
	private String color;

	public Circle(String color) {
		super(color);
	}

	public void draw() {
		System.out.println("PI r* r"+ " color of shape : "+ super.getColor()) ;
	}
}


public class B_NeedOfAbtractClassAndPolymorphism {

	public static void main(String[] args) {

		//Polymorphism? u can swap impl at run time ...
		Shape shape=null;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("PE ur choice 1:Sq and 2.Circle");
		int choice= scanner.nextInt();
		if(choice==1)
			shape=new Square("red");
		else if(choice==2)
			shape=new Circle("red");
		
		if(shape!=null)
			shape.draw();
	}
}





