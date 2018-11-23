package fr.utbm.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.utbm.ecommerce.dto.Order;
import fr.utbm.ecommerce.iservice.IOrderService;
import fr.utbm.ecommerce.repository.OrderDao;
@Service("OrderService")
@Transactional
public class OrderService implements IOrderService {
	@Autowired
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

	@Override
	public List<Order> getAllOrdersForUser(String string) {
		// TODO Auto-generated method stub
		return null;
	}

//	public List<Order> getAllOrdersForUser(@Param("iduser") int iduser) {
//		return orderDao.getAllOrdersForUser("%" + iduser + "%");
//	}

}
