package org.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	
	private Calculator calc;
	
	@BeforeEach
	void beforeEach() {
		
		calc = new Calculator(8f, 2f);
	}
	
	
	@Test
	@DisplayName("Test sum")
	void addTest() {
		
		float sumValue = calc.add();
		
		assertEquals(10, sumValue, "Valore ottenuto da add() non corretto");
	}
	
	@Test
	@DisplayName("Test subtraction")
	void subtractionTest() {
		
		float subValue = calc.subtract();
		
		assertEquals(6, subValue, "Valore ottenuto da subctrate() non corretto");
	}
	
	@Test
	@DisplayName("Test multiplication")
	void multiplicationTest() {
		
		float mulValue = calc.multiply();
		
		assertEquals(16, mulValue, "Valore ottenuto da multiply() non corretto");
	}
	
	@Test
	@DisplayName("Test division")
	void divisionTest() {
		
		float divValue = calc.divide();
		
		assertEquals(4, divValue, "Valore ottenuto da divide() non corretto");
	}
	
	
	
	/*
	 * #### Bonus
	Creare un ulteriore caso di test per il metodo `divide(float, float)` che verifichi 
	che venga effettivamente scatenata un'eccezione nel caso di divisione per `0`.
		 */
	
	
	@Test
	@DisplayName("Test 5")
	void test5() {
		
		Calculator c1 = new Calculator(2f, 0);
		
		assertThrows(IllegalArgumentException.class, () -> c1.divide());
	
	}
	
	
	
}
