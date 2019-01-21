package fr.utbm.ecommerce.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Entity shippinginfo
 *
 */
@Entity
@Table(name="shippinginfo")
public class ShippingInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	/*
	 *To define the primary key 
	 *And the generated method of the PK
	 *and the Column name in the database
	 * */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SHIPPINGID")
	private int ShippingID;
	@Column(name="SHIPPINGADDRESS")
	private String ShippingAddress;
	@Column(name="SHIPPINGPOSTALCODE")
	private String ShippingPostalCode;
	@Column(name="SHIPPINGTOWN")
	private String ShippingTown;
	@Column(name="SHIPPINGCOUNTRY")
	private String ShippingCountry;
	@Column(name="RECIPIENT")
	private String Recipient;
	
	
	/**Getters and Setters**/
	
	@Override
	public String toString() {
		return "ShippingInfo [ShippingID=" + ShippingID + ", ShippingAddress=" + ShippingAddress
				+ ", ShippingPostalCode=" + ShippingPostalCode + ", ShippingTown=" + ShippingTown + ", ShippingCountry="
				+ ShippingCountry + ", Recipient=" + Recipient + "]";
	}
	
	/**
	 * Default constructor
	 * @param shippingAddress the address
	 * @param shippingPostalCode the postal code
	 * @param shippingTown the town
	 * @param shippingCountry the country
	 * @param recipient the name of recipient
	 */
	public ShippingInfo(String shippingAddress, String shippingPostalCode, String shippingTown, String shippingCountry,
			String recipient) {
		super();
		ShippingAddress = shippingAddress;
		ShippingPostalCode = shippingPostalCode;
		ShippingTown = shippingTown;
		ShippingCountry = shippingCountry;
		Recipient = recipient;
	}


	/**
	 * Default constructor
	 */
	public ShippingInfo() {
		super();
	}
	
	/**
	 * Gets the shipping id
	 * @return the shippingID
	 */
	public int getShippingID() {
		return ShippingID;
	}
	/**
	 * Sets the shipping id
	 * @param shippingID the shippingID to set
	 */
	public void setShippingID(int shippingID) {
		ShippingID = shippingID;
	}
	/**
	 * Gets the shipping address
	 * @return the shippingAddress
	 */
	public String getShippingAddress() {
		return ShippingAddress;
	}
	/**
	 * Sets the shipping address
	 * @param shippingAddress the shippingAddress to set
	 */
	public void setShippingAddress(String shippingAddress) {
		ShippingAddress = shippingAddress;
	}
	/**
	 * Gets the postal code
	 * @return the shippingPostalCode
	 */
	public String getShippingPostalCode() {
		return ShippingPostalCode;
	}
	/**
	 * Sets the postal code
	 * @param shippingPostalCode the shippingPostalCode to set
	 */
	public void setShippingPostalCode(String shippingPostalCode) {
		ShippingPostalCode = shippingPostalCode;
	}
	/**
	 * Gets the town
	 * @return the shippingTown
	 */
	public String getShippingTown() {
		return ShippingTown;
	}
	/**
	 * Sets the town
	 * @param shippingTown the shippingTown to set
	 */
	public void setShippingTown(String shippingTown) {
		ShippingTown = shippingTown;
	}
	/**
	 * Gets the country
	 * @return the shippingCountry
	 */
	public String getShippingCountry() {
		return ShippingCountry;
	}
	/**
	 * Sets the country
	 * @param shippingCountry the shippingCountry to set
	 */
	public void setShippingCountry(String shippingCountry) {
		ShippingCountry = shippingCountry;
	}
	/**
	 * Gets the recipient
	 * @return the recipient
	 */
	public String getRecipient() {
		return Recipient;
	}
	/**
	 * Sets the recipient
	 * @param recipient the recipient to set
	 */
	public void setRecipient(String recipient) {
		Recipient = recipient;
	}
	
}
