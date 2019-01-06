package fr.utbm.ecommerce.iservice;

import java.util.List;

import fr.utbm.ecommerce.dto.CartItem;
import fr.utbm.ecommerce.dto.Order;
import fr.utbm.ecommerce.dto.Product;
 
public interface ICartItemService   {
	
	//add cart item
	CartItem addCarteItem(CartItem cartItem);

	//update the cart item
	CartItem updateCarteItem(CartItem cartItem);

	//delete the cart item
	boolean deleteCarteItem(CartItem cartItem);

	//get product of the cart item
	List<Product> getAllProducts(CartItem cartItem);

	//get the list of order of the cart item
	List<Order> getAllOrders(CartItem cartItem);

}
