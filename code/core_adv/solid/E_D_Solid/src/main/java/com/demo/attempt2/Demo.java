package com.demo.attempt2;

public class Demo {

	public static void main(String[] args) {
		Tyre tyre=new MrfTyre();
		Engine engine=new TurboEngine();
		//seat
		//
		
		//
		
		//
		//poor car class is rep for pulling the dep
		
		Car car =new Car(engine, tyre);//somehow we want to use push model
		car.drive();
	}
}
