package systemEvaluation;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.Window.Type;
import java.awt.ScrollPane;
import java.awt.Label;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.SpringLayout;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import java.awt.SystemColor;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;

public class Evaluation extends JFrame {

	private JPanel contentPane;
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private JTextField Unidadacademica_textField;
	private JTextField nombre_prof_textField;
	private JTextField departamento_textField;
	private JTextField disiplina_textField;
	private JTextField periodo_evaluado_textField;
	private JTextField codigo_textField;
	private JTextField tutulo_del_curso_textField;
	private JTextField modalidad_textField;
	@SuppressWarnings("rawtypes")
	private JComboBox contrato_comboBox;
	private JLabel titulo_curso_lblNewLabel;
	private JTextField servicio_institucion_total_textField;
	private JTextField calidad_total_textField;
	private JTextField servicio_comunidad_total_textField;
	private JTextField investigacion_creativo_total_textField;
	private JTextField crecimiento_profesional_total_textField;
	private JTextField parte1_total_textField;
	private JTextField total_parte2_estudi_textField;
	private JTextField parte3_estudiante_total_textField;
	private JTextField parte3_continuacion_total_textField;
	private JTextField parte3_gerencia_total_textField;
	private JTextField textField_2;


	private JComboBox parte1_perfil_de_estudiante_1_comboBox = new JComboBox();
	private JComboBox parte1_perfil_de_estudiante_2_comboBox = new JComboBox();
	private JComboBox parte2_estudi_3_comboBox = new JComboBox();
	private JComboBox parte2_estudi_4_comboBox = new JComboBox();
	private JComboBox parte3_estudi_5_comboBox = new JComboBox();
	private JComboBox parte3_estudi_6_comboBox = new JComboBox();
	private JComboBox parte3_estudi_7_comboBox = new JComboBox();
	private JComboBox parte3_estudi_8_comboBox = new JComboBox();
	private JComboBox parte3_estudi_9_comboBox = new JComboBox();
	private JComboBox parte3_estudi_10_comboBox_3 = new JComboBox();
	private JComboBox parte3_estudi_11_comboBox_3 = new JComboBox();
	private JComboBox parte3_estudi_12_comboBox_3 = new JComboBox();
	private JComboBox parte3_desarollo_de_clase_13_comboBox = new JComboBox();
	private JComboBox parte3_desarollo_de_clase_14_comboBox = new JComboBox();
	private JComboBox parte3_desarollo_de_clase_15_comboBox_1_1 = new JComboBox();
	private JComboBox parte3_desarollo_de_clase_16_comboBox = new JComboBox();
	private JComboBox parte3_desarollo_de_clase_17_comboBox_1_1 = new JComboBox();
	private JComboBox parte5_gerencia_18_comboBox_1 = new JComboBox();
	private JComboBox parte5_gerencia_19_comboBox_1 = new JComboBox();
	private JComboBox parte5_gerencia_20_comboBox_1 = new JComboBox();
	private JComboBox parte5_gerencia_21_comboBox_1 = new JComboBox();
	private JComboBox parte5_gerencia_22_comboBox_1 = new JComboBox();
	private JComboBox parte5_gerencia_23_comboBox_1 = new JComboBox();
	private JComboBox parte5_gerencia_24_comboBox_1 = new JComboBox();
	private JComboBox parte5_gerencia_25_comboBox_1 = new JComboBox();
	private JComboBox parte5_gerencia_26_comboBox_1 = new JComboBox();
	private JComboBox parte5_gerencia_27_comboBox = new JComboBox();
	private JComboBox parte5_gerencia_28_comboBox = new JComboBox();
	private JComboBox parte5_gerencia_29_comboBox = new JComboBox();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Evaluation frame = new Evaluation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Testing
	public Evaluation() {
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		tabbedPane.setBounds(0, 0, 1914, 988);
		contentPane.add(tabbedPane);
		
		
		//////////////////////////////////// Info a ingresar ////////////////////////////////////////////
		JPanel panel = new JPanel();
		tabbedPane.addTab("Informaci\u00F3n a Ingresar", null, panel, null);
		panel.setLayout(null);
		
		JLabel unidad_academica_lblNewLabel = new JLabel("Unidad acad\u00E9mica ");
		unidad_academica_lblNewLabel.setBounds(680, 167, 277, 20);
		unidad_academica_lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(unidad_academica_lblNewLabel);
		
		Unidadacademica_textField = new JTextField();
		Unidadacademica_textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Unidadacademica_textField.setBounds(920, 162, 253, 30);
		panel.add(Unidadacademica_textField);
		Unidadacademica_textField.setColumns(10);
		
		JLabel nombre_profedor_lblNewLabel = new JLabel("Nombre del profesor");
		nombre_profedor_lblNewLabel.setBounds(680, 212, 238, 20);
		nombre_profedor_lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(nombre_profedor_lblNewLabel);
		
		nombre_prof_textField = new JTextField();
		nombre_prof_textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nombre_prof_textField.setBounds(920, 207, 253, 30);
		panel.add(nombre_prof_textField);
		nombre_prof_textField.setColumns(10);
		
		JLabel rango_lblNewLabel = new JLabel("Rango acad\u00E9mico que solicita");
		rango_lblNewLabel.setBounds(680, 264, 226, 20);
		rango_lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(rango_lblNewLabel);
		
		JLabel departamento_lblNewLabel = new JLabel("Departamento");
		departamento_lblNewLabel.setBounds(680, 318, 185, 20);
		departamento_lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(departamento_lblNewLabel);
		
		departamento_textField = new JTextField();
		departamento_textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		departamento_textField.setBounds(920, 308, 253, 30);
		panel.add(departamento_textField);
		departamento_textField.setColumns(10);
		
		JLabel disciplina_lblNewLabel = new JLabel("Disciplina que ense\u00F1a");
		disciplina_lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		disciplina_lblNewLabel.setBounds(680, 371, 152, 20);
		panel.add(disciplina_lblNewLabel);
		
		disiplina_textField = new JTextField();
		disiplina_textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		disiplina_textField.setBounds(920, 366, 253, 30);
		panel.add(disiplina_textField);
		disiplina_textField.setColumns(10);
		
		JLabel objetivo_evaluacion_lblNewLabel = new JLabel("Objetivo de la evaluaci\u00F3n");
		objetivo_evaluacion_lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		objetivo_evaluacion_lblNewLabel.setBounds(680, 418, 185, 20);
		panel.add(objetivo_evaluacion_lblNewLabel);
		
		JComboBox objetivo_eval_comboBox = new JComboBox();
		
		objetivo_eval_comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		objetivo_eval_comboBox.setModel(new DefaultComboBoxModel(new String[] {"Formativa", "Sumativa"}));
		objetivo_eval_comboBox.setBounds(930, 416, 235, 25);
		panel.add(objetivo_eval_comboBox);
		
		objetivo_eval_comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String objetivo = objetivo_eval_comboBox.getSelectedItem().toString();
				System.out.println("Obejtivo de evaluacion: " + objetivo);
			}
		});
		

		
		JLabel periodo_evaluado_lblNewLabel = new JLabel("Per\u00EDodo evaluado");
		periodo_evaluado_lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		periodo_evaluado_lblNewLabel.setBounds(680, 472, 122, 20);
		panel.add(periodo_evaluado_lblNewLabel);
		
		periodo_evaluado_textField = new JTextField();
		periodo_evaluado_textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		periodo_evaluado_textField.setBounds(927, 467, 246, 30);
		panel.add(periodo_evaluado_textField);
		periodo_evaluado_textField.setColumns(10);
		
		JLabel anos_servicio_lblNewLabel = new JLabel("A\u00F1os de servicio como profesor");
		anos_servicio_lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		anos_servicio_lblNewLabel.setBounds(818, 522, 277, 25);
		panel.add(anos_servicio_lblNewLabel);
		
		JLabel jornada_comple_lblNewLabel = new JLabel("Jornada completa");
		jornada_comple_lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jornada_comple_lblNewLabel.setBounds(692, 561, 134, 20);
		panel.add(jornada_comple_lblNewLabel);
		
		JComboBox jornada_comple_comboBox = new JComboBox();
		
		jornada_comple_comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jornada_comple_comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "40", "41", "42", "43", "44", "45"}));
		jornada_comple_comboBox.setBounds(836, 558, 74, 27);
		panel.add(jornada_comple_comboBox);
		
		jornada_comple_comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String jornada = jornada_comple_comboBox.getSelectedItem().toString();
				int jornadaCompleta = Integer.parseInt(jornada);
				System.out.println("Jornada completa: " + jornadaCompleta);
			}
		});
		
		JLabel jornada_parcial_lblNewLabel = new JLabel("Jornada parcial");
		
		jornada_parcial_lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jornada_parcial_lblNewLabel.setBounds(969, 561, 107, 20);
		panel.add(jornada_parcial_lblNewLabel);
		
		JComboBox jornada_parcial_comboBox = new JComboBox();
		jornada_parcial_comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jornada_parcial_comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "40", "41", "42", "43", "44", "45"}));
		jornada_parcial_comboBox.setBounds(1111, 558, 74, 27);
		panel.add(jornada_parcial_comboBox);
		
		jornada_parcial_comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String jornada = jornada_parcial_comboBox.getSelectedItem().toString();
				int jornadaParcial = Integer.parseInt(jornada);
				System.out.println("Jornada completa: " + jornadaParcial);
			}
		});
		
		JLabel tipo_de_contrato_lblNewLabel = new JLabel("Tipo de contrato");
		tipo_de_contrato_lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		tipo_de_contrato_lblNewLabel.setBounds(871, 596, 157, 20);
		panel.add(tipo_de_contrato_lblNewLabel);
		
		contrato_comboBox = new JComboBox();
		
		contrato_comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contrato_comboBox.setModel(new DefaultComboBoxModel(new String[] {"Sustituto", "Temporero", "Probatorio", "Permanente"}));
		contrato_comboBox.setBounds(871, 629, 139, 27);
		panel.add(contrato_comboBox);
		contrato_comboBox.setSelectedItem("Temporero"); // SETTER TEST !!!!!!!!!!
		
		contrato_comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String contrato = contrato_comboBox.getSelectedItem().toString();
				System.out.println("Tipo de contrato: " + contrato);
				
			}
		});
		
		JLabel lblNewLabel_9 = new JLabel("Especifique los cursos ofrecidos ");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_9.setBounds(689, 667, 255, 22);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("durante el per\u00EDodo evaluado:");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_10.setBounds(941, 667, 226, 22);
		panel.add(lblNewLabel_10);
		
		JLabel codigo_lblNewLabel = new JLabel("C\u00F3digo");
		codigo_lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		codigo_lblNewLabel.setBounds(801, 726, 50, 20);
		panel.add(codigo_lblNewLabel);
		
		codigo_textField = new JTextField();
		codigo_textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		codigo_textField.setBounds(893, 722, 226, 29);
		panel.add(codigo_textField);
		codigo_textField.setColumns(10);
		
		titulo_curso_lblNewLabel = new JLabel("T\u00EDtulo del Curso ");
		titulo_curso_lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		titulo_curso_lblNewLabel.setBounds(744, 785, 118, 20);
		panel.add(titulo_curso_lblNewLabel);
		
		tutulo_del_curso_textField = new JTextField();
		tutulo_del_curso_textField.setColumns(10);
		tutulo_del_curso_textField.setBounds(893, 784, 226, 26);
		panel.add(tutulo_del_curso_textField);
		
		JLabel modalidad_lblNewLabel = new JLabel("Modalidad");
		modalidad_lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		modalidad_lblNewLabel.setBounds(779, 829, 72, 20);
		panel.add(modalidad_lblNewLabel);
		
		modalidad_textField = new JTextField();
		modalidad_textField.setColumns(10);
		modalidad_textField.setBounds(893, 828, 226, 26);
		panel.add(modalidad_textField);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(779, 144, 0, 12);
		panel.add(separator);
		
		JComboBox rangoAcademico_comboBox = new JComboBox();
		
		rangoAcademico_comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String rangoAcademico = rangoAcademico_comboBox.getSelectedItem().toString();
				System.out.println("Rango: " + rangoAcademico);
			}
		});
		
		rangoAcademico_comboBox.setModel(new DefaultComboBoxModel(new String[] {"Rango Catedratico", "Rango Catedratico Asociado", "Rango Catedratico Auxiliar"}));
		rangoAcademico_comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rangoAcademico_comboBox.setBounds(920, 261, 253, 27);
		panel.add(rangoAcademico_comboBox);
		
		JLabel lblNewLabel_44 = new JLabel("Informaci\u00F3n a Ingresar");
		lblNewLabel_44.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_44.setBounds(647, 11, 596, 123);
		panel.add(lblNewLabel_44);
		
		
		/////////////////////////////// INSTRUMENTO I ///////////////////////////////////////////
	
		
		
		
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Instrumento I", null, tabbedPane_2, null);
		
		/////////////////////////////// INSTRUMENTO I  PART 1 ///////////////////////////////////////////

		JPanel panel_15 = new JPanel();
		tabbedPane_2.addTab("Parte I", null, panel_15, null);
		panel_15.setLayout(null);
		
		JLabel lblNewLabel_39 = new JLabel("Evaluaci\u00F3n de Facultad por los Estudiantes");
		lblNewLabel_39.setFont(new Font("Tahoma", Font.BOLD, 54));
		lblNewLabel_39.setBounds(319, 21, 1151, 66);
		panel_15.add(lblNewLabel_39);
		
		JLabel lblNewLabel_40 = new JLabel("PARTE I. Perfil del estudiante. Utiliza la siguiente clave para las preguntas 1 y 2:");
		lblNewLabel_40.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_40.setBounds(551, 181, 839, 26);
		panel_15.add(lblNewLabel_40);
		
		JLabel lblNewLabel_41 = new JLabel("(4) Siempre (3) Casi siempre (2) Ocasionalmente (1) Casi");
		lblNewLabel_41.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_41.setBounds(711, 241, 580, 25);
		panel_15.add(lblNewLabel_41);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(Color.LIGHT_GRAY);
		panel_16.setBounds(265, 356, 1338, 416);
		panel_15.add(panel_16);
		panel_16.setLayout(null);
		
		JLabel lblNewLabel_42 = new JLabel("1. Indica la regularidad con que hasta ahora has asistido a este curso:");
		lblNewLabel_42.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_42.setBounds(10, 97, 741, 38);
		panel_16.add(lblNewLabel_42);
		
		JLabel lblNewLabel_43 = new JLabel("2. Indica la regularidad con que hasta ahora has asistido a las horas de oficina del profesor");
		lblNewLabel_43.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43.setBounds(10, 297, 970, 26);
		panel_16.add(lblNewLabel_43);
		
		JPanel panel_6_7_3 = new JPanel();
		panel_6_7_3.setBounds(-159, 208, 1530, 10);
		panel_16.add(panel_6_7_3);
		
		JPanel panel_6_8_2 = new JPanel();
		panel_6_8_2.setBounds(990, -55, 10, 495);
		panel_16.add(panel_6_8_2);
		
		
		
		parte1_perfil_de_estudiante_1_comboBox.setModel(new DefaultComboBoxModel(new String[] {" ", "1", "2", "3","4"}));
		parte1_perfil_de_estudiante_1_comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte1_perfil_de_estudiante_1_comboBox.setBounds(1092, 97, 159, 38);
		panel_16.add(parte1_perfil_de_estudiante_1_comboBox);
		
		parte1_perfil_de_estudiante_1_comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String parte1Box1 = parte1_perfil_de_estudiante_1_comboBox.getSelectedItem().toString();
				System.out.println("Box 1: " + parte1Box1);
			}
		});
		
		
	
		parte1_perfil_de_estudiante_2_comboBox.setModel(new DefaultComboBoxModel(new String[] {" ","1", "2", "3", "4"}));
		parte1_perfil_de_estudiante_2_comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte1_perfil_de_estudiante_2_comboBox.setBounds(1092, 303, 159, 38);
		panel_16.add(parte1_perfil_de_estudiante_2_comboBox);
		
		
		parte1_perfil_de_estudiante_2_comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String parte1Box2 = parte1_perfil_de_estudiante_2_comboBox.getSelectedItem().toString();
				System.out.println("Box 2: " + parte1Box2);
			}
		});
		
		JLabel lblNewLabel_20_2 = new JLabel("Puntuaci\u00F3n");
		lblNewLabel_20_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_20_2.setBounds(1349, 310, 132, 28);
		panel_15.add(lblNewLabel_20_2);
		
		JPanel panel_8_2 = new JPanel();
		panel_8_2.setLayout(null);
		panel_8_2.setBackground(Color.GRAY);
		panel_8_2.setBounds(1274, 795, 1, 1);
		panel_15.add(panel_8_2);
		
		parte1_total_textField = new JTextField();
		parte1_total_textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		parte1_total_textField.setColumns(10);
		parte1_total_textField.setBounds(28, 11, 259, 53);
		panel_8_2.add(parte1_total_textField);
		
		JLabel lblNewLabel_21_3 = new JLabel("Total");
		lblNewLabel_21_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_21_3.setBounds(1274, 795, 76, 37);
		panel_15.add(lblNewLabel_21_3);
		
		JPanel panel_17 = new JPanel();
		tabbedPane_2.addTab("Parte II", null, panel_17, null);
		panel_17.setLayout(null);
		
		JPanel panel_16_1 = new JPanel();
		panel_16_1.setBounds(946, 5, 1, 1);
		panel_16_1.setLayout(null);
		panel_16_1.setBackground(Color.LIGHT_GRAY);
		panel_17.add(panel_16_1);
		
		JLabel lblNewLabel_42_1 = new JLabel("1. Indica la regularidad con que hasta ahora has asistido a este curso:");
		lblNewLabel_42_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_42_1.setBounds(10, 97, 741, 38);
		panel_16_1.add(lblNewLabel_42_1);
		
		JLabel lblNewLabel_43_1 = new JLabel("2. Indica la regularidad con que hasta ahora has asistido a las horas de oficina del profesor");
		lblNewLabel_43_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_1.setBounds(10, 297, 970, 26);
		panel_16_1.add(lblNewLabel_43_1);
		
		JPanel panel_6_7_3_1 = new JPanel();
		panel_6_7_3_1.setBounds(-159, 208, 1530, 10);
		panel_16_1.add(panel_6_7_3_1);
		
		JPanel panel_6_8_2_1 = new JPanel();
		panel_6_8_2_1.setBounds(990, -55, 10, 495);
		panel_16_1.add(panel_6_8_2_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_2.setBounds(1092, 97, 159, 38);
		panel_16_1.add(comboBox_2);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_1_1.setBounds(1092, 303, 159, 38);
		panel_16_1.add(comboBox_1_1);
		
		JPanel panel_16_2 = new JPanel();
		panel_16_2.setLayout(null);
		panel_16_2.setBackground(Color.LIGHT_GRAY);
		panel_16_2.setBounds(304, 295, 1338, 416);
		panel_17.add(panel_16_2);
		
		JLabel lblNewLabel_42_2 = new JLabel("3. Al inicio del curso, en o antes de las primeras dos reuniones de cada t\u00E9rmino");
		lblNewLabel_42_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_42_2.setBounds(10, 39, 941, 38);
		panel_16_2.add(lblNewLabel_42_2);
		
		JLabel lblNewLabel_43_2 = new JLabel("4. El profesor discute el prontuario al inicio del curso.");
		lblNewLabel_43_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_2.setBounds(10, 281, 970, 26);
		panel_16_2.add(lblNewLabel_43_2);
		
		JPanel panel_6_7_3_2 = new JPanel();
		panel_6_7_3_2.setBounds(-162, 156, 1530, 10);
		panel_16_2.add(panel_6_7_3_2);
		
		JPanel panel_6_8_2_2 = new JPanel();
		panel_6_8_2_2.setBounds(990, -55, 10, 495);
		panel_16_2.add(panel_6_8_2_2);
		
		
		
		parte2_estudi_3_comboBox.setModel(new DefaultComboBoxModel(new String[] {" ", "1", "2", "3"}));
		parte2_estudi_3_comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte2_estudi_3_comboBox.setBounds(1092, 72, 159, 38);
		panel_16_2.add(parte2_estudi_3_comboBox);
		
		parte2_estudi_3_comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String parte2Box3 = parte2_estudi_3_comboBox.getSelectedItem().toString();
				System.out.println("Box 3: " + parte2Box3);
			}
		});
		
		
	
		parte2_estudi_4_comboBox.setModel(new DefaultComboBoxModel(new String[] {" ", "1", "2", "3"}));
		parte2_estudi_4_comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte2_estudi_4_comboBox.setBounds(1092, 259, 159, 38);
		panel_16_2.add(parte2_estudi_4_comboBox);
		
		parte2_estudi_4_comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String parte2Box4 = parte2_estudi_4_comboBox.getSelectedItem().toString();
				System.out.println("Box 4: " + parte2Box4);
			}
		});
		
		JLabel lblNewLabel_42_2_1 = new JLabel("acad\u00E9mico, el profesor pone a mi disposici\u00F3n el prontuario, ya sea en forma");
		lblNewLabel_42_2_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_42_2_1.setBounds(39, 70, 941, 38);
		panel_16_2.add(lblNewLabel_42_2_1);
		
		JLabel lblNewLabel_42_2_1_1 = new JLabel("impresa o digital.");
		lblNewLabel_42_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_42_2_1_1.setBounds(39, 107, 191, 38);
		panel_16_2.add(lblNewLabel_42_2_1_1);
		
		JPanel panel_8_2_1 = new JPanel();
		panel_8_2_1.setLayout(null);
		panel_8_2_1.setBackground(Color.GRAY);
		panel_8_2_1.setBounds(1322, 750, 309, 75);
		panel_17.add(panel_8_2_1);
		
		total_parte2_estudi_textField = new JTextField();
		total_parte2_estudi_textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		total_parte2_estudi_textField.setColumns(10);
		total_parte2_estudi_textField.setBounds(28, 11, 259, 53);
		panel_8_2_1.add(total_parte2_estudi_textField);
		
		JLabel lblNewLabel_21_3_1 = new JLabel("Total");
		lblNewLabel_21_3_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_21_3_1.setBounds(1205, 763, 90, 46);
		panel_17.add(lblNewLabel_21_3_1);
		
		JLabel lblNewLabel_39_1 = new JLabel("Evaluaci\u00F3n de Facultad por los Estudiantes");
		lblNewLabel_39_1.setFont(new Font("Tahoma", Font.BOLD, 54));
		lblNewLabel_39_1.setBounds(402, 31, 1529, 135);
		panel_17.add(lblNewLabel_39_1);
		
		JLabel lblNewLabel_41_1 = new JLabel("(3) Lo hizo (2) No lo hizo (1) Desconozco porque no estuve al inicio del curso");
		lblNewLabel_41_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_41_1.setBounds(567, 211, 1121, 42);
		panel_17.add(lblNewLabel_41_1);
		
		JLabel lblNewLabel_40_1 = new JLabel("PARTE II. El prontuario del curso. Utiliza la siguiente clave para las preguntas 3 y 4:");
		lblNewLabel_40_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_40_1.setBounds(506, 151, 1160, 49);
		panel_17.add(lblNewLabel_40_1);
		
		JPanel panel_18 = new JPanel();
		tabbedPane_2.addTab("Parte III", null, panel_18, null);
		panel_18.setLayout(null);
		
		JLabel lblNewLabel_39_1_1 = new JLabel("Evaluaci\u00F3n de Facultad por los Estudiantes");
		lblNewLabel_39_1_1.setFont(new Font("Tahoma", Font.BOLD, 54));
		lblNewLabel_39_1_1.setBounds(355, 0, 1529, 106);
		panel_18.add(lblNewLabel_39_1_1);
		
		JPanel panel_16_2_1 = new JPanel();
		panel_16_2_1.setLayout(null);
		panel_16_2_1.setBackground(Color.LIGHT_GRAY);
		panel_16_2_1.setBounds(239, 225, 1338, 600);
		panel_18.add(panel_16_2_1);
		
		JLabel lblNewLabel_42_2_2 = new JLabel("5. La forma en que se desarrolla la clase me mantiene interesado.");
		lblNewLabel_42_2_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_42_2_2.setBounds(10, 39, 941, 38);
		panel_16_2_1.add(lblNewLabel_42_2_2);
		
		JLabel lblNewLabel_43_2_1 = new JLabel("8. La forma en que el profesor ense\u00F1a el contenido del curso ha aumentado mi  ");
		lblNewLabel_43_2_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_2_1.setBounds(10, 263, 970, 26);
		panel_16_2_1.add(lblNewLabel_43_2_1);
		
		JPanel panel_6_7_3_2_1 = new JPanel();
		panel_6_7_3_2_1.setBounds(0, 162, 1530, 10);
		panel_16_2_1.add(panel_6_7_3_2_1);
		
		JPanel panel_6_8_2_2_1 = new JPanel();
		panel_6_8_2_2_1.setBounds(1053, 0, 10, 645);
		panel_16_2_1.add(panel_6_8_2_2_1);
		
		
	
		parte3_estudi_5_comboBox.setModel(new DefaultComboBoxModel(new String[] {" ", "1", "2", "3", "4"}));
		parte3_estudi_5_comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte3_estudi_5_comboBox.setBounds(1114, 41, 159, 38);
		panel_16_2_1.add(parte3_estudi_5_comboBox);
		
		parte3_estudi_5_comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String parte3Box5 = parte3_estudi_5_comboBox.getSelectedItem().toString();
				System.out.println("Box 5: " + parte3Box5);
			}
		});
		
		
	
		parte3_estudi_6_comboBox.setModel(new DefaultComboBoxModel(new String[] {" ", "1", "2", "3", "4"}));
		parte3_estudi_6_comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte3_estudi_6_comboBox.setBounds(1114, 113, 159, 38);
		panel_16_2_1.add(parte3_estudi_6_comboBox);
		
		parte3_estudi_6_comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String parte3Box6 = parte3_estudi_6_comboBox.getSelectedItem().toString();
				System.out.println("Box 6: " + parte3Box6);
			}
		});
		
		JLabel lblNewLabel_42_2_1_2 = new JLabel("6. El profesor demuestra conocer el material de la clase.");
		lblNewLabel_42_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_42_2_1_2.setBounds(10, 121, 941, 38);
		panel_16_2_1.add(lblNewLabel_42_2_1_2);
		
		JLabel lblNewLabel_42_2_1_1_1 = new JLabel("7. El profesor me hace pensar y reflexionar sobre los temas del curso.");
		lblNewLabel_42_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_42_2_1_1_1.setBounds(10, 183, 941, 38);
		panel_16_2_1.add(lblNewLabel_42_2_1_1_1);
		
		JPanel panel_6_7_3_2_1_1 = new JPanel();
		panel_6_7_3_2_1_1.setBounds(0, 100, 1530, 10);
		panel_16_2_1.add(panel_6_7_3_2_1_1);
		
		JPanel panel_6_7_3_2_1_2 = new JPanel();
		panel_6_7_3_2_1_2.setBounds(0, 232, 1530, 10);
		panel_16_2_1.add(panel_6_7_3_2_1_2);
		
		JLabel lblNewLabel_43_2_1_1 = new JLabel(" entendimiento de esta materia.");
		lblNewLabel_43_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_2_1_1.setBounds(30, 289, 970, 26);
		panel_16_2_1.add(lblNewLabel_43_2_1_1);
		
		JPanel panel_6_7_3_2_1_2_1 = new JPanel();
		panel_6_7_3_2_1_2_1.setBounds(0, 326, 1530, 10);
		panel_16_2_1.add(panel_6_7_3_2_1_2_1);
		
		JLabel lblNewLabel_43_2_1_2 = new JLabel("9. Hasta el presente, se han logrado los objetivos del curso conforme al prontuario. ");
		lblNewLabel_43_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_2_1_2.setBounds(10, 352, 970, 26);
		panel_16_2_1.add(lblNewLabel_43_2_1_2);
		
		JPanel panel_6_7_3_2_1_2_1_1 = new JPanel();
		panel_6_7_3_2_1_2_1_1.setBounds(0, 385, 1530, 10);
		panel_16_2_1.add(panel_6_7_3_2_1_2_1_1);
		
		JLabel lblNewLabel_43_2_1_2_1 = new JLabel("10. El profesor utiliza diversas formas o maneras de ense\u00F1anza");
		lblNewLabel_43_2_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_2_1_2_1.setBounds(10, 406, 970, 26);
		panel_16_2_1.add(lblNewLabel_43_2_1_2_1);
		
		JLabel lblNewLabel_43_2_1_2_1_1 = new JLabel("para presentar el contenido del curso.");
		lblNewLabel_43_2_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_2_1_2_1_1.setBounds(46, 433, 970, 26);
		panel_16_2_1.add(lblNewLabel_43_2_1_2_1_1);
		
		JPanel panel_6_7_3_2_1_2_1_1_1 = new JPanel();
		panel_6_7_3_2_1_2_1_1_1.setBounds(0, 470, 1530, 10);
		panel_16_2_1.add(panel_6_7_3_2_1_2_1_1_1);
		
		JLabel lblNewLabel_43_2_1_2_1_2 = new JLabel("11. El profesor utiliza materiales educativos relacionados con el contenido del curso.");
		lblNewLabel_43_2_1_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_2_1_2_1_2.setBounds(10, 490, 970, 26);
		panel_16_2_1.add(lblNewLabel_43_2_1_2_1_2);
		
		JPanel panel_6_7_3_2_1_2_1_1_1_1 = new JPanel();
		panel_6_7_3_2_1_2_1_1_1_1.setBounds(-192, 527, 1530, 10);
		panel_16_2_1.add(panel_6_7_3_2_1_2_1_1_1_1);
		
		JLabel lblNewLabel_43_2_1_2_1_2_1 = new JLabel("12. Cuando es oportuno, el profesor enriquece la clase con recursos tecnol\u00F3gicos y audiovisuales.");
		lblNewLabel_43_2_1_2_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_2_1_2_1_2_1.setBounds(10, 548, 1038, 26);
		panel_16_2_1.add(lblNewLabel_43_2_1_2_1_2_1);
		
		
	
		parte3_estudi_7_comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte3_estudi_7_comboBox.setModel(new DefaultComboBoxModel(new String[] {" ", "1", "2", "3", "4"}));
		parte3_estudi_7_comboBox.setBounds(1114, 183, 159, 34);
		panel_16_2_1.add(parte3_estudi_7_comboBox);
		
		parte3_estudi_7_comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String parte3Box7 = parte3_estudi_7_comboBox.getSelectedItem().toString();
				System.out.println("Box 7: " + parte3Box7);
			}
		});
		
		

		parte3_estudi_8_comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte3_estudi_8_comboBox.setModel(new DefaultComboBoxModel(new String[] {" ","1", "2", "3", "4"}));
		parte3_estudi_8_comboBox.setBounds(1114, 269, 159, 38);
		panel_16_2_1.add(parte3_estudi_8_comboBox);
		
		parte3_estudi_8_comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String parte3Box8 = parte3_estudi_8_comboBox.getSelectedItem().toString();
				System.out.println("Box 8: " + parte3Box8);
			}
		});
		
		
		
		parte3_estudi_9_comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte3_estudi_9_comboBox.setModel(new DefaultComboBoxModel(new String[] {" ","1", "2", "3", "4"}));
		parte3_estudi_9_comboBox.setBounds(1114, 347, 159, 33);
		panel_16_2_1.add(parte3_estudi_9_comboBox);
		
		parte3_estudi_9_comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String parte3Box9 = parte3_estudi_9_comboBox.getSelectedItem().toString();
				System.out.println("Box 9: " + parte3Box9);
			}
		});
		
		

		parte3_estudi_10_comboBox_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte3_estudi_10_comboBox_3.setModel(new DefaultComboBoxModel(new String[] {" ","1", "2", "3", "4"}));
		parte3_estudi_10_comboBox_3.setBounds(1114, 416, 159, 37);
		panel_16_2_1.add(parte3_estudi_10_comboBox_3);
		
		parte3_estudi_10_comboBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String parte3Box10 = parte3_estudi_10_comboBox_3.getSelectedItem().toString();
				System.out.println("Box 10: " + parte3Box10);
			}
		});
		
		

		parte3_estudi_11_comboBox_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte3_estudi_11_comboBox_3.setModel(new DefaultComboBoxModel(new String[] {" ", "1", "2", "3", "4"}));
		parte3_estudi_11_comboBox_3.setBounds(1114, 491, 159, 27);
		panel_16_2_1.add(parte3_estudi_11_comboBox_3);
		
		parte3_estudi_11_comboBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String parte3Box11 = parte3_estudi_11_comboBox_3.getSelectedItem().toString();
				System.out.println("Box 11: " + parte3Box11);
			}
		});
		
		
		
		parte3_estudi_12_comboBox_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte3_estudi_12_comboBox_3.setModel(new DefaultComboBoxModel(new String[] {" ","1", "2", "3", "4"}));
		parte3_estudi_12_comboBox_3.setBounds(1114, 548, 159, 41);
		panel_16_2_1.add(parte3_estudi_12_comboBox_3);
		
		parte3_estudi_12_comboBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String parte3Box12 = parte3_estudi_12_comboBox_3.getSelectedItem().toString();
				System.out.println("Box 12: " + parte3Box12);
				
			}
		});
		
		JLabel lblNewLabel_40_1_1 = new JLabel("PARTE III. Desarrollo de la clase. Utiliza la siguiente clave para las preguntas 5 al 12:");
		lblNewLabel_40_1_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_40_1_1.setBounds(375, 102, 1160, 49);
		panel_18.add(lblNewLabel_40_1_1);
		
		JLabel lblNewLabel_41_1_1 = new JLabel("(4) Totalmente de acuerdo (si) (3) Parcialmente de acuerdo (mayormente si) (2) Parcialmente en desacuerdo (mayormente no) (1) Totalmente en desacuerdo (no) (Espacio en blanco) No Aplica");
		lblNewLabel_41_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_41_1_1.setBounds(28, 162, 1827, 42);
		panel_18.add(lblNewLabel_41_1_1);
		
		JPanel panel_8_2_1_1 = new JPanel();
		panel_8_2_1_1.setLayout(null);
		panel_8_2_1_1.setBackground(Color.GRAY);
		panel_8_2_1_1.setBounds(1299, 836, 278, 75);
		panel_18.add(panel_8_2_1_1);
		
		parte3_estudiante_total_textField = new JTextField();
		parte3_estudiante_total_textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		parte3_estudiante_total_textField.setColumns(10);
		parte3_estudiante_total_textField.setBounds(21, 11, 236, 53);
		panel_8_2_1_1.add(parte3_estudiante_total_textField);
		
		JLabel lblNewLabel_21_3_1_1 = new JLabel("Total");
		lblNewLabel_21_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_21_3_1_1.setBounds(1185, 853, 90, 46);
		panel_18.add(lblNewLabel_21_3_1_1);
		
		JPanel panel_19 = new JPanel();
		tabbedPane_2.addTab("Parte III continuaci\u00F3n ", null, panel_19, null);
		panel_19.setLayout(null);
		
		JLabel lblNewLabel_39_1_1_1 = new JLabel("Evaluaci\u00F3n de Facultad por los Estudiantes");
		lblNewLabel_39_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 54));
		lblNewLabel_39_1_1_1.setBounds(183, 32, 1529, 135);
		panel_19.add(lblNewLabel_39_1_1_1);
		
		JLabel lblNewLabel_40_1_1_1 = new JLabel("PARTE III. Desarrollo de la clase. Utiliza la siguiente clave para las preguntas 13 al 17:");
		lblNewLabel_40_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_40_1_1_1.setBounds(382, 146, 1160, 49);
		panel_19.add(lblNewLabel_40_1_1_1);
		
		JLabel lblNewLabel_41_1_1_1 = new JLabel("(4) Totalmente de acuerdo (si) (3) Parcialmente de acuerdo (mayormente si) (2) Parcialmente en desacuerdo (mayormente no) (1) Totalmente en desacuerdo (no) (Espacio en blanco) No Aplica");
		lblNewLabel_41_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_41_1_1_1.setBounds(30, 206, 1827, 42);
		panel_19.add(lblNewLabel_41_1_1_1);
		
		JPanel panel_12_1 = new JPanel();
		panel_12_1.setLayout(null);
		panel_12_1.setBackground(Color.LIGHT_GRAY);
		panel_12_1.setBounds(278, 272, 1303, 482);
		panel_19.add(panel_12_1);
		
		JPanel panel_6_7_2_1_2 = new JPanel();
		panel_6_7_2_1_2.setBounds(0, 96, 1303, 10);
		panel_12_1.add(panel_6_7_2_1_2);
		
		JPanel panel_6_7_2_2_1 = new JPanel();
		panel_6_7_2_2_1.setBounds(0, 194, 1303, 10);
		panel_12_1.add(panel_6_7_2_2_1);
		
		JPanel panel_6_7_2_3_1 = new JPanel();
		panel_6_7_2_3_1.setBounds(0, 285, 1303, 10);
		panel_12_1.add(panel_6_7_2_3_1);
		
		JLabel lblNewLabel_27_1 = new JLabel("13. El profesor escucha y discute con respeto los planteamientos");
		lblNewLabel_27_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_27_1.setBounds(63, 45, 829, 27);
		panel_12_1.add(lblNewLabel_27_1);
		
		JLabel lblNewLabel_28_1 = new JLabel("14. El profesor toma medidas para asegurarse que yo entienda el");
		lblNewLabel_28_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_28_1.setBounds(63, 127, 916, 56);
		panel_12_1.add(lblNewLabel_28_1);
		
		JLabel lblNewLabel_29_1 = new JLabel("15. El profesor relaciona las ideas y temas presentados en el curso");
		lblNewLabel_29_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_29_1.setBounds(65, 231, 707, 27);
		panel_12_1.add(lblNewLabel_29_1);
		
		JLabel lblNewLabel_30_1 = new JLabel("16. El profesor promueve la participaci\u00F3n de los estudiantes");
		lblNewLabel_30_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_30_1.setBounds(63, 332, 729, 27);
		panel_12_1.add(lblNewLabel_30_1);
		
		JLabel lblNewLabel_31_1 = new JLabel("17. El profesor muestra inter\u00E9s por el aprovechamiento acad\u00E9mico");
		lblNewLabel_31_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_31_1.setBounds(63, 407, 784, 37);
		panel_12_1.add(lblNewLabel_31_1);
		
		JPanel panel_6_8_1_1_2 = new JPanel();
		panel_6_8_1_1_2.setBounds(989, 0, 10, 581);
		panel_12_1.add(panel_6_8_1_1_2);
		
		JPanel panel_6_7_2_3_1_1 = new JPanel();
		panel_6_7_2_3_1_1.setBounds(0, 386, 1303, 10);
		panel_12_1.add(panel_6_7_2_3_1_1);
		
		

		parte3_desarollo_de_clase_13_comboBox.setModel(new DefaultComboBoxModel(new String[] {" ","1", "2", "3", "4"}));
		parte3_desarollo_de_clase_13_comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte3_desarollo_de_clase_13_comboBox.setBounds(1071, 32, 159, 38);
		panel_12_1.add(parte3_desarollo_de_clase_13_comboBox);
		
		parte3_desarollo_de_clase_13_comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String parte3Box13 = parte3_desarollo_de_clase_13_comboBox.getSelectedItem().toString();
				System.out.println("Box 13: " + parte3Box13);
			}
		});
		
		

		parte3_desarollo_de_clase_14_comboBox.setModel(new DefaultComboBoxModel(new String[] {" ", "1", "2", "3", "4"}));
		parte3_desarollo_de_clase_14_comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte3_desarollo_de_clase_14_comboBox.setBounds(1071, 127, 159, 38);
		panel_12_1.add(parte3_desarollo_de_clase_14_comboBox);
		
		parte3_desarollo_de_clase_14_comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String parte3Box14 = parte3_desarollo_de_clase_14_comboBox.getSelectedItem().toString();
				System.out.println("Box 14: " + parte3Box14);
			}
		});
		
		

		parte3_desarollo_de_clase_15_comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {" ","1", "2", "3", "4"}));
		parte3_desarollo_de_clase_15_comboBox_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte3_desarollo_de_clase_15_comboBox_1_1.setBounds(1071, 220, 159, 38);
		panel_12_1.add(parte3_desarollo_de_clase_15_comboBox_1_1);
		
		parte3_desarollo_de_clase_15_comboBox_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String parte3Box15 = parte3_desarollo_de_clase_15_comboBox_1_1.getSelectedItem().toString();
				System.out.println("Box 15: " + parte3Box15);
			}
		});
		
		

		parte3_desarollo_de_clase_16_comboBox.setModel(new DefaultComboBoxModel(new String[] {" ","1", "2", "3", "4"}));
		parte3_desarollo_de_clase_16_comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte3_desarollo_de_clase_16_comboBox.setBounds(1071, 321, 159, 38);
		panel_12_1.add(parte3_desarollo_de_clase_16_comboBox);
		
		parte3_desarollo_de_clase_16_comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String parte3Box16 = parte3_desarollo_de_clase_16_comboBox.getSelectedItem().toString();
				System.out.println("Box 16: " + parte3Box16);
			}
		});
		
		
		
		parte3_desarollo_de_clase_17_comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {" ","1", "2", "3", "4"}));
		parte3_desarollo_de_clase_17_comboBox_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte3_desarollo_de_clase_17_comboBox_1_1.setBounds(1071, 418, 159, 38);
		panel_12_1.add(parte3_desarollo_de_clase_17_comboBox_1_1);
		
		parte3_desarollo_de_clase_17_comboBox_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String parte3Box17 = parte3_desarollo_de_clase_17_comboBox_1_1.getSelectedItem().toString();
				System.out.println("Box 17: " + parte3Box17);
			}
		});
		
		JPanel panel_8_2_1_1_1 = new JPanel();
		panel_8_2_1_1_1.setLayout(null);
		panel_8_2_1_1_1.setBackground(Color.GRAY);
		panel_8_2_1_1_1.setBounds(1288, 783, 278, 75);
		panel_19.add(panel_8_2_1_1_1);
		
		parte3_continuacion_total_textField = new JTextField();
		parte3_continuacion_total_textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		parte3_continuacion_total_textField.setColumns(10);
		parte3_continuacion_total_textField.setBounds(21, 11, 236, 53);
		panel_8_2_1_1_1.add(parte3_continuacion_total_textField);
		
		JLabel lblNewLabel_21_3_1_1_1 = new JLabel("Total");
		lblNewLabel_21_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_21_3_1_1_1.setBounds(1174, 804, 90, 46);
		panel_19.add(lblNewLabel_21_3_1_1_1);
		
		JPanel panel_20 = new JPanel();
		tabbedPane_2.addTab("Parte IV", null, panel_20, null);
		panel_20.setLayout(null);
		
		JLabel lblNewLabel_39_1_1_1_1 = new JLabel("Evaluaci\u00F3n de Facultad por los Estudiantes");
		lblNewLabel_39_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 54));
		lblNewLabel_39_1_1_1_1.setBounds(322, 0, 1529, 107);
		panel_20.add(lblNewLabel_39_1_1_1_1);
		
		JLabel lblNewLabel_40_1_1_1_1 = new JLabel("Gerencia del proceso de ense\u00F1anza aprendizaje");
		lblNewLabel_40_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_40_1_1_1_1.setBounds(646, 99, 503, 49);
		panel_20.add(lblNewLabel_40_1_1_1_1);
		
		JLabel lblNewLabel_41_1_1_1_1 = new JLabel("(4) Totalmente de acuerdo (si) (3) Parcialmente de acuerdo (mayormente si) (2) Parcialmente en desacuerdo (mayormente no) (1) Totalmente en desacuerdo (no) (Espacio en blanco) No Aplica");
		lblNewLabel_41_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_41_1_1_1_1.setBounds(45, 146, 1827, 42);
		panel_20.add(lblNewLabel_41_1_1_1_1);
		
		JPanel panel_16_2_1_1 = new JPanel();
		panel_16_2_1_1.setLayout(null);
		panel_16_2_1_1.setBackground(Color.LIGHT_GRAY);
		panel_16_2_1_1.setBounds(285, 220, 1338, 656);
		panel_20.add(panel_16_2_1_1);
		
		JLabel lblNewLabel_42_2_2_1 = new JLabel("18. El profesor presenta la clase en forma organizada y coherente.");
		lblNewLabel_42_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_42_2_2_1.setBounds(10, 27, 941, 38);
		panel_16_2_1_1.add(lblNewLabel_42_2_2_1);
		
		JLabel lblNewLabel_43_2_1_3 = new JLabel("21. El profesor explica claramente c\u00F3mo los estudiantes ser\u00E1n ");
		lblNewLabel_43_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_2_1_3.setBounds(10, 226, 970, 26);
		panel_16_2_1_1.add(lblNewLabel_43_2_1_3);
		
		JPanel panel_6_7_3_2_1_3 = new JPanel();
		panel_6_7_3_2_1_3.setBounds(0, 135, 1530, 10);
		panel_16_2_1_1.add(panel_6_7_3_2_1_3);
		
		JPanel panel_6_8_2_2_1_1 = new JPanel();
		panel_6_8_2_2_1_1.setBounds(1053, 0, 10, 669);
		panel_16_2_1_1.add(panel_6_8_2_2_1_1);
		
		

		parte5_gerencia_18_comboBox_1.setModel(new DefaultComboBoxModel(new String[] {" ","1", "2", "3", "4"}));
		parte5_gerencia_18_comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte5_gerencia_18_comboBox_1.setBounds(1114, 29, 159, 38);
		panel_16_2_1_1.add(parte5_gerencia_18_comboBox_1);
		
		parte5_gerencia_18_comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String parte4Box18 = parte5_gerencia_18_comboBox_1.getSelectedItem().toString();
				System.out.println("Box 18: " + parte4Box18);
			}
		});
		
		
	
		parte5_gerencia_19_comboBox_1.setModel(new DefaultComboBoxModel(new String[] {" ","1", "2", "3", "4"}));
		parte5_gerencia_19_comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte5_gerencia_19_comboBox_1.setBounds(1114, 97, 159, 27);
		panel_16_2_1_1.add(parte5_gerencia_19_comboBox_1);
		
		parte5_gerencia_19_comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String parte4Box19 = parte5_gerencia_19_comboBox_1.getSelectedItem().toString();
				System.out.println("Box 19: " + parte4Box19);
			}
		});
		
		JLabel lblNewLabel_42_2_1_2_1 = new JLabel("19. El profesor explica el material con claridad.");
		lblNewLabel_42_2_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_42_2_1_2_1.setBounds(10, 97, 941, 38);
		panel_16_2_1_1.add(lblNewLabel_42_2_1_2_1);
		
		JLabel lblNewLabel_42_2_1_1_1_1 = new JLabel("20. El profesor cumple con el horario de clase.");
		lblNewLabel_42_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_42_2_1_1_1_1.setBounds(10, 156, 941, 38);
		panel_16_2_1_1.add(lblNewLabel_42_2_1_1_1_1);
		
		JPanel panel_6_7_3_2_1_1_1 = new JPanel();
		panel_6_7_3_2_1_1_1.setBounds(0, 76, 1530, 10);
		panel_16_2_1_1.add(panel_6_7_3_2_1_1_1);
		
		JPanel panel_6_7_3_2_1_2_2 = new JPanel();
		panel_6_7_3_2_1_2_2.setBounds(0, 205, 1530, 10);
		panel_16_2_1_1.add(panel_6_7_3_2_1_2_2);
		
		JLabel lblNewLabel_43_2_1_1_1 = new JLabel("evaluados conforme al prontuario");
		lblNewLabel_43_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_2_1_1_1.setBounds(666, 226, 370, 26);
		panel_16_2_1_1.add(lblNewLabel_43_2_1_1_1);
		
		JPanel panel_6_7_3_2_1_2_1_2 = new JPanel();
		panel_6_7_3_2_1_2_1_2.setBounds(0, 263, 1530, 10);
		panel_16_2_1_1.add(panel_6_7_3_2_1_2_1_2);
		
		JLabel lblNewLabel_43_2_1_2_2 = new JLabel("22. Los ex\u00E1menes y trabajos responden al contenido del curso.");
		lblNewLabel_43_2_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_2_1_2_2.setBounds(10, 284, 970, 26);
		panel_16_2_1_1.add(lblNewLabel_43_2_1_2_2);
		
		JPanel panel_6_7_3_2_1_2_1_1_2 = new JPanel();
		panel_6_7_3_2_1_2_1_1_2.setBounds(0, 321, 1530, 10);
		panel_16_2_1_1.add(panel_6_7_3_2_1_2_1_1_2);
		
		JLabel lblNewLabel_43_2_1_2_1_3 = new JLabel("23. El profesor utiliza diversos m\u00E9todos para evaluar el aprendizaje. ");
		lblNewLabel_43_2_1_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_2_1_2_1_3.setBounds(10, 342, 970, 26);
		panel_16_2_1_1.add(lblNewLabel_43_2_1_2_1_3);
		
		JPanel panel_6_7_3_2_1_2_1_1_1_2 = new JPanel();
		panel_6_7_3_2_1_2_1_1_1_2.setBounds(0, 379, 1530, 10);
		panel_16_2_1_1.add(panel_6_7_3_2_1_2_1_1_1_2);
		
		JLabel lblNewLabel_43_2_1_2_1_2_2 = new JLabel("24. El profesor corrige los ex\u00E1menes y trabajos, seg\u00FAn los criterios establecidos en el prontuario.");
		lblNewLabel_43_2_1_2_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_2_1_2_1_2_2.setBounds(10, 400, 1021, 26);
		panel_16_2_1_1.add(lblNewLabel_43_2_1_2_1_2_2);
		
		JPanel panel_6_7_3_2_1_2_1_1_1_1_1 = new JPanel();
		panel_6_7_3_2_1_2_1_1_1_1_1.setBounds(0, 437, 1530, 10);
		panel_16_2_1_1.add(panel_6_7_3_2_1_2_1_1_1_1_1);
		
		JLabel lblNewLabel_43_2_1_2_1_2_1_1 = new JLabel("25. El profesor hace recomendaciones sobre los trabajos que presentan los estudiantes.");
		lblNewLabel_43_2_1_2_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_2_1_2_1_2_1_1.setBounds(10, 458, 1038, 26);
		panel_16_2_1_1.add(lblNewLabel_43_2_1_2_1_2_1_1);
		
		

		parte5_gerencia_20_comboBox_1.setModel(new DefaultComboBoxModel(new String[] {" ","1", "2", "3", "4"}));
		parte5_gerencia_20_comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte5_gerencia_20_comboBox_1.setBounds(1114, 156, 159, 34);
		panel_16_2_1_1.add(parte5_gerencia_20_comboBox_1);
		
		parte5_gerencia_20_comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String parte4Box20 = parte5_gerencia_20_comboBox_1.getSelectedItem().toString();
				System.out.println("Box 20: " + parte4Box20);				
			}
		});
		
		

		parte5_gerencia_21_comboBox_1.setModel(new DefaultComboBoxModel(new String[] {" ","1", "2", "3", "4"}));
		parte5_gerencia_21_comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte5_gerencia_21_comboBox_1.setBounds(1114, 222, 159, 38);
		panel_16_2_1_1.add(parte5_gerencia_21_comboBox_1);
		
		parte5_gerencia_21_comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String parte4Box21 = parte5_gerencia_21_comboBox_1.getSelectedItem().toString();
				System.out.println("Box 21: " + parte4Box21);
			}
		});
		
		
		
		parte5_gerencia_22_comboBox_1.setModel(new DefaultComboBoxModel(new String[] {" ","1", "2", "3", "4"}));
		parte5_gerencia_22_comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte5_gerencia_22_comboBox_1.setBounds(1114, 283, 159, 33);
		panel_16_2_1_1.add(parte5_gerencia_22_comboBox_1);
		
		parte5_gerencia_22_comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String parte4Box22 = parte5_gerencia_22_comboBox_1.getSelectedItem().toString();
				System.out.println("Box 22: " + parte4Box22);
				
			}
		});
		
		

		parte5_gerencia_23_comboBox_1.setModel(new DefaultComboBoxModel(new String[] {" ","1", "2", "3", "4"}));
		parte5_gerencia_23_comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte5_gerencia_23_comboBox_1.setBounds(1114, 339, 159, 37);
		panel_16_2_1_1.add(parte5_gerencia_23_comboBox_1);
		
		parte5_gerencia_23_comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String parte4Box23 = parte5_gerencia_23_comboBox_1.getSelectedItem().toString();
				System.out.println("Box 23: " + parte4Box23);
			}
		});
		
		

		parte5_gerencia_24_comboBox_1.setModel(new DefaultComboBoxModel(new String[] {" ","1", "2", "3", "4"}));
		parte5_gerencia_24_comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte5_gerencia_24_comboBox_1.setBounds(1114, 400, 159, 27);
		panel_16_2_1_1.add(parte5_gerencia_24_comboBox_1);
		
		parte5_gerencia_24_comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String parte4Box24 = parte5_gerencia_24_comboBox_1.getSelectedItem().toString();
				System.out.println("Box 24: " + parte4Box24);
				
			}
		});
		
		
		
		parte5_gerencia_25_comboBox_1.setModel(new DefaultComboBoxModel(new String[] {" ","1", "2", "3", "4"}));
		parte5_gerencia_25_comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte5_gerencia_25_comboBox_1.setBounds(1114, 453, 159, 31);
		panel_16_2_1_1.add(parte5_gerencia_25_comboBox_1);
		
		parte5_gerencia_25_comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String parte4Box25 = parte5_gerencia_25_comboBox_1.getSelectedItem().toString();
				System.out.println("Box 25: " + parte4Box25);
			}
		});
		
		JLabel lblNewLabel_43_2_1_2_1_2_1_1_1 = new JLabel("26. El profesor informa los resultados de los ex\u00E1menes y trabajos corregidos,  preferiblemente  ");
		lblNewLabel_43_2_1_2_1_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_2_1_2_1_2_1_1_1.setBounds(10, 517, 1038, 26);
		panel_16_2_1_1.add(lblNewLabel_43_2_1_2_1_2_1_1_1);
		
		JLabel lblNewLabel_43_2_1_2_1_2_1_1_1_1 = new JLabel("");
		lblNewLabel_43_2_1_2_1_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_2_1_2_1_2_1_1_1_1.setBounds(344, 529, 648, 26);
		panel_16_2_1_1.add(lblNewLabel_43_2_1_2_1_2_1_1_1_1);
		
		JLabel lblNewLabel_43_2_1_2_1_2_1_1_1_2 = new JLabel("en o antes de dos semanas.");
		lblNewLabel_43_2_1_2_1_2_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_2_1_2_1_2_1_1_1_2.setBounds(48, 538, 1038, 41);
		panel_16_2_1_1.add(lblNewLabel_43_2_1_2_1_2_1_1_1_2);
		
		JPanel panel_6_7_3_2_1_2_1_1_1_1_1_1 = new JPanel();
		panel_6_7_3_2_1_2_1_1_1_1_1_1.setBounds(0, 496, 1530, 10);
		panel_16_2_1_1.add(panel_6_7_3_2_1_2_1_1_1_1_1_1);
		
		
		
		
		parte5_gerencia_26_comboBox_1.setModel(new DefaultComboBoxModel(new String[] { " ","1", "2", "3", "4"}));
		parte5_gerencia_26_comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte5_gerencia_26_comboBox_1.setBounds(1114, 529, 159, 31);
		panel_16_2_1_1.add(parte5_gerencia_26_comboBox_1);
		
		parte5_gerencia_26_comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String parte4Box26 = parte5_gerencia_26_comboBox_1.getSelectedItem().toString();
				System.out.println("Box 26: " + parte4Box26);
			}
		});
		
		JPanel panel_6_7_3_2_1_2_1_1_1_1_1_1_1 = new JPanel();
		panel_6_7_3_2_1_2_1_1_1_1_1_1_1.setBounds(-36, 583, 1530, 10);
		panel_16_2_1_1.add(panel_6_7_3_2_1_2_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_43_2_1_2_1_2_1_1_2 = new JLabel("27. El profesor discute los resultados de las evaluaciones con los estudiantes");
		lblNewLabel_43_2_1_2_1_2_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_2_1_2_1_2_1_1_2.setBounds(10, 620, 1038, 26);
		panel_16_2_1_1.add(lblNewLabel_43_2_1_2_1_2_1_1_2);
		
		
		parte5_gerencia_27_comboBox.setModel(new DefaultComboBoxModel(new String[] {" ","1", "2", "3", "4"}));
		parte5_gerencia_27_comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte5_gerencia_27_comboBox.setBounds(1114, 604, 159, 28);
		panel_16_2_1_1.add(parte5_gerencia_27_comboBox);
		
		parte5_gerencia_27_comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String parte4Box27 = parte5_gerencia_27_comboBox.getSelectedItem().toString();
				System.out.println("Box 27: " + parte4Box27);
			}
		});
		
		JLabel lblNewLabel_21_3_1_1_2 = new JLabel("Total");
		lblNewLabel_21_3_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_21_3_1_1_2.setBounds(1730, 777, 90, 46);
		panel_20.add(lblNewLabel_21_3_1_1_2);
		
		JPanel panel_8_2_1_1_1_1 = new JPanel();
		panel_8_2_1_1_1_1.setLayout(null);
		panel_8_2_1_1_1_1.setBackground(Color.GRAY);
		panel_8_2_1_1_1_1.setBounds(1712, 834, 129, 56);
		panel_20.add(panel_8_2_1_1_1_1);
		
		parte3_gerencia_total_textField = new JTextField();
		parte3_gerencia_total_textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		parte3_gerencia_total_textField.setColumns(10);
		parte3_gerencia_total_textField.setBounds(25, 11, 75, 34);
		panel_8_2_1_1_1_1.add(parte3_gerencia_total_textField);
		
		JPanel panel_21 = new JPanel();
		tabbedPane_2.addTab("Parte IV continuaci\u00F3n", null, panel_21, null);
		panel_21.setLayout(null);
		
		JPanel panel_16_3 = new JPanel();
		panel_16_3.setLayout(null);
		panel_16_3.setBackground(Color.LIGHT_GRAY);
		panel_16_3.setBounds(266, 270, 1338, 416);
		panel_21.add(panel_16_3);
		
		JLabel lblNewLabel_42_3 = new JLabel("28. El profesor exhorta a los estudiantes a comunicarse con \u00E9l, en caso de que surjan ");
		lblNewLabel_42_3.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_42_3.setBounds(10, 97, 945, 38);
		panel_16_3.add(lblNewLabel_42_3);
		
		JLabel lblNewLabel_43_3 = new JLabel("29. El profesor provee la oportunidad de reunirse con \u00E9l en sus ");
		lblNewLabel_43_3.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_3.setBounds(10, 297, 970, 26);
		panel_16_3.add(lblNewLabel_43_3);
		
		JPanel panel_6_7_3_3 = new JPanel();
		panel_6_7_3_3.setBounds(-159, 208, 1530, 10);
		panel_16_3.add(panel_6_7_3_3);
		
		JPanel panel_6_8_2_3 = new JPanel();
		panel_6_8_2_3.setBounds(990, -55, 10, 495);
		panel_16_3.add(panel_6_8_2_3);
		
		
		parte5_gerencia_28_comboBox.setModel(new DefaultComboBoxModel(new String[] {" ","1", "2", "3", "4"}));
		parte5_gerencia_28_comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte5_gerencia_28_comboBox.setBounds(1092, 97, 159, 38);
		panel_16_3.add(parte5_gerencia_28_comboBox);

		parte5_gerencia_28_comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String parte4Box28 = parte5_gerencia_28_comboBox.getSelectedItem().toString();
				System.out.println("Box 28: " + parte4Box28);
			}
		});
		
		
		parte5_gerencia_29_comboBox.setModel(new DefaultComboBoxModel(new String[] {" ","1", "2", "3", "4"}));
		parte5_gerencia_29_comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte5_gerencia_29_comboBox.setBounds(1092, 303, 159, 38);
		panel_16_3.add(parte5_gerencia_29_comboBox);
		
		parte5_gerencia_29_comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String parte4Box29 = parte5_gerencia_29_comboBox.getSelectedItem().toString();
				System.out.println("Box 28: " + parte4Box29);
			}
		});
		
		JLabel lblNewLabel_42_3_1 = new JLabel(" dudas relacionadas con los temas del curso y sus evaluaciones.");
		lblNewLabel_42_3_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_42_3_1.setBounds(43, 126, 945, 38);
		panel_16_3.add(lblNewLabel_42_3_1);
		
		JLabel lblNewLabel_43_3_1 = new JLabel("horas de oficina.");
		lblNewLabel_43_3_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_3_1.setBounds(666, 297, 223, 26);
		panel_16_3.add(lblNewLabel_43_3_1);
		
		JLabel lblNewLabel_39_1_1_1_1_1 = new JLabel("Evaluaci\u00F3n de Facultad por los Estudiantes");
		lblNewLabel_39_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 54));
		lblNewLabel_39_1_1_1_1_1.setBounds(355, 38, 1529, 135);
		panel_21.add(lblNewLabel_39_1_1_1_1_1);
		
		JLabel lblNewLabel_40_1_1_1_1_1 = new JLabel("Gerencia del proceso de ense\u00F1anza aprendizaje");
		lblNewLabel_40_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_40_1_1_1_1_1.setBounds(682, 146, 503, 49);
		panel_21.add(lblNewLabel_40_1_1_1_1_1);
		
		JLabel lblNewLabel_41_1_1_1_1_1 = new JLabel("(4) Totalmente de acuerdo (si) (3) Parcialmente de acuerdo (mayormente si) (2) Parcialmente en desacuerdo (mayormente no) (1) Totalmente en desacuerdo (no) (Espacio en blanco) No Aplica");
		lblNewLabel_41_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_41_1_1_1_1_1.setBounds(28, 195, 1827, 42);
		panel_21.add(lblNewLabel_41_1_1_1_1_1);
		
		JButton guardar_parte3_estudiante_btnNewButton_1_2 = new JButton("GUARDAR");
		guardar_parte3_estudiante_btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		guardar_parte3_estudiante_btnNewButton_1_2.setBounds(695, 747, 336, 75);
		panel_21.add(guardar_parte3_estudiante_btnNewButton_1_2);
		
		JPanel panel_8_2_1_1_1_2 = new JPanel();
		panel_8_2_1_1_1_2.setLayout(null);
		panel_8_2_1_1_1_2.setBackground(Color.GRAY);
		panel_8_2_1_1_1_2.setBounds(1292, 747, 278, 75);
		panel_21.add(panel_8_2_1_1_1_2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_2.setColumns(10);
		textField_2.setBounds(21, 11, 236, 53);
		panel_8_2_1_1_1_2.add(textField_2);
		
		JLabel lblNewLabel_21_3_1_1_1_1 = new JLabel("Total");
		lblNewLabel_21_3_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_21_3_1_1_1_1.setBounds(1192, 762, 90, 46);
		panel_21.add(lblNewLabel_21_3_1_1_1_1);
		
		JLabel lblNewLabel_46 = new JLabel("New label");
		tabbedPane.addTab("New tab", null, lblNewLabel_46, null);
		
		
		//////////////////////// Termina Instrumento I //////////////////////////////
		
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Instrumento II", null, tabbedPane_1, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane_1.addTab("Calidad Docente", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calidad Docente:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(551, 158, 293, 52);
		panel_1.add(lblNewLabel);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(81, 297, 849, -11);
		panel_1.add(horizontalStrut);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.LIGHT_GRAY);
		panel_4.setBounds(117, 215, 1530, 611);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("h. Posesi\u00F3n de los atributos de integridad, laboriosidad, liberalidad y objetividad en la ense\u00F1anza ");
		lblNewLabel_8.setBounds(10, 549, 897, 52);
		panel_4.add(lblNewLabel_8);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 21));
		
		JLabel lblNewLabel_7 = new JLabel("g. Disponibilidad y eficacia en la orientaci\u00F3n acad\u00E9mica del estudiante");
		lblNewLabel_7.setBounds(10, 522, 804, 35);
		panel_4.add(lblNewLabel_7);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 21));
		
		JLabel lblNewLabel_6 = new JLabel("f. Habilidad para desarrollar y utilizar m\u00E9todos y estrategias adecuadas,incluyendo \u201Cassessment\u201D para una ense\u00F1anza efectiva");
		lblNewLabel_6.setBounds(10, 424, 1307, 71);
		panel_4.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 21));
		
		JLabel lblNewLabel_5 = new JLabel("e. Habilidad para promover y ampliar el inter\u00E9s del estudiante en la disciplina");
		lblNewLabel_5.setBounds(10, 363, 759, 35);
		panel_4.add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 21));
		
		JLabel lblNewLabel_4 = new JLabel("d. Habilidad para relacionar la disciplina con otras esferas del");
		lblNewLabel_4.setBounds(10, 287, 685, 35);
		panel_4.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 21));
		
		JLabel lblNewLabel_3 = new JLabel("c. Conocimiento de los desarrollos actuales de la disciplina");
		lblNewLabel_3.setBounds(10, 217, 685, 35);
		panel_4.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 21));
		
		JLabel lblNewLabel_2 = new JLabel("b. Habilidad para organizar el contenido y presentarlo en forma");
		lblNewLabel_2.setBounds(10, 127, 666, 59);
		panel_4.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		
		JLabel lblNewLabel_1 = new JLabel("a. Dominio de la disciplina que ense\u00F1a");
		lblNewLabel_1.setBounds(10, 24, 430, 71);
		panel_4.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(0, 106, 1530, 10);
		panel_4.add(panel_6);
		
		JPanel panel_6_1 = new JPanel();
		panel_6_1.setBounds(0, 197, 1530, 10);
		panel_4.add(panel_6_1);
		
		JPanel panel_6_2 = new JPanel();
		panel_6_2.setBounds(0, 266, 1530, 10);
		panel_4.add(panel_6_2);
		
		JPanel panel_6_3 = new JPanel();
		panel_6_3.setBounds(0, 333, 1530, 10);
		panel_4.add(panel_6_3);
		
		JPanel panel_6_4 = new JPanel();
		panel_6_4.setBounds(0, 409, 1530, 10);
		panel_4.add(panel_6_4);
		
		JPanel panel_6_5 = new JPanel();
		panel_6_5.setBounds(0, 501, 1530, 10);
		panel_4.add(panel_6_5);
		
		JPanel panel_6_6 = new JPanel();
		panel_6_6.setBounds(1244, 0, 10, 611);
		panel_4.add(panel_6_6);
		
		JComboBox auto_a_comboBox = new JComboBox();
		auto_a_comboBox.setBounds(1321, 39, 144, 44);
		panel_4.add(auto_a_comboBox);
		
		JComboBox auto_b_comboBox = new JComboBox();
		auto_b_comboBox.setBounds(1321, 130, 144, 44);
		panel_4.add(auto_b_comboBox);
		
		JComboBox auto_c_comboBox = new JComboBox();
		auto_c_comboBox.setBounds(1321, 217, 144, 35);
		panel_4.add(auto_c_comboBox);
		
		JComboBox auto_d_comboBox = new JComboBox();
		auto_d_comboBox.setBounds(1321, 287, 144, 35);
		panel_4.add(auto_d_comboBox);
		
		JComboBox auto_e_comboBox = new JComboBox();
		auto_e_comboBox.setBounds(1321, 354, 144, 44);
		panel_4.add(auto_e_comboBox);
		
		JComboBox auto_f_comboBox = new JComboBox();
		auto_f_comboBox.setBounds(1321, 435, 144, 44);
		panel_4.add(auto_f_comboBox);
		
		JComboBox auto_g_comboBox = new JComboBox();
		auto_g_comboBox.setBounds(1321, 532, 144, 44);
		panel_4.add(auto_g_comboBox);
		
		JLabel lblNewLabel_11 = new JLabel("Puntuaci\u00F3n");
		lblNewLabel_11.setForeground(Color.BLACK);
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_11.setBounds(1447, 164, 168, 40);
		panel_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Autoevaluaci\u00F3n Narrativa");
		lblNewLabel_12.setForeground(new Color(0, 100, 0));
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 65));
		lblNewLabel_12.setBounds(509, 11, 1117, 126);
		panel_1.add(lblNewLabel_12);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.GRAY);
		panel_9.setBounds(1371, 828, 276, 71);
		panel_1.add(panel_9);
		panel_9.setLayout(null);
		
		calidad_total_textField = new JTextField();
		calidad_total_textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		calidad_total_textField.setBounds(29, 11, 224, 49);
		panel_9.add(calidad_total_textField);
		calidad_total_textField.setColumns(10);
		
		JLabel lblNewLabel_21_1 = new JLabel("Total");
		lblNewLabel_21_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_21_1.setBounds(1271, 837, 90, 46);
		panel_1.add(lblNewLabel_21_1);
		
		JPanel panel_3 = new JPanel();
		tabbedPane_1.addTab("Servicio a la instituci\u00F3n", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_12_1 = new JLabel("Autoevaluaci\u00F3n Narrativa");
		lblNewLabel_12_1.setForeground(new Color(0, 100, 0));
		lblNewLabel_12_1.setFont(new Font("Tahoma", Font.BOLD, 65));
		lblNewLabel_12_1.setBounds(552, 34, 895, 126);
		panel_3.add(lblNewLabel_12_1);
		
		JLabel lblNewLabel_13 = new JLabel("Servicio a la instituci\u00F3n: ");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_13.setBounds(552, 242, 386, 52);
		panel_3.add(lblNewLabel_13);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_5.setBounds(225, 312, 1509, 495);
		panel_3.add(panel_5);
		panel_5.setLayout(null);
		
		JPanel panel_6_7 = new JPanel();
		panel_6_7.setBounds(0, 117, 1530, 10);
		panel_5.add(panel_6_7);
		
		JPanel panel_6_8 = new JPanel();
		panel_6_8.setBounds(1192, 0, 10, 495);
		panel_5.add(panel_6_8);
		
		JLabel lblNewLabel_14 = new JLabel("a. Participaci\u00F3n y aportaci\u00F3n a reuniones de facultad y de comit\u00E9s a nivel de Recinto.");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_14.setBounds(38, 23, 1176, 26);
		panel_5.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("b. Servicio en comit\u00E9s y en organizaciones a nivel institucional");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_15.setBounds(38, 60, 763, 46);
		panel_5.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("c. Colaboraci\u00F3n en actividades estudiantiles");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_16.setBounds(38, 138, 781, 46);
		panel_5.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("d. Asistencia a actos oficiales");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_17.setBounds(38, 188, 701, 28);
		panel_5.add(lblNewLabel_17);
		
		JPanel panel_6_7_1 = new JPanel();
		panel_6_7_1.setBounds(0, 238, 1530, 10);
		panel_5.add(panel_6_7_1);
		
		JLabel lblNewLabel_18 = new JLabel("e. Designaci\u00F3n como director/a de departamento, presidente de comit\u00E9 y otras ");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_18.setBounds(38, 318, 979, 46);
		panel_5.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("f. Participaci\u00F3n en organismos de gobierno; tales como: el Senado y el Consejo");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_19.setBounds(38, 375, 881, 46);
		panel_5.add(lblNewLabel_19);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setBounds(1284, 29, 144, 44);
		panel_5.add(comboBox_8);
		
		JComboBox comboBox_8_1 = new JComboBox();
		comboBox_8_1.setBounds(1284, 154, 144, 44);
		panel_5.add(comboBox_8_1);
		
		JComboBox comboBox_8_2 = new JComboBox();
		comboBox_8_2.setBounds(1284, 334, 144, 44);
		panel_5.add(comboBox_8_2);
		
		JLabel lblNewLabel_20 = new JLabel("Puntuaci\u00F3n");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_20.setBounds(1510, 266, 175, 35);
		panel_3.add(lblNewLabel_20);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.GRAY);
		panel_8.setBounds(1425, 818, 309, 75);
		panel_3.add(panel_8);
		panel_8.setLayout(null);
		
		servicio_institucion_total_textField = new JTextField();
		servicio_institucion_total_textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		servicio_institucion_total_textField.setBounds(28, 11, 259, 53);
		panel_8.add(servicio_institucion_total_textField);
		servicio_institucion_total_textField.setColumns(10);
		
		JLabel lblNewLabel_21 = new JLabel("Total");
		lblNewLabel_21.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_21.setBounds(1328, 836, 90, 46);
		panel_3.add(lblNewLabel_21);
		
		JPanel panel_7 = new JPanel();
		tabbedPane_1.addTab("Servicio a la Comunidad", null, panel_7, null);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel_12_1_1 = new JLabel("Autoevaluaci\u00F3n Narrativa");
		lblNewLabel_12_1_1.setForeground(new Color(0, 100, 0));
		lblNewLabel_12_1_1.setFont(new Font("Tahoma", Font.BOLD, 65));
		lblNewLabel_12_1_1.setBounds(467, 34, 895, 126);
		panel_7.add(lblNewLabel_12_1_1);
		
		JLabel lblNewLabel_22 = new JLabel("Servicio a la Comunidad");
		lblNewLabel_22.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_22.setBounds(600, 258, 294, 53);
		panel_7.add(lblNewLabel_22);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.LIGHT_GRAY);
		panel_10.setBounds(330, 320, 1303, 404);
		panel_7.add(panel_10);
		panel_10.setLayout(null);
		
		JPanel panel_6_7_2 = new JPanel();
		panel_6_7_2.setBounds(0, 192, 1303, 10);
		panel_10.add(panel_6_7_2);
		
		JLabel lblNewLabel_23 = new JLabel("a. Servicio en el campo profesional del profesor como consultor o investigador");
		lblNewLabel_23.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_23.setBounds(22, 37, 815, 50);
		panel_10.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("b. Servicio como recurso: conferenciante de grupos de la comunidad, participaci\u00F3n ");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_24.setBounds(22, 80, 987, 52);
		panel_10.add(lblNewLabel_24);
		
		JPanel panel_6_8_1 = new JPanel();
		panel_6_8_1.setBounds(954, 0, 10, 404);
		panel_10.add(panel_6_8_1);
		
		JLabel lblNewLabel_25 = new JLabel("activa en gestiones pol\u00EDticas, religiosas o c\u00EDvicas");
		lblNewLabel_25.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_25.setBounds(51, 117, 513, 45);
		panel_10.add(lblNewLabel_25);
		
		JComboBox comboBox_8_3 = new JComboBox();
		comboBox_8_3.setBounds(1050, 72, 144, 44);
		panel_10.add(comboBox_8_3);
		
		JLabel lblNewLabel_20_1 = new JLabel("Puntuaci\u00F3n");
		lblNewLabel_20_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_20_1.setBounds(1376, 267, 175, 35);
		panel_7.add(lblNewLabel_20_1);
		
		JLabel lblNewLabel_21_2 = new JLabel("Total");
		lblNewLabel_21_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_21_2.setBounds(1208, 746, 90, 46);
		panel_7.add(lblNewLabel_21_2);
		
		JPanel panel_8_1 = new JPanel();
		panel_8_1.setLayout(null);
		panel_8_1.setBackground(Color.GRAY);
		panel_8_1.setBounds(1308, 735, 309, 75);
		panel_7.add(panel_8_1);
		
		servicio_comunidad_total_textField = new JTextField();
		servicio_comunidad_total_textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		servicio_comunidad_total_textField.setColumns(10);
		servicio_comunidad_total_textField.setBounds(27, 11, 259, 53);
		panel_8_1.add(servicio_comunidad_total_textField);
		
		JPanel panel_11 = new JPanel();
		tabbedPane_1.addTab("Investigaci\u00F3n y trabajo creativo", null, panel_11, null);
		panel_11.setLayout(null);
		
		JLabel lblNewLabel_12_1_1_1 = new JLabel("Autoevaluaci\u00F3n Narrativa");
		lblNewLabel_12_1_1_1.setForeground(new Color(0, 100, 0));
		lblNewLabel_12_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 65));
		lblNewLabel_12_1_1_1.setBounds(471, 30, 895, 126);
		panel_11.add(lblNewLabel_12_1_1_1);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(Color.LIGHT_GRAY);
		panel_12.setBounds(303, 263, 1303, 482);
		panel_11.add(panel_12);
		panel_12.setLayout(null);
		
		JPanel panel_6_7_2_1 = new JPanel();
		panel_6_7_2_1.setBounds(0, 96, 1303, 10);
		panel_12.add(panel_6_7_2_1);
		
		JPanel panel_6_7_2_2 = new JPanel();
		panel_6_7_2_2.setBounds(0, 232, 1303, 10);
		panel_12.add(panel_6_7_2_2);
		
		JPanel panel_6_7_2_3 = new JPanel();
		panel_6_7_2_3.setBounds(0, 407, 1303, 10);
		panel_12.add(panel_6_7_2_3);
		
		JLabel lblNewLabel_27 = new JLabel("a. Publicaciones");
		lblNewLabel_27.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_27.setBounds(63, 45, 401, 27);
		panel_12.add(lblNewLabel_27);
		
		JLabel lblNewLabel_28 = new JLabel("b. Presentaciones y trabajos creativos relacionados con la disciplina que ense\u00F1a");
		lblNewLabel_28.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_28.setBounds(63, 149, 916, 56);
		panel_12.add(lblNewLabel_28);
		
		JLabel lblNewLabel_29 = new JLabel("c. Propuestas dise\u00F1adas y presentadas");
		lblNewLabel_29.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_29.setBounds(63, 288, 707, 27);
		panel_12.add(lblNewLabel_29);
		
		JLabel lblNewLabel_30 = new JLabel("d. Concesi\u00F3n de ayudas para investigaci\u00F3n y proyectos");
		lblNewLabel_30.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_30.setBounds(63, 320, 729, 27);
		panel_12.add(lblNewLabel_30);
		
		JLabel lblNewLabel_31 = new JLabel("e. Invenciones, patentes, labor art\u00EDstica y actuaci\u00F3n");
		lblNewLabel_31.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_31.setBounds(63, 347, 598, 37);
		panel_12.add(lblNewLabel_31);
		
		JPanel panel_6_8_1_1 = new JPanel();
		panel_6_8_1_1.setBounds(989, 0, 10, 581);
		panel_12.add(panel_6_8_1_1);
		
		JComboBox comboBox_8_4 = new JComboBox();
		comboBox_8_4.setBounds(1060, 28, 144, 44);
		panel_12.add(comboBox_8_4);
		
		JComboBox comboBox_8_5 = new JComboBox();
		comboBox_8_5.setBounds(1060, 149, 144, 44);
		panel_12.add(comboBox_8_5);
		
		JComboBox comboBox_8_6 = new JComboBox();
		comboBox_8_6.setBounds(1060, 294, 144, 44);
		panel_12.add(comboBox_8_6);
		
		JLabel lblNewLabel_26 = new JLabel("Investigaci\u00F3n y trabajo creativo");
		lblNewLabel_26.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_26.setBounds(562, 199, 420, 53);
		panel_11.add(lblNewLabel_26);
		
		JLabel lblNewLabel_20_1_1 = new JLabel("Puntuaci\u00F3n");
		lblNewLabel_20_1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_20_1_1.setBounds(1363, 217, 175, 35);
		panel_11.add(lblNewLabel_20_1_1);
		
		JPanel panel_8_1_1 = new JPanel();
		panel_8_1_1.setLayout(null);
		panel_8_1_1.setBackground(Color.GRAY);
		panel_8_1_1.setBounds(1297, 768, 309, 75);
		panel_11.add(panel_8_1_1);
		
		investigacion_creativo_total_textField = new JTextField();
		investigacion_creativo_total_textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		investigacion_creativo_total_textField.setColumns(10);
		investigacion_creativo_total_textField.setBounds(27, 11, 259, 53);
		panel_8_1_1.add(investigacion_creativo_total_textField);
		
		JLabel lblNewLabel_21_2_1 = new JLabel("Total");
		lblNewLabel_21_2_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_21_2_1.setBounds(1197, 784, 90, 46);
		panel_11.add(lblNewLabel_21_2_1);
		
		JPanel panel_13 = new JPanel();
		tabbedPane_1.addTab("Crecimiento y Desarrollo Profesional", null, panel_13, null);
		panel_13.setLayout(null);
		
		JLabel lblNewLabel_12_1_1_1_1 = new JLabel("Autoevaluaci\u00F3n Narrativa");
		lblNewLabel_12_1_1_1_1.setForeground(new Color(0, 100, 0));
		lblNewLabel_12_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 65));
		lblNewLabel_12_1_1_1_1.setBounds(422, 21, 895, 126);
		panel_13.add(lblNewLabel_12_1_1_1_1);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(Color.LIGHT_GRAY);
		panel_14.setBounds(125, 277, 1636, 546);
		panel_13.add(panel_14);
		panel_14.setLayout(null);
		
		JPanel panel_6_7_2_1_1 = new JPanel();
		panel_6_7_2_1_1.setBounds(0, 204, 1648, 10);
		panel_14.add(panel_6_7_2_1_1);
		
		JLabel lblNewLabel_33 = new JLabel("a. Obtenci\u00F3n de premios, ayudas y becas");
		lblNewLabel_33.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_33.setBounds(46, 35, 819, 42);
		panel_14.add(lblNewLabel_33);
		
		JLabel lblNewLabel_34 = new JLabel("b. Nombramiento como asesor/a en agencias del gobierno estatal o federal");
		lblNewLabel_34.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_34.setBounds(46, 88, 1058, 47);
		panel_14.add(lblNewLabel_34);
		
		JLabel lblNewLabel_35 = new JLabel("c. Participaci\u00F3n activa en organizaciones profesionales");
		lblNewLabel_35.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_35.setBounds(46, 147, 884, 31);
		panel_14.add(lblNewLabel_35);
		
		JPanel panel_6_7_2_1_1_1 = new JPanel();
		panel_6_7_2_1_1_1.setBounds(0, 345, 1636, 10);
		panel_14.add(panel_6_7_2_1_1_1);
		
		JLabel lblNewLabel_36 = new JLabel("d. Recurso en conferencias y charlas");
		lblNewLabel_36.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_36.setBounds(46, 274, 805, 31);
		panel_14.add(lblNewLabel_36);
		
		JLabel lblNewLabel_37 = new JLabel("e. Participaci\u00F3n en conferencias, congresos o institutos");
		lblNewLabel_37.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_37.setBounds(46, 392, 674, 26);
		panel_14.add(lblNewLabel_37);
		
		JLabel lblNewLabel_38 = new JLabel("f. Educaci\u00F3n post doctoral, educaci\u00F3n continua");
		lblNewLabel_38.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_38.setBounds(46, 429, 659, 42);
		panel_14.add(lblNewLabel_38);
		
		JPanel panel_6_8_1_1_1 = new JPanel();
		panel_6_8_1_1_1.setBounds(1266, 0, 10, 581);
		panel_14.add(panel_6_8_1_1_1);
		
		JComboBox comboBox_8_7 = new JComboBox();
		comboBox_8_7.setBounds(1391, 77, 144, 44);
		panel_14.add(comboBox_8_7);
		
		JComboBox comboBox_8_8 = new JComboBox();
		comboBox_8_8.setBounds(1391, 256, 144, 44);
		panel_14.add(comboBox_8_8);
		
		JComboBox comboBox_8_9 = new JComboBox();
		comboBox_8_9.setBounds(1391, 427, 144, 44);
		panel_14.add(comboBox_8_9);
		
		JLabel lblNewLabel_32 = new JLabel("Crecimiento y Desarrollo Profesional");
		lblNewLabel_32.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_32.setBounds(422, 229, 388, 37);
		panel_13.add(lblNewLabel_32);
		
		JPanel panel_8_1_1_1 = new JPanel();
		panel_8_1_1_1.setLayout(null);
		panel_8_1_1_1.setBackground(Color.GRAY);
		panel_8_1_1_1.setBounds(1401, 835, 360, 75);
		panel_13.add(panel_8_1_1_1);
		
		crecimiento_profesional_total_textField = new JTextField();
		crecimiento_profesional_total_textField.setHorizontalAlignment(SwingConstants.CENTER);
		crecimiento_profesional_total_textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		crecimiento_profesional_total_textField.setColumns(10);
		crecimiento_profesional_total_textField.setBounds(27, 11, 310, 53);
		panel_8_1_1_1.add(crecimiento_profesional_total_textField);
		
		JLabel lblNewLabel_21_2_1_1 = new JLabel("Total");
		lblNewLabel_21_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_21_2_1_1.setBounds(1285, 853, 90, 46);
		panel_13.add(lblNewLabel_21_2_1_1);
		
		JLabel lblNewLabel_20_1_1_1 = new JLabel("Puntuaci\u00F3n");
		lblNewLabel_20_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_20_1_1_1.setBounds(1510, 231, 175, 35);
		panel_13.add(lblNewLabel_20_1_1_1);
		
		JButton guardar_crecimiento_desarrollo_btnNewButton_2 = new JButton("GUARDAR");
		guardar_crecimiento_desarrollo_btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		guardar_crecimiento_desarrollo_btnNewButton_2.setBounds(628, 853, 336, 54);
		panel_13.add(guardar_crecimiento_desarrollo_btnNewButton_2);
		
		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Instrumento III", null, tabbedPane_3, null);
		
		JPanel panel_22 = new JPanel();
		tabbedPane_3.addTab("Rubrica", null, panel_22, null);
		panel_22.setLayout(null);
		
		JLabel lblNewLabel_45 = new JLabel("");
		lblNewLabel_45.setIcon(new ImageIcon("C:\\Users\\natal\\OneDrive\\Pictures\\Screenshots\\Screenshot 2020-11-24 175722.jpg"));
		lblNewLabel_45.setBounds(513, 283, 1062, 415);
		panel_22.add(lblNewLabel_45);
		
		JLabel lblNewLabel_44_1 = new JLabel("Visita al sal\u00F3n de clase");
		lblNewLabel_44_1.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_44_1.setBounds(765, 52, 596, 123);
		panel_22.add(lblNewLabel_44_1);
		
		JLabel lblNewLabel_47 = new JLabel("Rubrica para la evaluaci\u00F3n");
		lblNewLabel_47.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_47.setBounds(892, 207, 596, 35);
		panel_22.add(lblNewLabel_47);
		
		JPanel panel_23 = new JPanel();
		tabbedPane_3.addTab("Criterio I", null, panel_23, null);
		panel_23.setLayout(null);
		
		JLabel lblNewLabel_48 = new JLabel("1. Domina el tema discutido en clase.");
		lblNewLabel_48.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48.setBounds(10, 145, 389, 41);
		panel_23.add(lblNewLabel_48);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane.setBounds(1095, 183, 637, 168);
		panel_23.add(textPane);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox.setBounds(796, 156, 94, 22);
		panel_23.add(comboBox);
		
		JLabel lblNewLabel_48_1 = new JLabel("2. Usa ejemplos o ejercicios relacionados con el tema de la clase.");
		lblNewLabel_48_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_1.setBounds(10, 364, 637, 41);
		panel_23.add(lblNewLabel_48_1);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1.setBounds(40, 183, 637, 168);
		panel_23.add(textPane_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_1.setBounds(796, 375, 94, 22);
		panel_23.add(comboBox_1);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_3.setBounds(796, 604, 94, 22);
		panel_23.add(comboBox_3);
		
		JLabel lblNewLabel_48_1_1 = new JLabel("3. Integra conceptos o experiencias de otras disciplinas para enriquecer la clase.");
		lblNewLabel_48_1_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_1_1.setBounds(10, 584, 762, 59);
		panel_23.add(lblNewLabel_48_1_1);
		
		JTextPane textPane_1_1 = new JTextPane();
		textPane_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_1.setBounds(40, 660, 637, 168);
		panel_23.add(textPane_1_1);
		
		JLabel lblNewLabel_48_1_1_1 = new JLabel("4. Relaciona la utilidad del tema con otros cursos o \u00E1reas del conocimiento.");
		lblNewLabel_48_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_1_1_1.setBounds(1070, 136, 762, 59);
		panel_23.add(lblNewLabel_48_1_1_1);
		
		JComboBox comboBox_3_1 = new JComboBox();
		comboBox_3_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_3_1.setBounds(1787, 156, 94, 22);
		panel_23.add(comboBox_3_1);
		
		JTextPane textPane_1_1_1 = new JTextPane();
		textPane_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_1_1.setBounds(40, 405, 637, 168);
		panel_23.add(textPane_1_1_1);
		
		JLabel lblNewLabel_48_2 = new JLabel("5. Presenta el tema en forma actualizada.");
		lblNewLabel_48_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_2.setBounds(1072, 364, 404, 41);
		panel_23.add(lblNewLabel_48_2);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_4.setBounds(1787, 375, 94, 22);
		panel_23.add(comboBox_4);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_2.setBounds(1095, 660, 637, 168);
		panel_23.add(textPane_2);
		
		JLabel lblNewLabel_48_2_1 = new JLabel("6. Incorpora en la clase las nuevas tendencias de la disciplina.");
		lblNewLabel_48_2_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_2_1.setBounds(1070, 593, 598, 41);
		panel_23.add(lblNewLabel_48_2_1);
		
		JComboBox comboBox_4_1 = new JComboBox();
		comboBox_4_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_4_1.setBounds(1787, 604, 94, 22);
		panel_23.add(comboBox_4_1);
		
		JTextPane textPane_2_1 = new JTextPane();
		textPane_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_2_1.setBounds(1095, 405, 637, 168);
		panel_23.add(textPane_2_1);
		
		JPanel panel_6_6_1 = new JPanel();
		panel_6_6_1.setBackground(UIManager.getColor("Button.disabledForeground"));
		panel_6_6_1.setBounds(994, 136, 10, 796);
		panel_23.add(panel_6_6_1);
		
		JLabel lblNewLabel_49 = new JLabel(" DOMINIO DE LA DISCIPLINA");
		lblNewLabel_49.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_49.setBounds(615, 38, 870, 87);
		panel_23.add(lblNewLabel_49);
		
		JPanel panel_6_6_1_1 = new JPanel();
		panel_6_6_1_1.setBackground(SystemColor.textInactiveText);
		panel_6_6_1_1.setBounds(-10, 124, 1904, 10);
		panel_23.add(panel_6_6_1_1);
		
		JPanel panel_24 = new JPanel();
		tabbedPane_3.addTab("Criterio II", null, panel_24, null);
		panel_24.setLayout(null);
		
		JLabel lblNewLabel_49_1 = new JLabel("ORGANIZACI\u00D3N Y PRESENTACI\u00D3N DEL CONTENIDO");
		lblNewLabel_49_1.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_49_1.setBounds(246, 33, 1401, 87);
		panel_24.add(lblNewLabel_49_1);
		
		JTextPane textPane_1_2 = new JTextPane();
		textPane_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_2.setBounds(66, 251, 637, 168);
		panel_24.add(textPane_1_2);
		
		JTextPane textPane_1_3 = new JTextPane();
		textPane_1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_3.setBounds(66, 496, 637, 168);
		panel_24.add(textPane_1_3);
		
		JTextPane textPane_1_4 = new JTextPane();
		textPane_1_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_4.setBounds(66, 724, 637, 168);
		panel_24.add(textPane_1_4);
		
		JTextPane textPane_1_5 = new JTextPane();
		textPane_1_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_5.setBounds(1079, 282, 637, 168);
		panel_24.add(textPane_1_5);
		
		JTextPane textPane_1_6 = new JTextPane();
		textPane_1_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_6.setBounds(1079, 513, 637, 168);
		panel_24.add(textPane_1_6);
		
		JLabel lblNewLabel_48_3 = new JLabel("7. Presenta el material de la clase en forma organizada y coherente.");
		lblNewLabel_48_3.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_3.setBounds(48, 199, 742, 41);
		panel_24.add(lblNewLabel_48_3);
		
		JLabel lblNewLabel_48_4 = new JLabel("8. Utiliza el vocabulario propio de la materia.");
		lblNewLabel_48_4.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_4.setBounds(48, 444, 742, 41);
		panel_24.add(lblNewLabel_48_4);
		
		JLabel lblNewLabel_48_5 = new JLabel("9. Cumple con los objetivos establecidos para la clase.");
		lblNewLabel_48_5.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_5.setBounds(48, 672, 710, 41);
		panel_24.add(lblNewLabel_48_5);
		
		JLabel lblNewLabel_48_6 = new JLabel("10. Utiliza el tiempo de la clase de acuerdo con los objetivos establecidos ");
		lblNewLabel_48_6.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_6.setBounds(1056, 199, 838, 41);
		panel_24.add(lblNewLabel_48_6);
		
		JLabel lblNewLabel_48_7 = new JLabel("11. Resume los conceptos discutidos en clase");
		lblNewLabel_48_7.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_7.setBounds(1056, 461, 591, 41);
		panel_24.add(lblNewLabel_48_7);
		
		JLabel lblNewLabel_48_6_1 = new JLabel("y las actividades planificadas.");
		lblNewLabel_48_6_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_6_1.setBounds(1095, 230, 838, 41);
		panel_24.add(lblNewLabel_48_6_1);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_5.setBounds(760, 212, 94, 22);
		panel_24.add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_6.setBounds(760, 457, 94, 22);
		panel_24.add(comboBox_6);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_7.setBounds(760, 685, 94, 22);
		panel_24.add(comboBox_7);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_9.setBounds(1782, 212, 94, 22);
		panel_24.add(comboBox_9);
		
		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_10.setBounds(1782, 474, 94, 22);
		panel_24.add(comboBox_10);
		
		JPanel panel_6_6_1_1_1 = new JPanel();
		panel_6_6_1_1_1.setBackground(SystemColor.textInactiveText);
		panel_6_6_1_1_1.setBounds(0, 160, 1914, 10);
		panel_24.add(panel_6_6_1_1_1);
		
		JPanel panel_6_6_1_2 = new JPanel();
		panel_6_6_1_2.setBackground(SystemColor.textInactiveText);
		panel_6_6_1_2.setBounds(948, 160, 10, 796);
		panel_24.add(panel_6_6_1_2);
		
		JPanel panel_25 = new JPanel();
		tabbedPane_3.addTab("Criterio III", null, panel_25, null);
		panel_25.setLayout(null);
		
		JLabel lblNewLabel_49_1_1 = new JLabel("PROMOCI\u00D3N DEL INTER\u00C9S DEL ESTUDIANTE");
		lblNewLabel_49_1_1.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_49_1_1.setBounds(321, 44, 1401, 87);
		panel_25.add(lblNewLabel_49_1_1);
		
		JPanel panel_6_6_1_1_1_1 = new JPanel();
		panel_6_6_1_1_1_1.setBackground(SystemColor.textInactiveText);
		panel_6_6_1_1_1_1.setBounds(0, 161, 1914, 10);
		panel_25.add(panel_6_6_1_1_1_1);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1797, Short.MAX_VALUE)
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 800, Short.MAX_VALUE)
		);
		panel_2.setLayout(gl_panel_2);
		
		comboboxItems ("test", "instru1");
		
	}
	
	public void comboboxItems(String ID, String op1) {
		String bruh = "hola";
		String[] ap = new String[35];
		
		fileManager continueI = new fileManager();
	    ap = continueI.combobox(ID, op1);
	
		 	 parte1_perfil_de_estudiante_1_comboBox.setSelectedItem(ap[0]);
		 	 if(ap[1] == "0") {
		 		parte1_perfil_de_estudiante_2_comboBox.setSelectedIndex(0);
		 	
		 	 }
		 	 else {
		 		 parte1_perfil_de_estudiante_2_comboBox.setSelectedItem(ap[1]);
		 	 }
		 	 
			 parte2_estudi_3_comboBox.setSelectedItem(ap[2]);
			 parte2_estudi_4_comboBox.setSelectedItem(ap[3]);
			 parte3_estudi_5_comboBox.setSelectedItem(ap[4]);
			 parte3_estudi_6_comboBox.setSelectedItem(ap[5]);
			 parte3_estudi_7_comboBox.setSelectedItem(ap[6]);
			 parte3_estudi_8_comboBox.setSelectedItem(ap[7]);
			 parte3_estudi_9_comboBox.setSelectedItem(ap[8]);
			 parte3_estudi_10_comboBox_3.setSelectedItem(ap[9]);
			 parte3_estudi_11_comboBox_3.setSelectedItem(ap[10]);
			 parte3_estudi_12_comboBox_3.setSelectedItem(ap[11]);
			 parte3_desarollo_de_clase_13_comboBox.setSelectedItem(ap[12]);
			 parte3_desarollo_de_clase_14_comboBox.setSelectedItem(ap[13]);
			 parte3_desarollo_de_clase_15_comboBox_1_1.setSelectedItem(ap[14]);
			 parte3_desarollo_de_clase_16_comboBox.setSelectedItem(ap[15]);
			 parte3_desarollo_de_clase_17_comboBox_1_1.setSelectedItem(ap[16]);
			 parte5_gerencia_18_comboBox_1.setSelectedItem(ap[17]);
			 parte5_gerencia_19_comboBox_1.setSelectedItem(ap[18]);
			 parte5_gerencia_20_comboBox_1.setSelectedItem(ap[19]);
			 parte5_gerencia_21_comboBox_1.setSelectedItem(ap[20]);
			 parte5_gerencia_22_comboBox_1.setSelectedItem(ap[21]);
			 parte5_gerencia_23_comboBox_1.setSelectedItem(ap[22]);
			 parte5_gerencia_24_comboBox_1.setSelectedItem(ap[23]);
			 parte5_gerencia_25_comboBox_1.setSelectedItem(ap[24]);
			 parte5_gerencia_26_comboBox_1.setSelectedItem(ap[25]);
			 parte5_gerencia_27_comboBox.setSelectedItem(ap[26]);
			 parte5_gerencia_28_comboBox.setSelectedItem(ap[27]);
			 parte5_gerencia_29_comboBox.setSelectedItem(ap[28]);
		
		
	}
}




