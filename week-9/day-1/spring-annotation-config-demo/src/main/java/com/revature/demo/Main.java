package com.revature.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.service.ReimbursementService;
import com.revature.service.UserService;

public class Main {

	public static void main(String[] args) {
		
		// This object is the actual container that stores our Spring beans that were configured using XML configuration
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
		// Here we create the IoC container, which will look at the configuration file, and instantiate all of the bean definitions
		// It will then utilize dependency injection to wire the beans together accordingly 
		
		ReimbursementService reimbService = (ReimbursementService) container.getBean("reimbursementService");
		System.out.println(reimbService.getAllReimbursements());
		
		ReimbursementService reimbService2 = (ReimbursementService) container.getBean("reimbursementService");
		
		// True or false and why?
		// True, because both variables are pointing to the same object
		// This object happens to be the singleton instance that exists within the Spring container
		System.out.println("reimbService == reimbService2: " + (reimbService == reimbService2));
		
		UserService userService = (UserService) container.getBean("userService");
		System.out.println(userService.getAllUsers());
	}

}
