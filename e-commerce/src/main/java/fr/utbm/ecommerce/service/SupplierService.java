package fr.utbm.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.utbm.ecommerce.dto.Supplier;
import fr.utbm.ecommerce.repository.SupplierDao;

@Service("SupplierService")
@Transactional
public class SupplierService {
	@Autowired
	private SupplierDao supplierDao;

	//add a new supplier
	public boolean addSupplier(Supplier supplier) {
		boolean existed = existed(supplier.getSupplierID());
		if(existed == false){
			supplierDao.save(supplier);
			existed = true;
		}
		return existed;
	}

	//update a supplier
	public boolean updateSupplier(Supplier supplier) {
		boolean existed = existed(supplier.getSupplierID());
		if(existed == true){
			 supplierDao.save(supplier);
		}
		return existed;
	}

	//delete a supplier
	public boolean deleteSupplier(Supplier supplier) {
		boolean existed = existed(supplier.getSupplierID());
		if(existed == true){
			supplierDao.delete(supplier);
		}
		return existed;
		 
	}

	//get all suppliers
	public List<Supplier> getAllSupplier() {
		return (List<Supplier>) supplierDao.findAll();
	}

	//to know if the supplier existed or not
	public boolean existed(int id){
		return supplierDao.existsById(id);
	}

}
