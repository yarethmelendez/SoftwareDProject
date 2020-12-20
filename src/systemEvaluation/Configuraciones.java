package systemEvaluation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Configuraciones extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private JTextField textField_64;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_68;
	private JTextField textField_69;
	private JTextField textField_70;
	private JTextField textField_71;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Configuraciones frame = new Configuraciones();
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
	public Configuraciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane_2, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane_2.addTab("Catedratico", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Catedratico");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setBounds(780, 40, 300, 95);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Calidad Docente");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(132, 226, 147, 71);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("A");
		lblNewLabel_2.setBounds(90, 295, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("B");
		lblNewLabel_3.setBounds(90, 344, 46, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("C");
		lblNewLabel_4.setBounds(90, 395, 46, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("D");
		lblNewLabel_5.setBounds(90, 450, 46, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("E");
		lblNewLabel_6.setBounds(90, 503, 46, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("GH");
		lblNewLabel_7.setBounds(90, 589, 46, 14);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_1_1 = new JLabel("Servicio a la Institucion");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(385, 226, 211, 71);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("A");
		lblNewLabel_2_1.setBounds(385, 295, 46, 14);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("BC");
		lblNewLabel_3_1.setBounds(385, 344, 46, 14);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("DE");
		lblNewLabel_5_1.setBounds(385, 395, 46, 14);
		panel.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("F");
		lblNewLabel_5_2.setBounds(90, 547, 46, 14);
		panel.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_8 = new JLabel("FG");
		lblNewLabel_8.setBounds(385, 450, 46, 14);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Servicio a la Comunidad");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1_1.setBounds(697, 226, 211, 71);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("AB");
		lblNewLabel_3_1_1.setBounds(729, 295, 46, 14);
		panel.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Investigacion y Trabajo Creativo");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1_1_1.setBounds(974, 226, 293, 71);
		panel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_9 = new JLabel("A");
		lblNewLabel_9.setBounds(1019, 295, 27, 14);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("B");
		lblNewLabel_10.setBounds(1019, 344, 46, 14);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("CDE");
		lblNewLabel_11.setBounds(1019, 395, 46, 14);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Crecimiento y Desarrollo Profesional");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1_1_1_1.setBounds(1402, 226, 342, 71);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_12 = new JLabel("ABC");
		lblNewLabel_12.setBounds(1456, 295, 46, 14);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("D");
		lblNewLabel_13.setBounds(1456, 344, 46, 14);
		panel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("EF");
		lblNewLabel_14.setBounds(1456, 395, 46, 14);
		panel.add(lblNewLabel_14);
		
		textField = new JTextField();
		textField.setBounds(146, 292, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(146, 341, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(146, 392, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(146, 447, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(146, 500, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(146, 544, 86, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(146, 586, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(432, 292, 86, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(432, 341, 86, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(432, 392, 86, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(432, 447, 86, 20);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(780, 292, 86, 20);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(1098, 292, 86, 20);
		panel.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(1098, 341, 86, 20);
		panel.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(1098, 392, 86, 20);
		panel.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(1579, 292, 86, 20);
		panel.add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(1579, 341, 86, 20);
		panel.add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setBounds(1579, 389, 86, 20);
		panel.add(textField_17);
		textField_17.setColumns(10);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(800, 788, 168, 50);
		panel.add(btnNewButton);
		
		JButton btnRetroceder = new JButton("Retroceder");
		btnRetroceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainMenu e = new MainMenu();
				e.setVisible(true);
			}
		});
		btnRetroceder.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnRetroceder.setBounds(800, 871, 168, 50);
		panel.add(btnRetroceder);
		
		JPanel panel_2 = new JPanel();
		tabbedPane_2.addTab("Catedratico Asociado", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBounds(0, 0, 1889, 998);
		panel_2.add(panel_5);
		
		JLabel lblCatedraticoAsociado = new JLabel("Catedratico Asociado");
		lblCatedraticoAsociado.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblCatedraticoAsociado.setBounds(689, 44, 628, 95);
		panel_5.add(lblCatedraticoAsociado);
		
		JLabel lblNewLabel_1_4 = new JLabel("Calidad Docente");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_4.setBounds(132, 226, 147, 71);
		panel_5.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_2_4 = new JLabel("A");
		lblNewLabel_2_4.setBounds(90, 295, 46, 14);
		panel_5.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_3_4 = new JLabel("B");
		lblNewLabel_3_4.setBounds(90, 344, 46, 14);
		panel_5.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_4_3 = new JLabel("C");
		lblNewLabel_4_3.setBounds(90, 395, 46, 14);
		panel_5.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_5_5 = new JLabel("D");
		lblNewLabel_5_5.setBounds(90, 450, 46, 14);
		panel_5.add(lblNewLabel_5_5);
		
		JLabel lblNewLabel_6_3 = new JLabel("E");
		lblNewLabel_6_3.setBounds(90, 503, 46, 14);
		panel_5.add(lblNewLabel_6_3);
		
		JLabel lblNewLabel_7_3 = new JLabel("GH");
		lblNewLabel_7_3.setBounds(90, 589, 46, 14);
		panel_5.add(lblNewLabel_7_3);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("Servicio a la Institucion");
		lblNewLabel_1_1_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1_4.setBounds(385, 226, 211, 71);
		panel_5.add(lblNewLabel_1_1_4);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("A");
		lblNewLabel_2_1_3.setBounds(385, 295, 46, 14);
		panel_5.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_3_1_4 = new JLabel("BC");
		lblNewLabel_3_1_4.setBounds(385, 344, 46, 14);
		panel_5.add(lblNewLabel_3_1_4);
		
		JLabel lblNewLabel_5_1_3 = new JLabel("DE");
		lblNewLabel_5_1_3.setBounds(385, 395, 46, 14);
		panel_5.add(lblNewLabel_5_1_3);
		
		JLabel lblNewLabel_5_2_3 = new JLabel("F");
		lblNewLabel_5_2_3.setBounds(90, 547, 46, 14);
		panel_5.add(lblNewLabel_5_2_3);
		
		JLabel lblNewLabel_8_3 = new JLabel("FG");
		lblNewLabel_8_3.setBounds(385, 450, 46, 14);
		panel_5.add(lblNewLabel_8_3);
		
		JLabel lblNewLabel_1_1_1_4 = new JLabel("Servicio a la Comunidad");
		lblNewLabel_1_1_1_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1_1_4.setBounds(697, 226, 211, 71);
		panel_5.add(lblNewLabel_1_1_1_4);
		
		JLabel lblNewLabel_3_1_1_3 = new JLabel("AB");
		lblNewLabel_3_1_1_3.setBounds(729, 295, 46, 14);
		panel_5.add(lblNewLabel_3_1_1_3);
		
		JLabel lblNewLabel_1_1_1_1_4 = new JLabel("Investigacion y Trabajo Creativo");
		lblNewLabel_1_1_1_1_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1_1_1_4.setBounds(974, 226, 293, 71);
		panel_5.add(lblNewLabel_1_1_1_1_4);
		
		JLabel lblNewLabel_9_3 = new JLabel("A");
		lblNewLabel_9_3.setBounds(1019, 295, 27, 14);
		panel_5.add(lblNewLabel_9_3);
		
		JLabel lblNewLabel_10_3 = new JLabel("B");
		lblNewLabel_10_3.setBounds(1019, 344, 46, 14);
		panel_5.add(lblNewLabel_10_3);
		
		JLabel lblNewLabel_11_3 = new JLabel("CDE");
		lblNewLabel_11_3.setBounds(1019, 395, 46, 14);
		panel_5.add(lblNewLabel_11_3);
		
		JLabel lblNewLabel_1_1_1_1_1_3 = new JLabel("Crecimiento y Desarrollo Profesional");
		lblNewLabel_1_1_1_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1_1_1_1_3.setBounds(1402, 226, 342, 71);
		panel_5.add(lblNewLabel_1_1_1_1_1_3);
		
		JLabel lblNewLabel_12_3 = new JLabel("ABC");
		lblNewLabel_12_3.setBounds(1456, 295, 46, 14);
		panel_5.add(lblNewLabel_12_3);
		
		JLabel lblNewLabel_13_3 = new JLabel("D");
		lblNewLabel_13_3.setBounds(1456, 344, 46, 14);
		panel_5.add(lblNewLabel_13_3);
		
		JLabel lblNewLabel_14_3 = new JLabel("EF");
		lblNewLabel_14_3.setBounds(1456, 395, 46, 14);
		panel_5.add(lblNewLabel_14_3);
		
		textField_54 = new JTextField();
		textField_54.setColumns(10);
		textField_54.setBounds(146, 292, 86, 20);
		panel_5.add(textField_54);
		
		textField_55 = new JTextField();
		textField_55.setColumns(10);
		textField_55.setBounds(146, 341, 86, 20);
		panel_5.add(textField_55);
		
		textField_56 = new JTextField();
		textField_56.setColumns(10);
		textField_56.setBounds(146, 392, 86, 20);
		panel_5.add(textField_56);
		
		textField_57 = new JTextField();
		textField_57.setColumns(10);
		textField_57.setBounds(146, 447, 86, 20);
		panel_5.add(textField_57);
		
		textField_58 = new JTextField();
		textField_58.setColumns(10);
		textField_58.setBounds(146, 500, 86, 20);
		panel_5.add(textField_58);
		
		textField_59 = new JTextField();
		textField_59.setColumns(10);
		textField_59.setBounds(146, 544, 86, 20);
		panel_5.add(textField_59);
		
		textField_60 = new JTextField();
		textField_60.setColumns(10);
		textField_60.setBounds(146, 586, 86, 20);
		panel_5.add(textField_60);
		
		textField_61 = new JTextField();
		textField_61.setColumns(10);
		textField_61.setBounds(432, 292, 86, 20);
		panel_5.add(textField_61);
		
		textField_62 = new JTextField();
		textField_62.setColumns(10);
		textField_62.setBounds(432, 341, 86, 20);
		panel_5.add(textField_62);
		
		textField_63 = new JTextField();
		textField_63.setColumns(10);
		textField_63.setBounds(432, 392, 86, 20);
		panel_5.add(textField_63);
		
		textField_64 = new JTextField();
		textField_64.setColumns(10);
		textField_64.setBounds(432, 447, 86, 20);
		panel_5.add(textField_64);
		
		textField_65 = new JTextField();
		textField_65.setColumns(10);
		textField_65.setBounds(780, 292, 86, 20);
		panel_5.add(textField_65);
		
		textField_66 = new JTextField();
		textField_66.setColumns(10);
		textField_66.setBounds(1098, 292, 86, 20);
		panel_5.add(textField_66);
		
		textField_67 = new JTextField();
		textField_67.setColumns(10);
		textField_67.setBounds(1098, 341, 86, 20);
		panel_5.add(textField_67);
		
		textField_68 = new JTextField();
		textField_68.setColumns(10);
		textField_68.setBounds(1098, 392, 86, 20);
		panel_5.add(textField_68);
		
		textField_69 = new JTextField();
		textField_69.setColumns(10);
		textField_69.setBounds(1579, 292, 86, 20);
		panel_5.add(textField_69);
		
		textField_70 = new JTextField();
		textField_70.setColumns(10);
		textField_70.setBounds(1579, 341, 86, 20);
		panel_5.add(textField_70);
		
		textField_71 = new JTextField();
		textField_71.setColumns(10);
		textField_71.setBounds(1579, 389, 86, 20);
		panel_5.add(textField_71);
		
		JButton btnNewButton_3 = new JButton("Guardar");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_3.setBounds(800, 788, 168, 50);
		panel_5.add(btnNewButton_3);
		
		JButton btnRetroceder_3 = new JButton("Retroceder");
		btnRetroceder_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainMenu e = new MainMenu();
				e.setVisible(true);
			}
		});
		btnRetroceder_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnRetroceder_3.setBounds(800, 871, 168, 50);
		panel_5.add(btnRetroceder_3);
		
		JPanel panel_1 = new JPanel();
		tabbedPane_2.addTab("Catedratico Auxiliar", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(944, 5, 1, 1);
		panel_3.setLayout(null);
		panel_1.add(panel_3);
		
		JLabel lblNewLabel_15 = new JLabel("Catedratico");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_15.setBounds(780, 40, 300, 95);
		panel_3.add(lblNewLabel_15);
		
		JLabel lblNewLabel_1_2 = new JLabel("Calidad Docente");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_2.setBounds(132, 226, 147, 71);
		panel_3.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("A");
		lblNewLabel_2_2.setBounds(90, 295, 46, 14);
		panel_3.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("B");
		lblNewLabel_3_2.setBounds(90, 344, 46, 14);
		panel_3.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4_1 = new JLabel("C");
		lblNewLabel_4_1.setBounds(90, 395, 46, 14);
		panel_3.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_3 = new JLabel("D");
		lblNewLabel_5_3.setBounds(90, 450, 46, 14);
		panel_3.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_6_1 = new JLabel("E");
		lblNewLabel_6_1.setBounds(90, 503, 46, 14);
		panel_3.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("GH");
		lblNewLabel_7_1.setBounds(90, 589, 46, 14);
		panel_3.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Servicio a la Institucion");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1_2.setBounds(385, 226, 211, 71);
		panel_3.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("A");
		lblNewLabel_2_1_1.setBounds(385, 295, 46, 14);
		panel_3.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("BC");
		lblNewLabel_3_1_2.setBounds(385, 344, 46, 14);
		panel_3.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("DE");
		lblNewLabel_5_1_1.setBounds(385, 395, 46, 14);
		panel_3.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_5_2_1 = new JLabel("F");
		lblNewLabel_5_2_1.setBounds(90, 547, 46, 14);
		panel_3.add(lblNewLabel_5_2_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("FG");
		lblNewLabel_8_1.setBounds(385, 450, 46, 14);
		panel_3.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Servicio a la Comunidad");
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1_1_2.setBounds(697, 226, 211, 71);
		panel_3.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("AB");
		lblNewLabel_3_1_1_1.setBounds(729, 295, 46, 14);
		panel_3.add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Investigacion y Trabajo Creativo");
		lblNewLabel_1_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1_1_1_2.setBounds(974, 226, 293, 71);
		panel_3.add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblNewLabel_9_1 = new JLabel("A");
		lblNewLabel_9_1.setBounds(1019, 295, 27, 14);
		panel_3.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_10_1 = new JLabel("B");
		lblNewLabel_10_1.setBounds(1019, 344, 46, 14);
		panel_3.add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_11_1 = new JLabel("CDE");
		lblNewLabel_11_1.setBounds(1019, 395, 46, 14);
		panel_3.add(lblNewLabel_11_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Crecimiento y Desarrollo Profesional");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1_1_1_1_1.setBounds(1402, 226, 342, 71);
		panel_3.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_12_1 = new JLabel("ABC");
		lblNewLabel_12_1.setBounds(1456, 295, 46, 14);
		panel_3.add(lblNewLabel_12_1);
		
		JLabel lblNewLabel_13_1 = new JLabel("D");
		lblNewLabel_13_1.setBounds(1456, 344, 46, 14);
		panel_3.add(lblNewLabel_13_1);
		
		JLabel lblNewLabel_14_1 = new JLabel("EF");
		lblNewLabel_14_1.setBounds(1456, 395, 46, 14);
		panel_3.add(lblNewLabel_14_1);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(146, 292, 86, 20);
		panel_3.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(146, 341, 86, 20);
		panel_3.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(146, 392, 86, 20);
		panel_3.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(146, 447, 86, 20);
		panel_3.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(146, 500, 86, 20);
		panel_3.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(146, 544, 86, 20);
		panel_3.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(146, 586, 86, 20);
		panel_3.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(432, 292, 86, 20);
		panel_3.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(432, 341, 86, 20);
		panel_3.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(432, 392, 86, 20);
		panel_3.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(432, 447, 86, 20);
		panel_3.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(780, 292, 86, 20);
		panel_3.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(1098, 292, 86, 20);
		panel_3.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(1098, 341, 86, 20);
		panel_3.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(1098, 392, 86, 20);
		panel_3.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(1579, 292, 86, 20);
		panel_3.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(1579, 341, 86, 20);
		panel_3.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(1579, 389, 86, 20);
		panel_3.add(textField_35);
		
		JButton btnNewButton_1 = new JButton("Guardar");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(800, 788, 168, 50);
		panel_3.add(btnNewButton_1);
		
		JButton btnRetroceder_1 = new JButton("Retroceder");
		btnRetroceder_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnRetroceder_1.setBounds(800, 871, 168, 50);
		panel_3.add(btnRetroceder_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(0, 0, 1889, 998);
		panel_1.add(panel_4);
		
		JLabel lblCatedraticoAuxiliar = new JLabel("Catedratico Auxiliar");
		lblCatedraticoAuxiliar.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblCatedraticoAuxiliar.setBounds(715, 48, 526, 95);
		panel_4.add(lblCatedraticoAuxiliar);
		
		JLabel lblNewLabel_1_3 = new JLabel("Calidad Docente");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_3.setBounds(132, 226, 147, 71);
		panel_4.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_2_3 = new JLabel("A");
		lblNewLabel_2_3.setBounds(90, 295, 46, 14);
		panel_4.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_3_3 = new JLabel("B");
		lblNewLabel_3_3.setBounds(90, 344, 46, 14);
		panel_4.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_4_2 = new JLabel("C");
		lblNewLabel_4_2.setBounds(90, 395, 46, 14);
		panel_4.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_5_4 = new JLabel("D");
		lblNewLabel_5_4.setBounds(90, 450, 46, 14);
		panel_4.add(lblNewLabel_5_4);
		
		JLabel lblNewLabel_6_2 = new JLabel("E");
		lblNewLabel_6_2.setBounds(90, 503, 46, 14);
		panel_4.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_7_2 = new JLabel("GH");
		lblNewLabel_7_2.setBounds(90, 589, 46, 14);
		panel_4.add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Servicio a la Institucion");
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1_3.setBounds(385, 226, 211, 71);
		panel_4.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("A");
		lblNewLabel_2_1_2.setBounds(385, 295, 46, 14);
		panel_4.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_3_1_3 = new JLabel("BC");
		lblNewLabel_3_1_3.setBounds(385, 344, 46, 14);
		panel_4.add(lblNewLabel_3_1_3);
		
		JLabel lblNewLabel_5_1_2 = new JLabel("DE");
		lblNewLabel_5_1_2.setBounds(385, 395, 46, 14);
		panel_4.add(lblNewLabel_5_1_2);
		
		JLabel lblNewLabel_5_2_2 = new JLabel("F");
		lblNewLabel_5_2_2.setBounds(90, 547, 46, 14);
		panel_4.add(lblNewLabel_5_2_2);
		
		JLabel lblNewLabel_8_2 = new JLabel("FG");
		lblNewLabel_8_2.setBounds(385, 450, 46, 14);
		panel_4.add(lblNewLabel_8_2);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("Servicio a la Comunidad");
		lblNewLabel_1_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1_1_3.setBounds(697, 226, 211, 71);
		panel_4.add(lblNewLabel_1_1_1_3);
		
		JLabel lblNewLabel_3_1_1_2 = new JLabel("AB");
		lblNewLabel_3_1_1_2.setBounds(729, 295, 46, 14);
		panel_4.add(lblNewLabel_3_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_3 = new JLabel("Investigacion y Trabajo Creativo");
		lblNewLabel_1_1_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1_1_1_3.setBounds(974, 226, 293, 71);
		panel_4.add(lblNewLabel_1_1_1_1_3);
		
		JLabel lblNewLabel_9_2 = new JLabel("A");
		lblNewLabel_9_2.setBounds(1019, 295, 27, 14);
		panel_4.add(lblNewLabel_9_2);
		
		JLabel lblNewLabel_10_2 = new JLabel("B");
		lblNewLabel_10_2.setBounds(1019, 344, 46, 14);
		panel_4.add(lblNewLabel_10_2);
		
		JLabel lblNewLabel_11_2 = new JLabel("CDE");
		lblNewLabel_11_2.setBounds(1019, 395, 46, 14);
		panel_4.add(lblNewLabel_11_2);
		
		JLabel lblNewLabel_1_1_1_1_1_2 = new JLabel("Crecimiento y Desarrollo Profesional");
		lblNewLabel_1_1_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1_1_1_1_2.setBounds(1402, 226, 342, 71);
		panel_4.add(lblNewLabel_1_1_1_1_1_2);
		
		JLabel lblNewLabel_12_2 = new JLabel("ABC");
		lblNewLabel_12_2.setBounds(1456, 295, 46, 14);
		panel_4.add(lblNewLabel_12_2);
		
		JLabel lblNewLabel_13_2 = new JLabel("D");
		lblNewLabel_13_2.setBounds(1456, 344, 46, 14);
		panel_4.add(lblNewLabel_13_2);
		
		JLabel lblNewLabel_14_2 = new JLabel("EF");
		lblNewLabel_14_2.setBounds(1456, 395, 46, 14);
		panel_4.add(lblNewLabel_14_2);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(146, 292, 86, 20);
		panel_4.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(146, 341, 86, 20);
		panel_4.add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(146, 392, 86, 20);
		panel_4.add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(146, 447, 86, 20);
		panel_4.add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(146, 500, 86, 20);
		panel_4.add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(146, 544, 86, 20);
		panel_4.add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(146, 586, 86, 20);
		panel_4.add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(432, 292, 86, 20);
		panel_4.add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(432, 341, 86, 20);
		panel_4.add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBounds(432, 392, 86, 20);
		panel_4.add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBounds(432, 447, 86, 20);
		panel_4.add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setColumns(10);
		textField_47.setBounds(780, 292, 86, 20);
		panel_4.add(textField_47);
		
		textField_48 = new JTextField();
		textField_48.setColumns(10);
		textField_48.setBounds(1098, 292, 86, 20);
		panel_4.add(textField_48);
		
		textField_49 = new JTextField();
		textField_49.setColumns(10);
		textField_49.setBounds(1098, 341, 86, 20);
		panel_4.add(textField_49);
		
		textField_50 = new JTextField();
		textField_50.setColumns(10);
		textField_50.setBounds(1098, 392, 86, 20);
		panel_4.add(textField_50);
		
		textField_51 = new JTextField();
		textField_51.setColumns(10);
		textField_51.setBounds(1579, 292, 86, 20);
		panel_4.add(textField_51);
		
		textField_52 = new JTextField();
		textField_52.setColumns(10);
		textField_52.setBounds(1579, 341, 86, 20);
		panel_4.add(textField_52);
		
		textField_53 = new JTextField();
		textField_53.setColumns(10);
		textField_53.setBounds(1579, 389, 86, 20);
		panel_4.add(textField_53);
		
		JButton btnNewButton_2 = new JButton("Guardar");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2.setBounds(800, 788, 168, 50);
		panel_4.add(btnNewButton_2);
		
		JButton btnRetroceder_2 = new JButton("Retroceder");
		btnRetroceder_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainMenu e = new MainMenu();
				e.setVisible(true);
			}
		});
		btnRetroceder_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnRetroceder_2.setBounds(800, 871, 168, 50);
		panel_4.add(btnRetroceder_2);
	}
}
