package com.example.demo.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
@Entity
@Data
@Table(name = "roles")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	@Column(name="roleid")
	private Long id;
	private String nom;
	
	
	
	@ManyToMany(mappedBy ="roles",fetch = FetchType.LAZY,
            cascade = CascadeType.ALL )        
   @JsonIgnore
    private Set<User> users = new HashSet<>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(String nom,Set<User> users) {
		super();
		this.nom = nom;
		this.users = users;
	}
	
}
