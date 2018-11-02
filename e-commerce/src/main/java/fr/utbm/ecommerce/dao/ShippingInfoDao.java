package fr.utbm.ecommerce.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.utbm.ecommerce.dto.ShippingInfo;

public interface ShippingInfoDao extends CrudRepository<ShippingInfo,Integer> {
	ShippingInfo addShippingInfo(ShippingInfo shippingInfo);
	ShippingInfo updateShippingInfo(ShippingInfo shippingInfo);
	void deleteShippingInfo(ShippingInfo shippingInfo);
	List<ShippingInfo> getAllShippingInfo();
	}
