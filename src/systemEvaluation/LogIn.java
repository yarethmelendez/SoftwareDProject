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
	static String userName;

	public LogIn() {
		initialize();

	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		double [] valen = new double[54];
		valen[0] = 16;
		valen[1] = 12;
		valen[2] = 8;
		valen[3] = 6;
		valen[4] = 6;
		valen[5] = 9;
		valen[6] = 10;

		// Servicio a la institucion
		valen[7] = 3;
		valen[8] = 4;
		valen[9] = 2;
		valen[10] = 3;

		// Servicio a la comunidad
		valen[11] = 2;

		// Investigacion y trabajo creativo
		valen[12] = 2;
		valen[13] = 4;
		valen[14] = 4;

		// Crecimiento y desarrollo profesional
		valen[15] = 3;
		valen[16] = 3;
		valen[17] = 3;

		valen[18] = 15;
		valen[19] = 10;
		valen[20] = 10;
		valen[21] = 6;
		valen[22] = 7;
		valen[23] = 9;
		valen[24] = 8;

		// Servicio a la institucion
		valen[25] = 3;
		valen[26] = 3;
		valen[27] = 2;
		valen[28] = 3;

		// Servicio a la comunidad
		valen[29] = 2;

		// Investigacion y trabajo creativo
		valen[30] = 3;
		valen[31] = 4;
		valen[32] = 5;

		// Crecimiento y desarrollo profesional
		valen[33] = 4;
		valen[34] = 3;
		valen[35] = 3;

		// Calidad docente
		valen[36] = 13;
		valen[37] = 10;
		valen[38] = 12;
		valen[39] = 6;
		valen[40] = 5;
		valen[41] = 9;
		valen[42] = 8;

		// Servicio a la institucion
		valen[43] = 2;
		valen[44] = 3;
		valen[45] = 2;
		valen[46]= 2;

		// Servicio a la comunidad
		valen[47] = 2;

		// Investigacion y trabajo creativo
		valen[48] = 5;
		valen[49] = 5;
		valen[50] = 4;

		// Crecimiento y desarrollo profesional
		valen[51] = 4;
		valen[52] = 4;
		valen[53] = 4;

		ValenciasRango.setValen(valen);


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
		titulo_label.setBounds(646, 193, 643, 34);

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
		passwordLabel.setBounds(708, 484, 179, 16);
		panel_1.add(passwordLabel);


		JButton botonInicioSesion = new JButton("Iniciar Sesi\u00F3n");
		botonInicioSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {


				userName = numeroFacultad_textField.getText();
				String test = userName;
				String pass = passwordField.getText();
				int found = 0;

				MainMenu m = new MainMenu();

				fileManager  file = new fileManager();
				found =	file.login(getID(), pass);


				if (found == 1) {
					frame.setVisible(false);
					MainMenu e = new MainMenu();
					e.setVisible(true);

				}
			}
		});
		botonInicioSesion.setFont(new Font("Tahoma", Font.BOLD, 14));
		botonInicioSesion.setBounds(873, 567, 172, 29);
		panel_1.add(botonInicioSesion);

		JButton botonRegistrarse = new JButton("Registrarse");
		botonRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				Register w = new Register();
				w.setVisible(true);

			}
		});
		botonRegistrarse.setFont(new Font("Tahoma", Font.BOLD, 14));
		botonRegistrarse.setBounds(873, 631, 172, 29);
		panel_1.add(botonRegistrarse);
	}

	public String getID() {
		return userName;

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}

