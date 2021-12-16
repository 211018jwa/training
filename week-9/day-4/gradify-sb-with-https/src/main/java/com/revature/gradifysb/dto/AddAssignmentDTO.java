package com.revature.gradifysb.dto;

import java.util.Objects;

public class AddAssignmentDTO {

	private String assignmentName;

	public AddAssignmentDTO() {
		super();
	}

	public AddAssignmentDTO(String assignmentName) {
		super();
		this.assignmentName = assignmentName;
	}

	public String getAssignmentName() {
		return assignmentName;
	}

	public void setAssignmentName(String assignmentName) {
		this.assignmentName = assignmentName;
	}

	@Override
	public String toString() {
		return "AddAssignmentDTO [assignmentName=" + assignmentName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(assignmentName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AddAssignmentDTO other = (AddAssignmentDTO) obj;
		return Objects.equals(assignmentName, other.assignmentName);
	}
	
}
