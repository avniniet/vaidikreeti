package com.vaidikreeti.mainapp;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vaidikreeti.mainapp.dao.GotraRepository;
import com.vaidikreeti.mainapp.entity.Gotra;


@Component
public class TestRunner implements CommandLineRunner {
	
	private static final Logger logger = LoggerFactory.getLogger(TestRunner.class);

    @Autowired
    private GotraRepository gotraRepository;

	@Override
	public void run(String... args) throws Exception {
			
		logger.info("Saving Gotra");
		
		gotraRepository.save(new Gotra("Gotra1",LocalDateTime.now(),LocalDateTime.now()));
		gotraRepository.save(new Gotra("Gotra2",LocalDateTime.now(),LocalDateTime.now()));
		gotraRepository.save(new Gotra("Gotra3",LocalDateTime.now(),LocalDateTime.now()));
		gotraRepository.save(new Gotra("Gotra4",LocalDateTime.now(),LocalDateTime.now()));
		gotraRepository.save(new Gotra("Gotra5",LocalDateTime.now(),LocalDateTime.now()));
		
		logger.info("retrivng gotras");
		
		List<Gotra> gotras= gotraRepository.findAll();
	    gotras.forEach(gotra -> logger.info("{}", gotra));
		
		
		
	}

}
