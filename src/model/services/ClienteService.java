package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.ClienteDao;
import model.entities.Cliente;

public class ClienteService {

	private ClienteDao dao = DaoFactory.createClienteDao();
	
	public List<Cliente> findAll() {
		return dao.findAll();
	}
	
	public void saveOrUpdate(Cliente obj) {
		if (obj.getId() == null) {
			dao.insert(obj);
		}
		else {
			dao.update(obj);
		}
	}
	
	public void remove(Cliente obj) {
		dao.deleteById(obj.getId());
	}
}
