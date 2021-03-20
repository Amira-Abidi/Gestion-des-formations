package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Participant;
import com.example.demo.repository.ParticipantRepository;

@Service
public class ParticipantService {
	 @Autowired
	    private ParticipantRepository repository;
	 
	 public Participant saveParticipant(Participant Participant) {
	        return repository.save(Participant);
	    }
	 public List<Participant> getParticipants() {
	        return repository.findAll();
	    }
	  public Participant getOrganismById(int id) {
	        return repository.findById((long) id).orElse(null);
	    }

	  public String deleteParticipant(int id) {
	        repository.deleteById((long) id);
	        return "Participant removed !! " + id;
	    }
	  public Participant updateParticipant(Participant Participant) {
	        Participant existingParticipant = repository.findById((long) Participant.getId()).orElse(null);
	        existingParticipant.setNom(Participant.getNom());
	        existingParticipant.setPrenom(Participant.getPrenom());
	        existingParticipant.setType(Participant.getType());
	        existingParticipant.setIdOrganisme(Participant.getIdOrganisme());
	        existingParticipant.setEmail(Participant.getEmail());
	        existingParticipant.setTel(Participant.getTel());
	        existingParticipant.setPays(Participant.getPays());
	        existingParticipant.setProfils(Participant.getProfils());
	        existingParticipant.setSessionFormations(Participant.getSessionFormations());

	        
	       
	        return repository.save(existingParticipant);
	    }
}
