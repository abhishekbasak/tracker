package com.basak.tracker;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.basak.tracker.domain.User;
import com.basak.tracker.repository.UserRepository;
import com.basak.tracker.service.DataLoader;

@SpringBootApplication
public class TrackerApplication {

	private static final Logger logger = LoggerFactory.getLogger(TrackerApplication.class);
	
	@Autowired 
	UserRepository userRepository;
	
	@Autowired
	DataLoader dataLoader;
	
	public static void main(String[] args) {
		SpringApplication.run(TrackerApplication.class, args);
	}
	
	@PostConstruct
	void seePosts() {
		logger.info("Loaded ########## ");
		for (User user : userRepository.findAll()) {
			logger.info(user.toString());
		}
	}
}
