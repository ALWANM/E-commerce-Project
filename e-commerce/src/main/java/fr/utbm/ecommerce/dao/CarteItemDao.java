package fr.utbm.ecommerce.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.utbm.ecommerce.dto.CarteItem;
import fr.utbm.ecommerce.dto.Order;
import fr.utbm.ecommerce.dto.Product;

public interface CarteItemDao extends CrudRepository<CarteItem, Integer> {
	CarteItem addCarteItem(CarteItem carteItem);

	CarteItem updateCarteItem(CarteItem carteItem);

	boolean deleteCarteItem(CarteItem carteItem);

	List<Product> getAllProducts(CarteItem carteItem);

	List<Order> getAllOrders(CarteItem carteItem);

}
