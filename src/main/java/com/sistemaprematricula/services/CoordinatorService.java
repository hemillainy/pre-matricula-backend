package com.sistemaprematricula.services;

import org.springframework.stereotype.Service;

import com.sistemaprematricula.models.user.Coordinator;

@Service
public class CoordinatorService {

	private Coordinator coordinator;

	public Boolean validateEmail(String email) {
		this.validateCoordinator();
		return this.coordinator.getEmail().equals(email);
	}
	
	public Boolean validatePassword(String password) {
		this.validateCoordinator();
		return this.coordinator.getPassword().equals(password.hashCode());
	}
	
	private void validateCoordinator() {
		if(this.coordinator == null) {
			this.coordinator = Coordinator.getInstance();
		}
	}

	public void setPassword(String password) {
		this.validateCoordinator();
		this.coordinator.setPassword(password.hashCode());
	 }

	public String getEmail() {
		this.validateCoordinator();
		return this.coordinator.getEmail();
	}

}
