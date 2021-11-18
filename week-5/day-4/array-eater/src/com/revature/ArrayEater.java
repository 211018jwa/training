package com.revature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayEater {

	public static void main(String[] args) {
		
		int[] myInts = new int[] { 2, 6, 4, 9, 3 };
		int result = maxPoss(5, 2, 1, myInts);
		System.out.println(result);
		
	}
	
	public static int maxPoss(int N, int K, int P, int[] A) {
		// 2, 6, 4, 9, 3
		Arrays.sort(A); // 2, 3, 4(eat), 6(eat), 9(rescued)
		
		/*
		 * Approach #2
		 */
		List<Integer> listOfIntegers = new ArrayList<>();
		for (int i = 0; i < A.length; i++) {
			listOfIntegers.add(A[i]);
		}
		
		int result = 0;
		
		for (int i = 0; i < P; i++) {
			result += listOfIntegers.remove(listOfIntegers.size() - 1); // removing from the end of the List
		} // The sum of the rescued values
		
		for (int i = 0; i < K; i++) {
			listOfIntegers.remove(listOfIntegers.size() - 1);
		}
		
		// These are the surviving elements that were not "eaten" or "rescued"
		// Being added to the result along with the rescued elements
		for (int i = 0; i < listOfIntegers.size(); i++) {
			result += listOfIntegers.get(i);
		}
		
		/*
		 * Approach #1
		 */
//		int result = 0;
//		// P is the number you can rescue
//		// We want to rescue to highest values
//		for (int i = A.length - 1; i >= A.length - P; i--) {
//			result = result + A[i];
//		}
//		
//		// result now has the sum of all rescued elements
//		int elementsLeft = N - P; // we rescued P elements
//		elementsLeft = elementsLeft - K; // Array eater ate the K largest elements after we rescued P
//		
//		for (int i = 0; i < elementsLeft; i++) {
//			result = result + A[i];
//		}
//		
		return result;
	}

}
