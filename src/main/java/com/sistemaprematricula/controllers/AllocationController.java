package com.sistemaprematricula.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaprematricula.models.Allocation;
import com.sistemaprematricula.services.AllocationService;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(value = "*")
public class AllocationController {

	@Autowired
	AllocationService allocationService;

	@RequestMapping(value = "/allocation", method = RequestMethod.POST)
	public Allocation[] save(@RequestBody Allocation[] allocation) {
		return this.allocationService.save(allocation);
	}
	
	@RequestMapping(value = "/allocation", method = RequestMethod.DELETE)
	public void delete(@RequestBody Allocation[] allocation) {
		this.allocationService.delete(allocation);
	}
	

	@RequestMapping(value = "/allocation", method = RequestMethod.GET)
	public Map<String, List<String>> getAllStudentsFromDisciplines() {
		return this.allocationService.getStudentsFromDiscipline();
	}
	
	@RequestMapping(value = "/allocation/student", method = RequestMethod.GET)
	public Map<String, List<String>> getAllDisciplinesFromStudents() {
		return this.allocationService.getDisciplinesFromStudents();
	}

	@RequestMapping(value = "/allocation/student/{enrollment}", method = RequestMethod.GET)
	public List<String> getDisciplinesFromStudent(@PathVariable String enrollment) {
		return this.allocationService.getDisciplinesFromStudent(enrollment);
	}
	
	@RequestMapping(value = "/allocation/discipline/{code}", method = RequestMethod.GET)
	public List<String> getStudentsFromDiscipline(@PathVariable String code) {
		return this.allocationService.getStudentsFromDiscipline(code);
	}
	
}
