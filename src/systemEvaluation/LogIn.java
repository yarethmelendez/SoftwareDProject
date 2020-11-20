package systemEvaluation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//import register;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LogIn implements ActionListener{

	public JFrame frame;
	private JLabel titulo_label;
	private JPasswordField passwordField;
	private JTextField numeroFacultad_textField;
	private JLabel lblNewLabel_3;
	private JButton btnNewButton;

	
	public LogIn() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		


		frame = new JFrame();
		frame.setBackground(Color.GREEN);
		frame.setBounds(-7, 0, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.BLUE);
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(60, 179, 113));
		panel_1.setForeground(new Color(60, 179, 113));
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		titulo_label = new JLabel("Sistema de Evaluacion de Facultad");
		titulo_label.setForeground(new Color(255, 215, 0));
		panel_1.add(titulo_label);
		titulo_label.setFont(new Font("Times New Roman", Font.BOLD, 41));
		titulo_label.setBounds(655, 193, 643, 34);
		
		JLabel iniciarSesion = new JLabel("Iniciar Sesi\u00F3n");
		iniciarSesion.setFont(new Font("Times New Roman", Font.BOLD, 25));
		iniciarSesion.setBounds(873, 337, 185, 25);
		panel_1.add(iniciarSesion);
		
		//Password input
		passwordField = new JPasswordField();
		passwordField.setBounds(941, 480, 185, 25);
		panel_1.add(passwordField);
		
		// Username input
		numeroFacultad_textField = new JTextField();
		numeroFacultad_textField.setBounds(941, 415, 185, 26);
		panel_1.add(numeroFacultad_textField);
		numeroFacultad_textField.setColumns(10);
		
		JLabel numeroFacultad = new JLabel("Numero de Facultad");
		numeroFacultad.setFont(new Font("Tahoma", Font.BOLD, 16));
		numeroFacultad.setBounds(708, 420, 191, 16);
		panel_1.add(numeroFacultad);
		
		JLabel passwordLabel = new JLabel("Contrase\u00F1a");
		passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		passwordLabel.setBounds(691, 484, 179, 16);
		panel_1.add(passwordLabel);
		

		JButton botonInicioSesion = new JButton("Iniciar Sesi\u00F3n");
		botonInicioSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				
				String userName = numeroFacultad_textField.getText();
				String pass = passwordField.getText();
				int found = 0;
			
		MainMenu m = new MainMenu();
				
			fileManager  file = new fileManager();
			found =	file.login(userName, pass);
				
		 
				if (found == 1) {
					frame.setVisible(false);
					
					
				}
			}
		});
		botonInicioSesion.setFont(new Font("Tahoma", Font.BOLD, 14));
		botonInicioSesion.setBounds(873, 567, 172, 29);
		panel_1.add(botonInicioSesion);
		
		JButton botonRegistrarse = new JButton("Registrarse");
		botonRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Register w = new Register();
				w.setVisible(true);
			}
		});
		botonRegistrarse.setFont(new Font("Tahoma", Font.BOLD, 14));
		botonRegistrarse.setBounds(873, 631, 172, 29);
		panel_1.add(botonRegistrarse);
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}

