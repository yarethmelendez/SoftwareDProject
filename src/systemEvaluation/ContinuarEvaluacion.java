package systemEvaluation;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class ContinuarEvaluacion extends JFrame {


	private JPanel contentPane;
	private JButton btnNewButton;
	private JTextField textField;
	private JTextField textField_1;
	LogIn user = new LogIn();
	String User = user.getID();
	static String IDEBox;
	
	public ContinuarEvaluacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-7, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblSelecionaUnaEvaluacion = new JLabel("Seleciona una Evaluacion para Continuar");
		lblSelecionaUnaEvaluacion.setBounds(643, 66, 1590, 74);
		lblSelecionaUnaEvaluacion.setFont(new Font("Tahoma", Font.BOLD, 30));
		contentPane.add(lblSelecionaUnaEvaluacion);



		btnNewButton = new JButton("Retroceder ");
		btnNewButton.setBounds(1081, 901, 145, 46);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				MainMenu i = new MainMenu();
				i.setVisible(true);
				dispose(); 

			}

		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(btnNewButton);

		JButton btnCargar = new JButton("Cargar");
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				IDEBox = textField.getText();
				String[] ag = new String[164] ;

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

				
				Evaluation i ;
				try {
					 i = new Evaluation();
					 
					 for(int h = 0; h <size ;h++) {

							fileManager continuar = new fileManager();
							ag = continuar.combobox(User,h);
							System.out.print(ag[12]+ "owowowowowowowowowowowowo");
							

							if ( Integer.parseInt(IDEBox) > 0 && IDEBox.trim().equals(ag[12])) {
								
								i.comboboxItems(User, Integer.parseInt(IDEBox));
								i.setVisible(true);
								dispose();
								}
						}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
				
				
				
			}
		});
		btnCargar.setBounds(745, 901, 145, 46);
		btnCargar.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(btnCargar);
		
		

		textField = new JTextField();
		textField.setBounds(581, 901, 124, 46);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("Escoge el numero de evaluacion");
		lblNewLabel.setBounds(540, 872, 213, 25);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblNewLabel);

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
	public String getIDEBox() {
		return IDEBox;
		
	}
}



