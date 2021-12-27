package com.revature.gradifysb.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.gradifysb.model.User;

// What are the 3 different ways of configuring Spring beans?
// 1. Annotation configuration: commonly used (stereotype annotation)
// 2. Java Configuration: still commonly used in Spring Boot
	// Class with @Configuration on top
	// @Bean annotated methods, where the code inside of the methods is code to instantiate a particular object that will be a bean
// 3. XML Configuration (old way): Spring boot got rid of the need for XML Configuration

// @Repository // Registers a Spring bean, but also tells the Spring framework to automatically translate any JPA exceptions (Hibernate, etc.)
// into Spring specific annotations (like DataAccessException)
public class UserDaoOld {

	@PersistenceContext
	private EntityManager em;
	
	// This method either
	// 1. Returns the User with the given username and password
	// 2. throws a DataAccessException
	@Transactional
	public User getUserByUsernameAndPassword(String username, String password) {
		User user = em.createQuery("FROM User u WHERE u.username = :user AND u.password = :pass", User.class)
		.setParameter("user", username)
		.setParameter("pass", password)
		.getSingleResult(); 
		// the getSingleResult method will throw NoSuchResultException if there is no User matching that particular username
		// and password
		
		// However, Spring will take that exception and translate it into DataAccessException and throw that exception instead.
		
		return user;
	}
	
}
