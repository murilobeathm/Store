package pt.com.example.demosb.model.repositories;

import org.springframework.data.repository.CrudRepository;

import pt.com.example.demosb.model.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>  {

 	
}
