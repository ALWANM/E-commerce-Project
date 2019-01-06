package fr.utbm.ecommerce.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.utbm.ecommerce.dto.User;
import fr.utbm.ecommerce.iservice.IUserservice;
import fr.utbm.ecommerce.repository.UserDao;

@Service("UserService")
@Transactional
public class UserService   implements IUserservice {
	@Autowired
	private UserDao userDao;

	//add a new user
	public User addUser(User user) {
		return userDao.save(user);

	}

	//update the user
	public int updateUser(String firstname,String lastname ,String password,Date dateofbith,String gender,String address,String country,String town,String postalcode,String phonenumber,String role,String mail) {
		return userDao.updateUserByMail(firstname, lastname,password, dateofbith, gender, address, country, town, postalcode, phonenumber,role, mail);
	 

	}

	//delete a user
	public void deleteUser(String mail) {
		userDao.deleteUserByMail(mail);

	}

	//get the user by mail
	public User getUserByMail(String mail) {
		// return userDao.findUserByMail(mail);
		User user = userDao.getUserByMail("%" + mail + "%");
		return user;
	}

	
	//get all users
	public List<User> getAllUsers() {
		return (List<User>) userDao.findAll();

	}

	//get users who has the role admin and worker
	@Override
	public List<User> getUsers(String admin,String worker) {
	return userDao.getUsers(admin,worker);
	}

	 
}
