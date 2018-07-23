package com.sistemaprematricula.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemaprematricula.models.user.User;

public interface UserRepository extends JpaRepository<User, String> {
	

}
