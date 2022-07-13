package com.demo.attempt3;
import java.util.*;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		List<String> names=List.of("raj","ekta","sumit","amit");
		names.stream().filter(name->name.contains("ra")).sorted().collect(Collectors.toList());
		
		//rev a string
		String s="india";
		String aRev=new StringBuilder().append("india").reverse().toString();
		System.out.println(s);
		
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
//		Car car=ctx.getBean("car", Car.class);
//		System.out.println(car.hashCode());
//		
//		Car car2=ctx.getBean("car", Car.class);
//		System.out.println(car2.hashCode());
//		
//		

	}
}
