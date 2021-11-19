package com.revature.service;

public class ArithmeticService {

	public ArithmeticService() {
	}
	
	// We have 2 inputs, which are both Strings
	// We want to take these Strings and CONVERT them into numbers
	// So let's convert from String to double
	public String add(String num1, String num2) {	
		double number1 = Double.parseDouble(num1);
		double number2 = Double.parseDouble(num2);
		
		double result = number1 + number2;
		
		return "" + result;
	}
	
	public String subtract(String num1, String num2) {
		double number1 = Double.parseDouble(num1);
		double number2 = Double.parseDouble(num2);
		
		double result = number1 - number2;

		return "" + result;
	}

	public String multiply(String num1, String num2) {
		double number1 = Double.parseDouble(num1);
		double number2 = Double.parseDouble(num2);
		
		double result = number1 * number2;
		
		return "" + result;
	}

	public String divide(String num1, String num2) {
		double number1 = Double.parseDouble(num1);
		double number2 = Double.parseDouble(num2);
		
		double result = number1 / number2;
		
		return "" + result;
	}
	
}
