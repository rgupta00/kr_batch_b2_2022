package com.cal;

import static org.junit.jupiter.api.Assertions.*;

import org.checkerframework.framework.qual.IgnoreInWholeProgramInference;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

class CalculatorTest {
	Calculator calculator=null;
	
	
	@BeforeEach
	public void beforeEachMethod() {
		 calculator=new Calculator();
	}
	
	@Test
	public void manyAssertionMethods() {
		//Assertions.assertAll(heading, executables);
		//Assertions.assertEquals(expected, actual);
		//Assertions.assertTrue(condition);
		//Assertions.assertFalse(condition);
		//Assertions.assertNotEquals(unexpected, actual);
		
		//try them :)
	}
	
	@DisplayName(value = "multiplyTest")
	@Test
	public void multiplyTest() {
		Assertions.assertEquals(9, calculator.multiply(3,3));
	}
	
	//run this test iff os is linux
//	@EnabledOnOs(OS.WINDOWS)
	//@EnabledOnJre(JRE.JAVA_13)
	
	@DisplayName(value = "divide test")
	@Test
	public void divideTest() {
		Assertions.assertEquals(5, calculator.divide(10,2));
	}
	
	@DisplayName(value = "divide test with exception")
	@Test
	public void divideWithExceptionTest() {
		Assertions.assertThrows(ArithmeticException.class,
				()->calculator.divide(10, 0),
				"divide by zero" );
	}
	
	@DisplayName(value = "add 3 numbers")
	@Disabled
	@Test
	public void addThreeTimeTest() {
		Assertions.assertAll
		(
				()->Assertions.assertEquals(4, calculator.add(2, 2)),
				()->Assertions.assertEquals(-10, calculator.add(-8, -2)),
				()->Assertions.assertEquals(0, calculator.add(0,0))
		);
		
	}

	@DisplayName(value = "add test")
	@Test
	public void addTest() {
		Assertions.assertEquals(4, calculator.add(2, 2));
	}

	@AfterEach
	public void afterEachMethod() {
		calculator=null;
	}
	
}
