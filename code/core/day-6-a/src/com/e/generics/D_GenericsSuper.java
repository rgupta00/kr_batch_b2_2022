package com.e.generics;

import java.util.*;

class Animal {
}

class Cat extends Animal {
}

class Dog extends Animal {
}

class CostlyDog extends Dog {
}

public class D_GenericsSuper {

	public static void main(String[] args) {

		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog());
		dogs.add(new CostlyDog());

		myMethod(dogs);
	}

	
	//What is PECS (Producer Extends Consumer Super)?
	//
//<? extends XXX>: u can print it but can not change it
//<? super XXX>: u can add it but cannot iterate it
	private static void myMethod(List<? super Dog> dogs) {
		dogs.add(new CostlyDog());
//		for(Dog d: dogs) {
//			System.out.println(d);
//		}
	}

}
