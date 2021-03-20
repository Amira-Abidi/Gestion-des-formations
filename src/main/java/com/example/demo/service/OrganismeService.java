package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Organisme;
import com.example.demo.repository.OrganismeRepository;

@Service
public class OrganismeService {
	 @Autowired
	    private OrganismeRepository repository;
	 
	 public Organisme saveOrganisme(Organisme organisme) {
	        return repository.save(organisme);
	    }
	 public List<Organisme> getOrganismes() {
	        return repository.findAll();
	    }
	  public Organisme getOrganismById(int id) {
	        return repository.findById((long) id).orElse(null);
	    }

	  public String deleteOrganisme(int id) {
	        repository.deleteById((long) id);
	        return "Organisme removed !! " + id;
	    }
	  public Organisme updateOrganisme(Organisme Organisme) {
	        Organisme existingOrganisme = repository.findById((long) Organisme.getId()).orElse(null);
	        existingOrganisme.setLibelle(Organisme.getLibelle());
	       
	        return repository.save(existingOrganisme);
	    }
}
