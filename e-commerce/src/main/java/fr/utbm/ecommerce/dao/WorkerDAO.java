package fr.utbm.ecommerce.dao;

import java.util.List;

import fr.utbm.ecommerce.dto.Worker;

public interface WorkerDAO {
	public Worker getById(int id);
	public Worker getByMail(String mail);
	public List<Worker> getAll();
	public Boolean add(Worker Worker);
	public Boolean update(Worker Worker);
	public Boolean deleteAll();
	public Boolean DeleteById(int id);
}
