package fr.utbm.ecommerce.iservice;

import java.util.List;

import fr.utbm.ecommerce.dto.Order;

/**
 * Interface order service
 *
 */
public interface IOrderService   {
	 
	/**
	 * Creates a order
	 * @param order the object order
	 * @return boolean
	 */
	boolean addOrder(Order order);
	
	/**
	 * Updates the order
	 * @param order the order
	 * @return boolean
	 */
	boolean updateOrder(Order order);
	
	/**
	 * Deletes a order
	 * @param order the order
	 * @return boolean
	 */
	boolean deleteOrder(Order order);
	
	/**
	 * Gets all order by user
	 * @param userid the user id
	 * @return a list of order
	 */
	public List<Order> getAllOrder(int userid);
}
