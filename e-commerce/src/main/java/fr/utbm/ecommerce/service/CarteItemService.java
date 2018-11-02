package fr.utbm.ecommerce.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.utbm.ecommerce.dao.CarteItemDao;
import fr.utbm.ecommerce.dto.CarteItem;
@Service("CarteItemService")
@Transactional
public class CarteItemService {
	private CarteItemDao carteItemDao;

	public CarteItem addCarteItem(CarteItem carteItem) {
		return carteItemDao.save(carteItem);
	}
	public CarteItem updateCarteItem(CarteItem carteItem) {
		return carteItemDao.save(carteItem);
	}
	public void deleteCarteItem(CarteItem carteItem) {
		 carteItemDao.save(carteItem);
	}
}
