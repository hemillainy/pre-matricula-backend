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
import com.sistemaprematricula.services.UserService;


@RestController
@RequestMapping(value = "/users")
@CrossOrigin(value = "*")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<User> getAll() {
		return this.userService.getUsers();
	}
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public User save(@RequestBody User user) {
		return this.userService.save(user);
	}
	
	@RequestMapping(value = "/{enrollment}", method = RequestMethod.GET)
	public User getUser(@PathVariable String enrollment) {
		return this.userService.getUser(enrollment).get();
	}

}
