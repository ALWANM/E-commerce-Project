package fr.utbm.ecommerce.iservice;

import fr.utbm.ecommerce.dto.User;

import java.util.List;

import org.springframework.stereotype.Repository;;

 
public interface IUserservice {
	User updateUser(User user);

	User addUser(User user);

	void deleteUser(User user);

	User getUserByMail(String mail);

	List<User> getAllUsers();
}
