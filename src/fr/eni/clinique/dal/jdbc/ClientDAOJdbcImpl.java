package fr.eni.clinique.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import fr.eni.clinique.bo.Client;
import fr.eni.clinique.bo.Personnel;
import fr.eni.clinique.dal.DALException;
import fr.eni.clinique.dal.DAO;

public class ClientDAOJdbcImpl implements DAO<Client> {
	
	//private static final String sqlSelectAllInfosPersonnel = "SELECT CodePers,Nom ,Prenom, MotPasse ,Role FROM Personnels";
	private static final String sqlInsertClient= "insert into Clients (NomClient ,PrenomClient,Adresse1,Adresse2 ,CodePostal ,Ville,NumTel,Assurance,Email,Remarque,Archive) values(?,?,?,?,?,?,?,?,?,?,?)";
	//private static final String sqlSuppressionPersonnel = "UPDATE Personnels SET Archive= ? WHERE Nom= ?";
	//private static final String sqlSelectByMDP = "SELECT role FROM Personnels WHERE Nom=? AND MotPasse=?";
	//private static final String sqlMiseAJourMDP = "update Personnels set MotPasse=? where Nom=?";
	
	

	@Override
	public Client selectbyID(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Client client) throws DALException {
		Connection cnx = null;
		PreparedStatement rqt = null;
		ResultSet rs = null;

		try {
			cnx = JdbcTools.getConnection();
			rqt = cnx.prepareStatement(sqlInsertClient,Statement.RETURN_GENERATED_KEYS);
	 
			String nom = client.getNomClient();
			String prenom = client.getPrenomClient();
			String adresse1 = client.getAdresse1();
			String adresse2 = client.getAdresse2();
			String codePostal = client.getCodePostal();
			String ville = client.getVille();
			String num = client.getNumTel();
			String assurance = client.getAssurance();
			String email = client.getEmail();
			String remarque = client.getRemarque();
			Boolean archive = client.getArchive();
			
		
			
	
			rqt.setString(1, nom);
			rqt.setString(2, prenom);
			rqt.setString(3, adresse1);
			rqt.setString(4, adresse2);
			rqt.setString(5, codePostal);
			rqt.setString(6, ville);
			rqt.setString(7, num);
			rqt.setString(8, assurance);
			rqt.setString(9, email);
			rqt.setString(10, remarque);
			rqt.setBoolean(11, archive);
			
		
			int nbRows = rqt.executeUpdate();
			if(nbRows == 1) {
				// recuperation du tampon
				 rs = rqt.getGeneratedKeys();
				// je vais sur le premier enregistrement s'il existe
				if(rs.next()) {
					client.setCodeClient(rs.getInt(1));
				}
			}
		} catch (SQLException e) {
			//TO DO DALException
			throw new DALException("insertPersonnel failed - " , e);
		} finally {
			try {
				if (rs != null){
				rs.close();
				}
				if (rqt != null){
					rqt.close();
				}
				if(cnx!=null){
					cnx.close();
				}
			} catch (SQLException e) {
				//throw new DALException("close failed " , e);
				e.printStackTrace();
			}
		}	
	}

	@Override
	public List<Client> selectAll() throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client update(Client obj) throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimer(Integer id) throws DALException {
		// TODO Auto-generated method stub
		
	}

}
