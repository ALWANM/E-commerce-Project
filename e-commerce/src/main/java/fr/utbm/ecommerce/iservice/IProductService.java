package fr.utbm.ecommerce.iservice;

import java.util.List;

import fr.utbm.ecommerce.dto.Product;
 
/**
 * Interface Product Service
 *
 */
public interface IProductService  {
	/**
	 * Creates a new product
	 * @param product the product
	 * @return boolean
	 */
    boolean addProduct(Product product);
    
    /**
     * Updates a product
     * @param product the product
     * @return boolean
     */
    boolean updateProduct(Product product);
    
    //delete a product
    /**
     * Deletes a product
     * @param product the product
     * @return boolean
     */
    boolean deleteProduct(Product product);
    
    /**
     * Gets product by name
     * @param name the product name
     * @return product
     */
    Product getProductByName(String name);
    
    /**
     * Gets all products
     * @return a list of product
     */
	List<Product> getAllProduct();
	
	/**
	 * Gets product by id
	 * @param productid the product id
	 * @return product
	 */
    Product getProductById(int productid);
    
    /**
     * Knows if the product existed or not
     * @param productid the product id
     * @return boolean
     */
    boolean existed(int productid);
}
