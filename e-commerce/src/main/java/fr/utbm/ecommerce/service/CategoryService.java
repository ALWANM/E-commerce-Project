package fr.utbm.ecommerce.service;

import java.util.List;

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

	public Category addCategory(Category category) {
		return categoryDao.save(category);
	}

	public Category updateCategory(Category category) {
		return categoryDao.save(category);
	}

	public void deleteCategory(Category category) {
		categoryDao.delete(category);
	}

	public List<Category> getAllCategory() {
		return (List<Category>) categoryDao.findAll();
	}
}
