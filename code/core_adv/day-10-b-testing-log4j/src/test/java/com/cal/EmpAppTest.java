package com.cal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class EmpAppTest {

	@Order(value = 1)
	@Test
	@DisplayName(value = "add emp")
	public void addEmp() {
		System.out.println("Add emp");
	}
	@Order(value = 2)
	@Test
	@DisplayName(value = "update emp")	//DI
	public void updateEmp(TestInfo info) {
		System.out.println(info.getTestMethod().toString());
		System.out.println("update emp");
	}
	
	@Order(value = 3)
	@Test
	@DisplayName(value = "print emp")
	public void printEmp() {
		System.out.println("print emp");
	}
	
	@Order(value = 4)
	@Test
	@DisplayName(value = "del emp")
	public void deleteEmp() {
		System.out.println("del emp");
	}
	
	
}
