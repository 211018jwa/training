package com.revature.gradifysb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity 
@NoArgsConstructor @EqualsAndHashCode @Getter @Setter @ToString
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

	public Assignment(String assignmentName, int grade, AssignmentStatus status, User author, User resolver) {
		super();
		this.assignmentName = assignmentName;
		this.grade = grade;
		this.status = status;
		this.author = author;
		this.resolver = resolver;
	}
	
}
