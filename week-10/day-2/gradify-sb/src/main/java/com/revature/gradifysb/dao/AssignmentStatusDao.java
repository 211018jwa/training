package com.revature.gradifysb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.gradifysb.model.AssignmentStatus;

public interface AssignmentStatusDao extends JpaRepository<AssignmentStatus, Integer> {
	
	public AssignmentStatus findByStatus(String status);

}
