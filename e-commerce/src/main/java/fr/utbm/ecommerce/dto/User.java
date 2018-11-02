package fr.utbm.ecommerce.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "user", indexes = {
		@Index(name = "login", columnList = "MAIL,PASSWORD"),
		@Index(name = "MAIL", columnList = "MAIL") })
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IDUSER")
	private int IDUser;
	@Column(name = "FIRSTNAME")
	private String FirstName;
	@Column(name = "LASTNAME")
	private String LastName;
	@Column(name = "ROLE")
	private String Role;
	@Column(name = "PASSWORD")
	private String Password;
	@Column(name = "MAIL", unique = true)
	private String Mail;
	@Column(name = "PHONENUMBER")
	private String PhoneNumber;
	@Column(name = "DATEOFBIRTH")
	private Date DateOfBirth;
	@Column(name = "ADDRESS")
	private String Address;
	@Column(name = "POSTALCODE")
	private String PostalCode;
	@Column(name = "TOWN")
	private String Town;
	@Column(name = "COUNTRY")
	private String Country;
	@Column(name = "DATEOPEN")
	private Date DateOpen;
	@Column(name = "GENDER")
	private String Gender;

	public int getIDUser() {
		return IDUser;
	}

	public void setIDUser(int iDUser) {
		IDUser = iDUser;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getMail() {
		return Mail;
	}

	public void setMail(String mail) {
		Mail = mail;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public Date getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPostalCode() {
		return PostalCode;
	}

	public void setPostalCode(String postalCode) {
		PostalCode = postalCode;
	}

	public String getTown() {
		return Town;
	}

	public void setTown(String town) {
		Town = town;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public Date getDateOpen() {
		return DateOpen;
	}

	public void setDateOpen(Date dateOpen) {
		DateOpen = dateOpen;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	@Override
	public String toString() {
		return "User [IDUser=" + IDUser + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Role=" + Role
				+ ", Password=" + Password + ", Mail=" + Mail + ", PhoneNumber=" + PhoneNumber + ", DateOfBirth="
				+ DateOfBirth + ", Address=" + Address + ", PostalCode=" + PostalCode + ", Town=" + Town + ", Country="
				+ Country + ", DateOpen=" + DateOpen + ", Gender=" + Gender + "]";
	}

	public User(String firstName, String lastName, String role, String password, String mail, String phoneNumber,
			Date dateOfBirth, String address, String postalCode, String town, String country, Date dateOpen,
			String gender) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Role = role;
		Password = password;
		Mail = mail;
		PhoneNumber = phoneNumber;
		DateOfBirth = dateOfBirth;
		Address = address;
		PostalCode = postalCode;
		Town = town;
		Country = country;
		DateOpen = dateOpen;
		Gender = gender;
	}

}
