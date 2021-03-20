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

import com.example.demo.entities.Participant_session;
import com.example.demo.service.Participant_sessionService;
    

@RestController
@RequestMapping("/api/v1")
public class Participant_sessionController {
	 @Autowired
	    private Participant_sessionService service;
	  @PostMapping("/addParticipant_session")
	    public Participant_session addProduct(@RequestBody Participant_session Participant_session) {
	        return service.saveParticipant_session(Participant_session);
	    }
	  @GetMapping("/Participant_sessions")
	    public List<Participant_session> findAllProducts() {
	        return service.getParticipant_sessions();
	    }
	  @GetMapping("/Participant_sessionById/{id}")
	    public Participant_session findProductById(@PathVariable int id) {
	        return service.getOrganismById(id);
	    }
	  @DeleteMapping("/deleteParticipant_session/{id}")
	    public String deleteProduct(@PathVariable int id) {
	        return service.deleteParticipant_session(id);
	    }
	  @PutMapping("/updateParticipant_session")
	    public Participant_session updateProduct(@RequestBody Participant_session Participant_session) {
	        return service.updateParticipant_session(Participant_session);
	    }


}
