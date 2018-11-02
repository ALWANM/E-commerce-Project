package fr.utbm.ecommerce.service;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.utbm.ecommerce.dao.ProductDao;
import fr.utbm.ecommerce.dto.Product;

@Service("ProductService")
@Transactional
public class ProductService {
	private ProductDao productDao;

	public Product addProduct(Product product) {
		return productDao.save(product);
	}

	public Product updateProduct(Product product) {
		return productDao.save(product);
	}

	public void deleteProduct(Product product) {
		productDao.delete(product);
	}

	public List<Product> getAllProduct() {
		return (List<Product>) productDao.findAll();
	}

	public List<Product> getAllProductByName(@Param("name") String name) {
		return productDao.getAllProductByName("%" + name + "%");
	}
}
