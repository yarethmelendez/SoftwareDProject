package systemEvaluation;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.io.IOException;
import java.lang.Math;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Results extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Results frame = new Results();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public Results() throws IOException {
		
		
		ValenciasRubrica vr = new ValenciasRubrica();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_44_1_1 = new JLabel("RANGO CATEDR\u00C1TICO");
		lblNewLabel_44_1_1.setBounds(634, 65, 596, 123);
		lblNewLabel_44_1_1.setFont(new Font("Tahoma", Font.BOLD, 50));
		contentPane.add(lblNewLabel_44_1_1);
		
		JLabel lblNewLabel_48_8 = new JLabel("I. Experiencia y Calidad Docente");
		lblNewLabel_48_8.setBounds(334, 220, 389, 41);
		lblNewLabel_48_8.setFont(new Font("Tahoma", Font.BOLD, 22));
		contentPane.add(lblNewLabel_48_8);
		
		JLabel lblNewLabel_48_9 = new JLabel("a. Dominio de la disciplina que ense\u00F1a");
		lblNewLabel_48_9.setBounds(334, 283, 389, 41);
		lblNewLabel_48_9.setFont(new Font("Tahoma", Font.PLAIN, 21));
		contentPane.add(lblNewLabel_48_9);
		
		JLabel lblNewLabel_48_9_1 = new JLabel("b. Habilidad para organizar el contenido y presentarlo en");
		lblNewLabel_48_9_1.setBounds(334, 342, 546, 41);
		lblNewLabel_48_9_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		contentPane.add(lblNewLabel_48_9_1);
		
		JLabel lblNewLabel_48_9_2 = new JLabel("forma clara, l\u00F3gica e imaginativa.");
		lblNewLabel_48_9_2.setBounds(365, 374, 389, 41);
		lblNewLabel_48_9_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		contentPane.add(lblNewLabel_48_9_2);
		
		JLabel lblNewLabel_48_9_3 = new JLabel("c. Conocimiento de los desarrollos actuales de la disciplina.");
		lblNewLabel_48_9_3.setBounds(334, 430, 562, 41);
		lblNewLabel_48_9_3.setFont(new Font("Tahoma", Font.PLAIN, 21));
		contentPane.add(lblNewLabel_48_9_3);
		
		JLabel lblNewLabel_48_9_4 = new JLabel("d. Habilidad para relacionar la disciplina con otras esferas del");
		lblNewLabel_48_9_4.setBounds(334, 482, 583, 41);
		lblNewLabel_48_9_4.setFont(new Font("Tahoma", Font.PLAIN, 21));
		contentPane.add(lblNewLabel_48_9_4);
		
		JLabel lblNewLabel_48_9_5 = new JLabel("conocimiento. ");
		lblNewLabel_48_9_5.setBounds(365, 513, 389, 41);
		lblNewLabel_48_9_5.setFont(new Font("Tahoma", Font.PLAIN, 21));
		contentPane.add(lblNewLabel_48_9_5);
		
		JLabel lblNewLabel_48_9_6 = new JLabel("e. Habilidad para promover y ampliar el inter\u00E9s del estudiante");
		lblNewLabel_48_9_6.setBounds(334, 565, 583, 41);
		lblNewLabel_48_9_6.setFont(new Font("Tahoma", Font.PLAIN, 21));
		contentPane.add(lblNewLabel_48_9_6);
		
		JPanel panel_6_6_1_1_2 = new JPanel();
		panel_6_6_1_1_2.setBounds(10, 199, 1889, 10);
		panel_6_6_1_1_2.setBackground(SystemColor.textInactiveText);
		contentPane.add(panel_6_6_1_1_2);
		
		JPanel panel_6_6_1_1_3 = new JPanel();
		panel_6_6_1_1_3.setBounds(306, 257, 1442, 4);
		panel_6_6_1_1_3.setBackground(SystemColor.textInactiveText);
		contentPane.add(panel_6_6_1_1_3);
		
		JPanel panel_6_6_1_1_3_1 = new JPanel();
		panel_6_6_1_1_3_1.setBounds(306, 335, 1442, 4);
		panel_6_6_1_1_3_1.setBackground(SystemColor.textInactiveText);
		contentPane.add(panel_6_6_1_1_3_1);
		
		JPanel panel_6_6_1_1_3_1_1 = new JPanel();
		panel_6_6_1_1_3_1_1.setBounds(306, 412, 1442, 3);
		panel_6_6_1_1_3_1_1.setBackground(SystemColor.textInactiveText);
		contentPane.add(panel_6_6_1_1_3_1_1);
		
		JPanel panel_6_6_1_1_3_1_2 = new JPanel();
		panel_6_6_1_1_3_1_2.setBounds(306, 550, 1442, 4);
		panel_6_6_1_1_3_1_2.setBackground(SystemColor.textInactiveText);
		contentPane.add(panel_6_6_1_1_3_1_2);
		
		JPanel panel_6_6_1_1_3_1_3 = new JPanel();
		panel_6_6_1_1_3_1_3.setBounds(306, 482, 1442, 4);
		panel_6_6_1_1_3_1_3.setBackground(SystemColor.textInactiveText);
		contentPane.add(panel_6_6_1_1_3_1_3);
		
		JPanel panel_6_6_1_1_3_1_4 = new JPanel();
		panel_6_6_1_1_3_1_4.setBounds(306, 641, 1442, 4);
		panel_6_6_1_1_3_1_4.setBackground(SystemColor.textInactiveText);
		contentPane.add(panel_6_6_1_1_3_1_4);
		
		JLabel lblNewLabel_48_9_7 = new JLabel("en la disciplina.");
		lblNewLabel_48_9_7.setBounds(365, 589, 389, 41);
		lblNewLabel_48_9_7.setFont(new Font("Tahoma", Font.PLAIN, 21));
		contentPane.add(lblNewLabel_48_9_7);
		
		JLabel lblNewLabel_48_9_8 = new JLabel("f. Habilidad para desarrollar y utilizar m\u00E9todos y estrategias adecuadas,");
		lblNewLabel_48_9_8.setBounds(334, 659, 728, 41);
		lblNewLabel_48_9_8.setFont(new Font("Tahoma", Font.PLAIN, 21));
		contentPane.add(lblNewLabel_48_9_8);
		
		JLabel lblNewLabel_48_9_9 = new JLabel(" incluyendo el \u201Cassessment\u201D para una ense\u00F1anza efectiva.");
		lblNewLabel_48_9_9.setBounds(349, 683, 571, 41);
		lblNewLabel_48_9_9.setFont(new Font("Tahoma", Font.PLAIN, 21));
		contentPane.add(lblNewLabel_48_9_9);
		
		JLabel lblNewLabel_48_9_10 = new JLabel("g. Disponibilidad y eficacia en la orientaci\u00F3n acad\u00E9mica del ");
		lblNewLabel_48_9_10.setBounds(334, 750, 675, 41);
		lblNewLabel_48_9_10.setFont(new Font("Tahoma", Font.PLAIN, 21));
		contentPane.add(lblNewLabel_48_9_10);
		
		JLabel lblNewLabel_48_9_11 = new JLabel("estudiante.");
		lblNewLabel_48_9_11.setBounds(365, 785, 389, 34);
		lblNewLabel_48_9_11.setFont(new Font("Tahoma", Font.PLAIN, 21));
		contentPane.add(lblNewLabel_48_9_11);
		
		JLabel lblNewLabel_48_9_12 = new JLabel("h. Posesi\u00F3n de los atributos de integridad, laboriosidad, liberalidad y ");
		lblNewLabel_48_9_12.setBounds(334, 817, 710, 41);
		lblNewLabel_48_9_12.setFont(new Font("Tahoma", Font.PLAIN, 21));
		contentPane.add(lblNewLabel_48_9_12);
		
		JLabel lblNewLabel_48_9_13 = new JLabel("objetividad en la ense\u00F1anza");
		lblNewLabel_48_9_13.setBounds(365, 845, 389, 41);
		lblNewLabel_48_9_13.setFont(new Font("Tahoma", Font.PLAIN, 21));
		contentPane.add(lblNewLabel_48_9_13);
		
		JPanel panel_6_6_1_1_3_1_4_1 = new JPanel();
		panel_6_6_1_1_3_1_4_1.setBounds(306, 735, 1442, 4);
		panel_6_6_1_1_3_1_4_1.setBackground(SystemColor.textInactiveText);
		contentPane.add(panel_6_6_1_1_3_1_4_1);
		
		JPanel panel_6_6_1_1_3_1_4_2 = new JPanel();
		panel_6_6_1_1_3_1_4_2.setBounds(295, 815, 843, 4);
		panel_6_6_1_1_3_1_4_2.setBackground(SystemColor.textInactiveText);
		contentPane.add(panel_6_6_1_1_3_1_4_2);
		
		JPanel panel_6_6_1_1_3_1_4_3 = new JPanel();
		panel_6_6_1_1_3_1_4_3.setBounds(306, 882, 1442, 4);
		panel_6_6_1_1_3_1_4_3.setBackground(SystemColor.textInactiveText);
		contentPane.add(panel_6_6_1_1_3_1_4_3);
		
		JPanel panel_6_6_1_1_3_2 = new JPanel();
		panel_6_6_1_1_3_2.setBounds(295, 207, 17, 742);
		panel_6_6_1_1_3_2.setBackground(SystemColor.textInactiveText);
		contentPane.add(panel_6_6_1_1_3_2);
		
		JPanel panel_6_6_1_1_3_2_1 = new JPanel();
		panel_6_6_1_1_3_2_1.setBounds(1744, 199, 17, 750);
		panel_6_6_1_1_3_2_1.setBackground(SystemColor.textInactiveText);
		contentPane.add(panel_6_6_1_1_3_2_1);
		
		JPanel panel_6_6_1_1_3_2_2 = new JPanel();
		panel_6_6_1_1_3_2_2.setBounds(1133, 207, 10, 742);
		panel_6_6_1_1_3_2_2.setBackground(SystemColor.textInactiveText);
		contentPane.add(panel_6_6_1_1_3_2_2);
		
		JLabel lblNewLabel_48_8_1 = new JLabel("Catedr\u00E1tico \rValencia (63%)");
		lblNewLabel_48_8_1.setBounds(1159, 219, 317, 41);
		lblNewLabel_48_8_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		contentPane.add(lblNewLabel_48_8_1);
		
		JPanel panel_6_6_1_1_3_2_2_1 = new JPanel();
		panel_6_6_1_1_3_2_2_1.setBounds(1486, 207, 10, 742);
		panel_6_6_1_1_3_2_2_1.setBackground(SystemColor.textInactiveText);
		contentPane.add(panel_6_6_1_1_3_2_2_1);
		
		JLabel lblNewLabel_48_8_1_1 = new JLabel("Puntuaci\u00F3n obtenida");
		lblNewLabel_48_8_1_1.setBounds(1506, 220, 317, 41);
		lblNewLabel_48_8_1_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		contentPane.add(lblNewLabel_48_8_1_1);
		
		JLabel lblNewLabel_48_9_14 = new JLabel("13");
		lblNewLabel_48_9_14.setBounds(1287, 283, 37, 41);
		lblNewLabel_48_9_14.setFont(new Font("Tahoma", Font.PLAIN, 21));
		contentPane.add(lblNewLabel_48_9_14);
		
		JLabel lblNewLabel_48_9_14_1 = new JLabel("10");
		lblNewLabel_48_9_14_1.setBounds(1287, 359, 37, 41);
		lblNewLabel_48_9_14_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		contentPane.add(lblNewLabel_48_9_14_1);
		
		JLabel lblNewLabel_48_9_14_2 = new JLabel("12");
		lblNewLabel_48_9_14_2.setBounds(1287, 430, 37, 41);
		lblNewLabel_48_9_14_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		contentPane.add(lblNewLabel_48_9_14_2);
		
		JLabel lblNewLabel_48_9_14_3 = new JLabel("6");
		lblNewLabel_48_9_14_3.setBounds(1287, 498, 17, 41);
		lblNewLabel_48_9_14_3.setFont(new Font("Tahoma", Font.PLAIN, 21));
		contentPane.add(lblNewLabel_48_9_14_3);
		
		JLabel lblNewLabel_48_9_14_4 = new JLabel("5");
		lblNewLabel_48_9_14_4.setBounds(1287, 582, 37, 41);
		lblNewLabel_48_9_14_4.setFont(new Font("Tahoma", Font.PLAIN, 21));
		contentPane.add(lblNewLabel_48_9_14_4);
		
		JLabel lblNewLabel_48_9_14_5 = new JLabel("9");
		lblNewLabel_48_9_14_5.setBounds(1287, 673, 37, 41);
		lblNewLabel_48_9_14_5.setFont(new Font("Tahoma", Font.PLAIN, 21));
		contentPane.add(lblNewLabel_48_9_14_5);
		
		JLabel lblNewLabel_48_9_14_6 = new JLabel("8");
		lblNewLabel_48_9_14_6.setBounds(1287, 324, 1894, 1026);
		lblNewLabel_48_9_14_6.setFont(new Font("Tahoma", Font.PLAIN, 21));
		contentPane.add(lblNewLabel_48_9_14_6);
		
		JPanel panel_6_6_1_1_3_1_4_3_1 = new JPanel();
		panel_6_6_1_1_3_1_4_3_1.setBackground(SystemColor.textInactiveText);
		panel_6_6_1_1_3_1_4_3_1.setBounds(306, 945, 1442, 4);
		contentPane.add(panel_6_6_1_1_3_1_4_3_1);
		
		JTextField textField = new JTextField(""+Math.round(vr.CalidadDocente(1,0)[0]));
		textField.setEditable(false);
		textField.setBounds(1555, 283, 115, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextField textField_1 = new JTextField(""+Math.round(vr.CalidadDocente(1,0)[0]));
		textField_1.setColumns(10);
		textField_1.setBounds(1555, 356, 115, 34);
		contentPane.add(textField_1);
		
		JTextField textField_2 = new JTextField(""+Math.round(vr.CalidadDocente(1,0)[1]));
		textField_2.setColumns(10);
		textField_2.setBounds(1555, 430, 115, 34);
		contentPane.add(textField_2);
		
		JTextField textField_3 = new JTextField(""+Math.round(vr.CalidadDocente(1,0)[2]));
		textField_3.setColumns(10);
		textField_3.setBounds(1555, 505, 115, 34);
		contentPane.add(textField_3);
		
		JTextField textField_4 = new JTextField(""+Math.round(vr.CalidadDocente(1,0)[3]));
		textField_4.setColumns(10);
		textField_4.setBounds(1555, 579, 115, 34);
		contentPane.add(textField_4);
		
		JTextField textField_5 = new JTextField(""+Math.round(vr.CalidadDocente(1,0)[4]));
		textField_5.setColumns(10);
		textField_5.setBounds(1555, 673, 115, 34);
		contentPane.add(textField_5);
		
		JTextField textField_6 = new JTextField(""+Math.round(vr.CalidadDocente(1,0)[5]));
		textField_6.setColumns(10);
		textField_6.setBounds(1555, 796, 115, 34);
		contentPane.add(textField_6);
		
		JTextField textField_7 = new JTextField(""+Math.round(vr.CalidadDocente(1,0)[6]));
		textField_7.setColumns(10);
		textField_7.setBounds(1555, 900, 115, 34);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel_48_9_12_1 = new JLabel("Resultados");
		lblNewLabel_48_9_12_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_9_12_1.setBounds(365, 897, 115, 41);
		contentPane.add(lblNewLabel_48_9_12_1);
		
		JLabel lblNewLabel = new JLabel("63%");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(1287, 401, 1894, 1026);
		contentPane.add(lblNewLabel);
	}

}
