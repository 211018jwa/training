package com.revature.app;

public class Driver {

	public static void main(String[] args) {
		/*
		 * Binary Arithmetic Operators
		 * 
		 * <operand> <operator> <operand>
		 * 
		 * +: Addition
		 * -: Subtraction
		 * *: Multiplication
		 * %: Modulus (get the remainder when dividing, ex. 5 % 2 = 1)	
		 */
		
		// /: Division
		
		
		int x = 10;
		int mySum = x + 20;
		System.out.println("mySum: " + mySum);
		
		int myDifference = mySum - 25;
		System.out.println("myDifference: " + myDifference);
		
		int myProduct = mySum * 2;
		System.out.println("myProduct: " + myProduct);
		
		// division
		int numerator = 16;
		int denominator = 5;
		System.out.println("numerator / denominator: " + (numerator / denominator));
		// int / int = int 
		// an int cannot have decimal places, so whenever we divide an int by an int, it's like we're truncating the decimal places
		
		// So how do we retain the decimal places when we divide? We need at least one of the "operands" to be a floating-point type
		//
		System.out.println((double) numerator / denominator); // We are casting the numerator to a double
		// double / int -> double / double = double
		
		// Modulus
		int myRemainder = 5 % 2;
		System.out.println("myRemainder: " + myRemainder);

		/*
		 * Numeric Promotion
		 * 
		 * When we are dealing with binary operators (+, -, /, *, %), we have this concept of numeric promotion
		 * 
		 * 1. Primitive variables will be promoted to the widest operand. 
		 * 2. If all operands are narrower than int, they will all be promoted to int
		 */
		
		System.out.println(10.23 / 4); // double / int -> double / double = double
		System.out.println(3.14159f / 3); // float / int -> float / float = float
		
		byte byte1 = 10;
		byte byte2 = 3;
		
		byte myByte = (byte) (byte1 + byte2); // byte + byte -> int + int = int
		System.out.println("myByte: " + myByte);
		
		short short1 = 20;
		short short2 = 30;
		short myShort = (short) (short1 + short2); // short + short -> int + int = int
		
		/*
		 * Assignment Operators
		 * 
		 *  = 
		 *  +=
		 *  -=
		 *  *=
		 *  /=
		 *  %=
		 */
		int z = 10;
		z += 5; // z = z + 5 (adding 5 to z)
		z -= 5; // z = z - 5 (subtracting 5 from z)
		z *= 2; // z = z * 2 (doubling z)
		z /= 2; // z = z / 2 (halving z)
		z %= 2; // z = z % 2 (assigning the remainder of dividing z by 2 to z)
		System.out.println(z);
		
		/*
		 * Comparison Operators
		 * 
		 * 	How we compare values
		 * 
		 * 	==: equals
		 *  !=: not equal
		 *  >: greater than
		 *  <: less than
		 *  >=: greater than or equal to
		 *  <= : less than or equal to
		 *  
		 *  Comparison operators take two operands and evaluate to a boolean
		 */
		System.out.println(z == 0);
		System.out.println(z != 0);
		System.out.println(z > 0);
		System.out.println(z < 0);
		System.out.println(z >= 0);
		System.out.println(z <= 0);
		
		/*
		 * Logical Operators
		 * 
		 * 	The operands should be booleans
		 * 
		 * 	Short-circuiting operators:
		 *  	&&: AND (binary)
		 *  	||: OR (binary)
		 *  
		 *  Non short-circuiting operators
		 *  	&: AND
		 *  	|: OR
		 *  
		 *  !: NOT (single operand)
		 */
		
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(false && true); // false
		System.out.println(false && false); // false
		
		System.out.println(true || true); // true
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); // false
		
		System.out.println(!true); // false
		System.out.println(!false); // true
		
		// Short-circuiting example
		// false && ? = false
		// true || ? = true
		
		// true && ? = ?
		// false || ? = ?
		
		System.out.println(false && getTrue()); // false
		System.out.println(false && getFalse()); // false
		
		// These do not short-circuit, so getTrue() will be invoked and getFalse() will be invoked
		System.out.println(false & getTrue()); // false
		System.out.println(false & getFalse()); // false
		
		System.out.println(true || getTrue()); // true
		System.out.println(true || getFalse()); // true
		
		// These do not short-circuit, so getTrue() will be invoked and getFalse() will be invoked
		System.out.println(true | getTrue()); // true
		System.out.println(true | getFalse()); // true
		
		// These cannot short-circuit because the right side actually needs to be evaluated
		System.out.println(true && getFalse());
		System.out.println(false || getTrue());
		
	}
	
	public static boolean getTrue() {
		System.out.println("getTrue() invoked");
		return true;
	}
	
	public static boolean getFalse() {
		System.out.println("getFalse() invoked");
		return false;
	}

}
