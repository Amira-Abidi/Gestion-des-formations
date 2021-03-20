package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Formateur;
import com.example.demo.repository.FormateurRepository;

@Service
public class FormateurService {
	 @Autowired
	    private FormateurRepository repository;
	 
	 public Formateur saveFormateur(Formateur Formateur) {
	        return repository.save(Formateur);
	    }
	 public List<Formateur> getFormateurs() {
	        return repository.findAll();
	    }
	  public Formateur getOrganismById(int id) {
	        return repository.findById((long) id).orElse(null);
	    }

	  public String deleteFormateur(int id) {
	        repository.deleteById((long) id);
	        return "Formateur removed !! " + id;
	    }
	  public Formateur updateFormateur(Formateur Formateur) {
	        Formateur existingFormateur = repository.findById((long) Formateur.getId()).orElse(null);
	        existingFormateur.setNom(Formateur.getNom());
	        existingFormateur.setPrenom(Formateur.getPrenom());
	        existingFormateur.setType(Formateur.getType());
	        existingFormateur.setType(Formateur.getType());
	        existingFormateur.setOrganismes(Formateur.getOrganismes());

	        return repository.save(existingFormateur);
	    }
}
