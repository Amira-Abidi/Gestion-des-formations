package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Profil;
import com.example.demo.repository.ProfilRepository;

@Service
public class ProfilService {
	 @Autowired
	    private ProfilRepository repository;
	 
	 public Profil saveProfil(Profil Profil) {
	        return repository.save(Profil);
	    }
	 public List<Profil> getProfils() {
	        return repository.findAll();
	    }
	  public Profil getOrganismById(int id) {
	        return repository.findById((long) id).orElse(null);
	    }

	  public String deleteProfil(int id) {
	        repository.deleteById((long) id);
	        return "Profil removed !! " + id;
	    }
	  public Profil updateProfil(Profil Profil) {
	        Profil existingProfil = repository.findById((long) Profil.getId()).orElse(null);
	        existingProfil.setLibelle(Profil.getLibelle());
	        

	        return repository.save(existingProfil);
	    }
}
