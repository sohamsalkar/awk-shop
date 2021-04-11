package com.sha.awkshop.service;

import java.util.List;

import com.sha.awkshop.model.User;

public interface IUserService {
	
	User saveUser(User user);

	User findByUsername(String username);

	List<User> findAllUsers();

	User save(User user);

	List<User> findAll();

}
