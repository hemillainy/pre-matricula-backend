package com.sistemaprematricula.models.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Entity
@Table(name = "user_system")
@JsonTypeInfo(
		  use = JsonTypeInfo.Id.CLASS, 
		  include = JsonTypeInfo.As.PROPERTY,
		  property = "type"
)
@JsonSubTypes({ 
	  @Type(value = Coordinator.class, name = "coordinator")
})
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

	@Id
//	@JsonProperty("enrollment")
	@Column(name = "enrollment")
	private String enrollment;

	@Column(name = "email")
//	@JsonProperty("email")
	@NotNull(message = "User email can not be null")
	@NotEmpty(message = "User email can not be empty")
	private String email;

	@Column(name = "name")
//	@JsonProperty("name")
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
