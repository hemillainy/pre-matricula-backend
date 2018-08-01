package com.sistemaprematricula.models.user;

public class Coordinator{

	private static Coordinator coordinator;
	private String email;
	private Integer password;

	private Coordinator() {
		this.email = "geovane.silva@ccc.ufcg.edu.br";
		this.password = "ccspm".hashCode();
	}
	
	
	public static Coordinator getInstance() {
		if (coordinator == null) {
			coordinator = new Coordinator();
		}
		return coordinator;
	}

	public Integer getPassword() {
		return password;
	}

	public void setPassword(Integer password) {
		this.password = password;
	}	
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}