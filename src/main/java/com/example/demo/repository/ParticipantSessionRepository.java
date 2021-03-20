package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Participant_session;

public interface ParticipantSessionRepository extends JpaRepository <Participant_session,Long> {

}
