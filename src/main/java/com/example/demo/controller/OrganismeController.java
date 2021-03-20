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

import com.example.demo.entities.Organisme;
import com.example.demo.service.OrganismeService;
    

@RestController
@RequestMapping("/api/v1")
public class OrganismeController {
	 @Autowired
	    private OrganismeService service;
	  @PostMapping("/addOrganisme")
	    public Organisme addProduct(@RequestBody Organisme Organisme) {
	        return service.saveOrganisme(Organisme);
	    }
	  @GetMapping("/organismes")
	    public List<Organisme> findAllProducts() {
	        return service.getOrganismes();
	    }
	  @GetMapping("/organismeById/{id}")
	    public Organisme findProductById(@PathVariable int id) {
	        return service.getOrganismById(id);
	    }
	  @DeleteMapping("/deleteOrganisme/{id}")
	    public String deleteProduct(@PathVariable int id) {
	        return service.deleteOrganisme(id);
	    }
	  @PutMapping("/updateOrganisme")
	    public Organisme updateProduct(@RequestBody Organisme Organisme) {
	        return service.updateOrganisme(Organisme);
	    }


}
