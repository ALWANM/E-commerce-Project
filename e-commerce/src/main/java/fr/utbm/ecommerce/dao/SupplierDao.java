package fr.utbm.ecommerce.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.utbm.ecommerce.dto.Supplier;

public interface SupplierDao extends CrudRepository<Supplier,Integer>{
	Supplier addSupplier(Supplier supplier);
	Supplier updateSupplier(Supplier supplier);
	void deleteSupplier(Supplier supplier);
	List<Supplier> getAllSupplier();
}
