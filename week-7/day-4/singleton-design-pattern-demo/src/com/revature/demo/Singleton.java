package com.revature.demo;

import java.util.Objects;

/*
 * The Singleton is a design pattern that is utilized in order to ensure that only one single instance can ever exist for a given class
 * 
 * Classes are blueprints for objects
 * -> Normally you can create as many objects as you want from a particular class
 */
public class Singleton {
	// Instance fields
	private String a;
	private String b;
	private String c;
	private String d;
	
	/*
	 * Singleton design pattern
	 */
	// static field
	private static Singleton instance;
	
	// private constructor
	private Singleton() {
	}
	
	// getInstance method
	public static Singleton getInstance() {
		if (Singleton.instance == null) { // If there is not an instance already, instantiate the instance
			Singleton.instance = new Singleton();
		}
		
		// If the instance already exists, return the instance
		return Singleton.instance;
	}
	
	/*
	 * Getters/setters
	 * 
	 * hashCode/equals/toString (object class)
	 */

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	public String getD() {
		return d;
	}

	public void setD(String d) {
		this.d = d;
	}

	@Override
	public int hashCode() {
		return Objects.hash(a, b, c, d);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Singleton other = (Singleton) obj;
		return Objects.equals(a, other.a) && Objects.equals(b, other.b) && Objects.equals(c, other.c)
				&& Objects.equals(d, other.d);
	}

	@Override
	public String toString() {
		return "Singleton [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}
	
}
