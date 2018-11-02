package fr.utbm.ecommerce.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.utbm.ecommerce.dao.CategoryDao;
import fr.utbm.ecommerce.dto.Category;

@Service("CategoryService")
@Transactional
public class CategoryService {
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
