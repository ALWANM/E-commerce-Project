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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.utbm.ecommerce.dto.CartItem;
import fr.utbm.ecommerce.service.CartItemService;

@RestController
@RequestMapping("cartitem")
public class CartItemController {
	public static final Logger logger = LoggerFactory.getLogger(CartItemController.class);

	@Autowired
	private CartItemService CartItemService;

	//request method to create a new CartItem
	@CrossOrigin
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public ResponseEntity<?> createCartItem(@RequestBody CartItem CartItem){
		boolean created = CartItemService.addCartItem(CartItem);
		logger.info(CartItem.toString());
		if(created == false){
			logger.info("item is not created");
			return new ResponseEntity<Object>(HttpStatus.CONFLICT);
		}
		logger.info("item created");
		return new ResponseEntity<CartItem>(CartItem, HttpStatus.CREATED);
	}

	//request a method to update a CartItem
	@CrossOrigin
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public ResponseEntity<?> updateCartItem(@RequestBody CartItem CartItem){
		boolean updated = CartItemService.updateCartItem(CartItem);
		if(updated == false){
			logger.info("item not found to update");
			return new ResponseEntity<Object>(HttpStatus.CONFLICT);
		}
		logger.info("item updated");
		return new ResponseEntity<CartItem>(CartItem, HttpStatus.OK);
	}

	//request a method to delete a CartItem
	@CrossOrigin
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public ResponseEntity<?> deleteCartItem(@RequestBody CartItem CartItem){
		boolean deleted = CartItemService.deleteCartItem(CartItem);
		logger.info(CartItem.toString());
		if(deleted == false){
			logger.info("item not found to delete");
			return new ResponseEntity<Object>(HttpStatus.CONFLICT);

		}
		logger.info("item deleted");
		return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
	}

	//request a method to get all CartItem
	@CrossOrigin
	@RequestMapping(value="/order/items/{orderid}", method=RequestMethod.GET)
	public ResponseEntity<List<CartItem>> getAllCartItems(@PathVariable("orderid") int orderid){
		return new  ResponseEntity<List<CartItem>>(CartItemService.getAllCartItem(orderid), HttpStatus.OK);
	}
}
