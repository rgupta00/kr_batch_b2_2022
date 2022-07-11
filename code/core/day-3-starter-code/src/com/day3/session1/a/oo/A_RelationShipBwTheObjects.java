package com.day3.session1.a.oo;
//A passanger is moving from LN to Noida "using" metro

class Car{
	public void move(String s, String d) {
		System.out.println(" passanger is moving from "+ s + " to "+ d+ "using car");
	}
}

class Bike{
	public void move(String s, String d) {
		System.out.println(" passanger is moving from "+ s + " to "+ d+ "using bike");
	}
}

class Metro{
	public void move(String s, String d) {
		System.out.println(" passanger is moving from "+ s + " to "+ d+ "using metro");
	}
}

class Passanger{
	private String name;
	public Passanger(String name) {
		this.name = name;
	}

	public void travel(String s, String d, Bike bike) {
		System.out.println("name: "+ name);
		bike.move(s, d);
	}
}
public class A_RelationShipBwTheObjects {
	
	public static void main(String[] args) {
		//foolish code: if u have one change in the req... ur code have to change at many places :(
		Bike bike=new Bike();
		Passanger passanger=new Passanger("raj");
		passanger.travel("Preet Vihar", "CP", bike);
	}

}



