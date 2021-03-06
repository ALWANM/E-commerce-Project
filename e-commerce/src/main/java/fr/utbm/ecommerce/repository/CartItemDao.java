package fr.utbm.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.utbm.ecommerce.dto.CartItem;

@Repository("CartItemDao")
@Transactional
public interface CartItemDao extends CrudRepository<CartItem, Integer> {

	/**
	 * Gets a list of cart item of one order
	 * @param orderid the order id
	 * @return the list of cartitem
	 */
	@Query("SELECT ci from CartItem ci where ci.Order.OrderID =:orderid ")
	List<CartItem> getAllItemByOrder(@Param("orderid") int orderid);
}
