package com.basak.tracker.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basak.tracker.domain.User;
import com.basak.tracker.repository.UserRepository;

@Service
public class DataLoader {

	@Autowired
	private UserRepository userRepository;
	
	@PostConstruct
	private void loadData(){
		User user = new User("Abhishek", "Basak");
		
		userRepository.save(user);
	}
}
