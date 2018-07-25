package com.sistemaprematricula.services;

import java.util.HashMap;
import java.util.HashSet;
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

	public Map<String, List<String>> getStudentsFromDiscipline() {
		Map<String, List<String>> result = new HashMap<>();
		
		HashSet<String> disciplines = new HashSet<String>(this.allocationRepository.findDisciplines());

		for (String code : disciplines) {
			result.put(code, this.getStudentsFromDiscipline(code));
		}
		return result;
	}
	
	public List<String> getStudentsFromDiscipline(String code) {
		return this.allocationRepository.findStudentsFromDisciplina(code);
	}
	
	public Map<String, List<String>> getDisciplinesFromStudents() {
		Map<String, List<String>> result = new HashMap<>();

		HashSet<String> students =  new HashSet<String>(this.allocationRepository.findStudents());
		
		for (String enrollment : students) {
			result.put(enrollment, this.getDisciplinesFromStudent(enrollment));
		}
		
		return result;
	}


	public List<String> getDisciplinesFromStudent(String enrollment) {
		return this.allocationRepository.findDisciplinesFromStudent(enrollment);
		
	}

}
