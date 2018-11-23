package fr.utbm.ecommerce.iservice;

import java.util.List;

import org.springframework.stereotype.Repository;
import fr.utbm.ecommerce.dto.CartItem;
import fr.utbm.ecommerce.dto.Category;

 
public interface ICategoryService {
	Category addCategory(Category category);

	Category updateCategory(Category category);

	void deleteCategory(Category category);

	List<Category> getAllCategory( );

	 
	  
}
