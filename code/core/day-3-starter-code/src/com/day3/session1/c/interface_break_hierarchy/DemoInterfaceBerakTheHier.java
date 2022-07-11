package com.day3.session1.c.interface_break_hierarchy;
//interface  break the hierarchy

class Monkey {
	public void canJump() {
		System.out.println("i love jumping.original monkish jump.");
	}

	public void stayOnTree() {
		System.out.println("i love staying on tree");
	}

	public void biteTheKid() {
		System.out.println("i love biteTheKid");
	}
}

class Kid extends Monkey {

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

	}
}
