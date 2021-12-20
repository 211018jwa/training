package com.revature.gradifysb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.gradifysb.dao.AssignmentDao;
import com.revature.gradifysb.dto.AddAssignmentDTO;
import com.revature.gradifysb.model.Assignment;
import com.revature.gradifysb.model.User;

@Service
public class AssignmentService {

	@Autowired
	private AssignmentDao ad;
	
	// business logic
	// Check if the logged in user is an associate, and if they are, use the dao layer's getAllAssignmentsByUserId method
	// Check if the logged in user is a trainer, and if they are, use the dao layer's getAllAssignments method
	public List<Assignment> getAssignments(User currentlyLoggedInUser) {
		if (currentlyLoggedInUser.getRole().getRole().equals("associate")) {
			return ad.getAllAssignmentsByUserId(currentlyLoggedInUser.getId());
		}
		
		if (currentlyLoggedInUser.getRole().getRole().equals("trainer")) {
			return ad.getAllAssignments();
		}
		
		return new ArrayList<>();
	}
	
	// Trim trailing whitespaces from assignment name
	public Assignment addAssignment(User currentlyLoggedInUser, AddAssignmentDTO dto) {
		dto.setAssignmentName(dto.getAssignmentName().trim());
		
		return ad.addAssignment(currentlyLoggedInUser.getId(), dto);
	}
	
}
