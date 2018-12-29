package fr.utbm.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.utbm.ecommerce.dto.Category;
import fr.utbm.ecommerce.iservice.ICategoryService;
import fr.utbm.ecommerce.repository.CategoryDao;

@Service("CategoryService")
@Transactional
public class CategoryService implements ICategoryService {
	@Autowired

	private CategoryDao categoryDao;

	public boolean addCategory(Category category) {
		boolean existed = existed(category.getIDCATEGORY());
		if(existed == false){
			categoryDao.save(category);
			existed = true;
		}
		return existed;
		
	}

	public boolean updateCategory(Category category) {
		boolean existed = existed(category.getIDCATEGORY());
		if(existed == true){
			categoryDao.save(category);
		}
		return existed;
	}

	public boolean deleteCategory(Category category) {
		boolean existed= existed(category.getIDCATEGORY());
		if(existed == true){
			categoryDao.delete(category);
		}
		return existed;
	}

	public List<Category> getAllCategory() {
		return (List<Category>) categoryDao.findAll();
	}

	public boolean existed(int id){
		return categoryDao.existsById(id);
	}

	public Category getCategoryById(int id){
			return categoryDao.findById(id);
	}
}
