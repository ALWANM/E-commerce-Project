package fr.utbm.ecommerce.iservice;

import fr.utbm.ecommerce.dto.CartItem;

/**
 * Interface Cart Item Service
 *
 */
public interface ICartItemService   {
	
	/**
	 * Create cart item
	 * @param cartItem the object cartitem
	 * @return boolean
	 */
	 boolean addCartItem(CartItem cartItem);

	/**
	 * Updates the cart item
	 * @param cartItem the object cartitem
	 * @return boolean
	 */
	boolean updateCartItem(CartItem cartItem);

	/**
	 * Deletes the cart item
	 * @param cartItem the object cartitem
	 * @return boolean
	 */
	boolean deleteCartItem(CartItem cartItem);

}
