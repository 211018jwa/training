package com.revature.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.revature.model.Reimbursement;

// @Repository
public class HibernateReimbursementDao implements ReimbursementDao {

	@Override
	public List<Reimbursement> getAllReimbursements() {
		return new ArrayList<Reimbursement>(); // pretend that this code contacts the actual database and returns to you the Reimbursement
		// information. However the database is empty at the moment, so it returns an empty list
	}

}
