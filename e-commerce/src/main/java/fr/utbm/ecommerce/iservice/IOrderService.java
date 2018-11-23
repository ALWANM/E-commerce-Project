package fr.utbm.ecommerce.iservice;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.utbm.ecommerce.dto.Order;
 
public interface IOrderService   {
	 
	List<Order> getAllOrdersForUser(@Param("iduser") String string);
}
