package com.sistemaprematricula.sistemaprematricula.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sistemaprematricula.sistemaprematricula.models.user.User;
import com.sistemaprematricula.sistemaprematricula.repositories.UsersRepository;


@Service
public class UsersService {
	
	@Autowired
	UsersRepository usersRepository;
	
	@RequestMapping(value = "/{enrollment}", method = RequestMethod.GET)
	public User getUser(String enrollment) {
		return this.usersRepository.getOne(enrollment);
	}
	
	public List<User> getUsers() {
		return this.usersRepository.findAll();
	}
	
	public User addUser(User user) {
		this.usersRepository.save(user);
		return user;
	}

}
