package com.f.reflection_demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Foo{
	
	private Foo() {
		System.out.println("dare to call...");
	}
	public void fooMethod() {
		System.out.println("the logic");
	}
}

public class PrivateCtrCanBeCalledOutSideTheClass {
	
	public static void main(String[] args) throws ClassNotFoundException,
	InstantiationException, IllegalAccessException, 
	IllegalArgumentException, InvocationTargetException {
		
		Class<?> clazz=Class.forName("com.f.reflection_demo.Foo");
		
		Constructor[]constructors=clazz.getDeclaredConstructors();
		constructors[0].setAccessible(true);//gth i want to call it even if it private ...
		
		Foo foo=(Foo) constructors[0].newInstance();
		foo.fooMethod();
		
	}

}
