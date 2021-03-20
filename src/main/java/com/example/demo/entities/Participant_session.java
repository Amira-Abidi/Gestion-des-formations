package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Participant_session")
public class Participant_session  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
		@Column(name="id_participant")
		private int id;
		@Column(name="id_session")
		private String id_session;
		public Participant_session(int id_participant, String id_session) {
			super();
			this.id = id_participant;
			this.id_session = id_session;
		}
		public int getId_participant() {
			return id;
		}
		public void setId_participant(int id_participant) {
			this.id = id_participant;
		}
		public String getId_session() {
			return id_session;
		}
		public void setId_session(String id_session) {
			this.id_session = id_session;
		}
	
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		@Override
		public String toString() {
			return "Participant_session [id_participant=" + id + ", id_session=" + id_session + "]";
		}
}