package com.day1.session2.ex6;

import java.util.Optional;

//Optional ---> flatMap
/*
 * 		may have a	 may hv ins		but must have name
 * Person -----> Car---> Insurance--> name
 */
class Insurance {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class Car {
	private Insurance insurance;

	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

}

class Person {
	private Car car;	//syn symentic

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

}

public class DemoOptional {

	public static void main(String[] args) {

		Insurance insurance=null;
		
		Car car=new Car();
		car.setInsurance(insurance);
		
		Person person=new Person();
		person.setCar(car);
		
		System.out.println(getInsuranceName(person));
	}
	
	public static String getInsuranceName(Person person) {
		if(person!=null) {
			Car car=person.getCar();
			if(car!=null) {
				Insurance insurance=car.getInsurance();
				if(insurance!=null) {
					
				}
			}
		}
		
		return person.getCar().getInsurance().getName();
	}
}




