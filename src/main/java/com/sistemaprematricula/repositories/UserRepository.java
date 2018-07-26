package com.sistemaprematricula.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistemaprematricula.models.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	

}
