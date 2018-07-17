package fr.eni.clinique.dal;

import fr.eni.clinique.bo.Personnel;
import fr.eni.clinique.dal.jdbc.PersonnelDAOJdbcImpl;

public class DAOFactory {
	public static DAO<Personnel> getPersonnelDAO() {
		DAO<Personnel> personnelDAO = new PersonnelDAOJdbcImpl();
		return personnelDAO;
	}
	
	public static DAOAuthentification getDAOAuthentification() {
		DAOAuthentification personnelDAO = new PersonnelDAOJdbcImpl();
		return personnelDAO;
	}


}