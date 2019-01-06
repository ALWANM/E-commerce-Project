package fr.utbm.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.utbm.ecommerce.dto.Payment;
@Repository
public interface PaymentDao extends CrudRepository<Payment, Integer> {
	 
}
