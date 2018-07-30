package com.sistemaprematricula.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sistemaprematricula.models.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
	
	@Query("select u from User u where u.email = ?1")
	public User findUserFromEmail(String email);
}
