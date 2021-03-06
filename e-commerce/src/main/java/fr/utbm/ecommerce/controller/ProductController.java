package fr.utbm.ecommerce.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.utbm.ecommerce.dto.Product;
import fr.utbm.ecommerce.service.ProductService;

/**
 * Product controller
 *
 */
@RestController
@RequestMapping("product")
public class ProductController {
	public static final Logger logger = LoggerFactory.getLogger(ProductController.class);

	@Autowired
	private ProductService productService;

	/**
	 * Creates a new product
	 * @param product the object product
	 * @return response http created
	 */
	@CrossOrigin
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public ResponseEntity<?> createProduct(@RequestBody Product product){
		boolean created = productService.addProduct(product);
		if(created == false){
			logger.info("item is not created");
			return new ResponseEntity<Object>(HttpStatus.CONFLICT);
		}
		logger.info("item created");
		return new ResponseEntity<Product>(product, HttpStatus.CREATED);
	}

	/**
	 * Updates the product
	 * @param product the object product
	 * @return response http ok
	 */
	@CrossOrigin
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public ResponseEntity<?> updateProduct(@RequestBody Product product){
		boolean updated = productService.updateProduct(product);
		if(updated == false){
			logger.info("item not found to update");
			return new ResponseEntity<Object>(HttpStatus.CONFLICT);
		}
		logger.info("item updated");
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}

	/**
	 * Deletes the product
	 * @param product the object product
	 * @return response http no content
	 */
	@CrossOrigin
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public ResponseEntity<?> deleteProduct(@RequestBody Product product){
		boolean deleted = productService.deleteProduct(product);
		if(deleted == false){
			logger.info("item not found to delete");
			return new ResponseEntity<Object>(HttpStatus.CONFLICT);

		}
		logger.info("item deleted");
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

	/**
	 * Gets all products
	 * @return a list of products
	 */
	@CrossOrigin
	@RequestMapping(value="/products", method=RequestMethod.GET)
	public ResponseEntity<List<Product>> getAllProducts(){
		return new  ResponseEntity<List<Product>>(productService.getAllProduct(), HttpStatus.OK);
	}

	/**
	 * Gets the product by id
	 * @param id the product id
	 * @return the product
	 */
	@CrossOrigin
	@RequestMapping(value="/fetch/{id}", method=RequestMethod.GET)
	public ResponseEntity<Product> getProductById(@PathVariable("id") String id){
		return new ResponseEntity<Product>(productService.getProductById(Integer.parseInt(id)), HttpStatus.OK);
	}
}
