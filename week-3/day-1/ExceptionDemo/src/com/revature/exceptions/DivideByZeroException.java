package com.revature.exceptions;

public class DivideByZeroException extends Exception { // By extending the Exception class built into Java, this class becomes a 'checked' exception

	public DivideByZeroException() {
		super();
	}

	public DivideByZeroException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DivideByZeroException(String message, Throwable cause) {
		super(message, cause);
	}

	public DivideByZeroException(String message) {
		super(message);
	}

	public DivideByZeroException(Throwable cause) {
		super(cause);
	} 

}
