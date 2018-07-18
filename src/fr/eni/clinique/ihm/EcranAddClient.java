package fr.eni.clinique.ihm;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import fr.eni.clinique.dal.DALException;
import fr.eni.clinique.dal.DAOFactory;
import fr.eni.clinique.dal.DAOPersonnel;

public class EcranAddClient extends JFrame {

	private JTextField textCode;
	private JTextField textNom;
	private JTextField textPrenom;
	private JTextField textAdresse1;
	private JTextField textAdresse2;
	private JTextField textCodePostal;
	private JTextField textVille;
	private JLabel labelCode;
	private JLabel labelNom;
	private JLabel labelPrenom;
	private JLabel labelAdresse1;
	private JLabel labelAdresse2;
	private JLabel labelCodePostal;
	private JLabel labelVille;

	private JButton validerButton;
	private String login;
	private String pass;
	private Boolean testLogin;

	public JButton getValiderButton() {
		if (validerButton == null) {
			validerButton = new JButton("Ok");
			validerButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
				}
			});
		}
		return validerButton;
	}
	

	// texte field
	public JTextField getTextCode() {
		if (textCode == null) {
			textCode = new JTextField(20);
		}
		return textCode;
	}

	public JTextField getTextNom() {
		if (textNom == null) {
			textNom = new JTextField(20);
		}
		return textNom;
	}

	public JTextField getTextPrenom() {
		if (textPrenom == null) {
			textPrenom = new JTextField(20);
		}
		return textPrenom;
	}
	
	public JTextField getTextAdresse1() {
		if (textAdresse1 == null) {
			textAdresse1 = new JTextField(20);
		}
		return textAdresse1;
	}
	
	public JTextField getTextAdresse2() {
		if (textAdresse2 == null) {
			textAdresse2 = new JTextField(20);
		}
		return textAdresse2;
	}
	
	public JTextField getTextCodePostal() {
		if (textCodePostal == null) {
			textCodePostal = new JTextField(20);
		}
		return textCodePostal;
	}
	
	public JTextField getTextVille() {
		if (textVille == null) {
			textVille = new JTextField(20);
		}
		return textVille;
	}
	
	// label
	public JLabel getLabelCode() {
		if (labelCode == null) {
			labelCode = new JLabel("Code: ");
		}
		return labelCode;
	}
	
	public JLabel getLabelNom() {
		if (labelNom == null) {
			labelNom = new JLabel("Nom: ");
		}
		return labelNom;
	}
	
	public JLabel getLabelPrenom() {
		if (labelPrenom == null) {
			labelPrenom = new JLabel("Prenom: ");
		}
		return labelPrenom;
	}
	
	public JLabel getLabelAdresse1() {
		if (labelAdresse1 == null) {
			labelAdresse1 = new JLabel("Adresse: ");
		}
		return labelAdresse1;
	}
	
	public JLabel getLabelCodePostal() {
		if (labelCodePostal == null) {
			labelCodePostal = new JLabel("Code postal: ");
		}
		return labelCodePostal;
	}
	
	public JLabel getLabelVille() {
		if (labelVille == null) {
			labelVille = new JLabel("Ville: ");
		}
		return labelVille;
	}
	


	public EcranAddClient() {
		super();
		initIhm();
	}

	private void initIhm() {
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setLayout(new GridBagLayout());
		panelPrincipal.setOpaque(false);
		GridBagConstraints gbc = new GridBagConstraints();

		// login
		gbc.gridx = 0;
		gbc.gridy = 0;
		panelPrincipal.add(getLabelCode(), gbc);
		gbc.gridx = 1;
		gbc.gridy = 0;
		panelPrincipal.add(getTextCode(), gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		panelPrincipal.add(getLabelNom(), gbc);
		gbc.gridx = 1;
		gbc.gridy = 1;
		panelPrincipal.add(getTextNom(), gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		gbc.anchor = GridBagConstraints.EAST;
		panelPrincipal.add(getValiderButton(), gbc);
		this.setContentPane(panelPrincipal);

	}
}