package fr.utbm.ecommerce.controller;

import java.security.Principal;
import java.util.Date;
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

import fr.utbm.ecommerce.dto.User;
import fr.utbm.ecommerce.service.UserService;
import fr.utbm.ecommerce.util.CustomErrorType;

/**
 * User controller
 *
 */
@RestController
@RequestMapping("account")
public class UserController {
	public static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	/**
	 * Creates a new user
	 * @param newUser the object user
	 * @return response http created
	 */
	@CrossOrigin
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseEntity<?> createUser(@RequestBody User newUser) {
		try {
			if (userService.getUserByMail(newUser.getMail()) != null) {
				logger.error("username Already exist " + newUser.getMail());
				return new ResponseEntity<Object>(
						new CustomErrorType("user with username " + newUser.getMail() + " already exist "),
						HttpStatus.CONFLICT);
			}
			if(newUser.getRole()==null || newUser.getRole()=="")newUser.setRole("USER");

			return new ResponseEntity<User>(userService.addUser(newUser), HttpStatus.CREATED);
		} catch (Exception e) {
			System.err.println("Error : "+e.getMessage());
			return null;
		}
	}

	// this is the login api/service
	@CrossOrigin
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public Principal user(Principal principal) {
		logger.info("user logged " + principal);
		return principal;
	}
	
	/**
	 * Gets a list of users with the role worker and admin
	 * @param principal
	 * @return the list of users
	 */
	@CrossOrigin
	@RequestMapping(value="/users",method = RequestMethod.GET)
	public List<User> getUsers(Principal principal) {
		 
		return userService.getUsers("ADMIN","WORKER");
	}
	
	/**
	 * Updates the user
	 * @param updateUser the object user
	 * @return 1
	 */
	@CrossOrigin
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public int updateUser(@RequestBody User updateUser) {
		String firstname=updateUser.getFirstName();
		String lastname=updateUser.getLastName();
		String password=updateUser.getPassword();
		Date dateofbith=updateUser.getDateOfBirth();
		String gender=updateUser.getGender();
		String address=updateUser.getAddress();
		String country=updateUser.getCountry();
		String town=updateUser.getTown();
		String postalcode=updateUser.getPostalCode();
		String phonenumber=updateUser.getPhoneNumber();
		String mail=updateUser.getMail();
		String role=updateUser.getRole();
		return userService.updateUser(firstname, lastname,password, dateofbith, gender, address, country, town, postalcode, phonenumber,role, mail);
		
	}
	
	/**
	 * Deletes a user
	 * @param deleteuser the object user
	 */
	@CrossOrigin
	@RequestMapping(value="/delete",method = RequestMethod.POST)
	public void deleteUser(@RequestBody User deleteuser) {
		userService.deleteUser(deleteuser.getMail());
		System.out.println(deleteuser);
	}
	
	/**
	 * Logouts the user
	 * @return message logout
	 */
	@CrossOrigin
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String logoutUser() {
		return "logout";
	}
}
