package com.revature.app;

public class UncheckedDemo {

	public static void demo() {
		
		int userInput1 = 10;
		int userInput2 = 0;
		
		try {
			System.out.println(userInput1 / userInput2); // When we are performing arithmetic, we do not need to catch the ArithmeticException 
			// Our code will still compile just fine
			// However, if we do bad arithmetic, such as dividing by 0, that would result in this exception being thrown
			// And if we do not catch that exception, then the program will crash
		} catch(ArithmeticException e) {
			System.out.println("An ArithmeticException occurred. Message is '" + e.getMessage() + "'"); // Exception objects have a property called message. This contains a message that is part of that
			// exception when it is constructed and thrown. This goes back to the general idea we have of objects, which is that they have properties
			// and behaviors
		}
		
		// catching an exception allows you to handle it. Once you handle the exception, you can continue executing the rest of your code
		// If you choose not to handle an exception, it will crash the program.
		
		
	}
	
}
