package com.revature.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArithmeticServiceTest {

	public ArithmeticService arithmeticService;
	
	@BeforeEach
	public void setUp() {
		this.arithmeticService = new ArithmeticService();
	}
	
	// When writing tests, we have the acronym AAA (Arrange, Act, Assert
	@Test
	public void testCheckInputsMethodWithNoBlankInputs() {
		// Arrange
		// Our arrange happens to be in the beforeEach method, where we create the ArithmeticService object
		// We are arranging the initial values that we need
		
		// Act
		// Here we are acting on what we want to test. We are invoking the checkInputs method
		int result = this.arithmeticService.checkInputs("10.5", "100.34");
		
		// Assert
		// We want to assert that what we acted on gave us an appropriate output. The output SHOULD be 0 if the logic is correct.
		Assertions.assertEquals(0, result);
		
		// JUnit 5 common assert methods (static methods belonging to the Assertions class):
		// assertArrayEquals(int[] expected, int[] actual)
		// assertEquals(int expected, int actual)
		// assertTrue(boolean actual)
		// assertFalse(boolean actual)
		// fail(): automatically fails the test
	}
	
	@Test
	public void testCheckInputsMethodWithLeftBlankInputAndNonblankRightInput() {
		// Arrange
		
		// Act
		int result = this.arithmeticService.checkInputs("    ", "10.53");
		
		// Assert
		Assertions.assertEquals(1, result);
	}
	
	@Test
	public void testCheckInputsMethodWithNonblankLeftInputAndBlankRightInput() {
		// Arrange
		
		// Act
		int result = this.arithmeticService.checkInputs("10.3", "   ");
		
		// Assert
		Assertions.assertEquals(2, result);
	}
	
	@Test
	public void testCheckInputsMethodWithBothInputsBlank() {
		// Arrange
		
		// Act
		int result = this.arithmeticService.checkInputs("  ", "");
		
		// Assert
		Assertions.assertEquals(3, result);
	}
}
