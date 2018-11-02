package fr.utbm.ecommerce.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.utbm.ecommerce.dto.Payment;

public interface PaymentDao extends CrudRepository<Payment,Integer>{
	Payment addPayment(Payment payment);
	Payment updatePayment(Payment payment);
	void deletePayment(Payment payment);
	List<Payment> getAllPayment();
}
