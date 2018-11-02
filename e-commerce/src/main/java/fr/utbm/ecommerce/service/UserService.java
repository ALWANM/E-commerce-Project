package fr.utbm.ecommerce.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.utbm.ecommerce.dao.UserDao;
import fr.utbm.ecommerce.dto.User;

@Service("UserService")
@Transactional
public class UserService {
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
		return userDao.getUserByMail("%" + mail + "%");

	}

	public List<User> getAllUsers() {
		return (List<User>) userDao.findAll();

	}
}
