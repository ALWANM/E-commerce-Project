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
import javassist.bytecode.stackmap.BasicBlock.Catch;

@RestController
@RequestMapping("account")
public class UserController {
	public static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	// request method to create a new account by a guest
	@CrossOrigin
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseEntity<?> createUser(@RequestBody User newUser) {
		try {
//			System.out.println(newUser.getMail());
			if (userService.getUserByMail(newUser.getMail()) != null) {
				logger.error("username Already exist " + newUser.getMail());
				return new ResponseEntity<Object>(
						new CustomErrorType("user with username" + newUser.getMail() + "already exist "),
						HttpStatus.CONFLICT);
			}
//			newUser.setMail("marwan");
			if(newUser.getRole()==null)newUser.setRole("USER");

			return new ResponseEntity<User>(userService.addUser(newUser), HttpStatus.CREATED);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	// this is the login api/service
	@CrossOrigin
	@RequestMapping("/login")
	public Principal user(Principal principal) {
		logger.info("user logged " + principal);
		return principal;
	}
	@CrossOrigin
	@RequestMapping(value="/users",method = RequestMethod.GET)
	public List<User> getUsers(Principal principal) {
		 
		return userService.getUsers("ADMIN","WORKER");
	}
	@CrossOrigin
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public int updateUser(@RequestBody User updateUser) {
//		userService.deleteUser(updateUser);
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
		//return userService.updateUser(updateUser);
		
	}
	@CrossOrigin
	@RequestMapping(value="/delete",method = RequestMethod.POST)
	public void deleteUser(@RequestBody User deleteuser) {
		userService.deleteUser(deleteuser.getMail());
		System.out.println(deleteuser);
	}
//	
}
