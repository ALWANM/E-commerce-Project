package fr.utbm.ecommerce.dao;
import fr.utbm.ecommerce.dto.Admin;

public interface AdminDAO {
	public Admin getById(int id);
	public Admin getByName(String firstname, String lastname);
	public Boolean update(Admin admin);
	public Boolean delete(Admin admin);
	public Boolean deleteById(int id);
	public Boolean add(Admin admin);
}
