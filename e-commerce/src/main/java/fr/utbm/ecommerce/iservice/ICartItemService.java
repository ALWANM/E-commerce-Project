package fr.utbm.ecommerce.iservice;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.utbm.ecommerce.dto.CartItem;
import fr.utbm.ecommerce.dto.Order;
import fr.utbm.ecommerce.dto.Product;
 
public interface ICartItemService   {
	CartItem addCarteItem(CartItem cartItem);

	CartItem updateCarteItem(CartItem cartItem);

	boolean deleteCarteItem(CartItem cartItem);

	List<Product> getAllProducts(CartItem cartItem);

	List<Order> getAllOrders(CartItem cartItem);

}
