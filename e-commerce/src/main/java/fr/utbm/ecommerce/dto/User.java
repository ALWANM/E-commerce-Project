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

/*
 * to define the entity and the index of username and password 
 * and second index of mail
 * this make the research in database rapid 
 * and with these indexes we will never have a double username in same mail in database
 * */
@Entity
@Table(name = "user", indexes = { @Index(name = "login", columnList = "MAIL,PASSWORD"),
		@Index(name = "MAIL", columnList = "MAIL") })
//@Scope("session")
/*
 * by default there is a unique user created by spring security if we want to
 * login with an individual user we must implement a UserDetails
 *
 */
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

	public int getUserID() {
		return UserID;
	}

	public void setUserID(int userID) {
		UserID = userID;
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
		return "User [IDUser=" + UserID + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Role=" + Role
				+ ", Password=" + Password + ", Mail=" + Mail + ", PhoneNumber=" + PhoneNumber + ", DateOfBirth="
				+ DateOfBirth + ", Address=" + Address + ", PostalCode=" + PostalCode + ", Town=" + Town + ", Country="
				+ Country + ", DateOpen=" + DateOpen + ", Gender=" + Gender + "]";
	}
	/*
	 * default constructor
	 * */
	public User() {
		super();
	}
	/*
	 *   constructor
	 * */
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
