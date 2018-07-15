package models.user;

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
	
	@Column(name = "teacher")
	@NotNull(message = "Class teacher name can not be null")
	@NotEmpty(message = "class teacher name can not be empty")
	private String teacher;

	public CurricularComponent() {

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

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

}