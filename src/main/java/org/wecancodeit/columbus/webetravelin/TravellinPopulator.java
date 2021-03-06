package org.wecancodeit.columbus.webetravelin;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TravellinPopulator implements CommandLineRunner {

	@Resource
	private StateRepository stateRepo;
	
	
	@Resource
	private CityRepository cityRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Fish walleye = new Fish("Walleye", "Sander vitreus", "imageURl");
		Fish rainbowTrout = new Fish("Rainbow Trout", "copernicus", "imageURl");
		Fish clams = new Fish("Clams", "bivalve molluscs", "imageURl");
		
//		Repo.save(walleye);
//		fishRepo.save(rainbowTrout);
//		fishRepo.save(clams);
		
		
		
		State ohio = new State("OH", "Ohio", "Birthplace of Aviation", walleye);
		State wyoming = new State("WY", "Wyoming", "We are... the wild west", rainbowTrout);
		State newJersey = new State("NJ", "New Jersey", "Heeeey, I'm walkin here! ;<", clams);
		
		stateRepo.save(ohio);
		stateRepo.save(wyoming);
		stateRepo.save(newJersey);
		
		City columbus = new City("Columbus", "A lot", ohio);
		City cleveland = new City("Cleveland", "Less than columbus", ohio);
		City jackson = new City("Jackson", "A lot of rich people", wyoming);
		City trenton = new City("Trenton", "dont know", newJersey);
		
		cityRepo.save(columbus);
		cityRepo.save(cleveland);
		cityRepo.save(jackson);
		cityRepo.save(trenton);
	}
	
	
	
	

}
