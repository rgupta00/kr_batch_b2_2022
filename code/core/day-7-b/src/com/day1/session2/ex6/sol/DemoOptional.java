package com.day1.session2.ex6.sol;

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
	private Optional<Insurance> insurance;

	public Optional<Insurance> getInsurance() {
		return insurance;
	}

	public void setInsurance(Optional<Insurance> insurance) {
		this.insurance = insurance;
	}

}

class Person {
	private Optional<Car> car; // syn symentic

	public Optional<Car> getCar() {
		return car;
	}

	public void setCar(Optional<Car> car) {
		this.car = car;
	}
}

public class DemoOptional {

	public static void main(String[] args) {

		Insurance insurance=new Insurance();
		insurance.setName("comviva");
		
		Optional<Insurance> insuranceOpt = Optional.empty();

		Car car=new Car();
		car.setInsurance(insuranceOpt);
		
		Optional<Car> carOpt = Optional.ofNullable(car);
		
		
		Person person = new Person();
		person.setCar(carOpt);
		Optional<Person>personOpt=Optional.ofNullable(person);
		

		System.out.println(getInsuranceName(personOpt));
	}

	public static String getInsuranceName(Optional<Person> personOpt) {
	
		return personOpt
				.flatMap(p-> p.getCar())
				.flatMap(c-> c.getInsurance())
				.map(i->i.getName())
				.orElse("name is not found");
	}
	
	
	
	
	
	
//	public static String getInsuranceName(Optional<Person> personOpt) {
//		//optPerson--> optCar--> optIn-->ins name
//		
////		Optional<Car> optCar = personOpt.flatMap(p-> p.getCar());
////		Optional<Insurance> optIns=optCar.flatMap(c-> c.getInsurance());
////		
////		Optional<String> optName = optIns.map(i-> i.getName());
////		
////		String name= optName.orElse("name is not found");
//		
//		//Optional<Optional<Car>> map = personOpt.map(p-> p.getCar());
//		
//		return personOpt
//				.flatMap(p-> p.getCar())
//				.flatMap(c-> c.getInsurance())
//				.map(i->i.getName())
//				.orElse("name is not found");
//	}
	
//	public static String getInsuranceName(Person person) {
//		if (person != null) {
//			Car car = person.getCar();
//			if (car != null) {
//				Insurance insurance = car.getInsurance();
//				if (insurance != null) {
//
//				}
//			}
//		}
//
//		return person.getCar().getInsurance().getName();
//	}
}
