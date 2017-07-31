package com.basak.tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrackerApplication {

//	private static final Logger logger = LoggerFactory.getLogger(TrackerApplication.class);
	
//	@Autowired 
//	UserRepository userRepository;
//	
//	@Autowired
//	DataLoader dataLoader;
	
	public static void main(String[] args) {
		SpringApplication.run(TrackerApplication.class, args);
	}
	
	//@PostConstruct
//	void seePosts() {
//		logger.info("Loaded ########## ");
//		for (User user : userRepository.findAll()) {
//			logger.info(user.toString());
//		}
//	}
}
