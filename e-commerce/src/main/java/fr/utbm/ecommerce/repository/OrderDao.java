package fr.utbm.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.utbm.ecommerce.dto.Order;
@Repository
public interface OrderDao extends CrudRepository<Order, Integer> {
	 
	//get all order for one user
	/**
	 * Gets all orders by user
	 * @param iduser the user id
	 * @return a list of orders
	 */
	@Query("SELECT o FROM Order o WHERE o.User.UserID = :iduser ")
	List<Order> getAllOrdersForUser(@Param("iduser") int iduser);
}
