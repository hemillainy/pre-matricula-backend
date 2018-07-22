package com.sistemaprematricula.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemaprematricula.models.Allocation;
import com.sistemaprematricula.repositories.AllocationRepository;

@Service
public class AllocationService {
	
	@Autowired
	AllocationRepository allocationRepository;
	
	
	public List<Allocation> getAll() {
		return this.allocationRepository.findAll();
	}
	
	public void save(Allocation allocation) {
		this.allocationRepository.save(allocation);
	}
	

}
