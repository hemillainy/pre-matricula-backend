package com.sistemaprematricula.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaprematricula.services.CoordinatorService;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(value = "*")
public class CoordinatorController {
	
	@Autowired
	CoordinatorService coordinatorService;
	
	@RequestMapping(value = "/coordinator/{password}", method = RequestMethod.GET)
	public Boolean  validatePassword(@PathVariable String password) {
		return this.coordinatorService.validatePassword(password);
	}

}
