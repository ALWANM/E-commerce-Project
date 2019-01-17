package fr.utbm.ecommerce.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.utbm.ecommerce.dto.Supplier;
import fr.utbm.ecommerce.service.SupplierService;

@RestController
@RequestMapping("supplier")
public class SupplierController {
	public static final Logger logger = LoggerFactory.getLogger(SupplierController.class);

	@Autowired
	private SupplierService SupplierService;
	
	//request method to create a new Supplier
	@CrossOrigin
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public ResponseEntity<?> createSupplier(@RequestBody Supplier Supplier){
		boolean created = SupplierService.addSupplier(Supplier);
		
		if(created == false){
			logger.info("item is not created");
			return new ResponseEntity<Object>(HttpStatus.CONFLICT);
		}
		logger.info("item created");
		return new ResponseEntity<Supplier>(Supplier, HttpStatus.CREATED);
	}

	//request a method to update a Supplier
	@CrossOrigin
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public ResponseEntity<?> updateSupplier(@RequestBody Supplier Supplier){
		boolean updated = SupplierService.updateSupplier(Supplier);
		if(updated == false){
			logger.info("item not found to update");
			return new ResponseEntity<Object>(HttpStatus.CONFLICT);
		}
		logger.info("item updated");
		return new ResponseEntity<Supplier>(Supplier, HttpStatus.OK);
	}

	//request a method to delete a Supplier by id
	@CrossOrigin
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public ResponseEntity<?> deleteSupplier(@RequestBody Supplier Supplier){
		boolean deleted = SupplierService.deleteSupplier(Supplier);
		if(deleted == false){
			logger.info("item not found to delete");
			return new ResponseEntity<Object>(HttpStatus.CONFLICT);

		}
		logger.info("item deleted");
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

	//request a method to get all Suppliers
	@CrossOrigin
	@RequestMapping(value="/suppliers", method=RequestMethod.GET)
	public ResponseEntity<List<Supplier>> getAllSuppliers(){
		return new  ResponseEntity<List<Supplier>>(SupplierService.getAllSupplier(), HttpStatus.OK);
	}
}
