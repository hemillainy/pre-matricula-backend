package com.sistemaprematricula.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemaprematricula.models.user.User;
import com.sistemaprematricula.repositories.UsersRepository;

@Service
public class UsersService {

	@Autowired
	UsersRepository usersRepository;

	public Optional<User> getUser(String enrollment) {
		return this.usersRepository.findById(enrollment);
	}

	public List<User> getUsers() {
		return this.usersRepository.findAll();
	}

	public User save(User user) {
		this.usersRepository.save(user);
		return user;
	}

}
