package com.springboot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.springboot.exception.UserException;
import com.springboot.model.User;
import com.springboot.repository.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	private UserRepository uRepository;

	public UserController(UserRepository uRepository) {
		this.uRepository = uRepository;
	}

	@GetMapping("/users")
	  List<User> all() {
	    return uRepository.findAll();
	  }
	
	 @PostMapping("/users")
	  User newEmployee(@RequestBody User newUser) {
	    return uRepository.save(newUser);
	  }
	 @PutMapping("/users/{id}")
	  User updateUser( @PathVariable("id") int id , @RequestBody User use) {
		 User user = uRepository.findById(id).get();
		 user.setId(use.getId());
		 user.setName(use.getName());
		 user.setSalary(use.getSalary());
		 
		 return uRepository.save(user);
		
		
		 
	 }
}
