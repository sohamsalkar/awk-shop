package com.sha.awkshop.controller;

import com.sha.awkshop.model.User;
import com.sha.awkshop.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController

@RequestMapping("api/user") // pre-path
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@PostMapping
	public ResponseEntity<?> saveUser(@RequestBody User user)
	{
		if(userService.findByUsername(user.getUsername())!= null)
		{
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<?> getAllUsers()
	{
		return ResponseEntity.ok(userService.findAllUsers());
	}
	
}
