package org.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	
	private static Calculator calc;
	
	@BeforeAll
	private static void beforeAll() {
		
		calc = new Calculator(8.0f, 2.0f);
	}
	
	
	@Test
	@DisplayName("Test sum")
	void addTest() {
		
		float sumValue = calc.add();
		
		assertEquals(10.0, sumValue, "Valore ottenuto da add() non corretto");
	}
	
	@Test
	@DisplayName("Test subtraction")
	void subtractionTest() {
		
		float subValue = calc.subtract();
		
		assertEquals(6.0, subValue, "Valore ottenuto da subctrate() non corretto");
	}
	
	@Test
	@DisplayName("Test multiplication")
	void multiplicationTest() {
		
		float mulValue = calc.multiply();
		
		assertEquals(16.0, mulValue, "Valore ottenuto da multiply() non corretto");
	}
	
	@Test
	@DisplayName("Test division")
	void divisionTest() {
		
		float divValue = calc.divide();
		
		assertEquals(4.0, divValue, "Valore ottenuto da divide() non corretto");
	}
	
}
