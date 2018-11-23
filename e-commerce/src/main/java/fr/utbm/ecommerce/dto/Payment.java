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
@Entity
@Table(name="payment")
public class Payment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PAYMENTID")
	private int Paymentid;
	@Temporal(TemporalType.DATE)
	@Column(name="PAYMENTDATE")
	private Date PaymentDate;
	@Column(name="METHODOFPAYMENT")
	private String MethodOfPayment;
	public int getPaymentid() {
		return Paymentid;
	}
	public void setPaymentid(int paymentid) {
		Paymentid = paymentid;
	}
	public Date getPaymentDate() {
		return PaymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		PaymentDate = paymentDate;
	}
	public String getMethodOfPayment() {
		return MethodOfPayment;
	}
	public void setMethodOfPayment(String methodOfPayment) {
		MethodOfPayment = methodOfPayment;
	}
	@Override
	public String toString() {
		return "Payment [Paymentid=" + Paymentid + ", PaymentDate=" + PaymentDate + ", MethodOfPayment="
				+ MethodOfPayment + "]";
	}
	public Payment(Date paymentDate, String methodOfPayment) {
		super();
		PaymentDate = paymentDate;
		MethodOfPayment = methodOfPayment;
	}
	
}
