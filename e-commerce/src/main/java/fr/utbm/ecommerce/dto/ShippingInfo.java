package fr.utbm.ecommerce.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="shippinginfo")
public class ShippingInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="shippingid")
	private int shippingid;
	
	@Column(name="shippingaddress")
	private String shippingAddress;
	
	@Column(name="shippingpostalcode")
	private String shippingPostalCode;
	
	@Column(name="shipppingtown")
	private String shippingTown;
	
	@Column(name="shippingcountry")
	private String shippingCountry;
	
	@Column(name="status")
	private Status status;
	
	@Column(name="recipient")
	private String recipient;
	
	@OneToOne
	@JoinColumn(name="orderid")
	private Order order;
	
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public int getShippingid() {
		return shippingid;
	}

	public void setShippingid(int shippingid) {
		this.shippingid = shippingid;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getShippingPostalCode() {
		return shippingPostalCode;
	}

	public void setShippingPostalCode(String shippingPostalCode) {
		this.shippingPostalCode = shippingPostalCode;
	}

	public String getShippingTown() {
		return shippingTown;
	}

	public void setShippingTown(String shippingTown) {
		this.shippingTown = shippingTown;
	}

	public String getShippingCountry() {
		return shippingCountry;
	}

	public void setShippingCountry(String shippingCountry) {
		this.shippingCountry = shippingCountry;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public ShippingInfo(int shippingid, String shippingAddress, String shippingPostalCode, String shippingTown,
			String shippingCountry, Status status, String recipient) {
		this.shippingid = shippingid;
		this.shippingAddress = shippingAddress;
		this.shippingPostalCode = shippingPostalCode;
		this.shippingTown = shippingTown;
		this.shippingCountry = shippingCountry;
		this.status = status;
		this.recipient = recipient;
	}

	@Override
	public String toString() {
		return "ShippingInfo [shippingid=" + shippingid + ", shippingAddress=" + shippingAddress
				+ ", shippingPostalCode=" + shippingPostalCode + ", shippingTown=" + shippingTown + ", shippingCountry="
				+ shippingCountry + ", status=" + status + ", recipient=" + recipient + ", order=" + order + "]";
	}
	
	
}
