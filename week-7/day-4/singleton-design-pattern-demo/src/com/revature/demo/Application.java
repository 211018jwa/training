package com.revature.demo;

public class Application {

	public static void main(String[] args) {
		
		NotASingleton obj1 = new NotASingleton("abc", "def");
		NotASingleton obj2 = new NotASingleton("xyz", "asdfsdfdsfds");
		NotASingleton obj3 = new NotASingleton("ahlerjlkjwersdf", "cvcvlkjlkjq");
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		// Singleton example
		Singleton s1 = Singleton.getInstance();
		s1.setA("dfd");
		s1.setB("abc");
		s1.setC("def");
		s1.setD("xyz");
		
		System.out.println(s1);
		
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2);
		
		System.out.println("Are s1 and s2 pointing to the same object? " + (s1 == s2));
		
		
		
		FakeService fakeService = new FakeService();
		fakeService.doSomething();
	}

}
