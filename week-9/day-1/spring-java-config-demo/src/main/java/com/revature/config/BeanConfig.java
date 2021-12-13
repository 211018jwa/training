package com.revature.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.revature.dao.FakeReimbursementDao;
import com.revature.dao.FakeUserDao;
import com.revature.dao.ReimbursementDao;
import com.revature.dao.UserDao;
import com.revature.service.ReimbursementService;
import com.revature.service.UserService;

// Utilizing the annotation configuration scanning, we can have Spring scan for the @Configuration annotation,
// which will register this as a special configuration Spring bean
@Configuration
public class BeanConfig {
	
	// @Bean carries a special meaning
	// It will "intercept" the method call to determine if a bean already exists in the container or not
	// If it already exists, it will return the existing bean instead of running the code that exists inside of the method to create a
	// new object
	// The name of the Spring bean will be the method name itself
	@Bean
	public ReimbursementDao reimbursementDao() {
		return new FakeReimbursementDao();
	}
	
	// Inside of this class, we define various methods that are utilized to configure and wire together various beans
	@Bean
	public ReimbursementService myReimbursementService() {
		
		ReimbursementService reimbService = new ReimbursementService();
		// setter injection for ReimbursementService
		reimbService.setReimbursementDao(reimbursementDao());
		
		return reimbService;
	}
	
	@Bean
	public UserDao userDao() {
		return new FakeUserDao();
	}
	
	@Bean
	public UserService myUserService() {
		// Constructor injection
		return new UserService(userDao());
	}

}
