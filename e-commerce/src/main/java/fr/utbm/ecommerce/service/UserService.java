package fr.utbm.ecommerce.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
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

	public User addUser(User user) {
		return userDao.save(user);

	}

	public int updateUser(String firstname,String lastname ,String password,Date dateofbith,String gender,String address,String country,String town,String postalcode,String phonenumber,String role,String mail) {
		return userDao.updateUserByMail(firstname, lastname,password, dateofbith, gender, address, country, town, postalcode, phonenumber,role, mail);
	 

	}

	public void deleteUser(String mail) {
		userDao.deleteUserByMail(mail);

	}

	public User getUserByMail(String mail) {
		// return userDao.findUserByMail(mail);
		User user = userDao.getUserByMail("%" + mail + "%");
		return user;
	}

	public List<User> getAllUsers() {
		return (List<User>) userDao.findAll();

	}

 
	@Override
	public List<User> getUsers(String admin,String worker) {
	return userDao.getUsers(admin,worker);
	}

	 
}
