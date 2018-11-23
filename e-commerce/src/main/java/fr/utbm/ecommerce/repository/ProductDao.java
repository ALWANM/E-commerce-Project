package fr.utbm.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.utbm.ecommerce.dto.Product;

@Repository
public interface ProductDao extends CrudRepository<Product, Integer> {
	@Query("SELECT p FROM Product p WHERE LOWER(p.Name) LIKE LOWER(:name) ")
	List<Product> getAllProductByName(@Param("name") String name);
	@Query("SELECT p from Product p where p.ProductID =:productid ")
	Product getProducts(@Param("productid") int productid);
}
