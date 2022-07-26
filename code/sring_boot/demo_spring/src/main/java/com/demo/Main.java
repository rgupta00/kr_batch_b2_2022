package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("demo.xml");
		ctx.registerShutdownHook();
		Hello hello=ctx.getBean("hello", Hello.class);
		
		System.out.println(hello.getName());
		System.out.println(hello.getName());
		
	}
}
