package fr.utbm.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import fr.utbm.ecommerce.dto.User;

@Service
/*
 * create a class that implements UserDetailsService interface, then use it as
 * the authentication provider . It’s pretty easy to create an
 * AuthenticationManager of your own: just implement UserDetailsService. The
 * UserDetailsService contains a single method: loadByUsername. It’s up to that
 * method to either return a populated Authentication object or throw a
 * UsernameNotFoundException. UserDetailsService implementations do one thing:
 * return a UserDetails implementation
 */
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
