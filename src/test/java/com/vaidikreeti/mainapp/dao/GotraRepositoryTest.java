package com.vaidikreeti.mainapp.dao;

import java.time.LocalDateTime;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.vaidikreeti.mainapp.entity.Gotra;

@RunWith(SpringRunner.class)
public class GotraRepositoryTest {
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	private GotraRepository gotraRepository;
	
	@Test
	public void testFindbyName() {
		
		entityManager.persist(new Gotra("Gotra1",LocalDateTime.now(),LocalDateTime.now()));
		entityManager.persist(new Gotra("Gotra2",LocalDateTime.now(),LocalDateTime.now()));
		entityManager.persist(new Gotra("Gotra3",LocalDateTime.now(),LocalDateTime.now()));
		entityManager.persist(new Gotra("Gotra4",LocalDateTime.now(),LocalDateTime.now()));
		entityManager.persist(new Gotra("Gotra5",LocalDateTime.now(),LocalDateTime.now()));
		
		Gotra gotra=gotraRepository.findByGotraName("Gotra1");
		
		
			
	}

}
