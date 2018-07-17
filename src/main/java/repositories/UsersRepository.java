package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import models.user.User;

public interface UsersRepository extends JpaRepository<User, String> {

}
