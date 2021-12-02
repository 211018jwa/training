package com.revature.demo;

public class FakeService {

	public void doSomething() {
		System.out.println("Inside of FakeService's doSomething() method");
		Singleton s = Singleton.getInstance();
		System.out.println(s);
	}
	
}
