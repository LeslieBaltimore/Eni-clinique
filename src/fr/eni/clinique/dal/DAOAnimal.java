package fr.eni.clinique.dal;

import java.util.List;

/**
 * Classe en charge de
 * 
 * @author fbaconnais2018
 * @date 23 juil. 2018 - @time 11:08:40 Clinique - Version 1.0
 */
public interface DAOAnimal {

	/**
	 * Fonction en charge de modifier les donn�es d'un animal
	 * 
	 * @param nom
	 * @param sexe
	 * @param couleur
	 * @param race
	 * @param espece
	 * @param tatouage
	 * @param antecedents
	 * @param codeAnimal
	 * @throws DALException
	 */
	public void modifier(String nom, char sexe, String couleur, String race, String espece, String tatouage,
			String antecedents, int codeAnimal) throws DALException;

	/**
	 * Fonction en charge d'archiver un animal (en passant son Archive � True)
	 * 
	 * @param codeClient
	 *            - le code d'un client
	 * @param codeAnimal
	 *            - le code de l'animal que l'on veut archiver
	 * @throws DALException
	 */
	public void supprimerViaCodeClient(int codeClient, int codeAnimal) throws DALException;

	/**
	 * Fonction en charge de faire un select en BDD pour en retirer une liste
	 * 
	 * @return une liste de String contenant toutes les races en base de
	 *         donn�es.
	 * @throws DALException
	 */
	public List<String> getRaceList() throws DALException;

	/**
	 * Fonction en charge de faire un select en BDD pour en retirer une liste
	 * 
	 * @return une liste de String contenant toutes les esp�ces en base de
	 *         donn�es.
	 * @throws DALException
	 */
	public List<String> getEspeceList() throws DALException;
}
