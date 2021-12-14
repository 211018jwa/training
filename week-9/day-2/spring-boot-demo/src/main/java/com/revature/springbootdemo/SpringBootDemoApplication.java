package com.revature.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// The @SpringBootApplication does 3 things:
// 1. It enables "component scanning": Automatically looks for classes that should be registered as beans within the same package
// 		as this SpringBootDemoApplication class or any subpackages
//  	(any class annotated with @Component, @Service, @Repository, @Controller)
// 		The classes must be in the com.revature.springbootdemo package or a subpackage com.revature.springbootdemo.<something>
// 2. The SpringBootDemoApplication becomes a @Configuration class (Java config)
// 3. It enables autoconfiguration where Spring Boot will look for various dependencies that it can configure automatically
//		an example would be Spring Web, where Spring Boot will automatically configure and start up a embedded Tomcat server
//		that will listen for HTTP requests
@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
	
}
