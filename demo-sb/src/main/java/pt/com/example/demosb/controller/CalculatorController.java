package pt.com.example.demosb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
	
	@GetMapping(path = "/addition")
	public int addition(
			@RequestParam(name = "a") int a,
			@RequestParam (name = "b") int b) {
		
		return a + b;
	}
	
	@GetMapping(path = "/subtraction")
	public int subtraction(
			@RequestParam(name = "a") int a, 
			@RequestParam(name= "b") int b) {
		
		return a-b;
	}

}
