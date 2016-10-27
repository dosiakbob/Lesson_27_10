package ua.com.cookbook.service;

import java.util.List;

import ua.com.cookbook.entity.User;

public interface UserService {

	
	void save(User user);
	List<User> findAll();
	User findOne(int id);
	void delete (int id);
}
