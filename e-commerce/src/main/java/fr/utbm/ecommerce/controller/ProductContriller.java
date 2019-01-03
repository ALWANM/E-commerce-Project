package fr.utbm.ecommerce.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.utbm.ecommerce.dto.Product;
import fr.utbm.ecommerce.dto.User;
import fr.utbm.ecommerce.service.ProductService;
import fr.utbm.ecommerce.service.UserService;

@RestController
//@RequestMapping("account")
public class ProductContriller {
	@Autowired
	private ProductService productService;

	// request method to get all product
	//@CrossOrigin
	@RequestMapping(value="/products",method = RequestMethod.GET)
	public List<Product> getProduct() {
		 
		return productService.getAllProduct();
	}
}
