package com.revature.app;

public class SodaCan {

	public static void main(String[] args) {
		/*
		 * Control flow is the core of any programming language
		 * 
		 * If you want to ask yourself if something is a programming language or not, typically the best way to go about evaluating if it is or not is whether or not
		 * it has if statements, loops, anything to do with control flow.
		 * 
		 * Control flow: controlling what gets executed under certain conditions
		 */
		
		// If statement
		// If-else statements
		// While loop
		// Do-while loop
		// For loop
		// Switch
		
		// For-each (enhanced for loop): special syntax for a for loop
		
		// if (<boolean expression>) { // code inside here }
		int num = 100;
		if (num < 200) {
			System.out.println("The num variable is less than 200. It is " + num);
		}
		
		// if-else statement
		// if (<boolean expression>) { ... } else { ... }
		num = 300;
		if (num < 200) {
			System.out.println("The num variable is less than 200. It is " + num);
		} else {
			System.out.println("The num variable is 200 or larger. It is " + num);
		}
		
		/*
		 * if-else chaining
		 * 
		 * The blocks are mutually exclusive. Only one block of code will ever be executed
		 * 
		 * The first condition that matches will be the one that executes. So we need to be careful that we don't have conditions that will always be true before another condition
		 */
		int age = 45;
		if (age < 18) {
			System.out.println("Young adult");
		} else if (age < 40) {
			System.out.println("Minor");
		} else if (age < 65) {
			System.out.println("Middle aged adult");
		} else {
			System.out.println("Senior");
		}
		
		/*
		 * You can nest if statements inside of other if statements
		 * 
		 * Main takeaway: You can have blocks of code inside other blocks of code (variable scopes apply as usual)
		 */
		num = 200;
		if (num < 101) {
			System.out.println("The variable num is less than 101");
			
			
			if (num % 2 == 0) {
				System.out.println("The variable num is even");
			} else {
				System.out.println("The variabel num is odd");
			}
			
		} else {
			System.out.println("The variable num is greater than or equal to 101");
		}
		
		/*
		 * Switch statements
		 */
		int month = 1;
		switch (month) { // variables that can be used include byte, short, char, int, String, and enums
			case 1:
				System.out.println("It is January");
				break;
			case 2:
				System.out.println("It is February");
				break;
			case 3:
				System.out.println("It is March");
				break;
			case 4:
				System.out.println("It is April");
				break;
			case 5:
				System.out.println("It is May");
				break; // if we do not use the break keyword, it is known as "fall-through" (it might be useful in some circumstances, which is why Java designed switch blocks to be this way)
			case 6:
				System.out.println("It is June");
				break;
			default:
				System.out.println("It is not January, February, March, April, May or June");
		}
		
		/*
		 * Loops
		 * 
		 * 	For loops
		 * 	While loops
		 * 	Do while loops
		 */
		
		// This will print out 0 to 998 -> 0, 2, 4, ..., 998
		for (int i = 0; i < 1000; i = i + 2) { // int i is a "block scoped" variable. It is scoped to the for loop block specifically
			System.out.println(i);
		}
		
		// 5, 4, ..., 1
		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}
		
		for (int i = 0; i < 100; i+=3) {
			System.out.println(i);
		}
		
		// For loops are the most common type of loop you would use
		
		// While loop
		int number = 10;
		while (number >= 0) {
			System.out.println(number);
			number--;
		}
		
		// Do-while loop
		// A do-while loop is always guaranteed to execute at least once, regardless of the condition
		number = 0;
		do {
			System.out.println("number: " + number);
			number--;
		} while (number > 5); // A do-while loop does require a semicolon at the end. While loops do not
		
		/*
		 * break, continue keywords
		 */
		
		// Continue
		for (int i = 0; i <= 100; i++) {
			// skip over the odd numbers being printed out
			if (i % 2 == 1) {
				continue; // continue will skip us to the next iteration
			}
			
			// if continue is executed, then code below it will not run
			System.out.println("i: " + i);
		}
		
		// Break
		for (int i = 0; i <= 100; i++) {
			if (i == 50) {
				break; // end the loop immediately
			}
			
			System.out.println("i: " + i);
		}
		
	}

}
