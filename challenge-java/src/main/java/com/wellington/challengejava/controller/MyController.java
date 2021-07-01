package com.wellington.challengejava.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wellington.challengejava.model.Person;

@RestController
public class MyController {
	

	
	Person person = new Person("Wellington", "Brazilian", "to be come an engeniering");
	
	@RequestMapping("/")
	public	ResponseEntity<Person> getData(){
		
		return ResponseEntity.ok(person);
		
	}
	

	

}
