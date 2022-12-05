package pt.com.example.demosb.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/method")
public class MethodHttpController {
	
	@GetMapping
	public String get() {
		return "Requisition GET";
	}
	
	@PostMapping
	public String post() {
		return "Requisition POST";
	}
	
	@PutMapping
	public String put() {
		return "Requisition PUT";
	}
	
	@PatchMapping
	public String patch() {
		return "Requisition PATCH";
	}
	
	@DeleteMapping
	public String delete() {
		return "Requisition DELETE";
	}

}
