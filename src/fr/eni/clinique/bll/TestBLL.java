package fr.eni.clinique.bll;

import fr.eni.clinique.dal.DALException;
import fr.eni.clinique.dal.DAOAuthentification;
import fr.eni.clinique.dal.DAOFactory;

public class TestBLL {
	static String nom = "efrgomooommmrpb";
	static String pass = "12o34";
	static Boolean access;
	
	public static void main(String[] args) throws BLLException {
		LoginMger login = LoginMger.getInstance();
		DAOAuthentification loginDAO = DAOFactory.getDAOAuthentification();
		try {
			boolean connexionEtat = loginDAO.selectbyMDP(nom, pass);

			if (connexionEtat == true) {
				System.out.println("Connexion accept�e!");
			}
			else {
				System.out.println("Connexion refus�e!");
			}
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
