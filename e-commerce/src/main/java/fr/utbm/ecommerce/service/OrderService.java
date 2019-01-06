package fr.utbm.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

	//add order
	public Boolean addOrder(Order order) {
		orderDao.save(order);
		return true;
	}

	//update a order
	public Boolean updateOrder(Order order) {
		orderDao.save(order);
		return true;
	}

	//delete order
	public Boolean deleteOrder(Order order) {
		orderDao.delete(order);
		return true;
	}
	
	//get all order by user id
	public List<Order> getAllOrder(int userid){
		return orderDao.getAllOrdersForUser(userid);
	}

}
