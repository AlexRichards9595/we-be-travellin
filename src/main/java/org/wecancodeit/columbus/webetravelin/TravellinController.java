package org.wecancodeit.columbus.webetravelin;

import javax.annotation.Resource;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/states")
public class TravellinController {

	@Resource
	StateRepository stateRepo;
	
	@RequestMapping(value = "/states")
	public String getAllStates(Model model) {
		model.addAttribute("states", stateRepo.findAll());
		return "states";
	}
	
	@RequestMapping(value = "/{id}")
	public State findOneState(@PathVariable Long id) {
		return stateRepo.findOne(id);
	}
	
	@RequestMapping("")
	public Iterable<State> findAllStates(@RequestParam(defaultValue = "") String search ) {
		if (search.isEmpty()) {
			return stateRepo.findAll();
		}
		return stateRepo.findAllByAbbIgnoreCaseLike(search);
	}
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	

	