package fr.utbm.ecommerce.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.utbm.ecommerce.dto.Category;

public interface CategoryDao extends CrudRepository<Category, Integer>{
	boolean addCategory(Category category);
	boolean updateCategory(Category category);
	boolean deleteCategory(Category category);
	List<Category> getAllCategory();
}
