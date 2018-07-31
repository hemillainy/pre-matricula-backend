package com.sistemaprematricula.models.user;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "coordinator")
@PrimaryKeyJoinColumn(name = "coordinator_id", referencedColumnName="enrollment")
public class Coordinator extends User {

	@Column(name = "password")
	@NotNull(message = "User password can not be null")
	@NotEmpty(message = "User password can not be empty")
	private String password;

	@JsonCreator
	public Coordinator(@JsonProperty("enrollment") String enrollment, @JsonProperty("email") String email,@JsonProperty("name") String name, @JsonProperty("password") String password) {
		super(enrollment, email, name);
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	
}