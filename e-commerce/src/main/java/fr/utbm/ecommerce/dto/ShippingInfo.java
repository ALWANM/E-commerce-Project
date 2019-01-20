package fr.utbm.ecommerce.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/*
 * to define the entity 
 * */
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
	
	
	public int getShippingID() {
		return ShippingID;
	}
	public void setShippingID(int shippingID) {
		ShippingID = shippingID;
	}
	public void setShippingAddress(String shippingAddress) {
		ShippingAddress = shippingAddress;
	}
	public void setShippingPostalCode(String shippingPostalCode) {
		ShippingPostalCode = shippingPostalCode;
	}
	public void setShippingTown(String shippingTown) {
		ShippingTown = shippingTown;
	}
	public void setShippingCountry(String shippingCountry) {
		ShippingCountry = shippingCountry;
	}
	public void setRecipient(String recipient) {
		Recipient = recipient;
	}
	@Override
	public String toString() {
		return "ShippingInfo [ShippingID=" + ShippingID + ", ShippingAddress=" + ShippingAddress
				+ ", ShippingPostalCode=" + ShippingPostalCode + ", ShippingTown=" + ShippingTown + ", ShippingCountry="
				+ ShippingCountry + ", Recipient=" + Recipient + "]";
	}
	/*
	 *   constructor
	 * */
	public ShippingInfo(String shippingAddress, String shippingPostalCode, String shippingTown, String shippingCountry,
			String recipient) {
		super();
		ShippingAddress = shippingAddress;
		ShippingPostalCode = shippingPostalCode;
		ShippingTown = shippingTown;
		ShippingCountry = shippingCountry;
		Recipient = recipient;
	}
	/*
	 * default constructor
	 * */
	public ShippingInfo() {
		super();
	}
	
}
