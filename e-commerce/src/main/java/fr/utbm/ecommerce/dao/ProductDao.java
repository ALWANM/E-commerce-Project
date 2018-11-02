package fr.utbm.ecommerce.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import fr.utbm.ecommerce.dto.Product;

public interface ProductDao extends CrudRepository<Product,Integer> {
	Product addProduct(Product product);
	Product updateProduct(Product product);
	void deleteProduct(Product product);
	List<Product> getAllProduct();
	@Query("SELECT p FROM product p WHERE LOWER(p.NAME) LIKE LOWER(:name) ")
	List<Product> getAllProductByName(@Param("name") String name);
}
