package com.revature.gradifysb.daounittests;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataAccessException;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.transaction.annotation.Transactional;

import com.revature.gradifysb.dao.UserDao;
import com.revature.gradifysb.model.User;
import com.revature.gradifysb.model.UserRole;

@SpringBootTest
@DirtiesContext(classMode = ClassMode.BEFORE_EACH_TEST_METHOD)
public class UserDaoTest {

	@Autowired
	private EntityManager em; // we will use this to populate the initial data for each test
	
	@Autowired
	private UserDao sut; // system under test
	
	@Test
	@Transactional // After every single test, the modifications made are rolled back
	// Whatever information we added to the database when arranging this test does not exist after the test is completed
	public void testGetUserByUsernameAndPassword_positive() {
		/*
		 * Arrange
		 */
		// Create a UserRole, and persist the UserRole
		UserRole associate = new UserRole("associate");
		this.em.persist(associate);
		
		User user = new User("Bach", "Tran", "bach_tran", "password123", associate);
		this.em.persist(user);
		
		this.em.flush();
		
		/*
		 * Act
		 */
		// The actual testing of the DAO
		User actual = this.sut.findByUsernameAndPassword("bach_tran", "password123");
		
		/*
		 * Assert
		 */
		User expected = new User("Bach", "Tran", "bach_tran", "password123", associate);
		expected.setId(1);
		
		Assertions.assertEquals(expected, actual);
		
	}
	
	@Test
	@Transactional
	public void testGetUserByUsernameAndPassword_incorrectPassword() {
		/*
		 * Arrange: add a user and a certain role for the user
		 */
		UserRole associate = new UserRole("associate");
		this.em.persist(associate);
		
		User user = new User("Bach", "Tran", "bach_tran", "password123", associate);
		this.em.persist(user);
		
		this.em.flush();
		
		/*
		 * Act
		 */
		
		User actual = this.sut.findByUsernameAndPassword("bach_tran", "wrongpassword123");
		
		/*
		 * Assert
		 */
		Assertions.assertNull(actual);
	}
	
}
