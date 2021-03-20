package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Participant_session;
import com.example.demo.repository.ParticipantSessionRepository;

@Service
public class Participant_sessionService {
	 @Autowired
	    private ParticipantSessionRepository repository;
	 
	 public Participant_session saveParticipant_session(Participant_session Participant_session) {
	        return repository.save(Participant_session);
	    }
	 public List<Participant_session> getParticipant_sessions() {
	        return repository.findAll();
	    }
	  public Participant_session getOrganismById(int id) {
	        return repository.findById((long) id).orElse(null);
	    }

	  public String deleteParticipant_session(int id) {
	        repository.deleteById((long) id);
	        return "Participant_session removed !! " + id;
	    }
	  public Participant_session updateParticipant_session(Participant_session Participant_session) {
	        Participant_session existingParticipant_session = repository.findById((long) Participant_session.getId()).orElse(null);
	        existingParticipant_session.setId_participant(Participant_session.getId_participant());
	        existingParticipant_session.setId_session(Participant_session.getId_session());
	        
	        return repository.save(existingParticipant_session);
	    }
}
