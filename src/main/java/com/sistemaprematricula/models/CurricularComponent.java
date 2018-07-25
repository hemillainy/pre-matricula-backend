package com.sistemaprematricula.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "curricular_component")
public class CurricularComponent {

	@Id
	@Column(name = "code")
	@NotNull(message = "Class code can not be null")
	@NotEmpty(message = "Class can not be empty.")
	private String code;

	@Column(name = "name")
	@NotNull(message = "Class name can not be null")
	@NotEmpty(message = "Class name not be empty.")
	private String name;

	@Column(name = "credits")
	private int credits;

	@Column(name = "type")
	private String type;

	@Column(name = "period")
	private Integer period;

	public CurricularComponent() {

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getPeriod() {
		return period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

}