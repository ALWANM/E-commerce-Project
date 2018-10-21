package fr.utbm.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import fr.utbm.ecommerce.model.Product;

public interface ProductDAO extends CrudRepository<Product, Integer> {

}
