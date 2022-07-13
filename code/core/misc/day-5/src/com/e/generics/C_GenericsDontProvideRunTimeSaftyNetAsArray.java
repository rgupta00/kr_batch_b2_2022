package com.e.generics;

import java.util.*;

class Animal {
	public void sound() {
		System.out.println("some random sound");
	}
}
class Cat extends Animal {
	public void sound() {
		System.out.println("meou");
	}

}
class Doggy extends Animal {
	public void sound() {
		System.out.println("bho bho");
	}

}
public class C_GenericsDontProvideRunTimeSaftyNetAsArray {

	public static void main(String[] args) {
		//Array support polymorphic behaviour    
		Animal[]animals=new Cat[5];		//ArraryStoreException?
		//Generics dont support polymorphic behaviour  
		//List<Animal> animals=new ArrayList<Cat>();
	}

}





