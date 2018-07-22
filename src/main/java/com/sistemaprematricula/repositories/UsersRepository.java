package com.sistemaprematricula.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemaprematricula.models.user.User;

public interface UsersRepository extends JpaRepository<User, String> {
	

}
