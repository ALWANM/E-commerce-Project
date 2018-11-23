package fr.utbm.ecommerce.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="shippinginfo")
public class ShippingInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SHIPPINGINFOID")
	private int ShippingID;
	@Column(name="SHIPPINGADDRESS")
	private int ShippingAddress;
	@Column(name="SHIPPINGPOSTALCODE")
	private int ShippingPostalCode;
	@Column(name="SHIPPINGTOWN")
	private int ShippingTown;
	@Column(name="SHIPPINGCOUNTRY")
	private int ShippingCountry;
	@Column(name="RECIPIENT")
	private int Recipient;
	public int getShippingID() {
		return ShippingID;
	}
	public void setShippingID(int shippingID) {
		ShippingID = shippingID;
	}
	public int getShippingAddress() {
		return ShippingAddress;
	}
	public void setShippingAddress(int shippingAddress) {
		ShippingAddress = shippingAddress;
	}
	public int getShippingPostalCode() {
		return ShippingPostalCode;
	}
	public void setShippingPostalCode(int shippingPostalCode) {
		ShippingPostalCode = shippingPostalCode;
	}
	public int getShippingTown() {
		return ShippingTown;
	}
	public void setShippingTown(int shippingTown) {
		ShippingTown = shippingTown;
	}
	public int getShippingCountry() {
		return ShippingCountry;
	}
	public void setShippingCountry(int shippingCountry) {
		ShippingCountry = shippingCountry;
	}
	public int getRecipient() {
		return Recipient;
	}
	public void setRecipient(int recipient) {
		Recipient = recipient;
	}
	@Override
	public String toString() {
		return "ShippingInfo [ShippingID=" + ShippingID + ", ShippingAddress=" + ShippingAddress
				+ ", ShippingPostalCode=" + ShippingPostalCode + ", ShippingTown=" + ShippingTown + ", ShippingCountry="
				+ ShippingCountry + ", Recipient=" + Recipient + "]";
	}
	public ShippingInfo(int shippingAddress, int shippingPostalCode, int shippingTown, int shippingCountry,
			int recipient) {
		super();
		ShippingAddress = shippingAddress;
		ShippingPostalCode = shippingPostalCode;
		ShippingTown = shippingTown;
		ShippingCountry = shippingCountry;
		Recipient = recipient;
	}
	
}
