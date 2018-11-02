package fr.utbm.ecommerce.service;

import java.util.List;

import fr.utbm.ecommerce.dao.PaymentDao;
import fr.utbm.ecommerce.dto.Payment;

public class PaymentService {
	private PaymentDao paymentDao;

	public Payment addPayment(Payment payment) {
		return paymentDao.save(payment);
	}

	public Payment updatePayment(Payment payment) {
		return paymentDao.save(payment);
	}

	public void deletePayment(Payment payment) {
		paymentDao.delete(payment);
	}

	public List<Payment> getAllPayment() {
		return (List<Payment>) paymentDao.findAll();
	}
}
