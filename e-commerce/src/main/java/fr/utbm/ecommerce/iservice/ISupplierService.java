package fr.utbm.ecommerce.iservice;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.utbm.ecommerce.dto.Supplier;
 
public interface ISupplierService  {
    boolean addSupplier(Supplier supplier);
    boolean updateSupplier(Supplier supplier);
    boolean deleteSupplier(Supplier supplier);
    List<Supplier> getAllSupplier();
    Supplier getSupplierById(int id);
}
