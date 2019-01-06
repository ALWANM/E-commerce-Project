package fr.utbm.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.utbm.ecommerce.dto.Supplier;
@Repository
public interface SupplierDao extends CrudRepository<Supplier,Integer>{
	 
}
