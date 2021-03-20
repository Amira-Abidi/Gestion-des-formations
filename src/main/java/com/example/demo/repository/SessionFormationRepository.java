package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Session_de_formation;



public interface SessionFormationRepository extends JpaRepository <Session_de_formation,Long> {

}
