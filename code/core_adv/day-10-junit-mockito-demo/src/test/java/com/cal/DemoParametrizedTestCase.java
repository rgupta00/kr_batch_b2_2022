package com.cal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class DemoParametrizedTestCase {
	Calculator calculator = null;

	@BeforeEach
	public void beforeEachMethod() {
		calculator = new Calculator();
	}
	@ParameterizedTest
	@CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
	public void demoParametrizedTest(int a, int b, int result) {
		Assertions.assertEquals(result, calculator.add(a,b));
	}
	
	@ParameterizedTest
	@CsvSource({"1,2,3","5,5,10"})
	//@CsvFileSource(resources = "/data.csv")
	public void demoParametrizedTest2(int a, int b, int result) {
		Assertions.assertEquals(result, calculator.add(a,b));
	}
	
	
	@AfterEach
	public void afterEachMethod() {
		calculator = null;
	}
}
