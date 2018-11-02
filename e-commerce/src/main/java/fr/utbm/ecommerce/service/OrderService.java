package fr.utbm.ecommerce.service;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.utbm.ecommerce.dao.OrderDao;
import fr.utbm.ecommerce.dto.Order;
@Service("OrderService")
@Transactional
public class OrderService {
	private OrderDao orderDao;

	public Order addOrder(Order order) {
		return orderDao.save(order);
	}

	public Order updateOrder(Order order) {
		return orderDao.save(order);
	}

	public void deleteOrder(Order order) {
		orderDao.delete(order);
	}

	public List<Order> getAllOrdersForUser(@Param("iduser") int iduser) {
		return orderDao.getAllOrdersForUser("%" + iduser + "%");
	}

}
