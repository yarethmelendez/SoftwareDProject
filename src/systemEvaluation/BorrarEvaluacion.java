package systemEvaluation;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class BorrarEvaluacion extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JTextField textField;
	private JTextField textField_1;
	LogIn user = new LogIn();
	String User = user.getID();
	
	public BorrarEvaluacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-7, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblSelecionaUnaEvaluacion = new JLabel("Seleciona una Evaluacion para Borrar");
		lblSelecionaUnaEvaluacion.setBounds(643, 66, 1590, 74);
		lblSelecionaUnaEvaluacion.setFont(new Font("Tahoma", Font.BOLD, 30));
		contentPane.add(lblSelecionaUnaEvaluacion);

		btnNewButton = new JButton("Retroceder ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				MainMenu i = new MainMenu();
				i.setVisible(true);
				dispose(); 

			}

		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(1081, 901, 145, 46);
		contentPane.add(btnNewButton);

		JButton btnCargar = new JButton("Borrar");
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] ag = new String[163];
				fileManager borrar = new fileManager();
				String IDEBox = textField.getText();
				
				try {
					borrar.borrarEV3(Integer.parseInt(IDEBox));
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnCargar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCargar.setBounds(745, 901, 145, 46);
		contentPane.add(btnCargar);
		
		textField = new JTextField();
		textField.setBounds(581, 901, 124, 46);
		contentPane.add(textField);
		textField.setColumns(10);
		
String[] ag = new String[160];
		
		int j = 40;

		String[] ops;
		File instru;
		int size = 0;

		try {
			instru = new File("./instrumentos.csv");
			Scanner scanner = new Scanner(instru);

			while(scanner.hasNextLine()) {
				String data = scanner.nextLine();
				ops = data.split(",", 170);
				size++;

			}
			scanner.close();


		}catch(Exception ex) {

			System.out.print("404 "+ ex);
		}


		for(int i = 0; i <size ;i++) {

			fileManager continuar = new fileManager();
			ag = continuar.combobox(User,i);

			System.out.println("ID DE Evaluacion"+ag[12]+" "+ag[1]+" "+ag[13]);

			if(ag[1] != null) {
				textField_1 = new JTextField("ID DE Evaluacion"+ag[12]+" "+ag[1]+" "+ag[13]);
				textField_1.setEditable(false);
				textField_1.setBounds(667, j +177, 594, 39);
				contentPane.add(textField_1);
				textField_1.setColumns(10);
				j = j+40;
			}


		}
		
	}
} 