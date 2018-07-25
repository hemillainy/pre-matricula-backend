package com.sistemaprematricula.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemaprematricula.models.user.User;
import com.sistemaprematricula.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public Optional<User> getUser(String enrollment) {
		return this.userRepository.findById(enrollment);
	}

	public List<User> getUsers() {
		try {
		return this.userRepository.findAll(); 
		} catch(Exception ex) {
			List<User> a = new ArrayList<>();
			return a;
		}
	}

	public User save(User user) {
		this.userRepository.save(user);
		return user;
	}

}
