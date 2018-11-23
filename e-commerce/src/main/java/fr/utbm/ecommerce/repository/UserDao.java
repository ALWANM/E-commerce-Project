package fr.utbm.ecommerce.repository;

import fr.utbm.ecommerce.dto.User;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
//This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
//CRUD refers Create, Read, Update, Delete
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;;

@Repository("UserDao")
@Transactional
public interface UserDao extends CrudRepository<User, Integer> {
//
	@Query("SELECT u FROM User u WHERE LOWER(u.Mail) LIKE LOWER(:mail) ")
	User getUserByMail(@Param("mail") String mail);

}
