package systemEvaluation;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField name_textField;
	private JTextField last_name_textField;
	private JTextField textField;
	private JPasswordField passwordField;

	
	public Register() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\natal\\OneDrive\\Pictures\\flyers\\ec18b863896963.5ac177847630c.png"));
		setTitle("Registro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-7, 0, 1920, 1200);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setForeground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel name_label = new JLabel("Nombre");
		name_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		name_label.setHorizontalAlignment(SwingConstants.LEFT);
		name_label.setBounds(663, 308, 185, 14);
		contentPane.add(name_label);
		
		JLabel last_name_lblNewLabel = new JLabel("Apellido");
		last_name_lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		last_name_lblNewLabel.setBounds(663, 369, 92, 17);
		contentPane.add(last_name_lblNewLabel);
		
		name_textField = new JTextField();
		name_textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		name_textField.setBounds(910, 298, 226, 34);
		contentPane.add(name_textField);
		name_textField.setColumns(10);
		
		last_name_textField = new JTextField();
		last_name_textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		last_name_textField.setBounds(910, 360, 226, 34);
		contentPane.add(last_name_textField);
		last_name_textField.setColumns(10);
		
		JButton register_btnNewButton = new JButton("Registrarse");
		register_btnNewButton.setForeground(Color.BLACK);
		register_btnNewButton.setBackground(Color.GREEN);
		register_btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		register_btnNewButton.setBounds(820, 546, 226, 54);
		contentPane.add(register_btnNewButton);
		register_btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String ID = textField.getText();
				String pass = passwordField.getText();
				String name = name_textField.getText();
				String lastName = last_name_textField.getText(); 
				
				fileManager  file = new fileManager();
			    file.register(ID, pass, name, lastName);
			    dispose();
			    LogIn l = new LogIn();
			    l.frame.setVisible(true);
			}
		});
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setBounds(910, 414, 226, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel numeroDeFacultad_lblNewLabel = new JLabel("Numero de Facultad");
		numeroDeFacultad_lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		numeroDeFacultad_lblNewLabel.setBounds(663, 424, 202, 14);
		contentPane.add(numeroDeFacultad_lblNewLabel);
		
		JLabel titulo_lblNewLabel = new JLabel("Registro");
		titulo_lblNewLabel.setForeground(Color.GRAY);
		titulo_lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 82));
		titulo_lblNewLabel.setBounds(728, 93, 620, 170);
		contentPane.add(titulo_lblNewLabel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\natal\\OneDrive\\Pictures\\flyers\\logo-interamericana.png"));
		lblNewLabel.setBounds(330, 613, 1475, 403);
		contentPane.add(lblNewLabel);
		
		JLabel password_lblNewLabel = new JLabel("Contrase\u00F1a");
		password_lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		password_lblNewLabel.setBounds(663, 480, 202, 14);
		contentPane.add(password_lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(910, 472, 226, 34);
		contentPane.add(passwordField);
	}
}
