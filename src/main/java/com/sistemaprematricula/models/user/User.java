package com.sistemaprematricula.models.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "user_system")
public class User {

	@Id
	@Column(name = "email")
	private String email;

	@Column(name = "enrollment")
	@NotNull(message = "User enrollment can not be null")
	@NotEmpty(message = "User enrollment can not be empty")
	private String enrollment;


	@Column(name = "name")
	@NotNull(message = "User name can not be null")
	@NotEmpty(message = "User name can not be empty")
	private String name;

	public User() {
	}

	public User(String enrollment, String email, String name) {
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
