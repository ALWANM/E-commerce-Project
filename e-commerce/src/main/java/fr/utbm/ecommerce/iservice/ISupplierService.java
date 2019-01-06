package fr.utbm.ecommerce.iservice;

import java.util.List;

import fr.utbm.ecommerce.dto.Supplier;
 
public interface ISupplierService  {
	
	//add a new supplier
    boolean addSupplier(Supplier supplier);
    
    //update a supplier
    boolean updateSupplier(Supplier supplier);
    
    //delete a supplier
    boolean deleteSupplier(Supplier supplier);
    
    //get all suppliers
    List<Supplier> getAllSupplier();
    
    //get supplier by id
    Supplier getSupplierById(int id);
}
