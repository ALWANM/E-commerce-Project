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
/*
 * to define the entity 
 * */
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
	
	
	public int getSupplierID() {
		return SupplierID;
	}
	public void setSupplierID(int supplierID) {
		SupplierID = supplierID;
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
	@Override
	public String toString() {
		return "Supplier [SupplierID=" + SupplierID + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Mail="
				+ Mail + ", PhoneNumber=" + PhoneNumber + ", DateOfBirth=" + DateOfBirth + ", Address=" + Address
				+ ", PostalCode=" + PostalCode + ", Town=" + Town + ", Country=" + Country + "]";
	}
	/*
	 *   constructor
	 * */
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
	/*
	 * default constructor
	 * */
	public Supplier() {
		super();
	}
}
