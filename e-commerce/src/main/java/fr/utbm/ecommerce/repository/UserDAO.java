package fr.utbm.ecommerce.repository;

//This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
//CRUD refers Create, Read, Update, Delete

import org.springframework.data.repository.CrudRepository;

import fr.utbm.ecommerce.model.User;

public interface UserDAO extends CrudRepository<User, Integer> {

}
