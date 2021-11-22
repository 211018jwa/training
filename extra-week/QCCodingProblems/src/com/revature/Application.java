package com.revature;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// FizzBuzz

		// You are given a number N. 
		// In order from 1 to N (inclusive), print each number. 
		// If the number is divisible by 3, replace it with "Fizz". If it is divisible by 5, replace it with "Buzz". If divisible by both, print "FizzBuzz".

		fizzBuzzAlgorithm(16);
		
		/*
		 * Caesar Cipher
		 * 
		 * A -> 01, B -> 02
		 */
		String output = caesarCipher("ABC");
		System.out.println(output);
		
		/*
		 * Two Kids and a truck
		 */
		String result = twoKidsAndATruck(1, 3, 2);
		System.out.println(result);
	}
	
	/*
	 * Two kids and an ice cream truck are at various positions on a line. You will be given their starting positions. Your task is to determine which kid will reach the truck first, assuming the truck does not move and the kids are running at equal speed. If the kids arrive at the same time, the truck will be allowed to move to the next corner while the kids fight over the last cone.

	You are given i runs in a form of k1, k2, t representing the respective positions for kid_1, kid_2, and truck.

	Complete the function called TwoKidsAndATruck to return the appropriate answer to each run, which will be printed on a new line.
	If kid _1 catches the truck first, print Kid 1.
	If kid_2 catches the truck first, print Kid 2.
	If both kids reach the truck at the same time, print Truck as the two kids fight and truck escapes.
	
	2 <- number of sets of inputs
	1 2 3 <- first set of inputs, k1, k2, t -> Kid 2
	1 3 2 <- second set of inputs k1, k2, t -> Truck
	 */
	
	public static String twoKidsAndATruck(int k1, int k2, int t) {
		int k1distanceToTruck = Math.abs(t - k1);
		int k2distanceToTruck = Math.abs(t - k2);
		
		if (k1distanceToTruck == k2distanceToTruck) {
			return "Truck";
		} else if (k1distanceToTruck < k2distanceToTruck) { // Kid 1
			return "Kid 1";
		} else {
			return "Kid 2";
		}
		
	}
	
	public static void fizzBuzzAlgorithm(int N) {
		for (int i = 1; i <= N; i++) {
			if (i % 3 == 0 && i % 5 == 0) { // divisble by both
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
	
	public static String caesarCipher(String s) {
//		Map<Character, String> letterMappings = new HashMap<>();
//		letterMappings.put('A', "01");
//		letterMappings.put('B', "02");
//		letterMappings.put('C', "03");
//		letterMappings.put('D', "04");
//		letterMappings.put('E', "05");
//		letterMappings.put('F', "06");
//		letterMappings.put('G', "07");
//		letterMappings.put('H', "08");
//		letterMappings.put('I', "09");
//		letterMappings.put('J', "10");
//		letterMappings.put('K', "11");
//		letterMappings.put('L', "12");
//		letterMappings.put('M', "13");
//		letterMappings.put('N', "14");
//		letterMappings.put('O', "15");
//		letterMappings.put('P', "16");
//		letterMappings.put('Q', "17");
//		letterMappings.put('R', "18");
//		letterMappings.put('S', "19");
//		letterMappings.put('T', "20");
//		letterMappings.put('U', "21");
//		letterMappings.put('V', "22");
//		letterMappings.put('W', "23");
//		letterMappings.put('X', "24");
//		letterMappings.put('Y', "25");
//		letterMappings.put('Z', "26");
		
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			int number = (int) c - 64;
			
			if (number < 10) {
				result += ("0" + number);
			} else {
				result += number;
			}
		}
		
		return result;
	}

}
