package com.revature.service;

import java.util.List;

import com.revature.dao.ReimbursementDao;
import com.revature.model.Reimbursement;

public class ReimbursementService {

	private ReimbursementDao reimbursementDao;
	
	public List<Reimbursement> getAllReimbursements() {
		return this.reimbursementDao.getAllReimbursements();
	}
	
	public void setReimbursementDao(ReimbursementDao reimbursementDao) {
		this.reimbursementDao = reimbursementDao;
	}
	
}
