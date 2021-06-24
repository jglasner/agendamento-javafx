package model.dao;

import db.DB;
import model.dao.impl.ClienteDaoJDBC;

public class DaoFactory {
	
	public static ClienteDao createClienteDao() {
		return new ClienteDaoJDBC(DB.getConnection());
	}
}
