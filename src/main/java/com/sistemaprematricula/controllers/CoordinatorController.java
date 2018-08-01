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
	
	@RequestMapping(value = "/coordinator/validateEmail/{email}", method = RequestMethod.GET)
	public Boolean validateEmail(@PathVariable String email) {
		return this.coordinatorService.validateEmail(email);
	}
	
	@RequestMapping(value = "/coordinator/validatePassword/{password}", method = RequestMethod.GET)
	public Boolean  validatePassword(@PathVariable String password) {
		return this.coordinatorService.validatePassword(password);
	}
	
	@RequestMapping(value = "/coordinator", method = RequestMethod.GET)
	public String getEmail() {
		return this.coordinatorService.getEmail();
	}
	
	@RequestMapping(value = "/coordinator/password", method = RequestMethod.PUT)
	public Boolean setPassword(String oldPassword, String newPassword) {
		if(this.validatePassword(oldPassword)) {
			this.coordinatorService.setPassword(newPassword);
		} 
		return this.validatePassword(oldPassword);
	}
}
