package fr.utbm.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.utbm.ecommerce.dto.CartItem;
import fr.utbm.ecommerce.repository.CartItemDao;
@Service("CartItemService")
@Transactional
public class CartItemService {
	@Autowired
	private CartItemDao cartItemDao;

	//add cart item
	public Boolean addCartItem(CartItem cartItem) {
		cartItemDao.save(cartItem);
		return true;
	}
	
	//update a cart item
	public Boolean updateCartItem(CartItem cartItem) {
		cartItemDao.save(cartItem);
		return true;
	}
	
	//delete a cart item
	public Boolean deleteCartItem(CartItem cartItem) {
		 cartItemDao.save(cartItem);
		 return true;
	}
	
	//get all cart item by order id
	public List<CartItem> getAllCartItem(int orderid){
		return cartItemDao.getAllItemByOrder(orderid);
	}
}
