package org.wecancodeit.columbus.webetravelin;

import javax.annotation.Resource;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/states")
public class TravellinController {

	@Resource
	StateRepository stateRepo;
	
	@RequestMapping(value = "/states")
	public String getAllBooks(Model model) {
		model.addAttribute("states", stateRepo.findAll());
		return "states";
	}
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	

	