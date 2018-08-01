package com.sistemaprematricula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sistemaprematricula.models.user.Coordinator;

public interface CoordinatorRepository extends JpaRepository<Coordinator, String> {
	
	@Query("select password from Coordinator c")
	String getPassword();

	@Query("update Coordinator c set password = ?1 where email = ?2")
	void setPassword(String password, String email);

}
