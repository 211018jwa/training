package com.revature.app;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Array: a collection of a fixed size with elements that are ordered and accessible by an index
		 */
		
		// Define a reference variable for an array
		// An array is an object
		int[] myIntArray = new int[10]; // The size of the array we created is 10
		
		// Arrays have default values (it works exactly the same a default values for fields)
		// numbers 0 or 0.0
		// boolean false
		// reference types null
		
		// You cannot change the size of an array object once it has been created!
		// In the example above, when the array is created, it is given 10 "blocks" of memory which are 32 bits each (because an int is 32 bits)
		// These blocks of memory are adjacent to each other in the heap
		// THIS IS WHY WE CANNOT CHANGE THE SIZE OF AN ARRAY ONCE IT IS CREATED, because the blocks of memory must be next to each other
		
		// An array has indices ranging from 0 to (the size of the array - 1)
		// 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 in the example above
		
		System.out.println(myIntArray[5]);
		
		myIntArray[0] = 10;
		myIntArray[5] = 100;
		myIntArray[7] = 10000;
		myIntArray[4] = -153;
		
		
		System.out.println("Iterate over the for loop");
		// i will go from 0 to 9, because i must be less than 10
		for (int i = 0; i < myIntArray.length; i++) {
			System.out.println(myIntArray[i]);
		}
		
		
		
		// Instead of doing this...
//		int[] myOtherIntArray = new int[4];
//		myOtherIntArray[0] = 14;
//		myOtherIntArray[1] = 13;
//		myOtherIntArray[2] = 5;
//		myOtherIntArray[3] = 78;
		
		// We can do this
		int[] myOtherIntArray = { 14, 13, 5, 78 }; // We can use this shorthand notation to populate values ahead of time
		// The size of the array is 4 and will not change
		
		int[] intArr = myOtherIntArray;
		intArr[0] = -1000000;
		// intArr and myOtherIntArray are pointing to the same exact array object
		// so whether you use intArr or myOtherIntArray to access and modify values does not matter
		System.out.println(myOtherIntArray[0]);
		
		System.out.println(intArr == myOtherIntArray); // If you are using == to compare reference variables, you are checking to see if the reference variables are pointing to the same object
	
		// for-each (enhanced for loop)
		for (int element : intArr) { // element represents a particular element that we are currently iterating over within the intArr array
			System.out.println(element);
		}
		// enhanced for loops are less flexible, but more convenient if you are simply wanting to iterate from the 0th index to the largest index
		
		// Reverse traversal from largest index to 0th index
		for (int i = intArr.length - 1; i >= 0; i--) {
			System.out.println(intArr[i]);
		}
		
		/*
		 * Arrays are not limited to just primitive types
		 * 
		 * We can have reference variable arrays as well
		 */
		
		String[] myStrings = { "January", "February", "March" };
		
		// Multi-dimensional arrays (arrays within arrays)
		int[][] my2DArray = new int[][] { {1, 2, 3, 4, 5}, {10, 11, 12, 13, 14} }; // We have 2 arrays with 5 elements each inside of another array
		
		for (int i = 0; i < my2DArray.length; i++) {
			for (int j = 0; j < my2DArray[i].length; j++) {
				System.out.println("i: " + i + ", j: " + j + " : " + my2DArray[i][j]);
			}
		}
		
		// enhanced for loop
		for (int[] myArray : my2DArray) {
			for (int element : myArray) {
				System.out.println(element);
			}
		}
		
	}

}
