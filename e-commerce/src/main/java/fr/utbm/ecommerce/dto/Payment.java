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
 * Entity payment
 *
 */
@Entity
@Table(name="payment")
public class Payment implements Serializable{

	private static final long serialVersionUID = 1L;
	/*
	 *To define the primary key 
	 *And the generated method of the PK
	 *and the Column name in the database
	 * */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PAYMENTID")
	private int Paymentid;
	@Temporal(TemporalType.DATE)
	@Column(name="PAYMENTDATE")
	private Date PaymentDate;
	@Column(name="METHODOFPAYMENT")
	private String MethodOfPayment;
	
	
	/**Getters and Setters**/
	
	/**
	 * Gets the payment id
	 * @return payment id
	 */
	public int getPaymentid() {
		return Paymentid;
	}
	
	/**
	 * Sets the payment id
	 * @param paymentid the id
	 */
	public void setPaymentid(int paymentid) {
		Paymentid = paymentid;
	}
	
	/**
	 * Gets the date
	 * @return date
	 */
	public Date getPaymentDate() {
		return PaymentDate;
	}
	
	/**
	 * Sets the payment date
	 * @param paymentDate payment date
	 */
	public void setPaymentDate(Date paymentDate) {
		PaymentDate = paymentDate;
	}
	
	/**
	 * Gets the method of payment
	 * @return methodofpayment
	 */
	public String getMethodOfPayment() {
		return MethodOfPayment;
	}
	
	/**
	 * Sets the method of payment
	 * @param methodOfPayment payment
	 */
	public void setMethodOfPayment(String methodOfPayment) {
		MethodOfPayment = methodOfPayment;
	}
	
	@Override
	public String toString() {
		return "Payment [Paymentid=" + Paymentid + ", PaymentDate=" + PaymentDate + ", MethodOfPayment="
				+ MethodOfPayment + "]";
	}

	/**
	 * Default constructor
	 * @param paymentDate the date
	 * @param methodOfPayment the method of payment
	 */
	public Payment(Date paymentDate, String methodOfPayment) {
		super();
		PaymentDate = paymentDate;
		MethodOfPayment = methodOfPayment;
	}

	/**
	 * Default constructor
	 */
	public Payment() {
		super();
	}
	
}
