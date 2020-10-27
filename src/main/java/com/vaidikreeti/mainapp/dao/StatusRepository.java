package com.vaidikreeti.mainapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import  com.vaidikreeti.mainapp.entity.Status;


@Repository
public interface StatusRepository extends JpaRepository<Status, Integer> {

	
	
	
}