package com.wellington.javachallenge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.wellington.javachallenge.model.Person;

@Controller
public class ChallengeController {
	

	
	@GetMapping("/home")
	public String getHome(Model model) {
		
		Person person = new Person("Wellington", "Brazilian", "To live Abroad!");
		
		model.addAttribute("name", person.getName());
		model.addAttribute("nationality", person.getNationality());
		model.addAttribute("biggest_dream", person.getBiggestDream());
		
		return "home";
	}

}


