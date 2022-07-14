package com.f.reflection_demo;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class EmployeeReflectionDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		//static class loading
//		Employee employee=new Employee(1, "raj", 40000);
//		
//		Class<?> clazz=employee.getClass();
		
		//dynamic class loading
		Class<?> clazz = Class.forName("com.f.reflection_demo.Employee");	//janam parti
		//how to know inforation about this class metadata	
		//i wnat to print the methos
		Method[]methods=clazz.getMethods();//getDeclaredMethods
		for(Method m: methods) {
			System.out.println(m.getName()+":"+Modifier.toString(m.getModifiers())+": "+ m.getParameterCount());
		}
		
		//we want list of all the ctr
		
	}
}






