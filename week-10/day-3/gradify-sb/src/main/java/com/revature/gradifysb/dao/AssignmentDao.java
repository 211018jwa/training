package com.revature.gradifysb.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.revature.gradifysb.model.Assignment;

public interface AssignmentDao extends JpaRepository<Assignment, Integer> {

	@Query("SELECT a FROM Assignment a JOIN a.author au WHERE au.id = :userId")
	public List<Assignment> getAllAssignmentsByUserId(int userId);
	
}
