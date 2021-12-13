package com.revature.dao;

import java.util.ArrayList;
import java.util.List;

import com.revature.model.Reimbursement;

public class ReimbursementDao {

	private List<Reimbursement> fakeReimbursements;
	
	public ReimbursementDao() {
		List<Reimbursement> reimbursements = new ArrayList<>();
		reimbursements.add(new Reimbursement(1, 5.43, "dsfsdfs", "pending", "food"));
		reimbursements.add(new Reimbursement(2, 10.23, "abc", "approved", "lodging"));
		reimbursements.add(new Reimbursement(3, 23434.23, "def", "denied", "travel"));
		reimbursements.add(new Reimbursement(4, 56.54, "test", "pending", "other"));
		
		this.fakeReimbursements = reimbursements;
	}
	
	public List<Reimbursement> getAllReimbursements() {
		return this.fakeReimbursements;
	}
	
}
