package com.sistemaprematricula.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemaprematricula.models.user.Student;
import com.sistemaprematricula.models.user.User;
import com.sistemaprematricula.repositories.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;

	public Optional<Student> getUser(String enrollment) {
		return this.studentRepository.findById(enrollment);
	}

	public List<Student> getUsers() {
		return this.studentRepository.findAll();
	}

	public Student save(Student user) {
		this.studentRepository.save(user);
		return user;
	}

}
