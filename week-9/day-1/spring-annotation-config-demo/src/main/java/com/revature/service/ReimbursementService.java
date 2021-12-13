package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dao.ReimbursementDao;
import com.revature.model.Reimbursement;

@Service
public class ReimbursementService {

	private ReimbursementDao reimbursementDao;
	
	public List<Reimbursement> getAllReimbursements() {
		return this.reimbursementDao.getAllReimbursements();
	}
	
	@Autowired // Setter injection using @Autowired
	public void setReimbursementDao(ReimbursementDao reimbursementDao) {
		this.reimbursementDao = reimbursementDao;
	}
	
}
