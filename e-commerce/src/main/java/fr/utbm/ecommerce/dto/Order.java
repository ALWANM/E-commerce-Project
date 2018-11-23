package fr.utbm.ecommerce.dto;

import java.util.*;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "`order`")
public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ORDERID")
	private int OrderID;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DATE")
	private Date Date;
	
	@Column(name = "AMOUNT")
	private int Amount;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "SHIPPINGINFOID")
	private ShippingInfo ShippingInfo;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "USERID")
	private User User;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "PAYMENTID")
	private Payment Payment;

	public int getOrderID() {
		return OrderID;
	}

	public void setOrderID(int orderID) {
		OrderID = orderID;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}

	public int getAmount() {
		return Amount;
	}

	public void setAmount(int amount) {
		Amount = amount;
	}

	public ShippingInfo getShippingInfo() {
		return ShippingInfo;
	}

	public void setShippingInfo(ShippingInfo shippingInfo) {
		ShippingInfo = shippingInfo;
	}

	public User getUser() {
		return User;
	}

	public void setUser(User user) {
		User = user;
	}

	public Payment getPayment() {
		return Payment;
	}

	public void setPayment(Payment payment) {
		Payment = payment;
	}

	@Override
	public String toString() {
		return "Order [OrderID=" + OrderID + ", Date=" + Date + ", Amount=" + Amount + ", ShippingInfo=" + ShippingInfo
				+ ", User=" + User + ", Payment=" + Payment + "]";
	}

	public Order(Date date, int amount, fr.utbm.ecommerce.dto.@NotNull ShippingInfo shippingInfo,
			fr.utbm.ecommerce.dto.@NotNull User user, fr.utbm.ecommerce.dto.@NotNull Payment payment) {
		super();
		Date = date;
		Amount = amount;
		ShippingInfo = shippingInfo;
		User = user;
		Payment = payment;
	}

}
