package com.sistemaprematricula.models.user;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "student")
@PrimaryKeyJoinColumn(name = "student_id", referencedColumnName = "enrollment")
public class Student extends User {

	@Column(name = "cpf")
	@NotNull(message = "User cpf can not be null.")
	@NotEmpty(message = "User cpf can not be empty.")
	private String CPF;

	@Column(name = "date_birth")
	@NotNull(message = "Date of birth of the user can not be null")
	private Date dateBirth;

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public Date getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}

}