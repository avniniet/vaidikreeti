package com.vaidikreeti.mainapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vaidikreeti.mainapp.entity.Gotra;

@Repository
public interface GotraRepository extends JpaRepository<Gotra, Integer>{
 
	 Gotra findByGotraName(String name);
}
