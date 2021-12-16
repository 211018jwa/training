package com.revature.gradifysb.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Assignment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String assignmentName;
	private int grade;
	
	// Think of this as a foreign key to the assignment_status table
	@ManyToOne
	private AssignmentStatus status;
	
	@ManyToOne
	private User author;
	
	@ManyToOne // Who actually graded the assignment
	private User resolver;

	public Assignment() {
		super();
	}

	public Assignment(String assignmentName, int grade, AssignmentStatus status, User author, User resolver) {
		super();
		this.assignmentName = assignmentName;
		this.grade = grade;
		this.status = status;
		this.author = author;
		this.resolver = resolver;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAssignmentName() {
		return assignmentName;
	}

	public void setAssignmentName(String assignmentName) {
		this.assignmentName = assignmentName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public AssignmentStatus getStatus() {
		return status;
	}

	public void setStatus(AssignmentStatus status) {
		this.status = status;
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
	public int hashCode() {
		return Objects.hash(assignmentName, author, grade, id, resolver, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Assignment other = (Assignment) obj;
		return Objects.equals(assignmentName, other.assignmentName) && Objects.equals(author, other.author)
				&& grade == other.grade && id == other.id && Objects.equals(resolver, other.resolver)
				&& Objects.equals(status, other.status);
	}

	@Override
	public String toString() {
		return "Assignment [id=" + id + ", assignmentName=" + assignmentName + ", grade=" + grade + ", status=" + status
				+ ", author=" + author + ", resolver=" + resolver + "]";
	}
	
}
