package fr.utbm.ecommerce.iservice;

import java.util.List;

import fr.utbm.ecommerce.dto.Product;
 
public interface IProductService  {
	//add new product
    boolean addProduct(Product product);
    
    //update a product
    boolean updateProduct(Product product);
    
    //delete a product
    boolean deleteProduct(Product product);
    
    //get product by name
    Product getProductByName(String name);
    
    //get all products
	List<Product> getAllProduct();
	
	//get product by id
    Product getProductById(int productid);
    
    //to know if the product existed or not
    boolean existed(int productid);
}
