package fr.utbm.ecommerce.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.utbm.ecommerce.dao.ShippingInfoDao;
import fr.utbm.ecommerce.dto.ShippingInfo;

@Service("ShippingInfoService")
@Transactional
public class ShippingInfoService {
	private ShippingInfoDao shippingInfoDao;

	public ShippingInfo addShippingInfo(ShippingInfo shippingInfo) {
		return shippingInfoDao.save(shippingInfo);

	}

	public ShippingInfo updateShippingInfo(ShippingInfo shippingInfo) {
		return shippingInfoDao.save(shippingInfo);

	}

	public void deleteShippingInfo(ShippingInfo shippingInfo) {
		shippingInfoDao.delete(shippingInfo);

	}

	public List<ShippingInfo> getAllShippingInfo() {
		return (List<ShippingInfo>) shippingInfoDao.findAll();
	}

}
