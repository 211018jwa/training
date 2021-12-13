package com.revature.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.revature.model.Reimbursement;
import com.revature.model.User;
import com.revature.util.SessionFactorySingleton;

public class Main {

	public static void main(String[] args) {
//		populateSampleData();
	}
	
	public static void populateSampleData() {
		SessionFactory sf = SessionFactorySingleton.getSessionFactory();
		
		// Utilize the SessionFactory to create a Session object
		Session session = sf.openSession(); // The Session object is what you interact with in order to deal with data on the database
		
		Transaction tx = session.beginTransaction();
		
		// Object states
		// 1. Transient: plain old Java objects that have never been tracked by a Session object
		// 2. Persistent: an object tracked by the Session object that is synchronized with the database
		// 3. Detached: an object that was persistent but is no longer persistent because either it was detached from the Session
		//  	or the Session object was closed
		
		User user1 = new User("Bach", "Tran", "bach_tran", "password12345", "Employee", "bach.tran@email.com", 24); // Transient
		User user2 = new User("John", "Doe", "john_doe", "password123", "Finance Manager", "john_doe@company.com", 30); // Transient
		
		session.persist(user1); // user1 and user2 are now Persistent
		session.persist(user2);
		
		// Create reimbursements that belong to user1
		Reimbursement reimb1 = new Reimbursement(100.5, "pending", "lodging", "business trip hotel booking", user1, null);
		Reimbursement reimb2 = new Reimbursement(56.45, "approved", "food", "team-building get together at restaurant", user1, user2);
		
		session.persist(reimb1);
		session.persist(reimb2);

		tx.commit();
		
		session.close();
		
		// user1 and user2 are now detached at this point (no longer synchronized with the db)
		
	}

}
