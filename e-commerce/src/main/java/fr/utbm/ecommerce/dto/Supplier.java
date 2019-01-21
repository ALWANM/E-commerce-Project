package fr.utbm.ecommerce.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entity supplier
 *
 */
@Entity
@Table(name="supplier")
public class Supplier implements Serializable {

	private static final long serialVersionUID = 1L;
	/*
	 * To define the primary key And the generated method of the PK and the Column
	 * name in the database
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SUPPLIERID")
	private int SupplierID;
	@Column(name="FIRSTNAME")
	private String FirstName;
	@Column(name="LASTNAME")
	private String LastName;
	@Column(name="MAIL")
	private String Mail;
	@Column(name="PHONENUMBER")
	private String PhoneNumber;
	@Temporal(TemporalType.DATE)
	@Column(name="DATEOFBIRTH")
	private Date DateOfBirth;
	@Column(name="ADDRESS")
	private String Address;
	@Column(name="POSTALCODE")
	private String PostalCode;
	@Column(name="TOWN")
	private String Town;
	@Column(name="COUNTRY")
	private String Country;
	
	/**Getters and Setters**/
	
	
	/**
	 * Gets the supplier id
	 * @return the supplierID
	 */
	public int getSupplierID() {
		return SupplierID;
	}

	/**
	 * Sets the supplier id
	 * @param supplierID the supplierID to set
	 */
	public void setSupplierID(int supplierID) {
		SupplierID = supplierID;
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
	 * Gets the last name
	 * @return the lastName
	 */
	public String getLastName() {
		return LastName;
	}

	/**
	 * Sets the last name
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		LastName = lastName;
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
	 * Gets the address
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

	@Override
	public String toString() {
		return "Supplier [SupplierID=" + SupplierID + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Mail="
				+ Mail + ", PhoneNumber=" + PhoneNumber + ", DateOfBirth=" + DateOfBirth + ", Address=" + Address
				+ ", PostalCode=" + PostalCode + ", Town=" + Town + ", Country=" + Country + "]";
	}
	
	/**
	 * Default constructor
	 * @param firstName the first name
	 * @param lastName the last name
	 * @param mail the mail
	 * @param phoneNumber the phone number
	 * @param dateOfBirth the birthday date
	 * @param address the address
	 * @param postalCode the postal code
	 * @param town the town
	 * @param country the country
	 */
	public Supplier(String firstName, String lastName, String mail, String phoneNumber, Date dateOfBirth,
			String address, String postalCode, String town, String country) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Mail = mail;
		PhoneNumber = phoneNumber;
		DateOfBirth = dateOfBirth;
		Address = address;
		PostalCode = postalCode;
		Town = town;
		Country = country;
	}
	/**
	 * Default constructor
	 */
	public Supplier() {
		super();
	}
}
