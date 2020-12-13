package systemEvaluation;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class BorrarEvaluacion extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton btnNewButton;


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
		
		table = new JTable();
		table.setBounds(447, 164, 1028, 666);
		contentPane.add(table);
		
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
		btnCargar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCargar.setBounds(745, 901, 145, 46);
		contentPane.add(btnCargar);
	}
}