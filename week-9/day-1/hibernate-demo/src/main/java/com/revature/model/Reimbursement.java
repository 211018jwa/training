package com.revature.model;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "ers_reimbursements")
public class Reimbursement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	// @Column is optional
	private double amount;
	private String status;
	private String type;
	private String description;
	
	// Mapping annotations
	// @OneToOne
	// @OneToMany / @ManyToOne
	// @ManyToMany
	
	 
	// You could utilize the cascade property on the mapping annotation to cascade whatever hibernate operation you're doing
	// to the other entity as well
	// We have 5 different operations in JPA
	// 	1. Detach: takes a currently persistent object and transitions it to the detached state
	//  2. Persist: takes a transient object and turns it into a persistent object
	//  3. Merge: takes a detached object and turn it into a persistent object
	//  4. Refresh: synchronizes a persistent object's data with the database data
	//  5. Remove: removes an object and its associated database data from the database
	@ManyToOne(cascade = CascadeType.PERSIST)
	@OnDelete(action = OnDeleteAction.CASCADE) // If you delete the User, then it will delete all of the reimbursements
	// authored by that user automatically
	private User author;
	
	@ManyToOne
	private User resolver;

	public Reimbursement() {
		super();
	}

	public Reimbursement(double amount, String status, String type, String description, User author, User resolver) {
		super();
		this.amount = amount;
		this.status = status;
		this.type = type;
		this.description = description;
		this.author = author;
		this.resolver = resolver;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public User getResolver() {
		return resolver;
	}

	public void setResolver(User resolver) {
		this.resolver = resolver;
	}

	@Override
	public String toString() {
		return "Reimbursement [id=" + id + ", amount=" + amount + ", status=" + status + ", type=" + type
				+ ", description=" + description + ", author=" + author + ", resolver=" + resolver + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, author, description, id, resolver, status, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reimbursement other = (Reimbursement) obj;
		return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
				&& Objects.equals(author, other.author) && Objects.equals(description, other.description)
				&& id == other.id && Objects.equals(resolver, other.resolver) && Objects.equals(status, other.status)
				&& Objects.equals(type, other.type);
	}
	
}
