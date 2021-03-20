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

import com.example.demo.entities.Session_de_formation;
import com.example.demo.service.SessionFormationService;
    

@RestController
@RequestMapping("/api/v1")
public class SessionFormationController {
	 @Autowired
	    private SessionFormationService service;
	  @PostMapping("/addSessionFormation")
	    public Session_de_formation addProduct(@RequestBody Session_de_formation SessionFormation) {
	        return service.saveSessionFormation(SessionFormation);
	    }
	  @GetMapping("/SessionFormations")
	    public List<Session_de_formation> findAllProducts() {
	        return service.getSessionFormations();
	    }
	  @GetMapping("/SessionFormationById/{id}")
	    public Session_de_formation findProductById(@PathVariable int id) {
	        return service.getOrganismById(id);
	    }
	  @DeleteMapping("/deleteSessionFormation/{id}")
	    public String deleteProduct(@PathVariable int id) {
	        return service.deleteSessionFormation(id);
	    }
	  @PutMapping("/updateSessionFormation")
	    public Session_de_formation updateProduct(@RequestBody Session_de_formation SessionFormation) {
	        return service.updateSessionFormation(SessionFormation);
	    }


}
