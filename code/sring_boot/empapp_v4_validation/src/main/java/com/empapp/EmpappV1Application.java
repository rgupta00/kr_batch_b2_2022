package com.empapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//@SpringBootConfiguration+ @EnableAutoConfiguration+@ComponentScan
public class EmpappV1Application {

	public static void main(String[] args) {
		ApplicationContext ctx=  SpringApplication.run(EmpappV1Application.class, args);
//		String names[]=ctx.getBeanDefinitionNames();
//		for(String name: names)
//			System.out.println(name);
	}
}
