package fr.utbm.ecommerce.iservice;

import java.util.List;

import fr.utbm.ecommerce.dto.Category;

 /**
  * Interface Category Service
  *
  */
public interface ICategoryService {
	
	/**
	 * Creates a new category
	 * @param category the object category
	 * @return boolean
	 */
	boolean addCategory(Category category);

	/**
	 * Updates a category
	 * @param category the object category
	 * @return boolean
	 */
	boolean updateCategory(Category category);

	/**
	 * Deletes a category
	 * @param category the object category
	 * @return boolean
	 */
	boolean deleteCategory(Category category);

	/**
	 * Gets all categories
	 * @return a list of categories
	 */
	List<Category> getAllCategory( );

}
