package fr.utbm.ecommerce.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="worker")
@PrimaryKeyJoinColumn(name="webuserid")
public class Worker extends WebUser{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="workerid")
	private int workerID;
	
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;
	
	@Column(name="mail")
	private String mail;
	
	@Column(name="phonenumber")
	private String phoneNumber;
	
	@Column(name="dateopen")
	private Date dateOpen;

	public Worker(int webuserID, String login, String password, int workerID, String firstName, String lastName,
			String mail, String phoneNumber, Date dateOpen) {
		super(webuserID, login, password);
		this.workerID = workerID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mail = mail;
		this.phoneNumber = phoneNumber;
		this.dateOpen = dateOpen;
	}

	public int getWorkerID() {
		return workerID;
	}

	public void setWorkerID(int workerID) {
		this.workerID = workerID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getDateOpen() {
		return dateOpen;
	}

	public void setDateOpen(Date dateOpen) {
		this.dateOpen = dateOpen;
	}

	@Override
	public String toString() {
		return "Worker [workerID=" + workerID + ", firstName=" + firstName + ", lastName=" + lastName + ", mail=" + mail
				+ ", phoneNumber=" + phoneNumber + ", dateOpen=" + dateOpen + "]";
	}
	
}
