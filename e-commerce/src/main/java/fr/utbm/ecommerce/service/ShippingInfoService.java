package fr.utbm.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.utbm.ecommerce.dto.ShippingInfo;
import fr.utbm.ecommerce.iservice.IShippingInfoService;
import fr.utbm.ecommerce.repository.ShippingInfoDao;

@Service("ShippingInfoService")
@Transactional
public class ShippingInfoService implements IShippingInfoService{
	@Autowired
	private ShippingInfoDao shippingInfoDao;

	//add a new shipping info
	public ShippingInfo addShippingInfo(ShippingInfo shippingInfo) {
		return shippingInfoDao.save(shippingInfo);

	}

	//update a update shipping info
	public ShippingInfo updateShippingInfo(ShippingInfo shippingInfo) {
		return shippingInfoDao.save(shippingInfo);

	}

	//delete a shipping info
	public void deleteShippingInfo(ShippingInfo shippingInfo) {
		shippingInfoDao.delete(shippingInfo);

	}

	//get all shipping info
	public List<ShippingInfo> getAllShippingInfo() {
		return (List<ShippingInfo>) shippingInfoDao.findAll();
	}

}
