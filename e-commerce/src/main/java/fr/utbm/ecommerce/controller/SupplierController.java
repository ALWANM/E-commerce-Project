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

/**
 * Supplier controller
 *
 */
@RestController
@RequestMapping("supplier")
public class SupplierController {
	public static final Logger logger = LoggerFactory.getLogger(SupplierController.class);

	@Autowired
	private SupplierService SupplierService;
	
	/**
	 * Creates a new supplier
	 * @param Supplier the object supplier
	 * @return response http created
	 */
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

	/**
	 * Updates the supplier
	 * @param Supplier the object supplier
	 * @return response http ok
	 */
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

	/**
	 * Deletes the supplier
	 * @param Supplier the object supplier
	 * @return response http no content
	 */
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

	/**
	 * Gets all suppliers
	 * @return a list of supplier
	 */
	@CrossOrigin
	@RequestMapping(value="/suppliers", method=RequestMethod.GET)
	public ResponseEntity<List<Supplier>> getAllSuppliers(){
		return new  ResponseEntity<List<Supplier>>(SupplierService.getAllSupplier(), HttpStatus.OK);
	}
}
