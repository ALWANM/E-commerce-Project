package fr.utbm.ecommerce.iservice;

import java.util.List;

import fr.utbm.ecommerce.dto.Payment;

/**
 * Interface Payment Service
 *
 */
public interface IPaymentService   {
	/**
	 * Creates a new payment
	 * @param payment the payment
	 * @return boolean
	 */
	boolean addPayment(Payment payment);
	/**
	 * Updates a payment
	 * @param payment the payment
	 * @return boolean
	 */
	boolean updatePayment(Payment payment);
	/**
	 * Deletes the payment
	 * @param payment the payment
	 * @return boolean
	 */
	boolean deletePayment(Payment payment);
	/**
	 * Gets all payments
	 * @return a list of payment
	 */
	List<Payment> getAllPayment();
}
