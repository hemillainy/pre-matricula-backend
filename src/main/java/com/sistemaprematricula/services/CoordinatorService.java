package com.sistemaprematricula.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemaprematricula.models.user.Coordinator;
import com.sistemaprematricula.repositories.CoordinatorRepository;

@Service
public class CoordinatorService {

	@Autowired
	CoordinatorRepository coordinatorRepository;
	

	private Coordinator coordinator;
	
	public Boolean validatePassword(String password) {
		this.validateCoordinator();
		return this.coordinatorRepository.getPassword().equals(password);
	}
	
	private void validateCoordinator() {
		if(this.coordinator == null) {
			this.coordinator = Coordinator.getInstance();
			this.coordinatorRepository.save(this.coordinator);
		}
	}

	public void setPassword(String password) {
		this.validateCoordinator();
		this.coordinatorRepository.setPassword(password, this.coordinator.getEmail());
	 }

}
