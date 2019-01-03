package fr.utbm.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.utbm.ecommerce.dto.Product;
import fr.utbm.ecommerce.repository.ProductDao;
import org.springframework.data.repository.query.Param;
@Service("ProductService")
@Transactional
public class ProductService {
	@Autowired
	private ProductDao productDao;

	public boolean addProduct(Product product) {
		boolean existed = productDao.existsById(product.getProductID());
		if(existed == false){
			productDao.save(product);
			existed = true;
		}else{
			existed = false;
		}
		return existed;
	}

	public boolean updateProduct(Product product) {
		boolean existed = productDao.existsById(product.getProductID());
		if(existed == true){
			productDao.save(product);
			existed = true;
		}else{
			existed = false;
		}
		return existed;
	}

	public boolean deleteProduct(Product product) {
		boolean existed = productDao.existsById(product.getProductID());
		if(existed == true){
			productDao.delete(product);
		}
        return existed;
	}

	public List<Product> getAllProduct() {
		return (List<Product>) productDao.findAll();
	}
    
    public Product getProductByName(String name){
        Product product = productDao.getProductByName("%"+name+"%");
        return product;
    }
    
    public Product getProductById(int id){
        return productDao.findById(id);
    }

 
	public List<Product> getAllProductByName(@Param("name") String name) {
		return (List<Product>) productDao.getProductByName("%" + name + "%");
	}
 
    public boolean existed(int productid){
    	return productDao.existsById(productid);
    }
//	public List<Product> getAllProductByName(@Param("name") String name) {
//		return productDao.getAllProductByName("%" + name + "%");
//	}
 
}
