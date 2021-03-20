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

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
@Entity
@Table(name="Formation")
@Data
public class Formation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	@Column(name="formation_id")
	private Long id;
	@Column(name="titre")
	private String titre;
	@Column(name="type_formation")
	private String type_formation;
	@Column(name="annee")
	private int annee;
	@Column(name="nb_session")
	private int nb_session;
	@Column(name="duree")
	private int duree;
	@Column(name="budget")
	private int budget;
	@ManyToMany(mappedBy ="formations",fetch = FetchType.LAZY,
            cascade = CascadeType.ALL )        
   @JsonIgnore
    private Set<Session_de_formation> sessionFormation = new HashSet<>();
    
    @ManyToOne
	@JoinColumn(name = "id_domaine")
	private Domaine domaines;
    
	
    

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getType_formation() {
		return type_formation;
	}

	public void setType_formation(String type_formation) {
		this.type_formation = type_formation;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public int getNb_session() {
		return nb_session;
	}

	public void setNb_session(int nb_session) {
		this.nb_session = nb_session;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public Set<Session_de_formation> getSessionFormation() {
		return sessionFormation;
	}

	public void setSessionFormation(Set<Session_de_formation> sessionFormation) {
		this.sessionFormation = sessionFormation;
	}

	public Domaine getDomaines() {
		return domaines;
	}

	public void setDomaines(Domaine domaines) {
		this.domaines = domaines;
	}

	
}
