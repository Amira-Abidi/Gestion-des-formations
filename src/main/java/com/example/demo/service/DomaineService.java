package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Domaine;
import com.example.demo.repository.DomaineRepository;

@Service
public class DomaineService {
	 @Autowired
	    private DomaineRepository repository;
	 
	 public Domaine saveDomaine(Domaine Domaine) {
	        return repository.save(Domaine);
	    }
	 public List<Domaine> getDomaines() {
	        return repository.findAll();
	    }
	  public Domaine getOrganismById(int id) {
	        return repository.findById((long) id).orElse(null);
	    }

	  public String deleteDomaine(int id) {
	        repository.deleteById((long) id);
	        return "Domaine removed !! " + id;
	    }
	  public Domaine updateDomaine(Domaine Domaine) {
	        Domaine existingDomaine = repository.findById((long) Domaine.getId()).orElse(null);
	        existingDomaine.setLibelle(Domaine.getLibelle());
	       
	        return repository.save(existingDomaine);
	    }
}
