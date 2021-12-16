package com.revature.gradifysb.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.gradifysb.dto.AddAssignmentDTO;
import com.revature.gradifysb.model.Assignment;
import com.revature.gradifysb.model.AssignmentStatus;
import com.revature.gradifysb.model.User;

@Repository
public class AssignmentDao {

	@PersistenceContext
	private EntityManager em;
	
	// Associate retrieve their assignments
	@Transactional
	public List<Assignment> getAllAssignmentsByUserId(int userId) {
		List<Assignment> assignments = em.createQuery("SELECT a FROM Assignment a JOIN a.author au WHERE au.id = :userid", Assignment.class)
				.setParameter("userid", userId)
				.getResultList();
		
		return assignments;
	}
	
	@Transactional
	public List<Assignment> getAllAssignments() {
		List<Assignment> assignments = em.createQuery("FROM Assignment a", Assignment.class).getResultList();
		
		return assignments;
	}
	
	@Transactional // It will insert an assignment with a given assignment name encapsulated inside of the dto parameter
	// and have the author based on the userId of who is currently logged in with a status of pending and a null resolver
	// The grade will be -1 to signify that it has not yet been graded
	public Assignment addAssignment(int userIdOfCurrentlyLoggedInUser, AddAssignmentDTO dto) {
		User currentlyLoggedInUser = em.find(User.class, userIdOfCurrentlyLoggedInUser);
		
		AssignmentStatus pending = (AssignmentStatus) 
				em.createQuery("FROM AssignmentStatus a WHERE a.status = 'pending'").getSingleResult();
		
		Assignment assignmentToAdd = new Assignment(dto.getAssignmentName(), -1, pending, currentlyLoggedInUser, null);
		// Create a transient object that has the given assignment name, a pending status, the currently logged in User as the author,
		// and null for the resolver
		
		em.persist(assignmentToAdd);
		
		return assignmentToAdd;
	}
	
}
