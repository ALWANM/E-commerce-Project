package fr.utbm.ecommerce.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="payment")
public class Payment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="paymentdate")
	private Date paymentDate;
	
	@Column(name="methodofpayment")
	private String methodOfPayment;
	
	@Column(name="paid")
	private Boolean paid;
	
	@OneToOne
	@JoinColumn(name="orderid")
	private Order order;

	public Payment(int id, Date paymentDate, String methodOfPayment, Boolean paid, Order order) {
		super();
		this.id = id;
		this.paymentDate = paymentDate;
		this.methodOfPayment = methodOfPayment;
		this.paid = paid;
		this.order = order;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getMethodOfPayment() {
		return methodOfPayment;
	}

	public void setMethodOfPayment(String methodOfPayment) {
		this.methodOfPayment = methodOfPayment;
	}

	public Boolean getPaid() {
		return paid;
	}

	public void setPaid(Boolean paid) {
		this.paid = paid;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Payment [id=" + id + ", paymentDate=" + paymentDate + ", methodOfPayment=" + methodOfPayment + ", paid="
				+ paid + ", order=" + order + "]";
	}
	
	
	
}
