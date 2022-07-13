package com.f.generics2;

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

		// dogs.add(new Cat()); will not work!

		// i want a method that allow to even add an dog but dont allow iteration...
		// then
		// Anytype of dog is alled to be added...

		myMethod(dogs);
	}
	//PE  CS
	private static void myMethod(List<? super Dog> dogs) {
		dogs.add(new CostlyDog());// u can only change it...
//		for(Dog dog: dogs) {
//			System.out.println(dog);
//		}
	}
}
