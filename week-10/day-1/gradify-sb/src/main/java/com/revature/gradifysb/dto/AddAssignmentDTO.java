package com.revature.gradifysb.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @EqualsAndHashCode @ToString @NoArgsConstructor
public class AddAssignmentDTO {

	private String assignmentName;

	public AddAssignmentDTO(String assignmentName) {
		super();
		this.assignmentName = assignmentName;
	}
	
}
