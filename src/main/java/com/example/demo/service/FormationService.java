package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Formation;
import com.example.demo.repository.FormationRepository;

@Service
public class FormationService {
	 @Autowired
	    private FormationRepository repository;
	 
	 public Formation saveFormation(Formation Formation) {
	        return repository.save(Formation);
	    }
	 public List<Formation> getFormations() {
	        return repository.findAll();
	    }
	  public Formation getOrganismById(int id) {
	        return repository.findById((long) id).orElse(null);
	    }

	  public String deleteFormation(int id) {
	        repository.deleteById((long) id);
	        return "Formation removed !! " + id;
	    }
	  public Formation updateFormation(Formation Formation) {
	        Formation existingFormation = repository.findById((long) Formation.getId()).orElse(null);
	        existingFormation.setTitre(Formation.getTitre());
	        existingFormation.setType_formation(Formation.getType_formation());
	        existingFormation.setAnnee(Formation.getAnnee());
	        existingFormation.setSessionFormation(Formation.getSessionFormation());
	        existingFormation.setDuree(Formation.getDuree());
	        existingFormation.setBudget(Formation.getBudget());
	        existingFormation.setNb_session(Formation.getNb_session());
	        existingFormation.setDomaines(Formation.getDomaines());

	        return repository.save(existingFormation);
	    }
}
