package pt.com.example.demosb.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pt.com.example.demosb.model.entities.Product;
import pt.com.example.demosb.model.repositories.ProductRepository;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	@Autowired // Com essa anotação eu deixo por parte do Spring a criação do repositório
	private ProductRepository productRepository;

//	@PostMapping
	@RequestMapping(method = { RequestMethod.POST, RequestMethod.PUT })
	public @ResponseBody Product salveProduct(@Validated Product product) {
		productRepository.save(product);
		return product;
	}

	@GetMapping
	public Iterable<Product> getProductor() {
		return productRepository.findAll();
	}
	
	@GetMapping(path = "/page/{numberPage}")
	public Iterable <Product> getProductbypage(@PathVariable int numberPage){
		return productRepository.findAll();
	}

	@GetMapping(path = "/{id}")
	public Optional<Product> getProductById(@PathVariable int id) {
		return productRepository.findById(id);
	}

//	@PutMapping
//	public Product changeProduct(@Validated Product product) {
//		productRepository.save(product);
//		return product;
//	}
	
	@DeleteMapping(path = "{/id}")
	public void deleteProduct(@PathVariable int id) {
		productRepository.deleteById(id);
	}
}
