package fr.utbm.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.utbm.ecommerce.dto.CartItem;
import fr.utbm.ecommerce.repository.CartItemDao;
@Service("CarteItemService")
@Transactional
public class CarteItemService {
	@Autowired
	private CartItemDao cartItemDao;

	public CartItem addCarteItem(CartItem cartItem) {
		return cartItemDao.save(cartItem);
	}
	public CartItem updateCarteItem(CartItem cartItem) {
		return cartItemDao.save(cartItem);
	}
	public void deleteCarteItem(CartItem cartItem) {
		 cartItemDao.save(cartItem);
	}
}
