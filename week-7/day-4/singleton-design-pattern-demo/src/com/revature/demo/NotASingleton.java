package com.revature.demo;

import java.util.Objects;

// This class is not following the Singleton design pattern, so we can create as many objects/instances as we want
public class NotASingleton {

	private String property1;
	private String property2;
	
	public NotASingleton() {
	}
	
	public NotASingleton(String property1, String property2) {
		this.property1 = property1;
		this.property2 = property2;
	}

	public String getProperty1() {
		return property1;
	}

	public void setProperty1(String property1) {
		this.property1 = property1;
	}

	public String getProperty2() {
		return property2;
	}

	public void setProperty2(String property2) {
		this.property2 = property2;
	}

	@Override
	public String toString() {
		return "NotASingleton [property1=" + property1 + ", property2=" + property2 + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(property1, property2);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NotASingleton other = (NotASingleton) obj;
		return Objects.equals(property1, other.property1) && Objects.equals(property2, other.property2);
	}
	
}
