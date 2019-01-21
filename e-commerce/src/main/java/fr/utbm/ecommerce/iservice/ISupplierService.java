package fr.utbm.ecommerce.iservice;

import java.util.List;

import fr.utbm.ecommerce.dto.Supplier;

/**
 * Interface Supplier Service
 *
 */
public interface ISupplierService  {
	
	//add a new supplier
	/**
	 * Creates a supplier
	 * @param supplier the supplier
	 * @return boolean
	 */
    boolean addSupplier(Supplier supplier);
    
    //update a supplier
    /**
     * Updates a supplier
     * @param supplier the supplier
     * @return boolean
     */
    boolean updateSupplier(Supplier supplier);
    
    //delete a supplier
    /**
     * Deletes a supplier
     * @param supplier the supplier
     * @return boolean
     */
    boolean deleteSupplier(Supplier supplier);
    
    //get all suppliers
    /**
     * Gets all suppliers
     * @return a list of supplier
     */
    List<Supplier> getAllSupplier();
}
