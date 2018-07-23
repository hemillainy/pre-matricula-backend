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

	public Student(String enrollment, String email, String name, String password, String cpf, Date dateBirth) {
		super(enrollment, email, name, password);
	}

}
