package com.sistemaprematricula.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "allocation")
public class Allocation {

	@Id
	@Column(name = "student_enrollment")
	@NotNull(message = "Student enrollment can not be null")
	@NotEmpty(message = "Student enrollment can not be empty")
	private String studentEnrolllment;
	
	@Column(name = "discipline_code")
	@NotNull(message = "Discipline code can not be null")
	@NotEmpty(message = "Discipline code can not be empty")
	private String disciplineCode;
	
	public Allocation() {
		
	}

	public String getStudentEnrolllment() {
		return studentEnrolllment;
	}

	public void setStudentEnrolllment(String studentEnrolllment) {
		this.studentEnrolllment = studentEnrolllment;
	}

	public String getDisciplineCode() {
		return disciplineCode;
	}

	public void setDisciplineCode(String disciplineCode) {
		this.disciplineCode = disciplineCode;
	}
}
