package fr.utbm.ecommerce.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.utbm.ecommerce.dto.CartItem;
import fr.utbm.ecommerce.service.CartItemService;
/**
 * Cart item controller
 *
 */
@RestController
@RequestMapping("cartitem")
public class CartItemController {
	public static final Logger logger = LoggerFactory.getLogger(CartItemController.class);

	@Autowired
	private CartItemService CartItemService;

	/**
	 * Creates a cart item
	 * @param CartItem the object cartitem
	 * @return response http created
	 */
	@CrossOrigin
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public ResponseEntity<?> createCartItem(@RequestBody CartItem CartItem){
		//test if the item is already created or not
		boolean created = CartItemService.addCartItem(CartItem);
		if(created == false){
			logger.info("item is not created");
			return new ResponseEntity<Object>(HttpStatus.CONFLICT);
		}
		logger.info("item created");
		return new ResponseEntity<CartItem>(CartItem, HttpStatus.CREATED);
	}

	/**
	 * Updates a cart item 
	 * @param CartItem the object cartitem
	 * @return response http ok
	 */
	@CrossOrigin
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public ResponseEntity<?> updateCartItem(@RequestBody CartItem CartItem){
		//test if the item is updated
		boolean updated = CartItemService.updateCartItem(CartItem);
		if(updated == false){
			logger.info("item not found to update");
			return new ResponseEntity<Object>(HttpStatus.CONFLICT);
		}
		logger.info("item updated");
		return new ResponseEntity<CartItem>(CartItem, HttpStatus.OK);
	}

	/**
	 * Deletes a cart item
	 * @param CartItem the object cartitem
	 * @return response http no content
	 */
	@CrossOrigin
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public ResponseEntity<?> deleteCartItem(@RequestBody CartItem CartItem){
		//test if the item is deleted
		boolean deleted = CartItemService.deleteCartItem(CartItem);
		logger.info(CartItem.toString());
		if(deleted == false){
			logger.info("item not found to delete");
			return new ResponseEntity<Object>(HttpStatus.CONFLICT);

		}
		logger.info("item deleted");
		return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
	}

	/**
	 * Gets the list of cart item for one order
	 * @param orderid the order id
	 * @return the list of cart item
	 */
	@CrossOrigin
	@RequestMapping(value="/order/items/{orderid}", method=RequestMethod.GET)
	public ResponseEntity<List<CartItem>> getAllCartItems(@PathVariable("orderid") int orderid){
		return new  ResponseEntity<List<CartItem>>(CartItemService.getAllCartItem(orderid), HttpStatus.OK);
	}
}
