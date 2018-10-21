package fr.utbm.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import fr.utbm.ecommerce.model.CartLine;

public interface CartLineDAO extends CrudRepository<CartLine, Integer> {

}
