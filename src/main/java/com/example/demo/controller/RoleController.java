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

import com.example.demo.entities.Role;
import com.example.demo.service.RoleService;
    

@RestController
@RequestMapping("/api/v1")
public class RoleController {
	 @Autowired
	    private RoleService service;
	  @PostMapping("/addRole")
	    public Role addProduct(@RequestBody Role Role) {
	        return service.saveRole(Role);
	    }
	  @GetMapping("/Roles")
	    public List<Role> findAllProducts() {
	        return service.getRoles();
	    }
	  @GetMapping("/RoleById/{id}")
	    public Role findProductById(@PathVariable int id) {
	        return service.getOrganismById(id);
	    }
	  @DeleteMapping("/deleteRole/{id}")
	    public String deleteProduct(@PathVariable int id) {
	        return service.deleteRole(id);
	    }
	  @PutMapping("/updateRole")
	    public Role updateProduct(@RequestBody Role Role) {
	        return service.updateRole(Role);
	    }


}
