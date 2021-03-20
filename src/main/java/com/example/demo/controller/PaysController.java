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

import com.example.demo.entities.Pays;
import com.example.demo.service.PaysService;
    

@RestController
@RequestMapping("/api/v1")
public class PaysController {
	 @Autowired
	    private PaysService service;
	  @PostMapping("/addPays")
	    public Pays addProduct(@RequestBody Pays Pays) {
	        return service.savePays(Pays);
	    }
	  @GetMapping("/Payss")
	    public List<Pays> findAllProducts() {
	        return service.getPayss();
	    }
	  @GetMapping("/PaysById/{id}")
	    public Pays findProductById(@PathVariable int id) {
	        return service.getOrganismById(id);
	    }
	  @DeleteMapping("/deletePays/{id}")
	    public String deleteProduct(@PathVariable int id) {
	        return service.deletePays(id);
	    }
	  @PutMapping("/updatePays")
	    public Pays updateProduct(@RequestBody Pays Pays) {
	        return service.updatePays(Pays);
	    }


}
