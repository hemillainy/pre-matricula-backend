package com.sistemaprematricula.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sistemaprematricula.models.user.User;

@Entity
@Table(name = "allocation")
public class Allocation {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name = "student_enrollment")
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "student_enrollment")
	private User student;
	
	@Column(name = "discipline_code")
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "curricular_component_code")
	private CurricularComponent curricularComponent;
	
	public Allocation() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getStudent() {
		return student;
	}

	public void setStudent(User student) {
		this.student = student;
	}

	public CurricularComponent getCurricularComponent() {
		return curricularComponent;
	}

	public void setCurricularComponent(CurricularComponent curricularComponent) {
		this.curricularComponent = curricularComponent;
	}


}
