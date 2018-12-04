package fr.utbm.ecommerce.iservice;

import fr.utbm.ecommerce.dto.User;

import java.util.Date;
import java.util.List;;

 
public interface IUserservice {
	 

	int updateUser(String firstname,String lastname,String password,Date dateofbith,String gender,String address,String country,String town,String postalcode,String phonenumber,String role,String mail);

	User addUser(User user);

	void deleteUser(String mail);

	User getUserByMail(String mail);
	List<User> getUsers(String admin,String worker);
	List<User> getAllUsers();
}
