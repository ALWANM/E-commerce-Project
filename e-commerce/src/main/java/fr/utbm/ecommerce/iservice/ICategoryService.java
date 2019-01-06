package fr.utbm.ecommerce.iservice;

import java.util.List;

import fr.utbm.ecommerce.dto.Category;

 
public interface ICategoryService {
	boolean addCategory(Category category);

	boolean updateCategory(Category category);

	boolean deleteCategory(Category category);

	List<Category> getAllCategory( );

	Category getCategoryById(int id);
	  
}
