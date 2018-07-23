package com.sistemaprematricula.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	
	public Allocation save(Allocation allocation) {
		return this.allocationRepository.save(allocation);
	}

	public Map<String, ArrayList<String>> getStudentsFromDiscipline() {
		Map<String, ArrayList<String>> result = new HashMap<>();

		for (Allocation allocation : this.getAll()) {
			String key = allocation.getDisciplineCode();
			String value = allocation.getStudentEnrollment();
			
			if (result.containsKey(key)) {
				result.get(key).add(value);
			} else {
				result.put(key, new ArrayList<String>());
				result.get(key).add(value);
			}
		}
		return result;
	}
	
	public Map<String, ArrayList<String>> getDisciplinesFromStudents() {
		Map<String, ArrayList<String>> result = new HashMap<>();

		for (Allocation allocation : this.getAll()) {
			String key = allocation.getStudentEnrollment();
			String value = allocation.getDisciplineCode();
			
			if (result.containsKey(key)) {
				result.get(key).add(value);
			} else {
				result.put(key, new ArrayList<String>());
				result.get(key).add(value);
			}
		}
		return result;
	}

}
