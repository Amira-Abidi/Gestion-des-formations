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

import com.example.demo.entities.Formation;
import com.example.demo.service.FormationService;
    

@RestController
@RequestMapping("/api/v1")
public class FormationController {
	 @Autowired
	    private FormationService service;
	  @PostMapping("/addFormation")
	    public Formation addProduct(@RequestBody Formation Formation) {
	        return service.saveFormation(Formation);
	    }
	  @GetMapping("/Formations")
	    public List<Formation> findAllProducts() {
	        return service.getFormations();
	    }
	  @GetMapping("/FormationById/{id}")
	    public Formation findProductById(@PathVariable int id) {
	        return service.getOrganismById(id);
	    }
	  @DeleteMapping("/deleteFormation/{id}")
	    public String deleteProduct(@PathVariable int id) {
	        return service.deleteFormation(id);
	    }
	  @PutMapping("/updateFormation")
	    public Formation updateProduct(@RequestBody Formation Formation) {
	        return service.updateFormation(Formation);
	    }


}
