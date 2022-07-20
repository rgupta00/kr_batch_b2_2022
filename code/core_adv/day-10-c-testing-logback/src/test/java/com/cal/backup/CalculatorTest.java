package com.cal.backup;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cal.Calculator;

class CalculatorTest {
	Calculator calculator=null;
	
	@BeforeAll
	public  static void beforeAllMethod() {
		System.out.println("------@BeforeAll-------");
	}
	
	
	@BeforeEach
	public void beforeEachMethod() {
		System.out.println("------@BeforeEach-------");
		 calculator=new Calculator();
	}
	
	@Test
	public void multiplyTest() {
		System.out.println("-----------multiply test-----------");
		Assertions.assertEquals(9, calculator.multiply(3,3));
	}
	

	@Test
	public void addTest() {
		System.out.println("-----------add test-----------");
		Assertions.assertEquals(4, calculator.add(2, 2));
	}

	@AfterEach
	public void afterEachMethod() {
		System.out.println("------@AfterEach-------");
		calculator=null;
	}
	

	@AfterAll
	public  static void afterAllMethod() {
		System.out.println("------	@AfterAll-------");
	}
}
