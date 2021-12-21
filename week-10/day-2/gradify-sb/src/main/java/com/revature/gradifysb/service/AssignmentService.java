package com.revature.gradifysb.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.gradifysb.dao.AssignmentDao;
import com.revature.gradifysb.dao.AssignmentStatusDao;
import com.revature.gradifysb.dao.UserDao;
import com.revature.gradifysb.dto.AddAssignmentDTO;
import com.revature.gradifysb.model.Assignment;
import com.revature.gradifysb.model.AssignmentStatus;
import com.revature.gradifysb.model.User;

@Service
public class AssignmentService {

	@Autowired
	private AssignmentDao ad;
	
	@Autowired
	private AssignmentStatusDao asd;
	
	@Autowired
	private UserDao ud;
	
	// business logic
	// Check if the logged in user is an associate, and if they are, use the dao layer's getAllAssignmentsByUserId method
	// Check if the logged in user is a trainer, and if they are, use the dao layer's getAllAssignments method
	public List<Assignment> getAssignments(User currentlyLoggedInUser) {
		if (currentlyLoggedInUser.getRole().getRole().equals("associate")) {
			return ad.getAllAssignmentsByUserId(currentlyLoggedInUser.getId());
		}
		
		if (currentlyLoggedInUser.getRole().getRole().equals("trainer")) {
			return ad.findAll(); // findAll belongs to the JpaRepository interface that the AssignmentDao interface extends
		}
		
		return new ArrayList<>();
	}
	
	// Trim trailing whitespaces from assignment name
	public Assignment addAssignment(User currentlyLoggedInUser, AddAssignmentDTO dto) {
		
		AssignmentStatus as = asd.findByStatus("pending");
		
		System.out.println(as);
		
		Optional<User> u = ud.findById(currentlyLoggedInUser.getId()); // GetById returns a proxy, which doesn't actually
		// contain the data
		
		Assignment assignmentToAdd = new Assignment(dto.getAssignmentName(), -1, as, u.get(), null);
		
		Assignment addedAssignment = ad.save(assignmentToAdd);
		
		return addedAssignment;
	}
	
}
