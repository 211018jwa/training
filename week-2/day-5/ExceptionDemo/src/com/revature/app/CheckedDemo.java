package com.revature.app;

import com.revature.exceptions.DivideByZeroException;

public class CheckedDemo {

	public static void demo() {
		
		try {
			System.out.println(divide(10, 0));
			
			System.out.println("Exception did not occur, since we were able to reach this line");
			
			int[] ints = new int[5];
			ints[0] = 10;
			ints[1] = 50;
			ints[2] = 32;
			ints[3] = 33;
			ints[4] = 734;
			
			System.out.println(ints[6]);
			
		} catch(DivideByZeroException e) {
			// e.printStackTrace(); // printStackTrace() is a useful method that belongs to exception objects that will allow us to see
			// an entire trace of the stack at the moment in which the exception occurred.
			// This can allow us to trace back to exactly what methods called what methods, and ultimately which method the exception was
			// actually thrown from
			
			// printStackTrace should only be used for debugging, so you should remove that method invocation if you are deploying your application
			
			System.out.println(e.getMessage());
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Index " + e.getMessage() + " does not exist for some array you are trying to access this index from");
			
		} catch (ClassCastException | ArithmeticException e) { // You can have multiple types of exceptions for a particular catch block
			// ...
			
		} catch(RuntimeException e) {
			System.out.println("Any unchecked exceptions that were not specified in the earlier catch blocks will be caught here");
			
		} catch (Exception e) { // This catch block will catch ALL EXCEPTIONS. Consider the hierarchy of exceptions. The Exception class is always
			// the least specific. 
			
			System.out.println("Any checked exceptions that were not specified in the earlier catch blocks will be caught here");
			
			// You should always have more specific catch blocks first, less specific ones later
			
		}  finally {
			// The code in this block will ALWAYS execute, no matter what (unless your computer crashes or you purposefully terminate the application)
			System.out.println("I am inside the finally block. I will always be executed whether an exception occurs or not");
		}
		
		/*
		 * Principles behind declaring and handling exceptions:
		 *  'Checked exceptions require you to either "declare or handle" the exception, otherwise the program will not compile'
		 *  
		 *  1. Declare: using the 'throws' keyword in the method signature to say that the method you are trying to invoke has to potential to be
		 *  	throwing that particular checked exception. (Also known as "ducking" the exception, because you are not handling the exception in that 
		 *  	immediate method. You are passing the responsibility to the method that calls that method)
		 *  2. Handling: using a try block that contains the code that might have an exception thrown from it, and defining catch blocks that will then
		 *  	catch those exceptions and execute code to handle those particular exceptions
		 *  
		 *  Handling:
		 *  	1. try-catch
		 *  	2. multiple catch blocks (ex. try-catch-catch-catch-catch-...)
		 *  	3. try-catch-finally
		 *  	4. try-catch-catch-...-finally
		 *  
		 *  finally block:
		 *  	The purpose of the finally block is to ensure that you have code that is ALWAYS executed, regardless of whether an exception is caught
		 *  	or not
		 *  
		 *  	Might be useful to clean up resources that are being used
		 */
		
	}
	
	
	public static double divide(double d1, double d2) throws DivideByZeroException { // throws means that this method has the potential to throw
		// that particular type of exception (DivideByZeroException)
		// Any method that calls this divide method will therefore be required to either declare the exception itself or catch (handle) the exception
		
		// If d2 == 0, throw an exception
		// In this case, we will create our own custom checked exception called DivideByZeroException
		if (d2 == 0) {
			throw new DivideByZeroException("Tried to divide " + d1 + " by " + d2);
		}
		
		return d1 / d2;
	}
	
}
