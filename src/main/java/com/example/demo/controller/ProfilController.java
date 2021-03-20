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

import com.example.demo.entities.Profil;
import com.example.demo.service.ProfilService;
    

@RestController
@RequestMapping("/api/v1")
public class ProfilController {
	 @Autowired
	    private ProfilService service;
	  @PostMapping("/addProfil")
	    public Profil addProduct(@RequestBody Profil Profil) {
	        return service.saveProfil(Profil);
	    }
	  @GetMapping("/Profils")
	    public List<Profil> findAllProducts() {
	        return service.getProfils();
	    }
	  @GetMapping("/ProfilById/{id}")
	    public Profil findProductById(@PathVariable int id) {
	        return service.getOrganismById(id);
	    }
	  @DeleteMapping("/deleteProfil/{id}")
	    public String deleteProduct(@PathVariable int id) {
	        return service.deleteProfil(id);
	    }
	  @PutMapping("/updateProfil")
	    public Profil updateProduct(@RequestBody Profil Profil) {
	        return service.updateProfil(Profil);
	    }


}
