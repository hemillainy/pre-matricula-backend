package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import models.user.User;
import repositories.UsersRepository;

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

}
