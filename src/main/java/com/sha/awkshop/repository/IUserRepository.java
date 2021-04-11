package com.sha.awkshop.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sha.awkshop.model.User;

public interface IUserRepository extends JpaRepository< User , Long> {
	
	
	Optional<User> findByUsername(String username);
	
	

}
