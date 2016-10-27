package ua.com.cookbook.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import ua.com.cookbook.entity.Role;
import ua.com.cookbook.entity.User;
import ua.com.cookbook.repository.UserRepository;
import ua.com.cookbook.service.UserService;

@Service("userDetailsService")
public class UserServiceImpl implements UserService {

	@Autowired

	private UserRepository userrepository;
	@Autowired
	private BCryptPasswordEncoder encoder;




	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userrepository.findAll();
	}

	public User findOne(int id) {
		// TODO Auto-generated method stub
		return userrepository.findOne(id);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		userrepository.delete(id);
	}



}
