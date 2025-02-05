package systemEvaluation;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainMenu extends JFrame implements ActionListener {

	public JPanel contentPane;
	static int type;
	public static void setType(int type) {
		MainMenu.type = type;
	}

	static Boolean continuar = false;
	public MainMenu() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-7, -7, 1920, 1080);
	
		contentPane = new JPanel();
		contentPane.setForeground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton new_evaluation_btnNewButton = new JButton("Crear nueva evaluacion ");
		new_evaluation_btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		new_evaluation_btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Evaluation e = null;
				try {
					e = new Evaluation();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				e.setVisible(true);
				dispose();
				type = 1;
				continuar = false;
			}
		});
		new_evaluation_btnNewButton.setBounds(741, 399, 397, 23);
		contentPane.add(new_evaluation_btnNewButton);

		JButton continue_btnNewButton = new JButton("Continuar evaluacion ");
		continue_btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ContinuarEvaluacion W = new ContinuarEvaluacion();
				W.setVisible(true);
				dispose();
				
				continuar = true;
			}
		});
		continue_btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		continue_btnNewButton.setBounds(741, 469, 397, 23);
		contentPane.add(continue_btnNewButton);

		JButton erase_btnNewButton = new JButton("Borrar data existente");
		erase_btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BorrarEvaluacion e = new BorrarEvaluacion();
				e.setVisible(true);
				dispose();


			}
		});
		erase_btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		erase_btnNewButton.setBounds(741, 504, 397, 23);
		contentPane.add(erase_btnNewButton);

		JButton configurations_btnNewButton = new JButton("Configuraciones");
		configurations_btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Configuraciones c = new Configuraciones();
						c.setVisible(true);
						dispose();
				
			}
		});
		configurations_btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		configurations_btnNewButton.setBounds(741, 538, 397, 23);
		contentPane.add(configurations_btnNewButton);

		JLabel welcome_lblNewLabel = new JLabel("Que le gustaria hacer?");
		welcome_lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		welcome_lblNewLabel.setBounds(821, 336, 210, 23);
		contentPane.add(welcome_lblNewLabel);

		JLabel lblNewLabel = new JLabel("BIENVENIDOS ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 42));
		lblNewLabel.setBounds(775, 242, 364, 42);
		contentPane.add(lblNewLabel);

		JButton Salir_btnNewButton = new JButton("Salir");
		Salir_btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LogIn r = new LogIn();
				r.frame.setVisible(true);
				dispose();	
			}
		});
		Salir_btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		Salir_btnNewButton.setBounds(741, 576, 397, 23);
		contentPane.add(Salir_btnNewButton);
		
		///////////////////////////// BOTON ONLINE /////////////////////////////////////////////////////
		JButton new_evaluation_btnNewButton_1 = new JButton("Crear nueva evaluacion (Clases en linea) ");
		new_evaluation_btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		new_evaluation_btnNewButton_1.setBounds(741, 433, 397, 23);
		contentPane.add(new_evaluation_btnNewButton_1);
		new_evaluation_btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onlineEvaluation e = null;
				try {
					e = new onlineEvaluation();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				e.setVisible(true);
				dispose();
				type = 2;
				continuar = false;
			}
		});
		
		

	}
	public int gettype() {
		return type;
		
	}
	
	public Boolean getContinuar() {
		return continuar;
		
	}

	public void actionPerformed(ActionEvent arg0) {


	}
}
