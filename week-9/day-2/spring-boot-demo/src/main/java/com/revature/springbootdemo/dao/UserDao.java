package com.revature.springbootdemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.springbootdemo.model.User;

@Repository
public class UserDao {

	@PersistenceContext
	private EntityManager em; // The Hibernate Session interface extends the EntityManager JPA interface
	// Spring Data JPA, which was a dependency that we included into our Spring Boot Application, can make use of any
	// implementation of JPA. Remember that Hibernate was one particular type of implementation.
	// Therefore, when it comes to the idea of abstraction in OOP, we can make use of the EntityManager interface, which is the parent
	// of our Hibernate Session
	
	// @PersistenceContext is an annotation that will tell our application to inject an EntityManager into the em field
	// This EntityManager object will be associated with a particular "Persistence Context". The Persistence Context is a container
	// for the persistent objects (recall the idea of object states: transient, persistent, detached)
	// 	(remember persistent objects are objects synchronized with the database)
	// The Persistence Context container is by default "scoped" to a particular transaction
	// 	We can define what we mean by a transaction using the @Transactional annotation
	
	@Transactional
	public List<User> getAllUsers() {
		Session session = em.unwrap(Session.class); // If you don't want to work with EntityManager, which is a JPA interface,
		// and want to work with the Hibernate Session interface instead, you can "extract" the Hibernate Session object from
		// The EntityManager
		
		List<User> users = session.createQuery("SELECT u FROM User u").getResultList(); // All of the User objects are persistent
		
		return users; // Past the point of this method, the objects are detached because we have the @Transactional annotation
		// from Spring framework on the method.
		
		// @Transactional is a method-level annotation that will begin a transaction within the particular method, and when the method
		// is done executing, the transaction will end
		// Because the Persistence Context is scoped to individual transactions, once you move beyond that transaction, then
		// The objects become detached because the Persistence Context no longer exists
	}
	
	@Transactional
	public void deleteUserById(int id) {
		Session session = em.unwrap(Session.class);
		
		User userToDelete = session.get(User.class, id);
		
		session.remove(userToDelete); // remove belongs to JPA, delete belongs to Hibernate
		
		// get belongs to Hibernate, find belongs to JPA
		// save belongs to Hibernate, persist belongs to JPA
		// There are a lot of interchangeabilities between using JPA methods and Hibernate methods
		// They do have some differences especially when it comes to exceptions that are thrown
		
	}
	
	@Transactional
	public User getUserById(int id) {
		Session session = em.unwrap(Session.class);
		
		User user = session.get(User.class, id);
		
		return user;
	}
	
	@Transactional
	public User addUser(User u) {
		// What object state is u? Transient
		
		em.persist(u);
		
		// What object state is u? Persistent
		
		return u;
	}
	
	@Transactional()
	public User getUserByUsernameAndPassword(String username, String password) {
		
		try {
			User user = (User) em.createQuery("FROM User u WHERE u.username = :user AND u.password = :pass")
					.setParameter("user", username)
					.setParameter("pass", password)
					.getSingleResult();
			
			return user;
		} catch(NoResultException e) {
			return null;
		}
		
	}
	
}
