package com.sistemaprematricula.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaprematricula.models.user.Coordinator;
import com.sistemaprematricula.services.CoordinatorService;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(value = "*")
public class CoordinatorController {

	@Autowired
	CoordinatorService coordinatorService;

	@RequestMapping(value = "/coordinator", method = RequestMethod.POST)
	public Coordinator save(@RequestBody Coordinator coordinator) {
		return this.coordinatorService.save(coordinator);
	}

	@RequestMapping(value = "/coordinator/{email}", method = RequestMethod.GET)
	public Coordinator get(@PathVariable String email) {
		return this.coordinatorService.get(email);
	}

	@RequestMapping(value = "/coordinator/{email}", method = RequestMethod.PUT)
	public void update(@PathVariable String email, @RequestBody Coordinator coordinator) {
		this.coordinatorService.update(email, coordinator);
	}
	
}
