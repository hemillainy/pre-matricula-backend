package com.sistemaprematricula.models.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@Column(name = "email")
	private String email;

	@Column(name = "enrollment", unique=true)
	@NotNull(message = "Student enrollment can not be null")
	@NotEmpty(message = "Student enrollment can not be empty")
	private String enrollment;


	@Column(name = "name")
	@NotNull(message = "Student name can not be null")
	@NotEmpty(message = "Student name can not be empty")
	private String name;

	public Student() {
	}

	public Student(String enrollment, String email, String name) {
		this.enrollment = enrollment;
		this.email = email;
		this.name = name;
	}

	public String getEnrollment() {
		return enrollment;
	}

	public void setEnrollment(String enrollment) {
		this.enrollment = enrollment;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
