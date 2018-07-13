package models;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Student extends User{

	private String CPF;
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