package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	 @Autowired
	    private UserRepository repository;
	 
	 public User saveUser(User User) {
	        return repository.save(User);
	    }
	 public List<User> getUsers() {
	        return repository.findAll();
	    }
	  public User getOrganismById(int id) {
	        return repository.findById((long) id).orElse(null);
	    }

	  public String deleteUser(int id) {
	        repository.deleteById((long) id);
	        return "User removed !! " + id;
	    }
	  public User updateUser(User User) {
	        User existingUser = repository.findById((long) User.getId()).orElse(null);
	        existingUser.setLogin(User.getLogin());
	        existingUser.setPassword(User.getPassword());
	        existingUser.setIdRole(User.getIdRole());

	        return repository.save(existingUser);
	    }
}
