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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="Organisme")
public class Organisme  {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
		@Column(name="id")
		private int id;
		@Column(name="libelle")
		private String libelle;
		@OneToMany(mappedBy="organismes",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
		@JsonIgnore
		Set<Session_de_formation> SessionFormations =  new HashSet<>();
		
		@OneToMany(mappedBy="organismes",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
		@JsonIgnore
		Set<Formateur> formateurs =  new HashSet<>();
         public Organisme() {
	    	
	    }
	

	

		public Organisme( String libelle) {
			super();
			
			this.libelle = libelle;
		}

		public int getId() {
			return id;
		}




		public void setId(int id) {
			this.id = id;
		}




		public String getLibelle() {
			return libelle;
		}




		public void setLibelle(String libelle) {
			this.libelle = libelle;
		}




		@Override
		public String toString() {
			return "Organisme [id=" + id + ", libelle=" + libelle + "]";
		}
		
	}

