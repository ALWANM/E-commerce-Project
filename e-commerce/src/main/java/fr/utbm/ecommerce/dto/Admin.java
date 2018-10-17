package fr.utbm.ecommerce.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * @author Michel
 *
 */
@Entity
@Table(name="admin")
@PrimaryKeyJoinColumn(name="webuserid")
public class Admin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="adminid")
	private int adminID;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="dateopen")
	private Date dateOpen;
	
	@Column(name="state")
	private AdminState state = AdminState.NORMAL;
	
	public Admin(int adminID, String firstname, String lastname, Date dateOpen, AdminState state) {
		super();
		this.adminID = adminID;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dateOpen = dateOpen;
		this.state = state;
	}

	public int getAdminID() {
		return adminID;
	}

	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getDateOpen() {
		return dateOpen;
	}

	public void setDateOpen(Date dateOpen) {
		this.dateOpen = dateOpen;
	}

	public AdminState getState() {
		return state;
	}

	public void setState(AdminState state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Admin [adminID=" + adminID + ", firstname=" + firstname + ", lastname=" + lastname + ", dateOpen="
				+ dateOpen + ", state=" + state + "]";
	}
	
}
