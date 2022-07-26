package com.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Hello {
	

	public Hello() {
		System.out.println("hello ctr");
	}
	
	@PostConstruct
	public void afterBeanCreated() {
		System.out.println("....@PostConstruct...");
	}
	
	@PreDestroy
	public void beforeBeanDestory() {
		System.out.println("......@PreDestroy..........");
	}
	
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
