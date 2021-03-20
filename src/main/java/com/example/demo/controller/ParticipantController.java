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

import com.example.demo.entities.Participant;
import com.example.demo.service.ParticipantService;
    

@RestController
@RequestMapping("/api/v1")
public class ParticipantController {
	 @Autowired
	    private ParticipantService service;
	  @PostMapping("/addParticipant")
	    public Participant addProduct(@RequestBody Participant Participant) {
	        return service.saveParticipant(Participant);
	    }
	  @GetMapping("/Participants")
	    public List<Participant> findAllProducts() {
	        return service.getParticipants();
	    }
	  @GetMapping("/ParticipantById/{id}")
	    public Participant findProductById(@PathVariable int id) {
	        return service.getOrganismById(id);
	    }
	  @DeleteMapping("/deleteParticipant/{id}")
	    public String deleteProduct(@PathVariable int id) {
	        return service.deleteParticipant(id);
	    }
	  @PutMapping("/updateParticipant")
	    public Participant updateProduct(@RequestBody Participant Participant) {
	        return service.updateParticipant(Participant);
	    }


}
