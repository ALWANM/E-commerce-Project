package fr.utbm.ecommerce.dao;

import java.util.List;

import fr.utbm.ecommerce.dto.Category;

public interface CategoryDAO {
	public Category getById(int id);
	public Boolean deleteById(int id);
	public Boolean deleteByName(String name);
	public Boolean update(Category category);
	public List<Category> getAll();
}
