package com.sistemaprematricula.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemaprematricula.models.user.Student;

public interface StudentRepository extends JpaRepository<Student, String> {
	

}
