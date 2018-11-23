package fr.utbm.ecommerce.controller;

import java.security.Principal;
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
			newUser.setRole("USER");
			
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

}
