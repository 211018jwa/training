package com.revature.gradifysb.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.gradifysb.annotation.Associate;
import com.revature.gradifysb.dto.AddAssignmentDTO;
import com.revature.gradifysb.model.Assignment;
import com.revature.gradifysb.model.User;
import com.revature.gradifysb.service.AssignmentService;

@RestController
@CrossOrigin(originPatterns = "*", allowCredentials = "true")
public class AssignmentController {

	@Autowired
	private HttpServletRequest req;
	
	@Autowired
	private AssignmentService as;
	
	// Get All assignments for logged in associate 
	// (that belong to the associate that is logged in)
	@GetMapping(path = "/assignments")
	public ResponseEntity<Object> getAllAssignments() {
		/*
		 * Security
		 */
		HttpSession session = req.getSession();
		
		User currentlyLoggedInUser = (User) session.getAttribute("currentuser");
		
		if (currentlyLoggedInUser == null) {
			return ResponseEntity.status(401).body("You are not logged in");
		}
		
		// Actual functionality
		List<Assignment> assignments = as.getAssignments(currentlyLoggedInUser);
		
		return ResponseEntity.status(200).body(assignments);
		
	}
	
	@PostMapping(path = "/assignments")
	@Associate // Custom annotation
	public ResponseEntity<Object> addAssignment(@RequestBody AddAssignmentDTO dto) {
		
		User currentlyLoggedInUser = (User) req.getSession().getAttribute("currentuser");
		// Actual functionality
		Assignment addedAssignment = as.addAssignment(currentlyLoggedInUser, dto);
		
		return ResponseEntity.status(201).body(addedAssignment);
	}
	
}
