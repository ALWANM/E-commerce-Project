package fr.utbm.ecommerce.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * Entity user
 * Define the index username and password and second index of mail
 * by default there is a unique user created by spring security if we want to
 * login with an individual user we must implement a UserDetails
 */
@Entity
@Table(name = "user", indexes = { @Index(name = "login", columnList = "MAIL,PASSWORD"),
		@Index(name = "MAIL", columnList = "MAIL") })
//@Scope("session")
public class User implements UserDetails, Serializable {

	private static final long serialVersionUID = 1L;
	/*
	 *To define the primary key 
	 *And the generated method of the PK
	 *and the Column name in the database
	 * */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDUSER")
	private int UserID;
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
	@Temporal(TemporalType.DATE)
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
	@Temporal(TemporalType.DATE)
	@Column(name = "DATEOPEN")
	private Date DateOpen;
	@Column(name = "GENDER")
	private String Gender;

	/** Getters and Setters **/
	
	/**
	 * Gets the user id
	 * @return the userID
	 */
	public int getUserID() {
		return UserID;
	}


	/**
	 * Sets the user id
	 * @param userID the userID to set
	 */
	public void setUserID(int userID) {
		UserID = userID;
	}


	/**
	 * Gets the firstname
	 * @return the firstName
	 */
	public String getFirstName() {
		return FirstName;
	}


	/**
	 * Sets the firstname
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	/**
	 * Gets the lastname
	 * @return the lastName
	 */
	public String getLastName() {
		return LastName;
	}


	/**
	 * Sets the lastname
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		LastName = lastName;
	}


	/**
	 * Gets the role
	 * @return the role
	 */
	public String getRole() {
		return Role;
	}


	/**
	 * Sets the role
	 * @param role the role to set
	 */
	public void setRole(String role) {
		Role = role;
	}


	/**
	 * Gets the password
	 * @return the password
	 */
	public String getPassword() {
		return Password;
	}


	/**
	 * Sets the password
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		Password = password;
	}


	/**
	 * Gets the mail
	 * @return the mail
	 */
	public String getMail() {
		return Mail;
	}


	/**
	 * Sets the mail
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		Mail = mail;
	}


	/**
	 * Gets the phone number
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return PhoneNumber;
	}


	/**
	 * Sets the phone number
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}


	/**
	 * Gets the birthday date
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return DateOfBirth;
	}


	/**
	 * Sets the birthday date
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}


	/**
	 * Gets the addres
	 * @return the address
	 */
	public String getAddress() {
		return Address;
	}


	/**
	 * Sets the address
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		Address = address;
	}


	/**
	 * Gets the postal code
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return PostalCode;
	}


	/**
	 * Sets the postal code
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		PostalCode = postalCode;
	}


	/**
	 * Gets the town
	 * @return the town
	 */
	public String getTown() {
		return Town;
	}


	/**
	 * Sets the town
	 * @param town the town to set
	 */
	public void setTown(String town) {
		Town = town;
	}


	/**
	 * Gets the country
	 * @return the country
	 */
	public String getCountry() {
		return Country;
	}


	/**
	 * Sets the country
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		Country = country;
	}


	/**
	 * Gets the date of open
	 * @return the dateOpen
	 */
	public Date getDateOpen() {
		return DateOpen;
	}


	/**
	 * Sets the open date
	 * @param dateOpen the dateOpen to set
	 */
	public void setDateOpen(Date dateOpen) {
		DateOpen = dateOpen;
	}


	/**
	 * Gets the gender
	 * @return the gender
	 */
	public String getGender() {
		return Gender;
	}


	/**
	 * Sets the gender
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		Gender = gender;
	}

	@Override
	public String toString() {
		return "User [IDUser=" + UserID + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Role=" + Role
				+ ", Password=" + Password + ", Mail=" + Mail + ", PhoneNumber=" + PhoneNumber + ", DateOfBirth="
				+ DateOfBirth + ", Address=" + Address + ", PostalCode=" + PostalCode + ", Town=" + Town + ", Country="
				+ Country + ", DateOpen=" + DateOpen + ", Gender=" + Gender + "]";
	}


	/**
	 * Default constructor
	 */
	public User() {
		super();
	}
	
	/**
	 * Default constructor
	 * @param firstName the firstname
	 * @param lastName the lastname
	 * @param role the role
	 * @param password the password
	 * @param mail the mail
	 * @param phoneNumber the phone number
	 * @param dateOfBirth the birthday date
	 * @param address the address
	 * @param postalCode the postal code
	 * @param town the town
	 * @param country the country
	 * @param dateOpen the date open
	 * @param gender the gender
	 */
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

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		Collection<GrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority(Role));
		return authorities;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return Mail;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

//	@JsonIgnore
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		Collection<GrantedAuthority> authorities = new ArrayList<>();
//		authorities.add(new SimpleGrantedAuthority(Role));
//		return authorities;
//	}
//
//	@JsonIgnore
//	@Override
//	public String getUsername() {
//		 return Mail;
//	}
//
//	@JsonIgnore
//	@Override
//	public boolean isAccountNonExpired() {
//		 return true;
//	}
//
//	@JsonIgnore
//	@Override
//	public boolean isAccountNonLocked() { 
//		return true;
//	}
//
//	@JsonIgnore
//	@Override
//	public boolean isCredentialsNonExpired() { 
//		return true;
//	}

//	@JsonIgnore
//	@Override
//	public boolean isEnabled() { 
//		return true;
//	}

}
