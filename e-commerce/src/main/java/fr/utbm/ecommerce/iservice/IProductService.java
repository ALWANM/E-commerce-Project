package fr.utbm.ecommerce.iservice;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.utbm.ecommerce.dto.Product;
 
public interface IProductService  {
    boolean addProduct(Product product);
    boolean updateProduct(Product product);
    boolean deleteProduct(Product product);
    Product getProductByName(String name);
	List<Product> getAllProduct();
    Product getProductById(int productid);
    boolean existed(int productid);
}
