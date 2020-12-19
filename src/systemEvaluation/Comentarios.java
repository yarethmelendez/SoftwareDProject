package systemEvaluation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.awt.event.ActionEvent;

public class Comentarios extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Comentarios frame = new Comentarios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Comentarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(558, 52, 735, 934);
		contentPane.add(scrollPane);
		
		JTextArea txtrComentariosEvidendencia = new JTextArea();
		txtrComentariosEvidendencia.setEditable(false);
		txtrComentariosEvidendencia.setText("                                            Comentarios Evidendencia \r\n\r\n\r\na. Dominio de la disciplina que ense\u00F1a\r\nComentario:\r\n\r\n\r\n\r\n\r\n\r\nb. Habilidad para organizar el contenido y presentarlo en forma clara, l\u00F3gica e \r\nimaginativa\r\nComentario:\r\n\r\n\r\n\r\n\r\n\r\nc. Conocimiento de los desarrollos actuales de la disciplina\r\nComentario:\r\n\r\n\r\n\r\n\r\nd. Habilidad para relacionar la disciplina con otras esferas del conocimiento\r\nComentario:\r\n\r\n\r\n\r\n\r\ne. Habilidad para promover y ampliar el inter\u00E9s del estudiante en la disciplina\r\nComentario:\r\n\r\n\r\n\r\n\r\n\r\nf. Habilidad para desarrollar y utilizar m\u00E9todos y estrategias adecuadas,incluyendo\r\n \u201Cassessment\u201D para una ense\u00F1anza efectiva\r\nComentario:\r\n\r\n\r\n\r\n\r\n\r\n\r\ng. Disponibilidad y eficacia en la orientaci\u00F3n acad\u00E9mica del estudiante\r\nh. Posesi\u00F3n de los atributos de integridad, laboriosidad, liberalidad y objetividad \r\nen la ense\u00F1anza\r\nComentario:");
		scrollPane.setViewportView(txtrComentariosEvidendencia);
		
		JButton btnNewButton = new JButton("Imprimir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {

					txtrComentariosEvidendencia.print();
					}
					catch (PrinterException e1)
					{
					e1.printStackTrace();
					}
			}
		});
		btnNewButton.setBounds(87, 47, 114, 36);
		contentPane.add(btnNewButton);
		
		
		
		
		
		
		
		
		
		
		
	}
}
