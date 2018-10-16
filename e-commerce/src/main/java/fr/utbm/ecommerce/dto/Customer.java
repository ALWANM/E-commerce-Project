package fr.utbm.ecommerce.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class Customer implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="customerid")
	private int customerID;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="dateopen")
	private Date dateOpen;

	@Column(name="mail")
	private String mail;
	
	@Column(name="phonenumber")
	private String phoneNumber;
	
	@Column(name="dateofbirth")
	private Date dateOfBirth;
	
	@Column(name="address")
	private String address;
	
	@Column(name="postalcode")
	private String postalCode;
	
	@Column(name="town")
	private String town;
	
	@Column(name="country")
	private String country;
	
	@Column(name="gender")
	private String gender;

	@OneToMany
	@JoinColumn(name="orderid")
	private List<Order> listOrder = new ArrayList<Order>();


	public Customer(int customerID, String firstname, String lastname, Date dateOpen, String mail, String phoneNumber,
			Date dateOfBirth, String address, String postalCode, String town, String country, String gender,
			List<Order> listOrder) {
		super();
		this.customerID = customerID;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dateOpen = dateOpen;
		this.mail = mail;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.postalCode = postalCode;
		this.town = town;
		this.country = country;
		this.gender = gender;
		this.listOrder = listOrder;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", dateOpen=" + dateOpen + ", mail=" + mail + ", phoneNumber=" + phoneNumber + ", dateOfBirth="
				+ dateOfBirth + ", address=" + address + ", postalCode=" + postalCode + ", town=" + town + ", country="
				+ country + ", gender=" + gender + ", listOrder=" + listOrder + "]";
	}

	public List<Order> getListOrder() {
		return listOrder;
	}

	public void setListOrder(List<Order> listOrder) {
		this.listOrder = listOrder;
	}
	
	
}
