package com.sistemaprematricula.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemaprematricula.models.user.Coordinator;

@Service
public class CoordinatorService {

	@Autowired
	CoordinatorRepository coordinatorRepository;
	
	public Coordinator save(Coordinator coordinator) {
		this.coordinatorRepository.save(coordinator);
		return coordinator;
	}

	public Optional<Coordinator> get(String email) {
		return this.coordinatorRepository.findById(email);
	}

	public void update(String email, Coordinator coordinator) {
		// TODO Auto-generated method stub
		
	}
	
}
