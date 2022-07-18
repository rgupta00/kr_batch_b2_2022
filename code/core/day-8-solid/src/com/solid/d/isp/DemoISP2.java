package com.solid.d.isp;

//I			S			P
interface Flyable {
	public void fly();
}

interface Swimable {
	public void swim();
}

class Bird {
	public void eat() {
		System.out.println("eat the food");
	}

}

class Duck extends Bird implements Swimable {
	@Override
	public void swim() {
		System.out.println("good in swiming");
	}

}

class Eagle extends Bird implements Flyable {
	@Override
	public void fly() {
		System.out.println("fly like God of flying");
	}
}

class Emu extends Bird {

}

public class DemoISP2 {

	public static void main(String[] args) {
		Emu e = new Emu();
		e.eat();
		
		Eagle eagle=new Eagle();
		
	}

}
