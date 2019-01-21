package fr.utbm.ecommerce.iservice;

import java.util.Date;
import java.util.List;

import fr.utbm.ecommerce.dto.User;;

 /**
  * Interface User Service
  * @author Michel
  *
  */
public interface IUserservice {
	 

	//update a user
	/**
	 * Updates a user
	 * @param firstname the firstname
	 * @param lastname the lastname
	 * @param password the password
	 * @param dateofbith the birthday date
	 * @param gender the gender
	 * @param address the address
	 * @param country the country
	 * @param town the town
	 * @param postalcode the postal code
	 * @param phonenumber the phone number
	 * @param role the role
	 * @param mail the mail
	 * @return int
	 */
	int updateUser(String firstname,String lastname,String password,Date dateofbith,String gender,String address,String country,String town,String postalcode,String phonenumber,String role,String mail);

	//add a user
	/**
	 * Creates a user
	 * @param user the user
	 * @return user
	 */
	User addUser(User user);

	//delete a user
	/**
	 * Deletes a user
	 * @param mail the mail
	 */
	void deleteUser(String mail);

	//get user by mail
	/**
	 * Gets user by mail
	 * @param mail the mail
	 * @return user
	 */
	User getUserByMail(String mail);
	
	//get all users who has the role admin and worker
	/**
	 * Gets all user who has the role admin and worker
	 * @param admin
	 * @param worker
	 * @return list of user 
	 */
	List<User> getUsers(String admin,String worker);
	
	//get all users
	/**
	 * Gets all users
	 * @return a list of user
	 */
	List<User> getAllUsers();
}
