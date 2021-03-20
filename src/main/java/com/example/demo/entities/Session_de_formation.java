package com.example.demo.entities;
import java.sql.Date;
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
@Table(name="Session_de_formation")
public class Session_de_formation{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	@Column(name="id")
	private Long id;

	@Column(name="idFormation")
	private int idFormation;

	@Column(name="Date_debut")
	private Date Date_debut;
	@Column(name="Date_fin")
	private Date Date_fin;
	@Column(name="Nb_participant")
	private int Nb_participant;
	@Column(name="lieu")
	private String lieu;
	@ManyToMany(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL)
	private Set<Participant> participants = new HashSet<>();
	@ManyToOne
	@JoinColumn(name = "idOrganisme")
	private Organisme organismes;
	@ManyToOne
	@JoinColumn(name = "idFormateur")
	private Formateur formateurs;
	@ManyToMany(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL)
               
            
    private Set<Formation> formations = new HashSet<>();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getIdFormation() {
		return idFormation;
	}
	public void setIdFormation(int idFormation) {
		this.idFormation = idFormation;
	}
	public Date getDate_debut() {
		return Date_debut;
	}
	public void setDate_debut(Date date_debut) {
		Date_debut = date_debut;
	}
	public Date getDate_fin() {
		return Date_fin;
	}
	public void setDate_fin(Date date_fin) {
		Date_fin = date_fin;
	}
	public int getNb_participant() {
		return Nb_participant;
	}
	public void setNb_participant(int nb_participant) {
		Nb_participant = nb_participant;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public Set<Participant> getParticipants() {
		return participants;
	}
	public void setParticipants(Set<Participant> participants) {
		this.participants = participants;
	}
	public Organisme getOrganismes() {
		return organismes;
	}
	public void setOrganismes(Organisme organismes) {
		this.organismes = organismes;
	}
	public Formateur getFormateurs() {
		return formateurs;
	}
	public void setFormateurs(Formateur formateurs) {
		this.formateurs = formateurs;
	}
	public Set<Formation> getFormations() {
		return formations;
	}
	public void setFormations(Set<Formation> formations) {
		this.formations = formations;
	}
	
	
	
	
}
