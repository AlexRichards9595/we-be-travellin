package org.wecancodeit.columbus.webetravelin;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TravellinPopulator implements CommandLineRunner {

	@Resource
	private StateRepository stateRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		State ohio = new State("OH");
		State wyoming = new State("WY");
		State newJersey = new State("NJ");
		
		stateRepo.save(ohio);
		stateRepo.save(wyoming);
		stateRepo.save(newJersey);
	}
	
	
	
	

}
