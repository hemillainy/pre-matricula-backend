package com.sistemaprematricula.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaprematricula.models.user.Student;
import com.sistemaprematricula.models.user.User;
import com.sistemaprematricula.services.StudentService;


@RestController
@RequestMapping(value = "/users")
@CrossOrigin(value = "*")
public class UserController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Student> getAll() {
		return this.studentService.getUsers();
	}
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public Student save(@RequestBody Student user) {
		return this.studentService.save(user);
	}
	
	@RequestMapping(value = "/{enrollment}", method = RequestMethod.GET)
	public User getUser(@PathVariable String enrollment) {
		return this.studentService.getUser(enrollment).get();
	}

}
