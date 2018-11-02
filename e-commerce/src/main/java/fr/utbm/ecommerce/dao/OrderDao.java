package fr.utbm.ecommerce.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import fr.utbm.ecommerce.dto.Order;

public interface OrderDao extends CrudRepository<Order, Integer> {
	Order addOrder(Order order);

	Order updateOrder(Order order);

	void deleteOrder(Order order);

	@Query("SELECT o FROM order o WHERE o.IDUSER LIKE :iduser ")
	List<Order> getAllOrdersForUser(@Param("iduser") String string);
}
