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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="Participant")
public class Participant  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	@Column(name="participant_id")
	private Long id;
	@Column(name="nom")
	private String nom;
	@Column(name="prenom")
	private String prenom;
	@Column(name="type")
	private String type;
	@Column(name="idOrganisme")
    private int idOrganisme;

	@Column(name="email")
    private String email;
	@Column(name="tel")
    private int tel;
	@ManyToOne
	@JoinColumn(name = "idPays")
	private Pays pays;
	@ManyToOne
	@JoinColumn(name = "idProfil")
	private Profil profils;
    

	@ManyToMany(mappedBy ="participants",fetch = FetchType.LAZY,
            cascade = CascadeType.ALL )     
    private Set<Session_de_formation> SessionFormations = new HashSet<>();


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


	public int getIdOrganisme() {
		return idOrganisme;
	}


	public void setIdOrganisme(int idOrganisme) {
		this.idOrganisme = idOrganisme;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getTel() {
		return tel;
	}


	public void setTel(int tel) {
		this.tel = tel;
	}


	public Pays getPays() {
		return pays;
	}


	public void setPays(Pays pays) {
		this.pays = pays;
	}


	public Profil getProfils() {
		return profils;
	}


	public void setProfils(Profil profils) {
		this.profils = profils;
	}


	public Set<Session_de_formation> getSessionFormations() {
		return SessionFormations;
	}


	public void setSessionFormations(Set<Session_de_formation> sessionFormations) {
		SessionFormations = sessionFormations;
	}
    
    
	
    
}