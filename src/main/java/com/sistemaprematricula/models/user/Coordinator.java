package com.sistemaprematricula.models.user;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "coordinator")
public class Coordinator{

	@Id
	@Column(name = "email")
	private String email;

	@Column(name = "password")
	@NotNull(message = "User password can not be null")
	@NotEmpty(message = "User password can not be empty")
	private String password;
	public Coordinator(String email, String password) {
		
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}