package fr.utbm.ecommerce.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="order")
public class Order implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="orderid")
	private String orderID;
	
	@Column(name="userid")
	private int userID;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="amount")
	private float amount;
	
	@OneToOne
	@JoinColumn(name="shippingid")
	private ShippingInfo shipping;
	
	@OneToOne
	@JoinColumn(name="id")
	private Payment payment;

	@OneToOne
	@JoinColumn(name="idshoppingcart")
	private ShoppingCart cart;

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public ShippingInfo getShipping() {
		return shipping;
	}

	public void setShipping(ShippingInfo shipping) {
		this.shipping = shipping;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "Order [orderID=" + orderID + ", userID=" + userID + ", date=" + date + ", amount=" + amount
				+ ", shipping=" + shipping + ", payment=" + payment + ", cart=" + cart + "]";
	}

	public Order(String orderID, int userID, Date date, float amount, ShippingInfo shipping, Payment payment,
			ShoppingCart cart) {
		super();
		this.orderID = orderID;
		this.userID = userID;
		this.date = date;
		this.amount = amount;
		this.shipping = shipping;
		this.payment = payment;
		this.cart = cart;
	}

	public ShoppingCart getCart() {
		return cart;
	}

	public void setCart(ShoppingCart cart) {
		this.cart = cart;
	}
	
	public float getPrice() {
		float price = 0;
		List<LineProduct> list = cart.getLineProduct();
		if(list.isEmpty()==false) {
			for(LineProduct p : list) {
				price += p.getQuantity() * p.getProduct().getPrice();
			}
		}
		return price;
	}
}
