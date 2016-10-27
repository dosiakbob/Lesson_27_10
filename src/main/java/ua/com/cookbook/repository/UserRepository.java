package ua.com.cookbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.cookbook.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
User findByUsername(String username);
	
}
