package com.revature.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.revature.model.ReimbStatus;
import com.revature.model.ReimbType;
import com.revature.model.Reimbursement;
import com.revature.model.Role;
import com.revature.model.User;
import com.revature.util.SessionFactorySingleton;

public class Main {

	public static void main(String[] args) {
		// populateInitialData(); // Populate 2 UserRoles (finance manager and employee), add 2 users, add reimbursement types, reimbursement statuses
		
		addReimbursements();
	}
	
	public static void addReimbursements() {
		
		SessionFactory sf = SessionFactorySingleton.getSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		ReimbStatus pending = (ReimbStatus) session.createQuery("FROM ReimbStatus rs WHERE rs.status = 'pending'").getSingleResult();
		User author = session.get(User.class, 2);
		ReimbType travel = (ReimbType) session.createQuery("FROM ReimbType rt WHERE rt.type = 'travel'").getSingleResult();
		
		Reimbursement reimb1 = new Reimbursement(150.75, "plane ticket", author, null, travel, pending);
		
		session.persist(reimb1);
		
		tx.commit();
		
		session.close();
	}
	
	public static void populateInitialData() {
		SessionFactory sf = SessionFactorySingleton.getSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		// Add Roles
		Role employee = new Role("employee");
		Role financeManager = new Role("finance manager");
		
		session.persist(employee);
		session.persist(financeManager);
		
		tx.commit();
		
		// Add users
		// 1 Employee and 1 Finance manager
		tx = session.beginTransaction();
		
		User user1 = new User("John", "Doe", "john_doe", "pass123", "john_doe@email.com", 30, financeManager);
		User user2 = new User("Bach", "Tran", "bach_tran", "password12345", "bach_tran@email.com", 24, employee);
		
		session.persist(user1);
		session.persist(user2);
		
		tx.commit();
		
		// Add Reimbursement Statuses
		tx = session.beginTransaction();
		
		ReimbStatus p = new ReimbStatus("pending");
		ReimbStatus a = new ReimbStatus("approved");
		ReimbStatus d = new ReimbStatus("denied");
		
		session.persist(p);
		session.persist(a);
		session.persist(d);
		
		tx.commit();
		
		// Add Reimbursement Types
		tx = session.beginTransaction();
		
		ReimbType l = new ReimbType("lodging");
		ReimbType f = new ReimbType("food");
		ReimbType t = new ReimbType("travel");
		ReimbType o = new ReimbType("other");
		
		session.persist(l);
		session.persist(f);
		session.persist(t);
		session.persist(o);
		
		tx.commit();
	}

}
