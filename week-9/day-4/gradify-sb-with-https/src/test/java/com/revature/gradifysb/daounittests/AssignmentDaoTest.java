package com.revature.gradifysb.daounittests;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.transaction.annotation.Transactional;

import com.revature.gradifysb.dao.AssignmentDao;
import com.revature.gradifysb.dto.AddAssignmentDTO;
import com.revature.gradifysb.model.Assignment;
import com.revature.gradifysb.model.AssignmentStatus;
import com.revature.gradifysb.model.User;
import com.revature.gradifysb.model.UserRole;

@SpringBootTest
@DirtiesContext(classMode = ClassMode.BEFORE_EACH_TEST_METHOD)
// The DirtiesContext annotation basically will instruct to the Test runner that the context should be restarted after each test
// What that means is that we will have a new fresh database created for each test along with all of the Spring beans
public class AssignmentDaoTest {

	@Autowired
	private EntityManager em;
	
	@Autowired
	private AssignmentDao sut;
	
	@Test
	@Transactional
	public void testGetAllAssignmentsByUserId_positive() {
		/*
		 * Arrange
		 * 
		 * 1. We need a user (which requires user role)
		 * 2. We need an assignment (which requires assignment status)
		 */
		UserRole ur = new UserRole("associate");
		this.em.persist(ur);
		
		User u = new User("Bach", "Tran", "bach_tran", "password123", ur);
		this.em.persist(u);
		
		AssignmentStatus as = new AssignmentStatus("pending");
		this.em.persist(as);
		
		Assignment a1 = new Assignment("Homework 1.1", -1, as, u, null);
		this.em.persist(a1);
		
		Assignment a2 = new Assignment("Homework 1.2", -1, as, u, null);
		this.em.persist(a2);
		
		this.em.flush(); // It ensures that whatever persistent objects you have get synchronized with the database
		
		/*
		 * Act
		 */
		Assignment expected1 = new Assignment("Homework 1.1", -1, as, u, null);
		expected1.setId(1);
		Assignment expected2 = new Assignment("Homework 1.2", -1, as, u, null);
		expected2.setId(2);
		
		List<Assignment> expectedList = List.of(expected1, expected2);
		
		List<Assignment> actualList = this.sut.getAllAssignmentsByUserId(1);
		
		/*
		 * Assert
		 */
		
		Assertions.assertEquals(expectedList, actualList);
		
	}
	
	@Test
	@Transactional
	public void testGetAllAssignmentsByUserId_userDoesNotExist() {
		/*
		 * Arrange
		 */
		// Nothing required to arrange
		
		/*
		 * Act
		 */
		List<Assignment> actual = this.sut.getAllAssignmentsByUserId(1);
		
		/*
		 * Assert
		 */
		List<Assignment> expected = new ArrayList<>();
		
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	@Transactional
	public void testGetAllAssignments_positive() {
		/*
		 * Arrange
		 */
		UserRole ur = new UserRole("associate");
		this.em.persist(ur);
		
		AssignmentStatus as = new AssignmentStatus("pending");
		this.em.persist(as);
		
		// Setup associate Bach with 2 assignments
		User u = new User("Bach", "Tran", "bach_tran", "password123", ur);
		this.em.persist(u);
		
		Assignment a1 = new Assignment("Homework 1.1", -1, as, u, null);
		this.em.persist(a1);
		
		Assignment a2 = new Assignment("Homework 1.2", -1, as, u, null);
		this.em.persist(a2);
		
		// Setup associate Jane with 3 assignments
		User j = new User("Jane", "Doe", "jane_doe", "12345", ur);
		this.em.persist(j);
		
		Assignment j1 = new Assignment("Homework 1.1", -1, as, j, null);
		this.em.persist(j1);
		
		Assignment j2 = new Assignment("Homework 1.2", -1, as, j, null);
		this.em.persist(j2);
		
		Assignment j3 = new Assignment("Midterm 1", -1, as, j, null);
		this.em.persist(j3);
		
		this.em.flush();
		
		/*
		 * Act
		 */
		List<Assignment> assignments = this.sut.getAllAssignments();
		
		/*
		 * Assert
		 */
		Assignment expected1 = new Assignment("Homework 1.1", -1, as, u, null);
		expected1.setId(1);
		
		Assignment expected2 = new Assignment("Homework 1.2", -1, as, u, null);
		expected2.setId(2);
		
		Assignment expected3 = new Assignment("Homework 1.1", -1, as, j, null);
		expected3.setId(3);
		
		Assignment expected4 = new Assignment("Homework 1.2", -1, as, j, null);
		expected4.setId(4);
		
		Assignment expected5 = new Assignment("Midterm 1", -1, as, j, null);
		expected5.setId(5);
		
		List<Assignment> expectedAssignments = List.of(expected1, expected2, expected3, expected4, expected5);
		
		Assertions.assertEquals(expectedAssignments, assignments);
		
	}
	
	@Test
	@Transactional
	public void testAddAssignmentForUser_positive() {
		/*
		 * Arrange
		 * 
		 * Insert
		 * 1. UserRole into the database
		 * 2. A User into the database
		 * 3. AssignmentStatus
		 */
		UserRole associate = new UserRole("associate");
		this.em.persist(associate);
		
		User user = new User("Bach", "Tran", "bach_tran", "password12345", associate); // id of 1
		this.em.persist(user);
		
		AssignmentStatus pending = new AssignmentStatus("pending");
		this.em.persist(pending);
		
		this.em.flush();
		/*
		 * Act
		 */
		Assignment addedAssignment = this.sut.addAssignment(1, new AddAssignmentDTO("Midterm 1"));
		
		/*
		 * Assert
		 */
		Assignment expected = new Assignment("Midterm 1", -1, pending, user, null);
		expected.setId(1);
		
		Assertions.assertEquals(expected, addedAssignment);
		
	}
	
}
