package fr.utbm.ecommerce.iservice;

import java.util.List;

import fr.utbm.ecommerce.dto.Category;

 
public interface ICategoryService {
	//add a new category
	boolean addCategory(Category category);

	//update a category
	boolean updateCategory(Category category);

	//delete a category
	boolean deleteCategory(Category category);

	//get all categories
	List<Category> getAllCategory( );

	//get category by id
	Category getCategoryById(int id);
	  
}
