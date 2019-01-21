package fr.utbm.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.utbm.ecommerce.dto.Payment;
import fr.utbm.ecommerce.iservice.IPaymentService;
import fr.utbm.ecommerce.repository.PaymentDao;
@Service("PaymentService")
@Transactional
public class PaymentService implements IPaymentService{
	@Autowired
	private PaymentDao paymentDao;

	//add a new payment
	public boolean addPayment(Payment payment) {
		paymentDao.save(payment);
		return true;
	}

	//update the payment
	public boolean updatePayment(Payment payment) {
		paymentDao.save(payment);
		return true;
	}

	//delete the payment
	public boolean deletePayment(Payment payment) {
		paymentDao.delete(payment);
		return true;
	}

	//get all payments
	public List<Payment> getAllPayment() {
		return (List<Payment>) paymentDao.findAll();
	}
}
