package fr.utbm.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import fr.utbm.ecommerce.dto.User;

@Service
public class AppUserDetailsService implements UserDetailsService {

	@Autowired
	UserService userService;

	@Override
	public UserDetails loadUserByUsername(String mail) throws UsernameNotFoundException {
		User user = userService.getUserByMail(mail);
		if (null == user) {
			throw new UsernameNotFoundException("No user named " + mail);
		} else {
			return (UserDetails) user;
		}
	}

}
