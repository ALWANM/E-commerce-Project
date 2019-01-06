package fr.utbm.ecommerce.iservice;

import java.util.List;

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
