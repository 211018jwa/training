package com.revature.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/*
 * In this class, we are writing unit tests for the ArithmeticService
 * 
 * In particular, we have 4 different unit tests to test the functionality of our checkInputs(String input1, String input2) method
 * 
 * Unit test: a test that is testing a single unit (module)
 * 
 * Unit: typically a single method
 * 
 * As a tester, you should never say something is "bug free". 
 * As a rule of thumb, it is impossible to really say if something does not have bugs or not
 * But it is the role of someone writing tests or performing tests to UNCOVER bugs
 * Testers = bug hunters
 */

/*
 * Test Driven Development (TDD): 
 * 	- Designing your actual application around the tests
 * 	- You take your requirements -> write tests -> then write the application to pass those tests
 * 	- It is the opposite of what we did here
 * 	- We wrote our code first, before writing the tests
 * 
 * Pros:
 * 	- Always have tests for your methods (code coverage)
 * 		- Code coverage: What % of your code is actually associated with these tests?
 * 	- If done correctly, could result in less bugs
 * 	- Encourages good design and architecture
 * 
 * Cons:
 * 	- Hard to do if you are an inexperienced developer
 * 	- Initially can slow down development
 * 
 */

/*
 * Positive v. Negative testing
 * 
 * Tests can be categorized as positive or negative
 * 
 * 	- Positive test: A condition where the user is utilizing something correctly (according to the requirements)
 * 	- Negative test: A condition where the user is utilizing something INCORRECTLY (according to the requirements)
 */

/*
 * Ordering Tests: by default, tests inside of a class will run in a random order. There is NO guaranteed order for the tests
 * 
 * - But, if we want to specify the order, we can
 * 	1. Put the @TestMethodOrder(OrderAnnotation.class) annotation on top of the test class
 * 	2. On each test class, we can place the @Order(..) annotation
 */

// JUnit 5 common assert methods (static methods belonging to the Assertions class):
// assertArrayEquals(int[] expected, int[] actual)
// assertEquals(int expected, int actual)
// assertTrue(boolean actual)
// assertFalse(boolean actual)
// fail(): automatically fails the test

/*
 * Test case v. Test Suite
 * 	- You will hear these two terms fairly often in the world of software testing
 * 	- It is always important to study and pick up and start using the technical terminology, as this will both 
 * 		help you to better understand the topics as well as prepare you for client interviews and talking with coworkers
 * 
 * Test case: a test method
 * 	- a method annotated with @Test
 * 
 * Test suite: a collection of test classes
 * 	- test classes: contain test methods
 * 	- A test suite is a comprehensive suite of tests
 */

@TestMethodOrder(OrderAnnotation.class)
public class ArithmeticServiceTest {

	public ArithmeticService arithmeticService;
	
	@BeforeEach
	public void setUp() {
		this.arithmeticService = new ArithmeticService();
	}
	/*
	 * When ... then ...
	 * 
	 * When input is 10.5 and 100.34, then our output should be 0
	 * 
	 * When input is "    " and 10.53, then our output should be 1
	 * 
	 * When input is 10.3 and "    ", then our output should be 2
	 * 
	 * When input is "   " and "", then our output should be 3
	 */
	
	
	// When writing tests, we have the acronym AAA (Arrange, Act, Assert)
	@Test // POSITIVE TEST
	@Order(1)
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
		

	}
	
	@Test // NEGATIVE TEST
	@Order(2)
	public void testCheckInputsMethodWithLeftBlankInputAndNonblankRightInput() {
		// Arrange
		
		// Act
		int result = this.arithmeticService.checkInputs("    ", "10.53");
		
		// Assert
		Assertions.assertEquals(1, result);
	}
	
	@Test // NEGATIVE TEST
	@Order(3)
	public void testCheckInputsMethodWithNonblankLeftInputAndBlankRightInput() {
		// Arrange
		
		// Act
		int result = this.arithmeticService.checkInputs("10.3", "   ");
		
		// Assert
		Assertions.assertEquals(2, result);
	}
	
	@Test // NEGATIVE TEST
	@Order(4)
	public void testCheckInputsMethodWithBothInputsBlank() {
		// Arrange
		
		// Act
		int result = this.arithmeticService.checkInputs("  ", "");
		
		// Assert
		Assertions.assertEquals(3, result);
	}
}
