package com.sistemaprematricula.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaprematricula.models.Allocation;
import com.sistemaprematricula.services.AllocationService;

@RestController
@RequestMapping(value = "/allocation")
@CrossOrigin(value = "*")
public class AllocationController {

	@Autowired
	AllocationService allocationService;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public Allocation save(Allocation allocation) {
		this.allocationService.save(allocation);
		return allocation;
	}
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Allocation> getAll() {
		return this.allocationService.getAll();
	}
	
}
