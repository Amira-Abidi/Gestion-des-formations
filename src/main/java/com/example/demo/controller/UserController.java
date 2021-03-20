package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.service.UserService;
    

@RestController
@RequestMapping("/api/v1")
public class UserController {
	 @Autowired
	    private UserService service;
	  @PostMapping("/addUser")
	    public User addProduct(@RequestBody User User) {
	        return service.saveUser(User);
	    }
	  @GetMapping("/Users")
	    public List<User> findAllProducts() {
	        return service.getUsers();
	    }
	  @GetMapping("/UserById/{id}")
	    public User findProductById(@PathVariable int id) {
	        return service.getOrganismById(id);
	    }
	  @DeleteMapping("/deleteUser/{id}")
	    public String deleteProduct(@PathVariable int id) {
	        return service.deleteUser(id);
	    }
	  @PutMapping("/updateUser")
	    public User updateProduct(@RequestBody User User) {
	        return service.updateUser(User);
	    }


}
