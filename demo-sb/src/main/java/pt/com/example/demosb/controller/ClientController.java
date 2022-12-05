package pt.com.example.demosb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pt.com.example.demosb.model.entities.Client;

@RestController 
public class ClientController {
	
	@GetMapping(path = "/client")
	public Client getClient() {
		return new Client (25, "Maicon", "123.456.789");
	}
	
	@GetMapping(path = "/client2")
	public Client getClientbyId(@RequestParam(name = "id", defaultValue = "1") int id) {
		return new Client (id, "Mary", "985.654.541");
	}

	
}
