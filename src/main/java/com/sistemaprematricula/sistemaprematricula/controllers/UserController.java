package com.sistemaprematricula.sistemaprematricula.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaprematricula.sistemaprematricula.models.user.User;
import com.sistemaprematricula.sistemaprematricula.services.UsersService;


@RestController
@RequestMapping(value = "/api")
@CrossOrigin(value = "*")
public class UserController {
	
	@Autowired
	UsersService usersService;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<User> getAll() {
		return this.usersService.getUsers();
	}
}
