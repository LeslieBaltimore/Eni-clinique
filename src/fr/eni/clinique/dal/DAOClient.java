package fr.eni.clinique.dal;

import java.util.List;

import fr.eni.clinique.bo.Client;

public interface DAOClient extends DAO<Client>{
	
	public abstract List<Client> rechercherClient(String recherche) throws DALException;


}
