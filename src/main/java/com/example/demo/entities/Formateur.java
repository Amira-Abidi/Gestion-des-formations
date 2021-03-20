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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="Formateur")
public class Formateur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	@Column(name="id_formateur")
	private Long id;
	@Column(name="nom")
	private String nom;
	@Column(name="prenom")
	private String prenom;
	@Column(name="type")
	private String type;

	@OneToMany(mappedBy="formateurs",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JsonIgnore
	Set<Session_de_formation> sessionFormations =  new HashSet<>();
	@ManyToOne
	@JoinColumn(name = "idOrganisme")
	private Organisme organismes;
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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Set<Session_de_formation> getSessionFormations() {
		return sessionFormations;
	}
	public void setSessionFormations(Set<Session_de_formation> sessionFormations) {
		this.sessionFormations = sessionFormations;
	}
	public Organisme getOrganismes() {
		return organismes;
	}
	public void setOrganismes(Organisme organismes) {
		this.organismes = organismes;
	}
	
}
