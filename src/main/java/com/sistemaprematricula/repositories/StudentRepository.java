package com.sistemaprematricula.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sistemaprematricula.models.user.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
}
