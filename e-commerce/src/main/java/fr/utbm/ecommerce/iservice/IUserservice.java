package fr.utbm.ecommerce.iservice;

import java.util.Date;
import java.util.List;

import fr.utbm.ecommerce.dto.User;;

 
public interface IUserservice {
	 

	//update a user
	int updateUser(String firstname,String lastname,String password,Date dateofbith,String gender,String address,String country,String town,String postalcode,String phonenumber,String role,String mail);

	//add a user
	User addUser(User user);

	//delete a user
	void deleteUser(String mail);

	//get user by mail
	User getUserByMail(String mail);
	
	//get all users who has the role admin and worker
	List<User> getUsers(String admin,String worker);
	
	//get all users
	List<User> getAllUsers();
}
