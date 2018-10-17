package fr.utbm.ecommerce.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="webuser")
public class WebUser implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="webuserid")
    private int webuserID;
    
    @Column(name="login")
	private String login;
    
    @Column(name="password")
	private String password;

	public WebUser(int webuserID, String login, String password) {
		super();
		this.webuserID = webuserID;
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

	public int getWebuserID() {
		return webuserID;
	}

	public void setWebuserID(int webuserID) {
		this.webuserID = webuserID;
	}
	
}
