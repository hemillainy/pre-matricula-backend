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
import com.sistemaprematricula.services.StudentService;


@RestController
@RequestMapping(value = "/api")
@CrossOrigin(value = "*")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public List<Student> getAll() {
		return this.studentService.getStudents();
	}
	
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public Student save(@RequestBody Student user) {
		return this.studentService.save(user);
	}
	
	@RequestMapping(value = "/user/searchByEnrollment/{enrollment}", method = RequestMethod.GET)
	public Student getStudent(@PathVariable String enrollment) {
		return this.studentService.getStudent(enrollment).get();
	}
	
	@RequestMapping(value = "/user/searchByEmail/{email}", method = RequestMethod.GET)
	public Student getStudentByEmail(@PathVariable String email) {
		return this.studentService.getStudentByEmail(email);
	}

	@RequestMapping(value = "/user/{email}", method = RequestMethod.GET)
	public Boolean isRegistered(@PathVariable String email) {
		return this.studentService.isRegistered(email);
	}
}
