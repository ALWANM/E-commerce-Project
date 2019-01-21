package fr.utbm.ecommerce.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.utbm.ecommerce.dto.Product;

@Repository
public interface ProductDao extends CrudRepository<Product, Integer> {
	//get product by name
	/**
	 * Gets product by name
	 * @param name the product name
	 * @return product
	 */
	@Query("SELECT p FROM Product p WHERE LOWER(p.Name) LIKE LOWER(:name) ")
	Product getProductByName(@Param("name") String name);
	
	//get product by id
	/**
	 * Gets product by id
	 * @param productid the product id
	 * @return product
	 */
	@Query("SELECT P FROM Product P WHERE P.ProductID = :productid")
	Product getProductById(@Param("productid") int productid);
}
