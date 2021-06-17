package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Pays;
import com.example.demo.service.PaysService;
    

@RestController
@CrossOrigin(origins = "http://localhost:4400")

@RequestMapping("/api/v1")
public class PaysController {
	 @Autowired
	    private PaysService service;
	  @PostMapping("/Pays")
	    public Pays addProduct(@RequestBody Pays Pays) {
	        return service.savePays(Pays);
	    }
	  @GetMapping("/Pays")
	    public List<Pays> findAllProducts() {
	        return service.getPayss();
	    }
	  @GetMapping("/Pays/{id}")
	    public Pays findProductById(@PathVariable int id) {
	        return service.getOrganismById(id);
	    }
	  @DeleteMapping("/Pays/{id}")
	    public String deleteProduct(@PathVariable long id) {
	        return service.deletePays(id);
	    }
	  @PutMapping("/updatePays")
	    public Pays updateProduct(@RequestBody Pays Pays) {
	        return service.updatePays(Pays);
	    }


}
