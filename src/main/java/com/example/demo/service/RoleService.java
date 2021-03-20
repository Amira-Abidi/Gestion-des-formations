package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Role;
import com.example.demo.repository.RoleRepository;

@Service
public class RoleService {
	 @Autowired
	    private RoleRepository repository;
	 
	 public Role saveRole(Role Role) {
	        return repository.save(Role);
	    }
	 public List<Role> getRoles() {
	        return repository.findAll();
	    }
	  public Role getOrganismById(int id) {
	        return repository.findById((long) id).orElse(null);
	    }

	  public String deleteRole(int id) {
	        repository.deleteById((long) id);
	        return "Role removed !! " + id;
	    }
	  public Role updateRole(Role Role) {
	        Role existingRole = repository.findById((long) Role.getId()).orElse(null);
	        existingRole.setNom(Role.getNom());
	        

	        return repository.save(existingRole);
	    }
}
