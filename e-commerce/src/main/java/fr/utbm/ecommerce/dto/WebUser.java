package fr.utbm.ecommerce.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="webuser")
public class WebUser implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name="login")
	private String login;
    
    @Column(name="password")
	private String password;
	
    
	public WebUser(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	@Override
	public String toString() {
		return "WebUser [login=" + login + ", password=" + password + "]";
	}
	
}
