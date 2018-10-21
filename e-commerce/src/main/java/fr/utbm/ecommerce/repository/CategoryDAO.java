package fr.utbm.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import fr.utbm.ecommerce.model.Category;

public interface CategoryDAO extends CrudRepository<Category, Integer> {

}
