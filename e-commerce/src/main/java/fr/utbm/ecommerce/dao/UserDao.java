package fr.utbm.ecommerce.dao;

import fr.utbm.ecommerce.dto.User;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
//This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
//CRUD refers Create, Read, Update, Delete
import org.springframework.data.repository.query.Param;

import java.util.List;;

public interface UserDao extends CrudRepository<User, Integer> {
	User addUser(User User);

	User updateUser(User User);

	User deleteUser(User User);

	@Query("SELECT u FROM user u WHERE LOWER(u.mail) LIKE LOWER(:mail) ")
	User getUserByMail(@Param("mail") String mail);

	List<User> getAllUsers();

}
