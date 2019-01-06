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

	public boolean addSupplier(Supplier supplier) {
		boolean existed = existed(supplier.getSupplierID());
		if(existed == false){
			supplierDao.save(supplier);
		}
		return existed;
	}

	public boolean updateSupplier(Supplier supplier) {
		boolean existed = existed(supplier.getSupplierID());
		if(existed == true){
			 supplierDao.save(supplier);
		}
		return existed;
	}

	public boolean deleteSupplier(Supplier supplier) {
		boolean existed = existed(supplier.getSupplierID());
		if(existed == true){
			supplierDao.delete(supplier);
		}
		return existed;
		 
	}

	public List<Supplier> getAllSupplier() {
		return (List<Supplier>) supplierDao.findAll();
	}

	public boolean existed(int id){
		return supplierDao.existsById(id);
	}

	public Supplier getSupplierById(int id){
		return supplierDao.findById(id);
	}

}
