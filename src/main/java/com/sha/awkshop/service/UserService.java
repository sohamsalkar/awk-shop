package com.sha.awkshop.service;
import com.sha.awkshop.model.*;
import com.sha.awkshop.repository.*;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{
	
	@Autowired
	private IUserService userRepository;
	
	@Override
	public User saveUser(User user)
	{
		
		user.setCreateTime(LocalDateTime.now());
		return userRepository.save(user);		
	}
	
	@Override
	public User findByUsername(String username)
	{
		return userRepository.findByUsername(username);
	}

	@Override
	public List<User> findAllUsers() {
		
		return userRepository.findAll();
	}

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	

}
