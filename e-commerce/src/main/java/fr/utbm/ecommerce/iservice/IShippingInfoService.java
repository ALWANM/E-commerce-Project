package fr.utbm.ecommerce.iservice;

import java.util.List;

import fr.utbm.ecommerce.dto.ShippingInfo;

/**
 * Interface ShippingInfo Service
 *
 */
public interface IShippingInfoService   {
	/**
	 * Creates a shipping info
	 * @param shippingInfo the shippinginfo
	 * @return shippinginfo
	 */
	ShippingInfo addShippingInfo(ShippingInfo shippingInfo);
	/**
	 * Updates a shippinginfo
	 * @param shippingInfo the shippinginfo
	 * @return shippinginfo
	 */
	ShippingInfo updateShippingInfo(ShippingInfo shippingInfo);
	/**
	 * Deletes shippinginfo
	 * @param shippingInfo the shippinginfo
	 */
	void deleteShippingInfo(ShippingInfo shippingInfo);
	/**
	 * Gets all shipping info
	 * @return a list of shippinginfo
	 */
	List<ShippingInfo> getAllShippingInfo();
}
