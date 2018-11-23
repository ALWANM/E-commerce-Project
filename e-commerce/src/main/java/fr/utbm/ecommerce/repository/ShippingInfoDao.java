package fr.utbm.ecommerce.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.utbm.ecommerce.dto.ShippingInfo;
@Repository
public interface ShippingInfoDao extends CrudRepository<ShippingInfo,Integer> {
	}
