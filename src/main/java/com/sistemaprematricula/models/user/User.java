package com.sistemaprematricula.models.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "user")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "enrollment")
	@NotNull(message = "User enrollment can not be null")
	@NotEmpty(message = "User enrollment can not be empty")
	private String enrollment;

	@Column(name = "email")
	@NotNull(message = "User email can not be null")
	@NotEmpty(message = "User email can not be empty")
	private String email;

	@Column(name = "name")
	@NotNull(message = "User name can not be null")
	@NotEmpty(message = "User name can not be empty")
	private String name;

	@Column(name = "password")
	@NotNull(message = "User password can not be null")
	@NotEmpty(message = "User password can not be empty")
	private String password;

	public User() {
	}

	public User(String enrollment, String email, String name, String password) {
		this.enrollment = enrollment;
		this.email = email;
		this.name = name;
		this.password = password;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
