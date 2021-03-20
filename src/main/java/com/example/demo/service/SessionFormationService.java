package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Session_de_formation;
import com.example.demo.repository.SessionFormationRepository;

@Service
public class SessionFormationService {
	 @Autowired
	    private SessionFormationRepository repository;
	 
	 public Session_de_formation saveSessionFormation(Session_de_formation SessionFormation) {
	        return repository.save(SessionFormation);
	    }
	 public List<Session_de_formation> getSessionFormations() {
	        return repository.findAll();
	    }
	  public Session_de_formation getOrganismById(int id) {
	        return repository.findById((long) id).orElse(null);
	    }

	  public String deleteSessionFormation(int id) {
	        repository.deleteById((long) id);
	        return "SessionFormation removed !! " + id;
	    }
	  public Session_de_formation updateSessionFormation(Session_de_formation SessionFormation) {
		  Session_de_formation existingSessionFormation = repository.findById((long) SessionFormation.getId()).orElse(null);
	        existingSessionFormation.setIdFormation(SessionFormation.getIdFormation());
	        existingSessionFormation.setDate_debut(SessionFormation.getDate_debut());
	        existingSessionFormation.setDate_fin(SessionFormation.getDate_fin());
	        existingSessionFormation.setNb_participant(SessionFormation.getNb_participant());
	        existingSessionFormation.setLieu(SessionFormation.getLieu());
	        existingSessionFormation.setParticipants(SessionFormation.getParticipants());
	        existingSessionFormation.setOrganismes(SessionFormation.getOrganismes());
	        existingSessionFormation.setFormateurs(SessionFormation.getFormateurs());
	        existingSessionFormation.setFormations(SessionFormation.getFormations());
	       

	        return repository.save(existingSessionFormation);
	    }
}

