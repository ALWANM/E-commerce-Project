package fr.utbm.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.utbm.ecommerce.dto.Payment;
import fr.utbm.ecommerce.repository.PaymentDao;
@Service("PaymentService")
@Transactional
public class PaymentService {
	@Autowired
	private PaymentDao paymentDao;

	//add a new payment
	public Payment addPayment(Payment payment) {
		return paymentDao.save(payment);
	}

	//update the payment
	public Payment updatePayment(Payment payment) {
		return paymentDao.save(payment);
	}

	//delete the payment
	public void deletePayment(Payment payment) {
		paymentDao.delete(payment);
	}

	//get all payments
	public List<Payment> getAllPayment() {
		return (List<Payment>) paymentDao.findAll();
	}
}
