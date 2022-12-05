package pt.com.example.demosb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@GetMapping(path = "/ola")
	public String ola() {
		return "Olá Spring Boot!";
	}

}
