package com.day3.session1.c.interface_break_hierarchy;
//interface  break the hierarchy

interface Jumpable {
	public void canJump();
}

class Monkey implements Jumpable {
	public void canJump() {
		System.out.println("i love jumping.original monkish jump.");
	}

	public void stayOnTree() {
		System.out.println("i love staying on tree");
	}

	public void biteTheKid() {
		System.out.println(" bite..");
	}
}

class Kid implements Jumpable {

	public void goToSchool() {
		System.out.println("going to school :(");
	}

	@Override
	public void canJump() {
		System.out.println("i am a school champion in jumping");
	}
}

public class DemoInterfaceBerakTheHier {

	public static void main(String[] args) {
		Kid kids = new Kid();
		kids.canJump();
	}
}
