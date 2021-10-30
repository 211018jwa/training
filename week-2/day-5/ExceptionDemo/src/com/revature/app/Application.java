package com.revature.app;

public class Application {

	public static void main(String[] args) {
		
		System.out.println("This line RUNS");
		
		// Code that we are trying to execute goes inside the try { } block
		// If an exception is encountered with the code inside the try block, we will skip straight to the catch block for that particular exception
		// (given that we are actually trying to catch that exception)
		try {
			System.out.println(10 / 0); // We encounter the ArithmeticException here, which will disrupt the flow of the method, such that no subsequent lines
			// of code will execute in that method
		} catch (ArithmeticException e) { // e is just a naming convention for when we catch the exception
			// e is actually a reference variable to an exception object, in this case, it is a reference variable of the type ArithmeticException
			System.out.println("Cannot divide by 0");
		} catch (ClassCastException e) {
			// You can have multiple catch blocks
		}
		
		
		System.out.println("This line NOW DOES RUN");
		
		
		/*
		 * As long as we handle exceptions in our program, the program will not crash due to that exception
		 * 
		 * But, if we leave an exception unhandled, then the program will terminate
		 */
		
		/*
 		 * Throwable Hierarchy:
 		 * 
		 * In Java, there is a class called Throwable, which has two subclasses: Error and Exception
		 * 
		 * Error: a class that extends Throwable
		 * 	- Ex. StackOverflowError
		 *  - Ex. OutOfMemoryError
		 *  
		 *  Exception: a class that also extends Throwable that all exception subclasses inherit from
		 *  	- If a class inherits directly from the Exception class, it is known as a CHECKED exception
		 *  
		 *  RuntimeException: a class that extends the Exception class
		 *  	- Any subclasses of RuntimeException are known as UNCHECKED exceptions
		 */
		
		/*
		 * Two types of exceptions:
		 * 	- Checked exception
		 * 	- Unchecked exception
		 * 
		 * CUSTOM EXCEPTIONS:
		 * 	- To create a custom checked exception, we need to create a class that extends the Exception class
		 * 	- To create a custom unchecked exception, we need to create a class that extends the RuntimeException class
		 * 
		 * Despite the name of Exception and RuntimeException, ALL exceptions occur at RUNTIME
		 * - ALL EXCEPTIONS OCCUR AT RUNTIME
		 */

	}

}
