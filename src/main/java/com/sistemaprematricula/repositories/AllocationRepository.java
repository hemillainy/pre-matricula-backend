package com.sistemaprematricula.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sistemaprematricula.models.Allocation;

@Repository
public interface AllocationRepository extends JpaRepository<Allocation, Long> {
	
	@Query("select disciplineCode from Allocation a where a.studentEnrollment = ?1")
	List<String> findDisciplinesFromStudent(String enrollment);
	
	@Query("select studentEnrollment from Allocation a")
	List<String> findStudents();
	
	@Query("select studentEnrollment from Allocation a where a.disciplineCode = ?1")
	List<String> findStudentsFromDisciplina(String code);
}
