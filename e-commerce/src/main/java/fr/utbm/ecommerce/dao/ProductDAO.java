package fr.utbm.ecommerce.dao;

import java.util.List;

import fr.utbm.ecommerce.dto.Product;

public interface ProductDAO {
	public Product getById(int id);
	public Product getByName(String name);
	public List<Product> getAll();
	public Boolean add(Product Product);
	public Boolean update(Product Product);
	public Boolean deleteAll();
	public Boolean DeleteById(int id);
}
