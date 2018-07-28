package com.sistemaprematricula.models.user;


import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "coordinator")
@PrimaryKeyJoinColumn(name = "coordinator_id", referencedColumnName="enrollment")
public class Coordinator extends User {

	public Coordinator(String enrollment, String email, String name, String password) {
		super(enrollment, email, name, password);
	}
	
}
