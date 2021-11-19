package com.revature.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArithmeticServiceTest {

	@Test
	public void addPositiveTest() {
		/*
		 * AAA: ARRANGE, ACT, ASSERT
		 */
		
		/*
		 * ARRANGE: setup whatever we are testing
		 * 
		 * What are you testing? The add method from the ArithmeticService
		 * 
		 * SO what do you need to arrange then? Instantiate a ArithmeticService object
		 */
		ArithmeticService as = new ArithmeticService();
		
		/*
		 * Act: invoke whatever method we are actually testing (the add method)
		 */
		String actual = as.add("2", "5");
		
		/*
		 * Assert: assert that the actual condition matches what we would expect
		 */
		Assertions.assertEquals("7.0", actual);
	}
	
	@Test
	public void addPositiveTest_2() {
		/*
		 * AAA: ARRANGE, ACT, ASSERT
		 */
		
		/*
		 * ARRANGE: setup whatever we are testing
		 * 
		 * What are you testing? The add method from the ArithmeticService
		 * 
		 * SO what do you need to arrange then? Instantiate a ArithmeticService object
		 */
		ArithmeticService as = new ArithmeticService();
		
		/*
		 * Act: invoke whatever method we are actually testing (the add method)
		 */
		String actual = as.add("2.5", "5.25");
		
		/*
		 * Assert: assert that the actual condition matches what we would expect
		 */
		Assertions.assertEquals("7.75", actual);
	}
	
	@Test
	public void multiplyPositiveTest() {
		/*
		 * AAA: ARRANGE, ACT, ASSERT
		 */
		
		/*
		 * ARRANGE: setup whatever we are testing
		 * 
		 * What are you testing? The add method from the ArithmeticService
		 * 
		 * SO what do you need to arrange then? Instantiate a ArithmeticService object
		 */
		ArithmeticService as = new ArithmeticService();
		
		/*
		 * Act: invoke whatever method we are actually testing (the add method)
		 */
		
		String actual = as.multiply("2", "5");
		
		/*
		 * Assert: assert that the actual condition matches what we would expect
		 */
		Assertions.assertEquals("10.0", actual);
	}

	@Test
	public void multiplyPositiveTest_2() {
		/*
		 * AAA: ARRANGE, ACT, ASSERT
		 */
		
		/*
		 * ARRANGE: setup whatever we are testing
		 * 
		 * What are you testing? The add method from the ArithmeticService
		 * 
		 * SO what do you need to arrange then? Instantiate a ArithmeticService object
		 */
		ArithmeticService as = new ArithmeticService();
		
		/*
		 * Act: invoke whatever method we are actually testing (the add method)
		 */
		
		String actual = as.multiply("2.0", "5.25");
		
		/*
		 * Assert: assert that the actual condition matches what we would expect
		 */
		
		Assertions.assertEquals("10.5", actual);
	}

	@Test
	public void subtractPositiveTest() {
		ArithmeticService as = new ArithmeticService();

		String actual = as.subtract("2.5", "1.25");
		Assertions.assertEquals("1.25", actual);
	}
	
	@Test
	public void subtractPositiveTest_2() {
		ArithmeticService as = new ArithmeticService();

		String actual = as.subtract("2", "5");

		Assertions.assertEquals("-3.0", actual);
	}
	
	@Test
	public void dividePositiveTest() {
		ArithmeticService as = new ArithmeticService();

		String actual = as.divide("5", "2");
		Assertions.assertEquals("2.5", actual);
	}
	
	@Test
	public void dividePositiveTest_2() {
		ArithmeticService as = new ArithmeticService();

		String actual = as.divide("10.5", "2");

		Assertions.assertEquals("5.25", actual);
	}
	
}

