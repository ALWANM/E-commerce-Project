package fr.utbm.ecommerce.dao;

import java.util.List;

import fr.utbm.ecommerce.dto.Customer;

public interface CustomerDAO {
	public Customer getById(int id);
	public Customer getByMail(String mail);
	public List<Customer> getAll();
	public List<Customer> getByCountry(String country);
	public List<Customer> getByGender(String gender);
	public Boolean add(Customer customer);
	public Boolean update(Customer customer);
	public Boolean deleteAll();
	public Boolean DeleteById(int id);
}
