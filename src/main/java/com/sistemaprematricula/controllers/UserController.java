package com.sistemaprematricula.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaprematricula.models.user.User;
import com.sistemaprematricula.services.UsersService;


@RestController
@RequestMapping(value = "/users")
@CrossOrigin(value = "*")
public class UserController {
	
	@Autowired
	UsersService usersService;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<User> getAll() {
		return this.usersService.getUsers();
	}
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public User save(@RequestBody User user) {
		return this.usersService.save(user);
	}
	
	@RequestMapping(value = "/{enrollment}", method = RequestMethod.GET)
	public User getUser(@PathVariable String enrollment) {
		return this.usersService.getUser(enrollment).get();
	}

}
