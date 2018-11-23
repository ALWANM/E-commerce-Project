package fr.utbm.ecommerce.service;

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

	public User updateUser(User user) {
		return userDao.save(user);

	}

	public void deleteUser(User user) {
		userDao.delete(user);

	}

	public User getUserByMail(String mail) {
		// return userDao.findUserByMail(mail);
		User user = userDao.getUserByMail("%" + mail + "%");
		return user;
	}

	public List<User> getAllUsers() {
		return (List<User>) userDao.findAll();

	}

	 
}
