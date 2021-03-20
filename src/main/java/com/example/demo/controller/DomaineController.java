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

import com.example.demo.entities.Domaine;
import com.example.demo.service.DomaineService;
    

@RestController
@RequestMapping("/api/v1")
public class DomaineController {
	 @Autowired
	    private DomaineService service;
	  @PostMapping("/addDomaine")
	    public Domaine addProduct(@RequestBody Domaine Domaine) {
	        return service.saveDomaine(Domaine);
	    }
	  @GetMapping("/Domaines")
	    public List<Domaine> findAllProducts() {
	        return service.getDomaines();
	    }
	  @GetMapping("/DomaineById/{id}")
	    public Domaine findProductById(@PathVariable int id) {
	        return service.getOrganismById(id);
	    }
	  @DeleteMapping("/deleteDomaine/{id}")
	    public String deleteProduct(@PathVariable int id) {
	        return service.deleteDomaine(id);
	    }
	  @PutMapping("/updateDomaine")
	    public Domaine updateProduct(@RequestBody Domaine Domaine) {
	        return service.updateDomaine(Domaine);
	    }


}
