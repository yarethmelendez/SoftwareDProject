package systemEvaluation;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;

import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;


public class onlineEvaluation extends JFrame  {

	String[] values = new String[62];

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
	private JLabel titulo_curso_lblNewLabel;
	private JTextField servicio_institucion_total_textField;
	private JTextField calidad_total_textField;
	private JTextField servicio_comunidad_total_textField;
	private JTextField investigacion_creativo_total_textField;
	private JTextField crecimiento_profesional_total_textField;
	private JTextField parte1_total_textField;
	private JTextField parte3_estudiante_total_textField;
	private JTextField parte3_continuacion_total_textField;
	private JTextField parte3_gerencia_total_textField;
	private JTextField textField_2;


	private JComboBox rangoAcademico_comboBox = new JComboBox();
	private JComboBox objetivo_eval_comboBox = new JComboBox();
	private JComboBox jornada_comple_comboBox = new JComboBox();
	private JComboBox jornada_parcial_comboBox = new JComboBox();
	private JComboBox contrato_comboBox = new JComboBox();
	private JComboBox comboBox_11 = new JComboBox();

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

	private JComboBox comboBox = new JComboBox();
	private JComboBox comboBox_1 = new JComboBox();
	private JComboBox comboBox_3 = new JComboBox();
	private JComboBox comboBox_3_1 = new JComboBox();
	private JComboBox comboBox_4 = new JComboBox();
	private JComboBox comboBox_4_1 = new JComboBox();
	private JComboBox comboBox_5 = new JComboBox();
	private JComboBox comboBox_6 = new JComboBox();
	private JComboBox comboBox_7 = new JComboBox();
	private JComboBox comboBox_9 = new JComboBox();
	private JComboBox comboBox_10 = new JComboBox();
	private JComboBox comboBox_5_1 = new JComboBox();
	private JComboBox comboBox_5_2 = new JComboBox();
	private JComboBox comboBox_5_3 = new JComboBox();
	private JComboBox comboBox_5_4 = new JComboBox();
	private JComboBox comboBox_5_5 = new JComboBox();
	private JComboBox comboBox_5_1_1 = new JComboBox();
	private JComboBox comboBox_5_1_2 = new JComboBox();
	private JComboBox comboBox_5_1_3 = new JComboBox();
	private JComboBox comboBox_5_1_4 = new JComboBox();
	
	private JTextField ins2_4_a_textField;
	private JTextField ins2_a_textField;
	private JTextField ins2_b_textField;
	private JTextField ins2_c_textField;
	private JTextField ins2_d_textField;
	private JTextField ins2_e_textField;
	private JTextField ins2_f_textField;
	private JTextField ins2_gh_textField;
	private JTextField ins2_1_ab_textField;
	private JTextField ins2_1_cd_textField;
	private JTextField ins2_1_ef_textField;
	private JTextField ins2_3_ab_textField;
	private JTextField ins2_4_b_textField;
	private JTextField ins2_4_cde_textField;
	private JTextField ins2_5_abc_textField;
	private JTextField ins2_5_b_textField;
	private JTextField ins2_5_ef_textField;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;

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
	public onlineEvaluation() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\natal\\OneDrive\\Pictures\\flyers\\ec18b863896963.5ac177847630c.png"));
		setTitle("Evaluacion ");
		setBackground(SystemColor.infoText);


		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		tabbedPane.setBounds(0, 11, 1914, 1014);
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



		objetivo_eval_comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		objetivo_eval_comboBox.setModel(new DefaultComboBoxModel(new String[] {"Formativa", "Sumativa"}));
		objetivo_eval_comboBox.setBounds(920, 416, 253, 25);
		panel.add(objetivo_eval_comboBox);


		JLabel periodo_evaluado_lblNewLabel = new JLabel("Per\u00EDodo evaluado");
		periodo_evaluado_lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		periodo_evaluado_lblNewLabel.setBounds(680, 472, 122, 20);
		panel.add(periodo_evaluado_lblNewLabel);

		periodo_evaluado_textField = new JTextField();
		periodo_evaluado_textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		periodo_evaluado_textField.setBounds(920, 467, 253, 30);
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



		jornada_comple_comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jornada_comple_comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "40", "41", "42", "43", "44", "45"}));
		jornada_comple_comboBox.setBounds(836, 558, 74, 27);
		panel.add(jornada_comple_comboBox);


		JLabel jornada_parcial_lblNewLabel = new JLabel("Jornada parcial");

		jornada_parcial_lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jornada_parcial_lblNewLabel.setBounds(969, 561, 107, 20);
		panel.add(jornada_parcial_lblNewLabel);


		jornada_parcial_comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jornada_parcial_comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "40", "41", "42", "43", "44", "45"}));
		jornada_parcial_comboBox.setBounds(1111, 558, 74, 27);
		panel.add(jornada_parcial_comboBox);


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
		codigo_lblNewLabel.setBounds(812, 741, 50, 20);
		panel.add(codigo_lblNewLabel);

		codigo_textField = new JTextField();
		codigo_textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		codigo_textField.setBounds(893, 739, 226, 25);
		panel.add(codigo_textField);
		codigo_textField.setColumns(10);

		titulo_curso_lblNewLabel = new JLabel("T\u00EDtulo del Curso ");
		titulo_curso_lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		titulo_curso_lblNewLabel.setBounds(747, 785, 118, 20);
		panel.add(titulo_curso_lblNewLabel);

		tutulo_del_curso_textField = new JTextField();
		tutulo_del_curso_textField.setColumns(10);
		tutulo_del_curso_textField.setBounds(893, 784, 226, 26);
		panel.add(tutulo_del_curso_textField);

		JLabel modalidad_lblNewLabel = new JLabel("Modalidad");
		modalidad_lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		modalidad_lblNewLabel.setBounds(793, 829, 72, 20);
		panel.add(modalidad_lblNewLabel);

		modalidad_textField = new JTextField();
		modalidad_textField.setColumns(10);
		modalidad_textField.setBounds(893, 828, 226, 26);
		panel.add(modalidad_textField);

		JSeparator separator = new JSeparator();
		separator.setBounds(779, 144, 0, 12);
		panel.add(separator);



		rangoAcademico_comboBox.setModel(new DefaultComboBoxModel(new String[] {"Rango Catedratico", "Rango Catedratico Asociado", "Rango Catedratico Auxiliar"}));
		rangoAcademico_comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rangoAcademico_comboBox.setBounds(920, 261, 253, 27);
		panel.add(rangoAcademico_comboBox);

		JLabel lblNewLabel_44 = new JLabel("Informaci\u00F3n a Ingresar");
		lblNewLabel_44.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_44.setBounds(647, 11, 596, 123);
		panel.add(lblNewLabel_44);

		JLabel titulo_curso_lblNewLabel_1 = new JLabel("Informaci\u00F3n Ingresada");
		titulo_curso_lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		titulo_curso_lblNewLabel_1.setBounds(707, 887, 173, 20);
		panel.add(titulo_curso_lblNewLabel_1);


		comboBox_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"Manual ", "Online"}));
		comboBox_11.setBounds(893, 888, 226, 22);
		panel.add(comboBox_11);


		/////////////////////////////// INSTRUMENTO I ///////////////////////////////////////////


		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Instrumento I-A", null, tabbedPane_2, null);

		/////////////////////////////// INSTRUMENTO I  PART 1 ///////////////////////////////////////////

		JPanel panel_15 = new JPanel();
		tabbedPane_2.addTab("Parte I", null, panel_15, null);
		panel_15.setLayout(null);

		JLabel lblNewLabel_39 = new JLabel("Evaluaci\u00F3n de Facultad por los Estudiantes en los ");
		lblNewLabel_39.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_39.setBounds(265, 21, 1338, 66);
		panel_15.add(lblNewLabel_39);

		JLabel lblNewLabel_40 = new JLabel("PARTE I. Perfil del estudiante. Conteste las siguientes preguntas.");
		lblNewLabel_40.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_40.setBounds(551, 181, 839, 26);
		panel_15.add(lblNewLabel_40);

		JPanel panel_16 = new JPanel();
		panel_16.setBackground(Color.LIGHT_GRAY);
		panel_16.setBounds(265, 243, 1338, 416);
		panel_15.add(panel_16);
		panel_16.setLayout(null);

		JLabel lblNewLabel_42 = new JLabel("1. Indica el n\u00FAmero de horas a la semana que dedicas a trabajar en el curso en l\u00EDnea:");
		lblNewLabel_42.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_42.setBounds(10, 97, 956, 38);
		panel_16.add(lblNewLabel_42);

		JLabel lblNewLabel_43 = new JLabel("2. ¿Cu\u00E1ntas veces te comunicas con tu profesor a trav\u00E9s de los medios");
		lblNewLabel_43.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43.setBounds(10, 297, 970, 26);
		panel_16.add(lblNewLabel_43);

		JPanel panel_6_7_3 = new JPanel();
		panel_6_7_3.setBounds(-159, 208, 1530, 10);
		panel_16.add(panel_6_7_3);

		JPanel panel_6_8_2 = new JPanel();
		panel_6_8_2.setBounds(970, -55, 10, 495);
		panel_16.add(panel_6_8_2);

		parte1_perfil_de_estudiante_1_comboBox.setModel(new DefaultComboBoxModel(new String[] {" ", "M\u00E1s de 5 horas a la semana", "De 3 a 5 horas a la semana", "De 1 a 3 horas a la semana", "Menos de 1 hora a la semana"}));
		parte1_perfil_de_estudiante_1_comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte1_perfil_de_estudiante_1_comboBox.setBounds(1031, 97, 220, 38);
		panel_16.add(parte1_perfil_de_estudiante_1_comboBox);


		parte1_perfil_de_estudiante_2_comboBox.setModel(new DefaultComboBoxModel(new String[] {" ", "Tres veces, o m\u00E1s, a la semana", "Una vez a la semana", "Una vez al mes", "De una a tres veces, durante el t\u00E9rmino acad\u00E9mico", "Nunca"}));
		parte1_perfil_de_estudiante_2_comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte1_perfil_de_estudiante_2_comboBox.setBounds(1031, 303, 220, 38);
		panel_16.add(parte1_perfil_de_estudiante_2_comboBox);
		
		JLabel lblNewLabel_43_4 = new JLabel("provistos por la Instituci\u00F3n?");
		lblNewLabel_43_4.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_4.setBounds(46, 327, 934, 26);
		panel_16.add(lblNewLabel_43_4);


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
		
		JLabel lblNewLabel_21 = new JLabel("Cursos que se Ofrecen en L\u00EDnea");
		lblNewLabel_21.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_21.setBounds(478, 99, 895, 70);
		panel_15.add(lblNewLabel_21);

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
		panel_16_2.setBounds(304, 295, 1338, 398);
		panel_17.add(panel_16_2);

		JLabel lblNewLabel_42_2 = new JLabel("3. Durante la primera semana del curso, el profesor pone a mi disposici\u00F3n el prontuario.");
		lblNewLabel_42_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_42_2.setBounds(6, 83, 941, 38);
		panel_16_2.add(lblNewLabel_42_2);

		JLabel lblNewLabel_43_2 = new JLabel("4. El profesor aclara mis dudas con respecto al contenido del prontuario.");
		lblNewLabel_43_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_2.setBounds(10, 281, 970, 26);
		panel_16_2.add(lblNewLabel_43_2);

		JPanel panel_6_7_3_2 = new JPanel();
		panel_6_7_3_2.setBounds(-162, 186, 1530, 10);
		panel_16_2.add(panel_6_7_3_2);

		JPanel panel_6_8_2_2 = new JPanel();
		panel_6_8_2_2.setBounds(990, -55, 10, 495);
		panel_16_2.add(panel_6_8_2_2);


		parte2_estudi_3_comboBox.setModel(new DefaultComboBoxModel(new String[] {" ", "1", "2", "3"}));
		parte2_estudi_3_comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte2_estudi_3_comboBox.setBounds(1092, 86, 159, 38);
		panel_16_2.add(parte2_estudi_3_comboBox);

		parte2_estudi_4_comboBox.setModel(new DefaultComboBoxModel(new String[] {" ", "1", "2", "3"}));
		parte2_estudi_4_comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte2_estudi_4_comboBox.setBounds(1092, 278, 159, 38);
		panel_16_2.add(parte2_estudi_4_comboBox);

		JLabel lblNewLabel_39_1 = new JLabel("El Prontuario del curso. ");
		lblNewLabel_39_1.setFont(new Font("Tahoma", Font.BOLD, 54));
		lblNewLabel_39_1.setBounds(490, 18, 927, 135);
		panel_17.add(lblNewLabel_39_1);

		JLabel lblNewLabel_41_1 = new JLabel("(3) Lo hizo (2) No lo hizo (1) Desconozco porque no estuve al inicio del curso");
		lblNewLabel_41_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_41_1.setBounds(530, 211, 1121, 42);
		panel_17.add(lblNewLabel_41_1);

		JLabel lblNewLabel_40_1 = new JLabel("Utiliza la siguiente clave para las preguntas 3 y 4:");
		lblNewLabel_40_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_40_1.setBounds(576, 150, 814, 49);
		panel_17.add(lblNewLabel_40_1);

		JPanel panel_18 = new JPanel();
		tabbedPane_2.addTab("Parte III", null, panel_18, null);
		panel_18.setLayout(null);

		JLabel lblNewLabel_39_1_1 = new JLabel("PARTE III. Desarrollo de la clase en l\u00EDnea");
		lblNewLabel_39_1_1.setFont(new Font("Tahoma", Font.BOLD, 54));
		lblNewLabel_39_1_1.setBounds(355, 0, 1529, 106);
		panel_18.add(lblNewLabel_39_1_1);

		JPanel panel_16_2_1 = new JPanel();
		panel_16_2_1.setLayout(null);
		panel_16_2_1.setBackground(Color.LIGHT_GRAY);
		panel_16_2_1.setBounds(239, 175, 1338, 600);
		panel_18.add(panel_16_2_1);

		JLabel lblNewLabel_42_2_2 = new JLabel("5. El profesor demuestra conocer el material de la clase");
		lblNewLabel_42_2_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_42_2_2.setBounds(10, 25, 941, 38);
		panel_16_2_1.add(lblNewLabel_42_2_2);

		JLabel lblNewLabel_43_2_1 = new JLabel("8. Hasta el presente, se han logrado los objetivos del curso conforme al prontuario.");
		lblNewLabel_43_2_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_2_1.setBounds(10, 263, 970, 26);
		panel_16_2_1.add(lblNewLabel_43_2_1);

		JPanel panel_6_7_3_2_1 = new JPanel();
		panel_6_7_3_2_1.setBounds(-1, 147, 1530, 10);
		panel_16_2_1.add(panel_6_7_3_2_1);

		JPanel panel_6_8_2_2_1 = new JPanel();
		panel_6_8_2_2_1.setBounds(1053, 0, 10, 645);
		panel_16_2_1.add(panel_6_8_2_2_1);

		parte3_estudi_5_comboBox.setModel(new DefaultComboBoxModel(new String[] {" ", "1", "2", "3", "4"}));
		parte3_estudi_5_comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte3_estudi_5_comboBox.setBounds(1113, 22, 159, 38);
		panel_16_2_1.add(parte3_estudi_5_comboBox);


		parte3_estudi_6_comboBox.setModel(new DefaultComboBoxModel(new String[] {" ", "1", "2", "3", "4"}));
		parte3_estudi_6_comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte3_estudi_6_comboBox.setBounds(1114, 101, 159, 38);
		panel_16_2_1.add(parte3_estudi_6_comboBox);


		JLabel lblNewLabel_42_2_1_2 = new JLabel("6. El profesor me hace pensar y reflexionar sobre los temas del curso.");
		lblNewLabel_42_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_42_2_1_2.setBounds(9, 106, 941, 38);
		panel_16_2_1.add(lblNewLabel_42_2_1_2);

		JLabel lblNewLabel_42_2_1_1_1 = new JLabel("7. La forma en que el profesor presenta el contenido del curso en l\u00EDnea, contribuye ");
		lblNewLabel_42_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_42_2_1_1_1.setBounds(9, 161, 1023, 38);
		panel_16_2_1.add(lblNewLabel_42_2_1_1_1);

		JPanel panel_6_7_3_2_1_1 = new JPanel();
		panel_6_7_3_2_1_1.setBounds(0, 78, 1530, 10);
		panel_16_2_1.add(panel_6_7_3_2_1_1);

		JPanel panel_6_7_3_2_1_2 = new JPanel();
		panel_6_7_3_2_1_2.setBounds(0, 232, 1530, 10);
		panel_16_2_1.add(panel_6_7_3_2_1_2);

		JPanel panel_6_7_3_2_1_2_1 = new JPanel();
		panel_6_7_3_2_1_2_1.setBounds(-3, 303, 1530, 10);
		panel_16_2_1.add(panel_6_7_3_2_1_2_1);

		JLabel lblNewLabel_43_2_1_2 = new JLabel("9. El profesor enriquece la clase con recursos audiovisuales, referencias o enlaces al Internet.");
		lblNewLabel_43_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_2_1_2.setBounds(9, 331, 1022, 26);
		panel_16_2_1.add(lblNewLabel_43_2_1_2);

		JPanel panel_6_7_3_2_1_2_1_1 = new JPanel();
		panel_6_7_3_2_1_2_1_1.setBounds(-1, 372, 1530, 10);
		panel_16_2_1.add(panel_6_7_3_2_1_2_1_1);

		JLabel lblNewLabel_43_2_1_2_1 = new JLabel("10. El profesor atiende y discute con respeto mis planteamientos.");
		lblNewLabel_43_2_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_2_1_2_1.setBounds(10, 406, 970, 26);
		panel_16_2_1.add(lblNewLabel_43_2_1_2_1);

		JPanel panel_6_7_3_2_1_2_1_1_1 = new JPanel();
		panel_6_7_3_2_1_2_1_1_1.setBounds(-3, 448, 1530, 10);
		panel_16_2_1.add(panel_6_7_3_2_1_2_1_1_1);

		JLabel lblNewLabel_43_2_1_2_1_2 = new JLabel("11. El profesor relaciona las ideas y temas presentados en el curso con ");
		lblNewLabel_43_2_1_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_2_1_2_1_2.setBounds(9, 466, 1017, 26);
		panel_16_2_1.add(lblNewLabel_43_2_1_2_1_2);

		JPanel panel_6_7_3_2_1_2_1_1_1_1 = new JPanel();
		panel_6_7_3_2_1_2_1_1_1_1.setBounds(-192, 527, 1530, 10);
		panel_16_2_1.add(panel_6_7_3_2_1_2_1_1_1_1);

		JLabel lblNewLabel_43_2_1_2_1_2_1 = new JLabel("12. El profesor promueve que participe en los foros de discusi\u00F3n o en otras");
		lblNewLabel_43_2_1_2_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_2_1_2_1_2_1.setBounds(10, 548, 1038, 26);
		panel_16_2_1.add(lblNewLabel_43_2_1_2_1_2_1);

		parte3_estudi_7_comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte3_estudi_7_comboBox.setModel(new DefaultComboBoxModel(new String[] {" ", "1", "2", "3", "4"}));
		parte3_estudi_7_comboBox.setBounds(1114, 176, 159, 34);
		panel_16_2_1.add(parte3_estudi_7_comboBox);


		parte3_estudi_8_comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte3_estudi_8_comboBox.setModel(new DefaultComboBoxModel(new String[] {" ","1", "2", "3", "4"}));
		parte3_estudi_8_comboBox.setBounds(1116, 255, 159, 38);
		panel_16_2_1.add(parte3_estudi_8_comboBox);


		parte3_estudi_9_comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte3_estudi_9_comboBox.setModel(new DefaultComboBoxModel(new String[] {" ","1", "2", "3", "4"}));
		parte3_estudi_9_comboBox.setBounds(1117, 326, 159, 33);
		panel_16_2_1.add(parte3_estudi_9_comboBox);


		parte3_estudi_10_comboBox_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte3_estudi_10_comboBox_3.setModel(new DefaultComboBoxModel(new String[] {" ","1", "2", "3", "4"}));
		parte3_estudi_10_comboBox_3.setBounds(1117, 398, 159, 37);
		panel_16_2_1.add(parte3_estudi_10_comboBox_3);


		parte3_estudi_11_comboBox_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte3_estudi_11_comboBox_3.setModel(new DefaultComboBoxModel(new String[] {" ", "1", "2", "3", "4"}));
		parte3_estudi_11_comboBox_3.setBounds(1114, 491, 159, 27);
		panel_16_2_1.add(parte3_estudi_11_comboBox_3);


		parte3_estudi_12_comboBox_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte3_estudi_12_comboBox_3.setModel(new DefaultComboBoxModel(new String[] {" ","1", "2", "3", "4"}));
		parte3_estudi_12_comboBox_3.setBounds(1114, 548, 159, 41);
		panel_16_2_1.add(parte3_estudi_12_comboBox_3);
		
		JLabel lblNewLabel_42_2_1_1_1_2 = new JLabel("a aumentar mi entendimiento de esta materia.");
		lblNewLabel_42_2_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_42_2_1_1_1_2.setBounds(32, 193, 1023, 38);
		panel_16_2_1.add(lblNewLabel_42_2_1_1_1_2);
		
		JLabel lblNewLabel_43_2_1_2_1_2_3 = new JLabel("situaciones del diario vivir.");
		lblNewLabel_43_2_1_2_1_2_3.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_2_1_2_1_2_3.setBounds(48, 495, 1017, 26);
		panel_16_2_1.add(lblNewLabel_43_2_1_2_1_2_3);
		
		JLabel lblNewLabel_43_2_1_2_1_2_3_1 = new JLabel(" actividades de interacci\u00F3n.");
		lblNewLabel_43_2_1_2_1_2_3_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_2_1_2_1_2_3_1.setBounds(46, 574, 1017, 26);
		panel_16_2_1.add(lblNewLabel_43_2_1_2_1_2_3_1);


		JLabel lblNewLabel_40_1_1 = new JLabel("Utiliza la siguiente clave para las preguntas 5 al 12:");
		lblNewLabel_40_1_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_40_1_1.setBounds(597, 82, 584, 49);
		panel_18.add(lblNewLabel_40_1_1);

		JLabel lblNewLabel_41_1_1 = new JLabel("(4) Totalmente de acuerdo (si) (3) Parcialmente de acuerdo (mayormente si) (2) Parcialmente en desacuerdo (mayormente no) (1) Totalmente en desacuerdo (no) (Espacio en blanco) No Aplica");
		lblNewLabel_41_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_41_1_1.setBounds(28, 121, 1827, 42);
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
		tabbedPane_2.addTab("Parte IV", null, panel_19, null);
		panel_19.setLayout(null);

		JLabel lblNewLabel_39_1_1_1 = new JLabel("Gerencia del proceso de ense\u00F1anza aprendizaje.");
		lblNewLabel_39_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 54));
		lblNewLabel_39_1_1_1.setBounds(183, 32, 1529, 135);
		panel_19.add(lblNewLabel_39_1_1_1);

		JLabel lblNewLabel_40_1_1_1 = new JLabel("Conteste las preguntas 14-24 tomando en consideraci\u00F3n la siguiente premisa");
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

		JLabel lblNewLabel_27_1 = new JLabel("14. El profesor aclara mis dudas sobre la estructura y organizaci\u00F3n del curso.\n\n");
		lblNewLabel_27_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_27_1.setBounds(63, 35, 849, 27);
		panel_12_1.add(lblNewLabel_27_1);

		JLabel lblNewLabel_28_1 = new JLabel("15. El profesor est\u00E1 disponible para contestar mis preguntas en el horario anunciado.\n");
		lblNewLabel_28_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_28_1.setBounds(63, 127, 916, 56);
		panel_12_1.add(lblNewLabel_28_1);

		JLabel lblNewLabel_29_1 = new JLabel("16. Los ex\u00E1menes y trabajos responden al contenido del curso.");
		lblNewLabel_29_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_29_1.setBounds(65, 231, 707, 27);
		panel_12_1.add(lblNewLabel_29_1);

		JLabel lblNewLabel_30_1 = new JLabel("17. El profesor utiliza diversos m\u00E9todos para evaluar el aprendizaje.\n");
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


		parte3_desarollo_de_clase_14_comboBox.setModel(new DefaultComboBoxModel(new String[] {" ", "1", "2", "3", "4"}));
		parte3_desarollo_de_clase_14_comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte3_desarollo_de_clase_14_comboBox.setBounds(1071, 127, 159, 38);
		panel_12_1.add(parte3_desarollo_de_clase_14_comboBox);


		parte3_desarollo_de_clase_15_comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {" ","1", "2", "3", "4"}));
		parte3_desarollo_de_clase_15_comboBox_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte3_desarollo_de_clase_15_comboBox_1_1.setBounds(1071, 220, 159, 38);
		panel_12_1.add(parte3_desarollo_de_clase_15_comboBox_1_1);


		parte3_desarollo_de_clase_16_comboBox.setModel(new DefaultComboBoxModel(new String[] {" ","1", "2", "3", "4"}));
		parte3_desarollo_de_clase_16_comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte3_desarollo_de_clase_16_comboBox.setBounds(1071, 321, 159, 38);
		panel_12_1.add(parte3_desarollo_de_clase_16_comboBox);


		parte3_desarollo_de_clase_17_comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {" ","1", "2", "3", "4"}));
		parte3_desarollo_de_clase_17_comboBox_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte3_desarollo_de_clase_17_comboBox_1_1.setBounds(1071, 418, 159, 38);
		panel_12_1.add(parte3_desarollo_de_clase_17_comboBox_1_1);


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
		tabbedPane_2.addTab("Parte IV Continuacion", null, panel_20, null);
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
		panel_16_2_1_1.setBounds(285, 220, 1338, 495);
		panel_20.add(panel_16_2_1_1);

		JLabel lblNewLabel_42_2_2_1 = new JLabel("18. El profesor corrige los ex\u00E1menes y trabajos, seg\u00FAn los criterios ");
		lblNewLabel_42_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_42_2_2_1.setBounds(10, 6, 941, 38);
		panel_16_2_1_1.add(lblNewLabel_42_2_2_1);

		JLabel lblNewLabel_43_2_1_3 = new JLabel("21. El profesor exhorta a los estudiantes a comunicarse con \u00E9l, en caso de que surjan dudas");
		lblNewLabel_43_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_2_1_3.setBounds(10, 199, 970, 26);
		panel_16_2_1_1.add(lblNewLabel_43_2_1_3);

		JPanel panel_6_7_3_2_1_3 = new JPanel();
		panel_6_7_3_2_1_3.setBounds(0, 122, 1530, 10);
		panel_16_2_1_1.add(panel_6_7_3_2_1_3);

		JPanel panel_6_8_2_2_1_1 = new JPanel();
		panel_6_8_2_2_1_1.setBounds(1053, 0, 10, 669);
		panel_16_2_1_1.add(panel_6_8_2_2_1_1);

		parte5_gerencia_18_comboBox_1.setModel(new DefaultComboBoxModel(new String[] {" ","1", "2", "3", "4"}));
		parte5_gerencia_18_comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte5_gerencia_18_comboBox_1.setBounds(1114, 9, 159, 38);
		panel_16_2_1_1.add(parte5_gerencia_18_comboBox_1);


		parte5_gerencia_19_comboBox_1.setModel(new DefaultComboBoxModel(new String[] {" ","1", "2", "3", "4"}));
		parte5_gerencia_19_comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte5_gerencia_19_comboBox_1.setBounds(1114, 97, 159, 27);
		panel_16_2_1_1.add(parte5_gerencia_19_comboBox_1);


		JLabel lblNewLabel_42_2_1_2_1 = new JLabel("19. El profesor informa los resultados de los ex\u00E1menes y trabajos corregidos, preferiblemente en");
		lblNewLabel_42_2_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_42_2_1_2_1.setBounds(10, 72, 1031, 38);
		panel_16_2_1_1.add(lblNewLabel_42_2_1_2_1);

		JLabel lblNewLabel_42_2_1_1_1_1 = new JLabel("20. El profesor discute los resultados de mis evaluaciones, en su defecto, hace anotaciones ");
		lblNewLabel_42_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_42_2_1_1_1_1.setBounds(10, 135, 1031, 38);
		panel_16_2_1_1.add(lblNewLabel_42_2_1_1_1_1);

		JPanel panel_6_7_3_2_1_1_1 = new JPanel();
		panel_6_7_3_2_1_1_1.setBounds(-73, 65, 1530, 10);
		panel_16_2_1_1.add(panel_6_7_3_2_1_1_1);

		JPanel panel_6_7_3_2_1_2_2 = new JPanel();
		panel_6_7_3_2_1_2_2.setBounds(0, 188, 1530, 10);
		panel_16_2_1_1.add(panel_6_7_3_2_1_2_2);

		JLabel lblNewLabel_43_2_1_1_1 = new JLabel("relacionadas con los temas del curso y sus evaluaciones.");
		lblNewLabel_43_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_2_1_1_1.setBounds(48, 225, 903, 26);
		panel_16_2_1_1.add(lblNewLabel_43_2_1_1_1);

		JPanel panel_6_7_3_2_1_2_1_2 = new JPanel();
		panel_6_7_3_2_1_2_1_2.setBounds(-12, 249, 1530, 10);
		panel_16_2_1_1.add(panel_6_7_3_2_1_2_1_2);

		JLabel lblNewLabel_43_2_1_2_2 = new JLabel("22. El profesor provee oportunidades flexibles de interacci\u00F3n entre estudiante-estudiante y ");
		lblNewLabel_43_2_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_2_1_2_2.setBounds(10, 260, 970, 26);
		panel_16_2_1_1.add(lblNewLabel_43_2_1_2_2);

		JPanel panel_6_7_3_2_1_2_1_1_2 = new JPanel();
		panel_6_7_3_2_1_2_1_1_2.setBounds(0, 310, 1530, 10);
		panel_16_2_1_1.add(panel_6_7_3_2_1_2_1_1_2);

		JLabel lblNewLabel_43_2_1_2_1_3 = new JLabel("23. El profesor actualiza el plan de trabajo en el calendario de actividades.");
		lblNewLabel_43_2_1_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_2_1_2_1_3.setBounds(10, 329, 970, 26);
		panel_16_2_1_1.add(lblNewLabel_43_2_1_2_1_3);

		JPanel panel_6_7_3_2_1_2_1_1_1_2 = new JPanel();
		panel_6_7_3_2_1_2_1_1_1_2.setBounds(-36, 367, 1530, 10);
		panel_16_2_1_1.add(panel_6_7_3_2_1_2_1_1_1_2);

		JLabel lblNewLabel_43_2_1_2_1_2_2 = new JLabel("24. El profesor procura que las diversas actividades del curso se cumplan dentro ");
		lblNewLabel_43_2_1_2_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_2_1_2_1_2_2.setBounds(10, 378, 1021, 26);
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
		parte5_gerencia_20_comboBox_1.setBounds(1114, 144, 159, 34);
		panel_16_2_1_1.add(parte5_gerencia_20_comboBox_1);


		parte5_gerencia_21_comboBox_1.setModel(new DefaultComboBoxModel(new String[] {" ","1", "2", "3", "4"}));
		parte5_gerencia_21_comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte5_gerencia_21_comboBox_1.setBounds(1114, 210, 159, 38);
		panel_16_2_1_1.add(parte5_gerencia_21_comboBox_1);


		parte5_gerencia_22_comboBox_1.setModel(new DefaultComboBoxModel(new String[] {" ","1", "2", "3", "4"}));
		parte5_gerencia_22_comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte5_gerencia_22_comboBox_1.setBounds(1114, 271, 159, 33);
		panel_16_2_1_1.add(parte5_gerencia_22_comboBox_1);



		parte5_gerencia_23_comboBox_1.setModel(new DefaultComboBoxModel(new String[] {" ","1", "2", "3", "4"}));
		parte5_gerencia_23_comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte5_gerencia_23_comboBox_1.setBounds(1114, 327, 159, 37);
		panel_16_2_1_1.add(parte5_gerencia_23_comboBox_1);


		parte5_gerencia_24_comboBox_1.setModel(new DefaultComboBoxModel(new String[] {" ","1", "2", "3", "4"}));
		parte5_gerencia_24_comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte5_gerencia_24_comboBox_1.setBounds(1114, 400, 159, 27);
		panel_16_2_1_1.add(parte5_gerencia_24_comboBox_1);


		parte5_gerencia_25_comboBox_1.setModel(new DefaultComboBoxModel(new String[] {" ","1", "2", "3", "4"}));
		parte5_gerencia_25_comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		parte5_gerencia_25_comboBox_1.setBounds(1114, 453, 159, 31);
		panel_16_2_1_1.add(parte5_gerencia_25_comboBox_1);


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
		
		JLabel lblNewLabel_42_2_2_1_1 = new JLabel("establecidos en el prontuario");
		lblNewLabel_42_2_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_42_2_2_1_1.setBounds(48, 29, 941, 38);
		panel_16_2_1_1.add(lblNewLabel_42_2_2_1_1);
		
		JLabel lblNewLabel_42_2_2_1_1_1 = new JLabel("o antes de dos semanas.");
		lblNewLabel_42_2_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_42_2_2_1_1_1.setBounds(48, 90, 941, 38);
		panel_16_2_1_1.add(lblNewLabel_42_2_2_1_1_1);
		
		JLabel lblNewLabel_42_2_2_1_1_2 = new JLabel("en los espacios provistos en los diferentes tipos de actividades.");
		lblNewLabel_42_2_2_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_42_2_2_1_1_2.setBounds(48, 157, 941, 38);
		panel_16_2_1_1.add(lblNewLabel_42_2_2_1_1_2);
		
		JLabel lblNewLabel_43_2_1_1_1_1 = new JLabel("estudiante- profesor, usando los foros de discusi\u00F3n, los salones virtuales, entre otros");
		lblNewLabel_43_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_2_1_1_1_1.setBounds(48, 283, 903, 26);
		panel_16_2_1_1.add(lblNewLabel_43_2_1_1_1_1);
		
		JLabel lblNewLabel_43_2_1_1_1_1_1 = new JLabel("del plazo establecido.");
		lblNewLabel_43_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_2_1_1_1_1_1.setBounds(48, 399, 903, 26);
		panel_16_2_1_1.add(lblNewLabel_43_2_1_1_1_1_1);


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
		tabbedPane_2.addTab("Parte V", null, panel_21, null);
		panel_21.setLayout(null);

		JPanel panel_16_3 = new JPanel();
		panel_16_3.setLayout(null);
		panel_16_3.setBackground(Color.LIGHT_GRAY);
		panel_16_3.setBounds(108, 158, 1462, 416);
		panel_21.add(panel_16_3);

		JLabel lblNewLabel_42_3 = new JLabel("25. ¿Qu\u00E9 fue lo que m\u00E1s te gust\u00F3 del curso?\n");
		lblNewLabel_42_3.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_42_3.setBounds(10, 6, 945, 38);
		panel_16_3.add(lblNewLabel_42_3);

		JLabel lblNewLabel_43_3 = new JLabel("26. ¿Qu\u00E9 fue lo que menos te gust\u00F3 del curso?");
		lblNewLabel_43_3.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_3.setBounds(810, 0, 970, 26);
		panel_16_3.add(lblNewLabel_43_3);

		JPanel panel_6_7_3_3 = new JPanel();
		panel_6_7_3_3.setBounds(-159, 208, 1530, 10);
		panel_16_3.add(panel_6_7_3_3);

		JPanel panel_6_8_2_3 = new JPanel();
		panel_6_8_2_3.setBounds(800, -22, 10, 495);
		panel_16_3.add(panel_6_8_2_3);

		JLabel lblNewLabel_43_3_1 = new JLabel("27. ¿Tomar\u00EDas otro curso en l\u00EDnea con el mismo profesor o lo recomendar\u00EDas ");
		lblNewLabel_43_3_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_3_1.setBounds(0, 220, 945, 47);
		panel_16_3.add(lblNewLabel_43_3_1);
		
		JLabel lblNewLabel_43_3_1_1 = new JLabel("28. ¿Qu\u00E9 sugerencias har\u00EDas para que el profesor mejore su ense\u00F1anza ");
		lblNewLabel_43_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_3_1_1.setBounds(810, 215, 879, 26);
		panel_16_3.add(lblNewLabel_43_3_1_1);
		
		JLabel lblNewLabel_43_3_1_2 = new JLabel("a un compa\u00F1ero? Explica.");
		lblNewLabel_43_3_1_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_3_1_2.setBounds(40, 253, 945, 47);
		panel_16_3.add(lblNewLabel_43_3_1_2);
		
		JLabel lblNewLabel_43_3_1_1_1 = new JLabel("y participe m\u00E1s en tu aprendizaje en esta modalidad?");
		lblNewLabel_43_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_43_3_1_1_1.setBounds(848, 238, 879, 26);
		panel_16_3.add(lblNewLabel_43_3_1_1_1);

		JLabel lblNewLabel_39_1_1_1_1_1 = new JLabel("Evaluaci\u00F3n de Facultad por los Estudiantes");
		lblNewLabel_39_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 54));
		lblNewLabel_39_1_1_1_1_1.setBounds(297, -13, 1203, 135);
		panel_21.add(lblNewLabel_39_1_1_1_1_1);

		JLabel lblNewLabel_40_1_1_1_1_1 = new JLabel("Otras Apreciaciones del Estudiante");
		lblNewLabel_40_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_40_1_1_1_1_1.setBounds(774, 82, 503, 49);
		panel_21.add(lblNewLabel_40_1_1_1_1_1);

		JLabel lblNewLabel_41_1_1_1_1_1 = new JLabel("Contesta las siguientes preguntas.");
		lblNewLabel_41_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_41_1_1_1_1_1.setBounds(803, 119, 307, 42);
		panel_21.add(lblNewLabel_41_1_1_1_1_1);

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



		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Instrumento II", null, tabbedPane_1, null);
		
		//EVIDENCIA////
		
		JPanel panel_28 = new JPanel();
		panel_28.setLayout(null);
		tabbedPane_1.addTab("Evidencia", null, panel_28, null);

		JLabel lblNewLabel_44_1_1 = new JLabel("RANGO CATEDR\u00C1TICO");
		lblNewLabel_44_1_1.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_44_1_1.setBounds(614, -14, 596, 107);
		panel_28.add(lblNewLabel_44_1_1);

		JLabel lblNewLabel_48_8 = new JLabel("I. Experiencia y Calidad Docente");
		lblNewLabel_48_8.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_48_8.setBounds(267, 68, 389, 41);
		panel_28.add(lblNewLabel_48_8);

		JLabel lblNewLabel_48_9 = new JLabel("a. Dominio de la disciplina que ense\u00F1a");
		lblNewLabel_48_9.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_9.setBounds(197, 141, 389, 41);
		panel_28.add(lblNewLabel_48_9);

		JLabel lblNewLabel_48_9_1 = new JLabel("b. Habilidad para organizar el contenido y presentarlo en");
		lblNewLabel_48_9_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_9_1.setBounds(197, 249, 546, 41);
		panel_28.add(lblNewLabel_48_9_1);

		JLabel lblNewLabel_48_9_2 = new JLabel("forma clara, l\u00F3gica e imaginativa.");
		lblNewLabel_48_9_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_9_2.setBounds(207, 281, 389, 41);
		panel_28.add(lblNewLabel_48_9_2);

		JLabel lblNewLabel_48_9_3 = new JLabel("c. Conocimiento de los desarrollos actuales de la disciplina.");
		lblNewLabel_48_9_3.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_9_3.setBounds(197, 366, 562, 41);
		panel_28.add(lblNewLabel_48_9_3);

		JLabel lblNewLabel_48_9_4 = new JLabel("d. Habilidad para relacionar la disciplina con otras esferas del");
		lblNewLabel_48_9_4.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_9_4.setBounds(197, 471, 583, 41);
		panel_28.add(lblNewLabel_48_9_4);

		JLabel lblNewLabel_48_9_5 = new JLabel("conocimiento. ");
		lblNewLabel_48_9_5.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_9_5.setBounds(228, 503, 136, 34);
		panel_28.add(lblNewLabel_48_9_5);

		JLabel lblNewLabel_48_9_6 = new JLabel("e. Habilidad para promover y ampliar el inter\u00E9s del estudiante");
		lblNewLabel_48_9_6.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_9_6.setBounds(197, 586, 583, 41);
		panel_28.add(lblNewLabel_48_9_6);

		JPanel panel_6_6_1_1_2 = new JPanel();
		panel_6_6_1_1_2.setBackground(SystemColor.textInactiveText);
		panel_6_6_1_1_2.setBounds(10, 68, 1904, 10);
		panel_28.add(panel_6_6_1_1_2);

		JPanel panel_6_6_1_1_3 = new JPanel();
		panel_6_6_1_1_3.setBackground(SystemColor.textInactiveText);
		panel_6_6_1_1_3.setBounds(160, 104, 1601, 4);
		panel_28.add(panel_6_6_1_1_3);

		JPanel panel_6_6_1_1_3_1 = new JPanel();
		panel_6_6_1_1_3_1.setBackground(SystemColor.textInactiveText);
		panel_6_6_1_1_3_1.setBounds(160, 217, 1601, 4);
		panel_28.add(panel_6_6_1_1_3_1);

		JPanel panel_6_6_1_1_3_1_1 = new JPanel();
		panel_6_6_1_1_3_1_1.setBackground(SystemColor.textInactiveText);
		panel_6_6_1_1_3_1_1.setBounds(160, 331, 1601, 3);
		panel_28.add(panel_6_6_1_1_3_1_1);

		JPanel panel_6_6_1_1_3_1_2 = new JPanel();
		panel_6_6_1_1_3_1_2.setBackground(SystemColor.textInactiveText);
		panel_6_6_1_1_3_1_2.setBounds(160, 553, 1601, 4);
		panel_28.add(panel_6_6_1_1_3_1_2);

		JPanel panel_6_6_1_1_3_1_3 = new JPanel();
		panel_6_6_1_1_3_1_3.setBackground(SystemColor.textInactiveText);
		panel_6_6_1_1_3_1_3.setBounds(160, 445, 1601, 4);
		panel_28.add(panel_6_6_1_1_3_1_3);

		JPanel panel_6_6_1_1_3_1_4 = new JPanel();
		panel_6_6_1_1_3_1_4.setBackground(SystemColor.textInactiveText);
		panel_6_6_1_1_3_1_4.setBounds(160, 665, 1601, 4);
		panel_28.add(panel_6_6_1_1_3_1_4);

		JLabel lblNewLabel_48_9_7 = new JLabel("en la disciplina.");
		lblNewLabel_48_9_7.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_9_7.setBounds(225, 613, 389, 41);
		panel_28.add(lblNewLabel_48_9_7);

		JLabel lblNewLabel_48_9_8 = new JLabel("f. Habilidad para desarrollar y utilizar m\u00E9todos y estrategias adecuadas,");
		lblNewLabel_48_9_8.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_9_8.setBounds(197, 680, 728, 41);
		panel_28.add(lblNewLabel_48_9_8);

		JLabel lblNewLabel_48_9_9 = new JLabel(" incluyendo el \u201Cassessment\u201D para una ense\u00F1anza efectiva.");
		lblNewLabel_48_9_9.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_9_9.setBounds(219, 716, 571, 41);
		panel_28.add(lblNewLabel_48_9_9);

		JLabel lblNewLabel_48_9_10 = new JLabel("g. Disponibilidad y eficacia en la orientaci\u00F3n acad\u00E9mica del ");
		lblNewLabel_48_9_10.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_9_10.setBounds(197, 782, 675, 41);
		panel_28.add(lblNewLabel_48_9_10);

		JLabel lblNewLabel_48_9_11 = new JLabel("estudiante.");
		lblNewLabel_48_9_11.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_9_11.setBounds(225, 809, 389, 34);
		panel_28.add(lblNewLabel_48_9_11);

		JLabel lblNewLabel_48_9_12 = new JLabel("h. Posesi\u00F3n de los atributos de integridad, laboriosidad, liberalidad y ");
		lblNewLabel_48_9_12.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_9_12.setBounds(197, 845, 710, 41);
		panel_28.add(lblNewLabel_48_9_12);

		JLabel lblNewLabel_48_9_13 = new JLabel("objetividad en la ense\u00F1anza");
		lblNewLabel_48_9_13.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_9_13.setBounds(225, 874, 389, 41);
		panel_28.add(lblNewLabel_48_9_13);

		JPanel panel_6_6_1_1_3_1_4_1 = new JPanel();
		panel_6_6_1_1_3_1_4_1.setBackground(SystemColor.textInactiveText);
		panel_6_6_1_1_3_1_4_1.setBounds(160, 774, 1601, 3);
		panel_28.add(panel_6_6_1_1_3_1_4_1);

		JPanel panel_6_6_1_1_3_1_4_3 = new JPanel();
		panel_6_6_1_1_3_1_4_3.setBackground(SystemColor.textInactiveText);
		panel_6_6_1_1_3_1_4_3.setBounds(141, 926, 1611, 3);
		panel_28.add(panel_6_6_1_1_3_1_4_3);

		JPanel panel_6_6_1_1_3_2 = new JPanel();
		panel_6_6_1_1_3_2.setBackground(SystemColor.textInactiveText);
		panel_6_6_1_1_3_2.setBounds(141, 74, 17, 855);
		panel_28.add(panel_6_6_1_1_3_2);

		JPanel panel_6_6_1_1_3_2_1 = new JPanel();
		panel_6_6_1_1_3_2_1.setBackground(SystemColor.textInactiveText);
		panel_6_6_1_1_3_2_1.setBounds(1744, 74, 17, 855);
		panel_28.add(panel_6_6_1_1_3_2_1);

		JPanel panel_6_6_1_1_3_2_2 = new JPanel();
		panel_6_6_1_1_3_2_2.setBackground(SystemColor.textInactiveText);
		panel_6_6_1_1_3_2_2.setBounds(934, 68, 10, 861);
		panel_28.add(panel_6_6_1_1_3_2_2);

		JPanel panel_6_6_1_1_3_2_2_1 = new JPanel();
		panel_6_6_1_1_3_2_2_1.setBackground(SystemColor.textInactiveText);
		panel_6_6_1_1_3_2_2_1.setBounds(1185, 68, 10, 862);
		panel_28.add(panel_6_6_1_1_3_2_2_1);

		JLabel lblNewLabel_48_8_1_1 = new JLabel("Puntuaci\u00F3n obtenida");
		lblNewLabel_48_8_1_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_48_8_1_1.setBounds(949, 68, 234, 41);
		panel_28.add(lblNewLabel_48_8_1_1);

		JLabel lblNewLabel_48_8_1_1_1 = new JLabel("Comentarios");
		lblNewLabel_48_8_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_48_8_1_1_1.setBounds(1369, 68, 152, 41);
		panel_28.add(lblNewLabel_48_8_1_1_1);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(1195, 110, 546, 101);
		panel_28.add(textArea);

		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(1195, 217, 546, 114);
		panel_28.add(textArea_1);

		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(1195, 331, 546, 114);
		panel_28.add(textArea_2);

		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(1195, 445, 546, 107);
		panel_28.add(textArea_3);

		JTextArea textArea_4 = new JTextArea();
		textArea_4.setBounds(1195, 553, 546, 107);
		panel_28.add(textArea_4);

		JTextArea textArea_5 = new JTextArea();
		textArea_5.setBounds(1196, 670, 546, 107);
		panel_28.add(textArea_5);

		JTextArea textArea_6 = new JTextArea();
		textArea_6.setBounds(1195, 782, 546, 140);
		panel_28.add(textArea_6);
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Tahoma", Font.BOLD, 19));
		spinner.setBounds(1039, 155, 58, 27);
		panel_28.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		spinner_1.setBounds(1039, 263, 58, 27);
		panel_28.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		spinner_2.setBounds(1039, 380, 58, 27);
		panel_28.add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		spinner_3.setBounds(1038, 485, 59, 27);
		panel_28.add(spinner_3);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		spinner_4.setBounds(1039, 600, 58, 27);
		panel_28.add(spinner_4);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		spinner_5.setBounds(1039, 711, 58, 27);
		panel_28.add(spinner_5);
		
		JSpinner spinner_5_1 = new JSpinner();
		spinner_5_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		spinner_5_1.setBounds(1039, 831, 58, 27);
		panel_28.add(spinner_5_1);

///////////////////////////// instrumento 2 ////////////////////////////

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

		ins2_a_textField = new JTextField();
		ins2_a_textField.setEditable(false);
		ins2_a_textField.setBounds(1343, 38, 86, 35);
		panel_4.add(ins2_a_textField);
		ins2_a_textField.setColumns(10);

		ins2_b_textField = new JTextField();
		ins2_b_textField.setEditable(false);
		ins2_b_textField.setColumns(10);
		ins2_b_textField.setBounds(1343, 137, 86, 35);
		panel_4.add(ins2_b_textField);

		ins2_c_textField = new JTextField();
		ins2_c_textField.setEditable(false);
		ins2_c_textField.setColumns(10);
		ins2_c_textField.setBounds(1343, 217, 86, 35);
		panel_4.add(ins2_c_textField);

		ins2_d_textField = new JTextField();
		ins2_d_textField.setEditable(false);
		ins2_d_textField.setColumns(10);
		ins2_d_textField.setBounds(1343, 287, 86, 35);
		panel_4.add(ins2_d_textField);

		ins2_e_textField = new JTextField();
		ins2_e_textField.setEditable(false);
		ins2_e_textField.setColumns(10);
		ins2_e_textField.setBounds(1343, 354, 86, 35);
		panel_4.add(ins2_e_textField);

		ins2_f_textField = new JTextField();
		ins2_f_textField.setEditable(false);
		ins2_f_textField.setColumns(10);
		ins2_f_textField.setBounds(1343, 442, 86, 35);
		panel_4.add(ins2_f_textField);

		ins2_gh_textField = new JTextField();
		ins2_gh_textField.setEditable(false);
		ins2_gh_textField.setColumns(10);
		ins2_gh_textField.setBounds(1343, 533, 86, 35);
		panel_4.add(ins2_gh_textField);

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

		JPanel panel_3 = new JPanel();
		tabbedPane_1.addTab("Servicio a la instituci\u00F3n", null, panel_3, null);
		panel_3.setLayout(null);

		JLabel ins2_1_a_textField = new JLabel("Autoevaluaci\u00F3n Narrativa");
		ins2_1_a_textField.setForeground(new Color(0, 100, 0));
		ins2_1_a_textField.setFont(new Font("Tahoma", Font.BOLD, 65));
		ins2_1_a_textField.setBounds(552, 34, 895, 126);
		panel_3.add(ins2_1_a_textField);

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
		panel_6_7.setBounds(0, 60, 1530, 10);
		panel_5.add(panel_6_7);

		JPanel panel_6_8 = new JPanel();
		panel_6_8.setBounds(1192, 0, 10, 495);
		panel_5.add(panel_6_8);

		JLabel lblNewLabel_14 = new JLabel("a. Trabajo en comit\u00E9s de facultad a nivel departamental");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_14.setBounds(38, 23, 1176, 26);
		panel_5.add(lblNewLabel_14);

		JLabel lblNewLabel_15 = new JLabel("b. Participaci\u00F3n y aportaci\u00F3n a reuniones de facultad y de comit\u00E9s a nivel de Recinto");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_15.setBounds(38, 81, 1052, 46);
		panel_5.add(lblNewLabel_15);

		JLabel lblNewLabel_16 = new JLabel("c. Servicio en comit\u00E9s y en organizaciones a nivel  institucional\r");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_16.setBounds(38, 147, 781, 46);
		panel_5.add(lblNewLabel_16);

		JLabel lblNewLabel_17 = new JLabel("d. Colaboraci\u00F3n en actividades estudiantiles");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_17.setBounds(35, 219, 701, 28);
		panel_5.add(lblNewLabel_17);

		JPanel panel_6_7_1 = new JPanel();
		panel_6_7_1.setBounds(0, 258, 1530, 10);
		panel_5.add(panel_6_7_1);

		JLabel lblNewLabel_18 = new JLabel("e. Asistencia a actos oficiales");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_18.setBounds(38, 270, 979, 46);
		panel_5.add(lblNewLabel_18);

		JLabel lblNewLabel_19 = new JLabel("f. Designaci\u00F3n como director/a de departamento, presidente de comit\u00E9 y  otras\r");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_19.setBounds(38, 327, 881, 46);
		panel_5.add(lblNewLabel_19);

		ins2_1_ab_textField = new JTextField();
		ins2_1_ab_textField.setHorizontalAlignment(SwingConstants.CENTER);
		ins2_1_ab_textField.setEditable(false);
		ins2_1_ab_textField.setBounds(1312, 11, 86, 38);
		panel_5.add(ins2_1_ab_textField);
		ins2_1_ab_textField.setColumns(10);

		ins2_1_cd_textField = new JTextField();
		ins2_1_cd_textField.setHorizontalAlignment(SwingConstants.CENTER);
		ins2_1_cd_textField.setEditable(false);
		ins2_1_cd_textField.setColumns(10);
		ins2_1_cd_textField.setBounds(1312, 83, 86, 38);
		panel_5.add(ins2_1_cd_textField);

		ins2_1_ef_textField = new JTextField();
		ins2_1_ef_textField.setHorizontalAlignment(SwingConstants.CENTER);
		ins2_1_ef_textField.setEditable(false);
		ins2_1_ef_textField.setColumns(10);
		ins2_1_ef_textField.setBounds(1312, 150, 86, 38);
		panel_5.add(ins2_1_ef_textField);
		
		JLabel lblNewLabel_19_1 = new JLabel("g. Participaci\u00F3n en organismos de gobierno; tales como: el Senado y el Consejo Universitario\r");
		lblNewLabel_19_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_19_1.setBounds(38, 419, 1091, 46);
		panel_5.add(lblNewLabel_19_1);
		
		JPanel panel_6_7_4 = new JPanel();
		panel_6_7_4.setBounds(0, 134, 1530, 10);
		panel_5.add(panel_6_7_4);
		
		JPanel panel_6_7_4_1 = new JPanel();
		panel_6_7_4_1.setBounds(0, 193, 1530, 10);
		panel_5.add(panel_6_7_4_1);
		
		JPanel panel_6_7_1_1 = new JPanel();
		panel_6_7_1_1.setBounds(0, 316, 1530, 10);
		panel_5.add(panel_6_7_1_1);
		
		JPanel panel_6_7_1_2 = new JPanel();
		panel_6_7_1_2.setBounds(0, 384, 1530, 10);
		panel_5.add(panel_6_7_1_2);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(1312, 212, 86, 38);
		panel_5.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(1312, 273, 86, 38);
		panel_5.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(1312, 335, 86, 38);
		panel_5.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(1312, 423, 86, 38);
		panel_5.add(textField_4);

		JLabel lblNewLabel_20 = new JLabel("Puntuaci\u00F3n");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_20.setBounds(1510, 266, 175, 35);
		panel_3.add(lblNewLabel_20);

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

		ins2_3_ab_textField = new JTextField();
		ins2_3_ab_textField.setHorizontalAlignment(SwingConstants.CENTER);
		ins2_3_ab_textField.setEditable(false);
		ins2_3_ab_textField.setColumns(10);
		ins2_3_ab_textField.setBounds(1071, 68, 86, 38);
		panel_10.add(ins2_3_ab_textField);

		JLabel lblNewLabel_20_1 = new JLabel("Puntuaci\u00F3n");
		lblNewLabel_20_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_20_1.setBounds(1376, 267, 175, 35);
		panel_7.add(lblNewLabel_20_1);

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

		ins2_4_a_textField = new JTextField();
		ins2_4_a_textField.setEditable(false);
		ins2_4_a_textField.setBounds(1076, 28, 128, 44);
		panel_12.add(ins2_4_a_textField);
		ins2_4_a_textField.setColumns(10);

		ins2_4_b_textField = new JTextField();
		ins2_4_b_textField.setEditable(false);
		ins2_4_b_textField.setColumns(10);
		ins2_4_b_textField.setBounds(1076, 138, 128, 44);
		panel_12.add(ins2_4_b_textField);

		ins2_4_cde_textField = new JTextField();
		ins2_4_cde_textField.setEditable(false);
		ins2_4_cde_textField.setColumns(10);
		ins2_4_cde_textField.setBounds(1076, 303, 128, 44);
		panel_12.add(ins2_4_cde_textField);
		
		JLabel lblNewLabel_26 = new JLabel("Investigaci\u00F3n y trabajo creativo");
		lblNewLabel_26.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_26.setBounds(562, 199, 420, 53);
		panel_11.add(lblNewLabel_26);

		JLabel lblNewLabel_20_1_1 = new JLabel("Puntuaci\u00F3n");
		lblNewLabel_20_1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_20_1_1.setBounds(1363, 217, 175, 35);
		panel_11.add(lblNewLabel_20_1_1);

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

		ins2_5_abc_textField = new JTextField();
		ins2_5_abc_textField.setEditable(false);
		ins2_5_abc_textField.setColumns(10);
		ins2_5_abc_textField.setBounds(1387, 79, 128, 44);
		panel_14.add(ins2_5_abc_textField);

		ins2_5_b_textField = new JTextField();
		ins2_5_b_textField.setEditable(false);
		ins2_5_b_textField.setColumns(10);
		ins2_5_b_textField.setBounds(1387, 261, 128, 44);
		panel_14.add(ins2_5_b_textField);

		ins2_5_ef_textField = new JTextField();
		ins2_5_ef_textField.setEditable(false);
		ins2_5_ef_textField.setColumns(10);
		ins2_5_ef_textField.setBounds(1387, 418, 128, 44);
		panel_14.add(ins2_5_ef_textField);

		JLabel lblNewLabel_32 = new JLabel("Crecimiento y Desarrollo Profesional");
		lblNewLabel_32.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_32.setBounds(422, 229, 388, 37);
		panel_13.add(lblNewLabel_32);

		JLabel lblNewLabel_20_1_1_1 = new JLabel("Puntuaci\u00F3n");
		lblNewLabel_20_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_20_1_1_1.setBounds(1510, 231, 175, 35);
		panel_13.add(lblNewLabel_20_1_1_1);

		///////Instrumento 2////////////////////
		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Instrumento III-A", null, tabbedPane_3, null);


		JPanel panel_23 = new JPanel();
		tabbedPane_3.addTab("Criterio I", null, panel_23, null);
		panel_23.setLayout(null);


		JLabel lblNewLabel_48 = new JLabel("1. Mediante la interacci\u00F3n con los estudiantes, el profesor demostr\u00F3 conocimiento ");
		lblNewLabel_48.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48.setBounds(6, 99, 785, 41);
		panel_23.add(lblNewLabel_48);


		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane.setBounds(1095, 156, 637, 168);
		panel_23.add(textPane);



		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "4", "3", "2", "1", "0"}));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox.setBounds(796, 156, 94, 22);
		panel_23.add(comboBox);


		JLabel lblNewLabel_48_1 = new JLabel("2. Mediante la interacci\u00F3n con los estudiantes, el profesor integr\u00F3 conceptos \n");
		lblNewLabel_48_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_1.setBounds(1070, 99, 762, 41);
		panel_23.add(lblNewLabel_48_1);


		JTextPane textPane_1 = new JTextPane();
		textPane_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1.setBounds(40, 156, 637, 168);
		panel_23.add(textPane_1);



		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "4", "3", "2", "1", "0"}));
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_1.setBounds(796, 454, 94, 22);
		panel_23.add(comboBox_1);


		JLabel lblNewLabel_48_1_1_1 = new JLabel("3. El profesor resalt\u00F3 la utilidad del tema para otros cursos o \u00E1reas del conocimiento.");
		lblNewLabel_48_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_1_1_1.setBounds(6, 396, 808, 59);
		panel_23.add(lblNewLabel_48_1_1_1);



		JComboBox comboBox_3_1 = new JComboBox();
		comboBox_3_1.setModel(new DefaultComboBoxModel(new String[] {"", "4", "3", "2", "1", "0"}));
		comboBox_3_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_3_1.setBounds(1787, 156, 94, 22);
		panel_23.add(comboBox_3_1);


		JTextPane textPane_1_1_1 = new JTextPane();
		textPane_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_1_1.setBounds(40, 454, 637, 168);
		panel_23.add(textPane_1_1_1);


		JLabel lblNewLabel_48_2 = new JLabel("4. El profesor facilit\u00F3 que los estudiantes relacionen el tema");
		lblNewLabel_48_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_2.setBounds(1070, 377, 404, 41);
		panel_23.add(lblNewLabel_48_2);



		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"", "4", "3", "2", "1", "0"}));
		comboBox_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_4.setBounds(1787, 375, 94, 22);
		panel_23.add(comboBox_4);



		JComboBox comboBox_4_1 = new JComboBox();
		comboBox_4_1.setModel(new DefaultComboBoxModel(new String[] {"", "4", "3", "2", "1", "0"}));
		comboBox_4_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_4_1.setBounds(1787, 604, 94, 22);
		panel_23.add(comboBox_4_1);


		JTextPane textPane_2_1 = new JTextPane();
		textPane_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_2_1.setBounds(1095, 454, 637, 168);
		panel_23.add(textPane_2_1);


		JPanel panel_6_6_1 = new JPanel();
		panel_6_6_1.setBackground(UIManager.getColor("Button.disabledForeground"));
		panel_6_6_1.setBounds(994, 136, 10, 796);
		panel_23.add(panel_6_6_1);


		JLabel lblNewLabel_49 = new JLabel(" DOMINIO DE LA DISCIPLINA Y SU RELACI\u00D3N CON OTRAS ESFERAS DEL CONOCIMIENTO");
		lblNewLabel_49.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_49.setBounds(90, 0, 1409, 87);
		panel_23.add(lblNewLabel_49);


		JPanel panel_6_6_1_1 = new JPanel();
		panel_6_6_1_1.setBackground(SystemColor.textInactiveText);
		panel_6_6_1_1.setBounds(-32, 97, 1904, 10);
		panel_23.add(panel_6_6_1_1);
		
		JLabel lblNewLabel_48_10 = new JLabel("suficiente del tema evaluado");
		lblNewLabel_48_10.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10.setBounds(29, 119, 785, 41);
		panel_23.add(lblNewLabel_48_10);
		
		JLabel lblNewLabel_48_1_1 = new JLabel("o experiencias de otras disciplinas para enriquecer el tema evaluado.");
		lblNewLabel_48_1_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_1_1.setBounds(1095, 119, 762, 41);
		panel_23.add(lblNewLabel_48_1_1);
		
		JLabel lblNewLabel_48_2_1 = new JLabel("con sus experiencias personales o el mundo del trabajo.");
		lblNewLabel_48_2_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_2_1.setBounds(1095, 405, 404, 41);
		panel_23.add(lblNewLabel_48_2_1);


		JPanel panel_24 = new JPanel();
		tabbedPane_3.addTab("Criterio II", null, panel_24, null);
		panel_24.setLayout(null);


		JLabel lblNewLabel_49_1 = new JLabel("GESTI\u00D3N DE LA DOCENCIA");
		lblNewLabel_49_1.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_49_1.setBounds(626, 6, 1021, 87);
		panel_24.add(lblNewLabel_49_1);


		JTextPane textPane_1_2 = new JTextPane();
		textPane_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_2.setBounds(66, 211, 637, 168);
		panel_24.add(textPane_1_2);


		JTextPane textPane_1_3 = new JTextPane();
		textPane_1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_3.setBounds(66, 462, 637, 168);
		panel_24.add(textPane_1_3);


		JTextPane textPane_1_4 = new JTextPane();
		textPane_1_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_4.setBounds(66, 724, 637, 168);
		panel_24.add(textPane_1_4);


		JTextPane textPane_1_5 = new JTextPane();
		textPane_1_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_5.setBounds(995, 211, 637, 168);
		panel_24.add(textPane_1_5);


		JTextPane textPane_1_6 = new JTextPane();
		textPane_1_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_6.setBounds(995, 462, 637, 168);
		panel_24.add(textPane_1_6);


		JLabel lblNewLabel_48_3 = new JLabel("5. El profesor ejerci\u00F3 la docencia como un gu\u00EDa o facilitador de los estudiantes,");
		lblNewLabel_48_3.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_3.setBounds(34, 105, 742, 41);
		panel_24.add(lblNewLabel_48_3);


		JLabel lblNewLabel_48_4 = new JLabel("7. El profesor promovi\u00F3 la comunicaci\u00F3n e interacci\u00F3n estudiante-estudiante.\n");
		lblNewLabel_48_4.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_4.setBounds(34, 409, 742, 41);
		panel_24.add(lblNewLabel_48_4);


		JLabel lblNewLabel_48_5 = new JLabel("9. Cumple con los objetivos establecidos para la clase.");
		lblNewLabel_48_5.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_5.setBounds(48, 672, 710, 41);
		panel_24.add(lblNewLabel_48_5);


		JLabel lblNewLabel_48_6 = new JLabel("6. En su interacci\u00F3n con los estudiantes, el profesor utiliz\u00F3 un lenguaje que");
		lblNewLabel_48_6.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_6.setBounds(970, 94, 691, 41);
		panel_24.add(lblNewLabel_48_6);


		JLabel lblNewLabel_48_7 = new JLabel("8. El profesor foment\u00F3 la comunicaci\u00F3n e interacci\u00F3n estudiante-profesor.");
		lblNewLabel_48_7.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_7.setBounds(970, 409, 591, 41);
		panel_24.add(lblNewLabel_48_7);


		JLabel lblNewLabel_48_6_1 = new JLabel("corresponde con el nivel de los estudiantes en el curso.");
		lblNewLabel_48_6_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_6_1.setBounds(995, 117, 838, 41);
		panel_24.add(lblNewLabel_48_6_1);



		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"", "4", "3", "2", "1", "0"}));
		comboBox_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_5.setBounds(788, 211, 94, 22);
		panel_24.add(comboBox_5);



		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"", "4", "3", "2", "1", "0"}));
		comboBox_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_6.setBounds(760, 457, 94, 22);
		panel_24.add(comboBox_6);



		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"", "4", "3", "2", "1", "0"}));
		comboBox_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_7.setBounds(760, 685, 94, 22);
		panel_24.add(comboBox_7);

		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"", "4", "3", "2", "1", "0"}));
		comboBox_9.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_9.setBounds(1782, 212, 94, 22);
		panel_24.add(comboBox_9);



		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"", "4", "3", "2", "1", "0"}));
		comboBox_10.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_10.setBounds(1782, 474, 94, 22);
		panel_24.add(comboBox_10);


		JPanel panel_6_6_1_1_1 = new JPanel();
		panel_6_6_1_1_1.setBackground(SystemColor.textInactiveText);
		panel_6_6_1_1_1.setBounds(0, 84, 1920, 10);
		panel_24.add(panel_6_6_1_1_1);


		JPanel panel_6_6_1_2 = new JPanel();
		panel_6_6_1_2.setBackground(SystemColor.textInactiveText);
		panel_6_6_1_2.setBounds(948, 84, 10, 872);
		panel_24.add(panel_6_6_1_2);
		
		JLabel lblNewLabel_48_3_2 = new JLabel("mediante la comunicaci\u00F3n e interacci\u00F3n con los mismos, as\u00ED como en las");
		lblNewLabel_48_3_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_3_2.setBounds(58, 131, 718, 41);
		panel_24.add(lblNewLabel_48_3_2);
		
		JLabel lblNewLabel_48_3_2_1 = new JLabel("diversas actividades docentes.");
		lblNewLabel_48_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_3_2_1.setBounds(58, 158, 718, 41);
		panel_24.add(lblNewLabel_48_3_2_1);


		JPanel panel_25 = new JPanel();
		tabbedPane_3.addTab("Criterio II", null, panel_25, null);
		panel_25.setLayout(null);


		JLabel lblNewLabel_49_1_1 = new JLabel("GESTI\u00D3N DE LA DOCENCIA");
		lblNewLabel_49_1_1.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_49_1_1.setBounds(589, 6, 723, 87);
		panel_25.add(lblNewLabel_49_1_1);


		JPanel panel_6_6_1_1_1_1 = new JPanel();
		panel_6_6_1_1_1_1.setBackground(SystemColor.textInactiveText);
		panel_6_6_1_1_1_1.setBounds(0, 83, 1914, 10);
		panel_25.add(panel_6_6_1_1_1_1);


		JPanel panel_6_6_1_2_1 = new JPanel();
		panel_6_6_1_2_1.setBackground(SystemColor.textInactiveText);
		panel_6_6_1_2_1.setBounds(968, 83, 10, 874);
		panel_25.add(panel_6_6_1_2_1);


		JLabel lblNewLabel_48_3_1 = new JLabel("9. El profesor planific\u00F3 la distribuci\u00F3n del tiempo de forma tal que los estudiantes");
		lblNewLabel_48_3_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_3_1.setBounds(10, 105, 771, 41);
		panel_25.add(lblNewLabel_48_3_1);


		JLabel lblNewLabel_48_3_1_1 = new JLabel("10. El profesor inform\u00F3 a los estudiantes del tiempo estimado para responder");
		lblNewLabel_48_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_3_1_1.setBounds(990, 105, 742, 41);
		panel_25.add(lblNewLabel_48_3_1_1);

		JTextPane textPane_1_2_1 = new JTextPane();
		textPane_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_2_1.setBounds(33, 237, 637, 168);
		panel_25.add(textPane_1_2_1);


		JTextPane textPane_1_2_2 = new JTextPane();
		textPane_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_2_2.setBounds(33, 538, 637, 168);
		panel_25.add(textPane_1_2_2);


		JTextPane textPane_1_2_3 = new JTextPane();
		textPane_1_2_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_2_3.setBounds(44, 741, 637, 168);
		panel_25.add(textPane_1_2_3);


		JTextPane textPane_1_2_4 = new JTextPane();
		textPane_1_2_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_2_4.setBounds(1021, 239, 637, 168);
		panel_25.add(textPane_1_2_4);


		JTextPane textPane_1_2_5 = new JTextPane();
		textPane_1_2_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_2_5.setBounds(1017, 524, 637, 168);
		panel_25.add(textPane_1_2_5);


		JLabel lblNewLabel_48_3_1_3 = new JLabel("11. El profesor inform\u00F3 a los estudiantes de los resultados de las actividades realizadas");
		lblNewLabel_48_3_1_3.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_3_1_3.setBounds(6, 409, 813, 41);
		panel_25.add(lblNewLabel_48_3_1_3);


		JLabel lblNewLabel_48_3_1_3_1 = new JLabel("12. El profesor respondi\u00F3 en el tiempo establecido, los mensajes, las preguntas");
		lblNewLabel_48_3_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_3_1_3_1.setBounds(990, 417, 838, 41);
		panel_25.add(lblNewLabel_48_3_1_3_1);


		JLabel lblNewLabel_48_3_1_3_1_1 = new JLabel("y las consultas de los estudiantes, que se recibieron");
		lblNewLabel_48_3_1_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_3_1_3_1_1.setBounds(1017, 444, 891, 41);
		panel_25.add(lblNewLabel_48_3_1_3_1_1);



		JComboBox comboBox_5_1 = new JComboBox();
		comboBox_5_1.setModel(new DefaultComboBoxModel(new String[] {"", "4", "3", "2", "1", "0"}));
		comboBox_5_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_5_1.setBounds(826, 236, 94, 22);
		panel_25.add(comboBox_5_1);



		JComboBox comboBox_5_2 = new JComboBox();
		comboBox_5_2.setModel(new DefaultComboBoxModel(new String[] {"", "4", "3", "2", "1", "0"}));
		comboBox_5_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_5_2.setBounds(833, 531, 94, 22);
		panel_25.add(comboBox_5_2);



		JComboBox comboBox_5_4 = new JComboBox();
		comboBox_5_4.setModel(new DefaultComboBoxModel(new String[] {"", "4", "3", "2", "1", "0"}));
		comboBox_5_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_5_4.setBounds(1791, 239, 94, 22);
		panel_25.add(comboBox_5_4);



		JComboBox comboBox_5_5 = new JComboBox();
		comboBox_5_5.setModel(new DefaultComboBoxModel(new String[] {"", "4", "3", "2", "1", "0"}));
		comboBox_5_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_5_5.setBounds(1791, 559, 94, 22);
		panel_25.add(comboBox_5_5);
		
		JLabel lblNewLabel_48_3_1_7 = new JLabel("pueden cumplir con los objetivos establecidos.");
		lblNewLabel_48_3_1_7.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_3_1_7.setBounds(33, 132, 771, 41);
		panel_25.add(lblNewLabel_48_3_1_7);
		
		JLabel lblNewLabel_48_3_1_1_1 = new JLabel("a los mensajes, para informar sobre los resultados");
		lblNewLabel_48_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_3_1_1_1.setBounds(1021, 132, 742, 41);
		panel_25.add(lblNewLabel_48_3_1_1_1);
		
		JLabel lblNewLabel_48_3_1_1_1_1 = new JLabel("de los ex\u00E1menes, asignaciones y otros trabajos corregidos;");
		lblNewLabel_48_3_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_3_1_1_1_1.setBounds(1021, 158, 742, 41);
		panel_25.add(lblNewLabel_48_3_1_1_1_1);
		
		JLabel lblNewLabel_48_3_1_1_1_1_1 = new JLabel("aunque el dise\u00F1o del curso pueda incluir algo sobre esto.\n");
		lblNewLabel_48_3_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_3_1_1_1_1_1.setBounds(1021, 188, 742, 41);
		panel_25.add(lblNewLabel_48_3_1_1_1_1_1);
		
		JLabel lblNewLabel_48_3_1_1_1_2 = new JLabel("por aquellos no m\u00E1s tarde de dos semanas de haber sido entregados durante el");
		lblNewLabel_48_3_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_3_1_1_1_2.setBounds(42, 431, 779, 41);
		panel_25.add(lblNewLabel_48_3_1_1_1_2);
		
		JLabel lblNewLabel_48_3_1_1_1_2_1 = new JLabel("semestre o su equivalente en los diversos t\u00E9rminos acad\u00E9micos. (Art\u00EDculo II del ");
		lblNewLabel_48_3_1_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_3_1_1_1_2_1.setBounds(42, 453, 779, 41);
		panel_25.add(lblNewLabel_48_3_1_1_1_2_1);
		
		JLabel lblNewLabel_48_3_1_1_1_2_1_1 = new JLabel("General de Estudiantes).");
		lblNewLabel_48_3_1_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_3_1_1_1_2_1_1.setBounds(43, 479, 779, 41);
		panel_25.add(lblNewLabel_48_3_1_1_1_2_1_1);
		
		JLabel lblNewLabel_48_3_1_3_1_1_1 = new JLabel("mediante el correo electr\u00F3nico.\n");
		lblNewLabel_48_3_1_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_3_1_3_1_1_1.setBounds(1017, 479, 891, 41);
		panel_25.add(lblNewLabel_48_3_1_3_1_1_1);


		JPanel panel_26 = new JPanel();
		tabbedPane_3.addTab("Criterio II", null, panel_26, null);
		panel_26.setLayout(null);


		JLabel lblNewLabel_49_1_1_1 = new JLabel("GESTI\u00D3N DE LA DOCENCIA");
		lblNewLabel_49_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_49_1_1_1.setBounds(654, 43, 786, 87);
		panel_26.add(lblNewLabel_49_1_1_1);


		JLabel lblNewLabel_48_3_1_4 = new JLabel("13. El profesor utiliz\u00F3 las herramientas disponibles en la plataforma y present\u00F3");
		lblNewLabel_48_3_1_4.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_3_1_4.setBounds(32, 266, 742, 41);
		panel_26.add(lblNewLabel_48_3_1_4);


		JLabel lblNewLabel_48_3_1_6 = new JLabel("14. El profesor mantuvo un clima de confianza y respeto");
		lblNewLabel_48_3_1_6.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_3_1_6.setBounds(965, 266, 838, 41);
		panel_26.add(lblNewLabel_48_3_1_6);


		JTextPane textPane_1_2_1_1 = new JTextPane();
		textPane_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_2_1_1.setBounds(69, 332, 637, 168);
		panel_26.add(textPane_1_2_1_1);


		JTextPane textPane_1_2_1_3 = new JTextPane();
		textPane_1_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_2_1_3.setBounds(1031, 318, 637, 168);
		panel_26.add(textPane_1_2_1_3);


		JPanel panel_6_6_1_1_1_1_1 = new JPanel();
		panel_6_6_1_1_1_1_1.setBackground(SystemColor.textInactiveText);
		panel_6_6_1_1_1_1_1.setBounds(0, 200, 1914, 10);
		panel_26.add(panel_6_6_1_1_1_1_1);


		JPanel panel_6_6_1_2_1_1 = new JPanel();
		panel_6_6_1_2_1_1.setBackground(SystemColor.textInactiveText);
		panel_6_6_1_2_1_1.setBounds(909, 211, 10, 796);
		panel_26.add(panel_6_6_1_2_1_1);



		JComboBox comboBox_5_1_1 = new JComboBox();
		comboBox_5_1_1.setModel(new DefaultComboBoxModel(new String[] {"", "4", "3", "2", "1", "0"}));
		comboBox_5_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_5_1_1.setBounds(790, 277, 94, 22);
		panel_26.add(comboBox_5_1_1);



		JComboBox comboBox_5_1_3 = new JComboBox();
		comboBox_5_1_3.setModel(new DefaultComboBoxModel(new String[] {"", "4", "3", "2", "1", "0"}));
		comboBox_5_1_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_5_1_3.setBounds(1788, 279, 94, 22);
		panel_26.add(comboBox_5_1_3);
		
		JLabel lblNewLabel_48_3_1_4_1 = new JLabel("el contenido del curso en forma organizada y coherente.");
		lblNewLabel_48_3_1_4_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_3_1_4_1.setBounds(66, 293, 742, 41);
		panel_26.add(lblNewLabel_48_3_1_4_1);
		
		JPanel panel_22 = new JPanel();
		tabbedPane_3.addTab("Criterio III", null, panel_22, null);
		panel_22.setLayout(null);
		
		JLabel lblNewLabel_49_1_1_1_2 = new JLabel("PROMOCI\u00D3N DEL INTER\u00C9S DEL ESTUDIANTE POR LA ASIGNATURA");
		lblNewLabel_49_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblNewLabel_49_1_1_1_2.setBounds(220, 5, 1292, 87);
		panel_22.add(lblNewLabel_49_1_1_1_2);
		
		JLabel lblNewLabel_48_3_1_4_2 = new JLabel("15. El profesor facilit\u00F3 la discusi\u00F3n para complementar, ");
		lblNewLabel_48_3_1_4_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_3_1_4_2.setBounds(6, 104, 776, 41);
		panel_22.add(lblNewLabel_48_3_1_4_2);
		
		JLabel lblNewLabel_48_3_1_6_1 = new JLabel("16. El profesor promovi\u00F3 la b\u00FAsqueda de informaci\u00F3n o experiencias");
		lblNewLabel_48_3_1_6_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_3_1_6_1.setBounds(982, 104, 838, 41);
		panel_22.add(lblNewLabel_48_3_1_6_1);
		
		JLabel lblNewLabel_48_3_1_4_1_1 = new JLabel("aclarar o enriquecer el tema.");
		lblNewLabel_48_3_1_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_3_1_4_1_1.setBounds(40, 140, 742, 41);
		panel_22.add(lblNewLabel_48_3_1_4_1_1);
		
		JTextPane textPane_1_2_1_1_1 = new JTextPane();
		textPane_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_2_1_1_1.setBounds(40, 193, 637, 168);
		panel_22.add(textPane_1_2_1_1_1);
		
		JTextPane textPane_1_2_1_3_1 = new JTextPane();
		textPane_1_2_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_2_1_3_1.setBounds(1019, 193, 637, 168);
		panel_22.add(textPane_1_2_1_3_1);
		
		JComboBox comboBox_5_1_1_1 = new JComboBox();
		comboBox_5_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_5_1_1_1.setBounds(727, 193, 94, 22);
		panel_22.add(comboBox_5_1_1_1);
		
		JComboBox comboBox_5_1_3_1 = new JComboBox();
		comboBox_5_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_5_1_3_1.setBounds(1726, 324, 94, 22);
		panel_22.add(comboBox_5_1_3_1);
		
		JLabel lblNewLabel_48_3_1_4_1_1_1 = new JLabel("para enriquecer el conocimiento.");
		lblNewLabel_48_3_1_4_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_3_1_4_1_1_1.setBounds(1019, 140, 742, 41);
		panel_22.add(lblNewLabel_48_3_1_4_1_1_1);
		
		JLabel lblNewLabel_48_3_1_4_2_1 = new JLabel("17. El profesor foment\u00F3 el pensamiento cr\u00EDtico.\n");
		lblNewLabel_48_3_1_4_2_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_3_1_4_2_1.setBounds(6, 413, 776, 41);
		panel_22.add(lblNewLabel_48_3_1_4_2_1);
		
		JTextPane textPane_1_2_1_1_1_1 = new JTextPane();
		textPane_1_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_2_1_1_1_1.setBounds(40, 474, 637, 168);
		panel_22.add(textPane_1_2_1_1_1_1);
		
		JComboBox comboBox_5_1_1_1_1 = new JComboBox();
		comboBox_5_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_5_1_1_1_1.setBounds(727, 474, 94, 22);
		panel_22.add(comboBox_5_1_1_1_1);
		
		JPanel panel_31 = new JPanel();
		tabbedPane_3.addTab("Criterio IV", null, panel_31, null);
		panel_31.setLayout(null);
		
		JLabel lblNewLabel_49_1_1_1_2_1 = new JLabel("DESARROLLO Y USO DE M\u00C9TODOS Y ESTRATEGIAS DE ENSE\u00D1ANZA\n");
		lblNewLabel_49_1_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblNewLabel_49_1_1_1_2_1.setBounds(230, 6, 1292, 87);
		panel_31.add(lblNewLabel_49_1_1_1_2_1);
		
		JLabel lblNewLabel_48_3_1_4_2_2 = new JLabel("18. El profesor aport\u00F3 recursos de apoyo adicionales para enriquecer el ");
		lblNewLabel_48_3_1_4_2_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_3_1_4_2_2.setBounds(16, 105, 776, 41);
		panel_31.add(lblNewLabel_48_3_1_4_2_2);
		
		JLabel lblNewLabel_48_3_1_6_1_1 = new JLabel("Por ejemplo: trabajo colaborativo, v\u00EDdeos, presentaciones,");
		lblNewLabel_48_3_1_6_1_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_3_1_6_1_1.setBounds(1012, 151, 838, 41);
		panel_31.add(lblNewLabel_48_3_1_6_1_1);
		
		JLabel lblNewLabel_48_3_1_4_1_1_2 = new JLabel("tema evaluado.");
		lblNewLabel_48_3_1_4_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_3_1_4_1_1_2.setBounds(50, 141, 742, 41);
		panel_31.add(lblNewLabel_48_3_1_4_1_1_2);
		
		JLabel lblNewLabel_48_3_1_4_1_1_1_1 = new JLabel("seminarios y conferencias a trav\u00E9s de la web, entre otros.");
		lblNewLabel_48_3_1_4_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_3_1_4_1_1_1_1.setBounds(1012, 171, 742, 41);
		panel_31.add(lblNewLabel_48_3_1_4_1_1_1_1);
		
		JLabel lblNewLabel_48_3_1_4_2_1_1 = new JLabel("19. El profesor utiliz\u00F3 diferentes recursos de ense\u00F1anza para facilitar el aprendizaje.");
		lblNewLabel_48_3_1_4_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_3_1_4_2_1_1.setBounds(975, 118, 786, 41);
		panel_31.add(lblNewLabel_48_3_1_4_2_1_1);
		
		JTextPane textPane_1_2_1_1_1_2 = new JTextPane();
		textPane_1_2_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_2_1_1_1_2.setBounds(26, 194, 637, 168);
		panel_31.add(textPane_1_2_1_1_1_2);
		
		JTextPane textPane_1_2_1_3_1_1 = new JTextPane();
		textPane_1_2_1_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_2_1_3_1_1.setBounds(1002, 209, 637, 168);
		panel_31.add(textPane_1_2_1_3_1_1);
		
		JComboBox comboBox_5_1_1_1_2 = new JComboBox();
		comboBox_5_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_5_1_1_1_2.setBounds(757, 194, 94, 22);
		panel_31.add(comboBox_5_1_1_1_2);
		
		JComboBox comboBox_5_1_3_1_1 = new JComboBox();
		comboBox_5_1_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_5_1_3_1_1.setBounds(1756, 325, 94, 22);
		panel_31.add(comboBox_5_1_3_1_1);
		
		JComboBox comboBox_5_1_1_1_1_1 = new JComboBox();
		comboBox_5_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_5_1_1_1_1_1.setBounds(757, 475, 94, 22);
		panel_31.add(comboBox_5_1_1_1_1_1);

		////////////////////////////Menu bar//////////////////////////////////////////////////
		var menuBar = new JMenuBar();

		var fileMenu = new JMenu("Guardar");///// menu option
		fileMenu.setFont(new Font("Segoe UI", Font.BOLD, 17));
		fileMenu.setMnemonic(KeyEvent.VK_F);


		var eMenuItem1 = new JMenuItem("Guardar");
		eMenuItem1.addActionListener(new ActionListener() {//// item 1
			public void actionPerformed(ActionEvent arg0) {/// action listener 
			}
		});
		eMenuItem1.setMnemonic(KeyEvent.VK_E);


		fileMenu.add(eMenuItem1);
		menuBar.add(fileMenu);

		JMenuItem eMenuItem1_1 = new JMenuItem("Continuar Luego");//// item 2
		eMenuItem1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {/// action listener 

			}
		});
		eMenuItem1_1.setMnemonic(KeyEvent.VK_E);
		fileMenu.add(eMenuItem1_1);

		setJMenuBar(menuBar);

		////////////////////////////Menu bar finish//////////////////////////////////////////////////

		/////////////////////////////////////BOTON GUARDAR //////////////////////////////////////

		JButton guardarButton = new JButton("Guardar");
		guardarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//Informacion a ingresar

				values [0] = Unidadacademica_textField.getText();
				values [1] = nombre_prof_textField.getText();
				values [2] = rangoAcademico_comboBox.getSelectedItem().toString();
				values [3] = departamento_textField.getText();
				values [4] = disiplina_textField.getText();
				values [5] = objetivo_eval_comboBox.getSelectedItem().toString();
				values [6] = periodo_evaluado_textField.getText();
				values [7] = jornada_comple_comboBox.getSelectedItem().toString();
				values [8] = jornada_parcial_comboBox.getSelectedItem().toString();
				values [9] = contrato_comboBox.getSelectedItem().toString();
				values [10] = codigo_textField.getText();
				values [11] = tutulo_del_curso_textField.getText();
				values [12] = modalidad_textField.getText();
				values [13] = comboBox_11.getSelectedItem().toString();

				if (parte1_perfil_de_estudiante_1_comboBox.getSelectedItem().toString() == " ") {

					values[14] = "0";

				} else {

					values [14] = parte1_perfil_de_estudiante_1_comboBox.getSelectedItem().toString();

				}
				if (parte1_perfil_de_estudiante_2_comboBox.getSelectedItem().toString() == " ") {

					values [15] = "0";

				} else {

					values [15] = parte1_perfil_de_estudiante_2_comboBox.getSelectedItem().toString();

				}
				if (parte2_estudi_3_comboBox.getSelectedItem().toString() == " ") {

					values [16] = "0";

				} else {

					values [16] = parte2_estudi_3_comboBox.getSelectedItem().toString();

				}
				if (parte2_estudi_4_comboBox.getSelectedItem().toString() == " ") {

					values [17] = "0";

				} else {

					values [17] = parte2_estudi_4_comboBox.getSelectedItem().toString();

				}
				if (parte3_estudi_5_comboBox.getSelectedItem().toString() == " ") {

					values [18] = "0";

				} else {

					values [18] = parte3_estudi_5_comboBox.getSelectedItem().toString();

				}
				if (parte3_estudi_6_comboBox.getSelectedItem().toString() == " ") {

					values [19] = "0";

				} else {

					values [19] = parte3_estudi_6_comboBox.getSelectedItem().toString();

				}
				if (parte3_estudi_7_comboBox.getSelectedItem().toString() == " ") {

					values [20] = "0";

				} else {

					values [20] = parte3_estudi_7_comboBox.getSelectedItem().toString();

				}
				if (parte3_estudi_8_comboBox.getSelectedItem().toString() == " ") {

					values [21] = "0";

				} else {

					values [21] = parte3_estudi_8_comboBox.getSelectedItem().toString();

				}
				if (parte3_estudi_9_comboBox.getSelectedItem().toString() == " ") {

					values [22] = "0";

				} else {

					values [22] = parte3_estudi_9_comboBox.getSelectedItem().toString();

				}
				if (parte3_estudi_10_comboBox_3.getSelectedItem().toString() == " ") {

					values [23] = "0";

				} else {

					values [23] = parte3_estudi_10_comboBox_3.getSelectedItem().toString();

				}
				if (parte3_estudi_11_comboBox_3.getSelectedItem().toString() == " ") {

					values [24] = "0";

				} else {

					values [24] = parte3_estudi_11_comboBox_3.getSelectedItem().toString();

				}
				if (parte3_estudi_12_comboBox_3.getSelectedItem().toString() == " ") {

					values [25] = "0";

				} else {

					values [25] = parte3_estudi_12_comboBox_3.getSelectedItem().toString();

				}
				if (parte3_desarollo_de_clase_13_comboBox.getSelectedItem().toString() == " ") {

					values [26] = "0";

				} else {

					values [26] = parte3_desarollo_de_clase_13_comboBox.getSelectedItem().toString();

				}
				if (parte3_desarollo_de_clase_14_comboBox.getSelectedItem().toString() == " ") {

					values [27] = "0";

				} else {

					values [27] = parte3_desarollo_de_clase_14_comboBox.getSelectedItem().toString();

				}
				if (parte3_desarollo_de_clase_15_comboBox_1_1.getSelectedItem().toString() == " ") {

					values [28] = "0";

				} else {

					values [28] = parte3_desarollo_de_clase_15_comboBox_1_1.getSelectedItem().toString();

				}
				if (parte3_desarollo_de_clase_16_comboBox.getSelectedItem().toString() == " ") {

					values [29] = "0";

				} else {

					values [29] = parte3_desarollo_de_clase_16_comboBox.getSelectedItem().toString();

				}
				if ( parte3_desarollo_de_clase_17_comboBox_1_1.getSelectedItem().toString() == " ") {

					values [30] = "0";

				} else {

					values [30] = parte3_desarollo_de_clase_17_comboBox_1_1.getSelectedItem().toString();

				}
				if (parte5_gerencia_18_comboBox_1.getSelectedItem().toString() == " ") {

					values [31] = "0";

				} else {

					values [31] = parte5_gerencia_18_comboBox_1.getSelectedItem().toString();

				}
				if (parte5_gerencia_19_comboBox_1.getSelectedItem().toString() == " ") {

					values [32] = "0";

				} else {

					values [32] = parte5_gerencia_19_comboBox_1.getSelectedItem().toString();

				}
				if (parte5_gerencia_20_comboBox_1.getSelectedItem().toString() == " ") {

					values [33] = "0";

				} else {

					values [33] = parte5_gerencia_20_comboBox_1.getSelectedItem().toString();

				}
				if (parte5_gerencia_21_comboBox_1.getSelectedItem().toString() == " ") {

					values [34] = "0";

				} else {

					values [34] = parte5_gerencia_21_comboBox_1.getSelectedItem().toString();

				}
				if (parte5_gerencia_22_comboBox_1.getSelectedItem().toString() == " ") { 

					values[35] = "0";

				} else {

					values [35] = parte5_gerencia_22_comboBox_1.getSelectedItem().toString();

				}
				if (parte5_gerencia_23_comboBox_1.getSelectedItem().toString() == " ") {

					values [36] = "0";

				} else {

					values [36] = parte5_gerencia_23_comboBox_1.getSelectedItem().toString();

				}
				if (parte5_gerencia_24_comboBox_1.getSelectedItem().toString() == " ") {

					values [37] = "0";

				} else {

					values [37] = parte5_gerencia_24_comboBox_1.getSelectedItem().toString();

				}
				if (parte5_gerencia_25_comboBox_1.getSelectedItem().toString() == " ") {

					values [38] = "0";

				} else {

					values [38] = parte5_gerencia_25_comboBox_1.getSelectedItem().toString();

				}
				if (parte5_gerencia_26_comboBox_1.getSelectedItem().toString() == " ") {

					values [39] = "0";

				} else {

					values [39] = parte5_gerencia_26_comboBox_1.getSelectedItem().toString();

				}
				if (parte5_gerencia_27_comboBox.getSelectedItem().toString() == " ") {

					values [40] = "0";

				} else {

					values [40] = parte5_gerencia_27_comboBox.getSelectedItem().toString();

				} 
//				if (parte5_gerencia_28_comboBox.getSelectedItem().toString() == " ") {
//
//					values [41] = "0";
//
//				} else {
//
//					values [41] = parte5_gerencia_28_comboBox.getSelectedItem().toString();
//
//				} 
//				if (parte5_gerencia_29_comboBox.getSelectedItem().toString() == " ") {
//
//					values [42] = "0";
//
//				} else {
//
//					values [42] = parte5_gerencia_29_comboBox.getSelectedItem().toString();
//
//				}
				////////////////////////////NEW VALUES ///////////////////////////////
				if (comboBox.getSelectedItem().toString() == " ") {

					values [60] = "0";

				} else {

					values [60] = comboBox.getSelectedItem().toString();

				}	
				if (comboBox_1.getSelectedItem().toString() == " ") {

					values [61] = "0";

				} else {

					values [61] = comboBox_1.getSelectedItem().toString();

				}
				if (comboBox_3.getSelectedItem().toString() == " ") {

					values [62] = "0";

				} else {

					values [62] = comboBox_3.getSelectedItem().toString();

				}
				if (comboBox_3_1.getSelectedItem().toString() == " ") {

					values [63] = "0";

				} else {

					values [63] = comboBox_3_1.getSelectedItem().toString();

				}
				if (comboBox_4.getSelectedItem().toString() == " ") {

					values [64] = "0";

				} else {

					values [64] = comboBox_4.getSelectedItem().toString();

				}
				if (comboBox_4_1.getSelectedItem().toString() == " ") {

					values [65] = "0";

				} else {

					values [65] = comboBox_4_1.getSelectedItem().toString();

				}
				if (comboBox_5.getSelectedItem().toString() == " ") {

					values [66] = "0";

				} else {

					values [66] = comboBox_5.getSelectedItem().toString();

				}
				if (comboBox_6.getSelectedItem().toString() == " ") {

					values [67] = "0";

				} else {

					values [67] = comboBox_6.getSelectedItem().toString();

				}
				if (comboBox_7.getSelectedItem().toString() == " ") {

					values [68] = "0";

				} else {

					values [68] = comboBox_7.getSelectedItem().toString();

				}
				if (comboBox_9.getSelectedItem().toString() == " ") {

					values [69] = "0";

				} else {

					values [69] = comboBox_9.getSelectedItem().toString();

				}
				if (comboBox_10.getSelectedItem().toString() == " ") {

					values [70] = "0";

				} else {

					values [70] = comboBox_10.getSelectedItem().toString();

				}
				if (comboBox_5_1.getSelectedItem().toString() == " ") {

					values [71] = "0";

				} else {

					values [71] = comboBox_5_1.getSelectedItem().toString();

				}
				if (comboBox_5_2.getSelectedItem().toString() == " ") {

					values [72] = "0";

				} else {

					values [72] = comboBox_5_2.getSelectedItem().toString();

				}
				if (comboBox_5_3.getSelectedItem().toString() == " ") {

					values [73] = "0";

				} else {

					values [73] = comboBox_5_3.getSelectedItem().toString();

				}
				if (comboBox_5_4.getSelectedItem().toString() == " ") {

					values [74] = "0";

				} else {

					values [74] = comboBox_5_4.getSelectedItem().toString();

				}
				if (comboBox_5_5.getSelectedItem().toString() == " ") {

					values [75] = "0";

				} else {

					values [75] = comboBox_5_5.getSelectedItem().toString();

				}
				if (comboBox_5_1_1.getSelectedItem().toString() == " ") {

					values [76] = "0";

				} else {

					values [76] = comboBox_5_1_1.getSelectedItem().toString();

				}
				if (comboBox_5_1_2.getSelectedItem().toString() == " ") {

					values [77] = "0";

				} else {

					values [77] = comboBox_5_1_2.getSelectedItem().toString();

				}
				if (comboBox_5_1_3.getSelectedItem().toString() == " ") {

					values [78] = "0";

				} else {

					values [78] = comboBox_5_1_3.getSelectedItem().toString();

				}
				if (comboBox_5_1_4.getSelectedItem().toString() == " ") {

					values [79] = "0";

				} else {

					values [79] = comboBox_5_1_4.getSelectedItem().toString();

				}

				/////////////////TESTING//////////////////////////////
				for (int i = 0; i < values.length; i++) {
					System.out.println("Test " + i + ": " +values[i]);
				}
				/////////////////////////////////////////////////////////

				LogIn user = new LogIn();

				String ID = user.getID();
				System.out.print("\n"+ID+" hooooooolaaaaaa\n");
				File guardar;


				try {
					guardar = new File("./instrumentos.csv");
					FileWriter fw = new FileWriter("./instrumentos.csv",true);
					BufferedWriter bw = new BufferedWriter(fw);
					PrintWriter pw = new PrintWriter(bw);

					pw.print("FALSE"+","+"FALSE"+","+ID+",");

					for(int i = 0 ; i < values.length ;i++) {
						pw.print(values[i]+",");	
					}
					pw.println(" ");
					pw.flush();
					pw.close();


				}catch(Exception ex) {

					System.out.print("404 "+ ex);
				}

			}
		});
		guardarButton.setBounds(719, 747, 186, 61);
		panel_21.add(guardarButton);
		
		JTabbedPane tabbedPane_5 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Instrumento IV", null, tabbedPane_5, null);
		
		JPanel panel_29 = new JPanel();
		panel_29.setLayout(null);
		tabbedPane_5.addTab("Rubrica", null, panel_29, null);
		
		JLabel lblNewLabel_44_1_2 = new JLabel(" Evaluaci\u00F3n del Director");
		lblNewLabel_44_1_2.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_44_1_2.setBounds(448, 23, 639, 123);
		panel_29.add(lblNewLabel_44_1_2);
	

		JTabbedPane tabbedPane_6 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_5.addTab("RESPONSABILIDADES y DEBERES COMO FACULTAD", null, tabbedPane_6, null);
		
		JPanel panel_32 = new JPanel();
		tabbedPane_6.addTab("1", null, panel_32, null);
		panel_32.setLayout(null);
		
		JLabel lblNewLabel_44_1_2_1_2 = new JLabel(" Evaluaci\u00F3n del Director");
		lblNewLabel_44_1_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_44_1_2_1_2.setBounds(615, 0, 639, 97);
		panel_32.add(lblNewLabel_44_1_2_1_2);
		
		JPanel panel_6_6_1_1_4_2 = new JPanel();
		panel_6_6_1_1_4_2.setBackground(SystemColor.textInactiveText);
		panel_6_6_1_1_4_2.setBounds(0, 108, 1904, 10);
		panel_32.add(panel_6_6_1_1_4_2);
		
		JLabel lblNewLabel_48_10_4 = new JLabel("1. Cumple con las horas de oficina seg\u00FAn establecidas.");
		lblNewLabel_48_10_4.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_4.setBounds(10, 125, 556, 41);
		panel_32.add(lblNewLabel_48_10_4);
		
		JTextPane textPane_1_7_4 = new JTextPane();
		textPane_1_7_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_7_4.setBounds(33, 166, 637, 168);
		panel_32.add(textPane_1_7_4);
		
		JLabel lblNewLabel_48_10_1_3 = new JLabel("2. Presenta evidencia sobre las diferentes formas en la que cumple con la consejer\u00EDa ");
		lblNewLabel_48_10_1_3.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_1_3.setBounds(10, 345, 871, 41);
		panel_32.add(lblNewLabel_48_10_1_3);
		
		JLabel lblNewLabel_48_10_1_1_1 = new JLabel("acad\u00E9mica ofrecida a sus estudiantes, seg\u00FAn definida en el Manual de la Facultad.\r");
		lblNewLabel_48_10_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_1_1_1.setBounds(33, 377, 871, 41);
		panel_32.add(lblNewLabel_48_10_1_1_1);
		
		JTextPane textPane_1_7_1_2 = new JTextPane();
		textPane_1_7_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_7_1_2.setBounds(33, 417, 637, 168);
		panel_32.add(textPane_1_7_1_2);
		
		JLabel lblNewLabel_48_10_1_2_1 = new JLabel("3. Informa al Director del Departamento sobre sus ausencias.");
		lblNewLabel_48_10_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_1_2_1.setBounds(10, 596, 871, 41);
		panel_32.add(lblNewLabel_48_10_1_2_1);
		
		JTextPane textPane_1_7_1_1_1 = new JTextPane();
		textPane_1_7_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_7_1_1_1.setBounds(33, 658, 637, 168);
		panel_32.add(textPane_1_7_1_1_1);
		
		JPanel panel_6_6_1_3_3 = new JPanel();
		panel_6_6_1_3_3.setBackground(SystemColor.textInactiveText);
		panel_6_6_1_3_3.setBounds(955, 112, 10, 832);
		panel_32.add(panel_6_6_1_3_3);
		
		JLabel lblNewLabel_48_10_2_2 = new JLabel("4. Informa al Director del Departamento c\u00F3mo repone sus ausencias.");
		lblNewLabel_48_10_2_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_2_2.setBounds(1005, 129, 686, 41);
		panel_32.add(lblNewLabel_48_10_2_2);
		
		JLabel lblNewLabel_48_10_2_1_2 = new JLabel("5. Contribuye a las deliberaciones de las reuniones de su Departamento. ");
		lblNewLabel_48_10_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_2_1_2.setBounds(1005, 345, 686, 41);
		panel_32.add(lblNewLabel_48_10_2_1_2);
		
		JLabel lblNewLabel_48_10_2_1_1_1 = new JLabel("6. Colabora en las actividades que desarrolla el Departamento.\r");
		lblNewLabel_48_10_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_2_1_1_1.setBounds(1005, 596, 686, 41);
		panel_32.add(lblNewLabel_48_10_2_1_1_1);
		
		JTextPane textPane_1_7_4_1 = new JTextPane();
		textPane_1_7_4_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_7_4_1.setBounds(1027, 166, 637, 168);
		panel_32.add(textPane_1_7_4_1);
		
		JTextPane textPane_1_7_4_2 = new JTextPane();
		textPane_1_7_4_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_7_4_2.setBounds(1027, 400, 637, 168);
		panel_32.add(textPane_1_7_4_2);
		
		JTextPane textPane_1_7_4_3 = new JTextPane();
		textPane_1_7_4_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_7_4_3.setBounds(1027, 658, 637, 168);
		panel_32.add(textPane_1_7_4_3);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_8.setBounds(810, 138, 94, 22);
		panel_32.add(comboBox_8);
		
		JComboBox comboBox_12 = new JComboBox();
		comboBox_12.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_12.setBounds(810, 358, 94, 22);
		panel_32.add(comboBox_12);
		
		JComboBox comboBox_13 = new JComboBox();
		comboBox_13.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_13.setBounds(810, 609, 94, 22);
		panel_32.add(comboBox_13);
		
		JComboBox comboBox_14 = new JComboBox();
		comboBox_14.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_14.setBounds(1770, 138, 94, 22);
		panel_32.add(comboBox_14);
		
		JComboBox comboBox_15 = new JComboBox();
		comboBox_15.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_15.setBounds(1770, 358, 94, 22);
		panel_32.add(comboBox_15);
		
		JComboBox comboBox_16 = new JComboBox();
		comboBox_16.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_16.setBounds(1770, 609, 94, 22);
		panel_32.add(comboBox_16);
		
		JPanel panel_8 = new JPanel();
		tabbedPane_6.addTab("2", null, panel_8, null);
		panel_8.setLayout(null);
		
		JPanel panel_8_1 = new JPanel();
		panel_8_1.setLayout(null);
		panel_8_1.setBounds(0, -16, 1904, 919);
		panel_8.add(panel_8_1);
		
		JLabel lblNewLabel_44_1_2_1_1 = new JLabel(" Evaluaci\u00F3n del Director");
		lblNewLabel_44_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_44_1_2_1_1.setBounds(584, 0, 639, 97);
		panel_8_1.add(lblNewLabel_44_1_2_1_1);
		
		JPanel panel_6_6_1_1_4_1 = new JPanel();
		panel_6_6_1_1_4_1.setBackground(SystemColor.textInactiveText);
		panel_6_6_1_1_4_1.setBounds(0, 122, 1904, 10);
		panel_8_1.add(panel_6_6_1_1_4_1);
		
		JLabel lblNewLabel_48_10_3 = new JLabel("7. Cumple con las normas y procedimientos de la Instituci\u00F3n. Somete dentro del ");
		lblNewLabel_48_10_3.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_3.setBounds(10, 143, 760, 41);
		panel_8_1.add(lblNewLabel_48_10_3);
		
		JLabel lblNewLabel_48_10_3_1 = new JLabel("tiempo establecido por la Universidad y la unidad acad\u00E9mica, los siguientes \r");
		lblNewLabel_48_10_3_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_3_1.setBounds(33, 167, 760, 41);
		panel_8_1.add(lblNewLabel_48_10_3_1);
		
		JLabel lblNewLabel_48_10_3_1_1 = new JLabel("documentos: el cotejo de listas, el informe de estudiantes que nunca han ");
		lblNewLabel_48_10_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_3_1_1.setBounds(30, 189, 817, 41);
		panel_8_1.add(lblNewLabel_48_10_3_1_1);
		
		JLabel lblNewLabel_48_10_3_1_2 = new JLabel("las calificaciones finales, la remoci\u00F3n de incompletos, la notificaci\u00F3n de extramuros, ");
		lblNewLabel_48_10_3_1_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_3_1_2.setBounds(33, 208, 867, 41);
		panel_8_1.add(lblNewLabel_48_10_3_1_2);
		
		JLabel lblNewLabel_48_10_3_1_2_1 = new JLabel("los horarios de clase, entre otros, y sigue el calendario acad\u00E9mico.");
		lblNewLabel_48_10_3_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_3_1_2_1.setBounds(33, 233, 867, 41);
		panel_8_1.add(lblNewLabel_48_10_3_1_2_1);
		
		JTextPane textPane_1_7_3 = new JTextPane();
		textPane_1_7_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_7_3.setBounds(43, 273, 637, 168);
		panel_8_1.add(textPane_1_7_3);
		
		JLabel lblNewLabel_48_10_3_2 = new JLabel("8. Atiende las indicaciones, memorandos y recomendaciones del personal gerencial");
		lblNewLabel_48_10_3_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_3_2.setBounds(10, 452, 817, 41);
		panel_8_1.add(lblNewLabel_48_10_3_2);
		
		JLabel lblNewLabel_48_10_3_2_1 = new JLabel("(Director de Departamento, Decanos, y otros).");
		lblNewLabel_48_10_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_3_2_1.setBounds(33, 481, 760, 41);
		panel_8_1.add(lblNewLabel_48_10_3_2_1);
		
		JTextPane textPane_1_7_3_1 = new JTextPane();
		textPane_1_7_3_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_7_3_1.setBounds(43, 526, 637, 168);
		panel_8_1.add(textPane_1_7_3_1);
		
		JLabel lblNewLabel_48_10_3_2_2 = new JLabel("9. Est\u00E1 disponible para ofrecer cursos, seg\u00FAn las necesidades establecidas en el ");
		lblNewLabel_48_10_3_2_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_3_2_2.setBounds(10, 693, 760, 41);
		panel_8_1.add(lblNewLabel_48_10_3_2_2);
		
		JTextPane textPane_1_7_3_1_1 = new JTextPane();
		textPane_1_7_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_7_3_1_1.setBounds(43, 757, 637, 151);
		panel_8_1.add(textPane_1_7_3_1_1);
		
		JLabel lblNewLabel_48_10_3_2_2_1 = new JLabel("horario de clases para la oferta acad\u00E9mica del t\u00E9rmino.\r");
		lblNewLabel_48_10_3_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_3_2_2_1.setBounds(33, 724, 760, 41);
		panel_8_1.add(lblNewLabel_48_10_3_2_2_1);
		
		JLabel lblNewLabel_48_10_3_3 = new JLabel("10. Participa en comit\u00E9s departamentales, de la unidad acad\u00E9mica, institucional o en ");
		lblNewLabel_48_10_3_3.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_3_3.setBounds(971, 143, 883, 41);
		panel_8_1.add(lblNewLabel_48_10_3_3);
		
		JLabel lblNewLabel_48_10_3_3_1 = new JLabel("organismos universitarios cuando as\u00ED se le solicita.\r");
		lblNewLabel_48_10_3_3_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_3_3_1.setBounds(1009, 178, 873, 41);
		panel_8_1.add(lblNewLabel_48_10_3_3_1);
		
		JTextPane textPane_1_7_3_2 = new JTextPane();
		textPane_1_7_3_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_7_3_2.setBounds(1031, 225, 637, 168);
		panel_8_1.add(textPane_1_7_3_2);
		
		JLabel lblNewLabel_48_10_3_3_2 = new JLabel("11. Asiste a las convocatorias de facultad, tales como actividades de reconocimientos ");
		lblNewLabel_48_10_3_3_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_3_3_2.setBounds(971, 416, 883, 41);
		panel_8_1.add(lblNewLabel_48_10_3_3_2);
		
		JLabel lblNewLabel_48_10_3_3_2_1 = new JLabel("acad\u00E9micos a estudiantes, el Servicio de Graduaci\u00F3n, la Graduaci\u00F3n, entre otros. ");
		lblNewLabel_48_10_3_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_3_3_2_1.setBounds(1009, 452, 883, 41);
		panel_8_1.add(lblNewLabel_48_10_3_3_2_1);
		
		JTextPane textPane_1_7_3_2_1 = new JTextPane();
		textPane_1_7_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_7_3_2_1.setBounds(1031, 504, 637, 168);
		panel_8_1.add(textPane_1_7_3_2_1);
		
		JLabel lblNewLabel_48_10_3_3_2_2 = new JLabel("12. Asiste a actividades de desarrollo profesional como congresos, seminarios, cursos ");
		lblNewLabel_48_10_3_3_2_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_3_3_2_2.setBounds(971, 693, 883, 41);
		panel_8_1.add(lblNewLabel_48_10_3_3_2_2);
		
		JLabel lblNewLabel_48_10_3_3_2_2_1 = new JLabel("de educaci\u00F3n continuada, entre otros.\r");
		lblNewLabel_48_10_3_3_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_3_3_2_2_1.setBounds(1009, 724, 873, 41);
		panel_8_1.add(lblNewLabel_48_10_3_3_2_2_1);
		
		JTextPane textPane_1_7_3_2_1_1 = new JTextPane();
		textPane_1_7_3_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_7_3_2_1_1.setBounds(1031, 757, 637, 151);
		panel_8_1.add(textPane_1_7_3_2_1_1);
		
		JPanel panel_6_6_1_3_1 = new JPanel();
		panel_6_6_1_3_1.setBackground(SystemColor.textInactiveText);
		panel_6_6_1_3_1.setBounds(910, 127, 10, 820);
		panel_8_1.add(panel_6_6_1_3_1);
		
		JComboBox comboBox_17 = new JComboBox();
		comboBox_17.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_17.setBounds(803, 156, 94, 22);
		panel_8_1.add(comboBox_17);
		
		JComboBox comboBox_18 = new JComboBox();
		comboBox_18.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_18.setBounds(803, 465, 94, 22);
		panel_8_1.add(comboBox_18);
		
		JComboBox comboBox_19 = new JComboBox();
		comboBox_19.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_19.setBounds(806, 706, 94, 22);
		panel_8_1.add(comboBox_19);
		
		JComboBox comboBox_20 = new JComboBox();
		comboBox_20.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_20.setBounds(1787, 156, 94, 22);
		panel_8_1.add(comboBox_20);
		
		JComboBox comboBox_21 = new JComboBox();
		comboBox_21.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_21.setBounds(1788, 429, 94, 22);
		panel_8_1.add(comboBox_21);
		
		JComboBox comboBox_22 = new JComboBox();
		comboBox_22.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_22.setBounds(1787, 706, 94, 22);
		panel_8_1.add(comboBox_22);
		
		JPanel panel_34 = new JPanel();
		tabbedPane_6.addTab("3", null, panel_34, null);
		panel_34.setLayout(null);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBounds(-64, 0, 1977, 945);
		panel_34.add(panel_9);
		
		JLabel lblNewLabel_48_10_3_4 = new JLabel("13. Mantiene un clima de respeto con los colegas y con los compa\u00F1eros de trabajo.\r");
		lblNewLabel_48_10_3_4.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_3_4.setBounds(468, 125, 837, 41);
		panel_9.add(lblNewLabel_48_10_3_4);
		
		JPanel panel_6_6_1_1_4_1_1 = new JPanel();
		panel_6_6_1_1_4_1_1.setBackground(SystemColor.textInactiveText);
		panel_6_6_1_1_4_1_1.setBounds(62, 104, 1904, 10);
		panel_9.add(panel_6_6_1_1_4_1_1);
		
		JLabel lblNewLabel_44_1_2_1_1_1 = new JLabel(" Evaluaci\u00F3n del Director");
		lblNewLabel_44_1_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_44_1_2_1_1_1.setBounds(585, -4, 639, 97);
		panel_9.add(lblNewLabel_44_1_2_1_1_1);
		
		JTextPane textPane_1_7_3_3 = new JTextPane();
		textPane_1_7_3_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_7_3_3.setBounds(251, 179, 1261, 246);
		panel_9.add(textPane_1_7_3_3);
		
		JLabel lblNewLabel_48_10_3_4_1 = new JLabel("14. Mantiene un clima de respeto con los estudiantes. ");
		lblNewLabel_48_10_3_4_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_3_4_1.setBounds(644, 446, 837, 41);
		panel_9.add(lblNewLabel_48_10_3_4_1);
		
		JTextPane textPane_1_7_3_3_1 = new JTextPane();
		textPane_1_7_3_3_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_7_3_3_1.setBounds(251, 510, 1261, 246);
		panel_9.add(textPane_1_7_3_3_1);
		
		JPanel panel_27 = new JPanel();
		tabbedPane_5.addTab("TAREAS ACAD\u00C9MICAS", null, panel_27, null);
		panel_27.setLayout(null);
		
		JLabel lblNewLabel_44_1_2_1_1_1_1 = new JLabel(" Evaluaci\u00F3n del Director");
		lblNewLabel_44_1_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_44_1_2_1_1_1_1.setBounds(614, 0, 639, 97);
		panel_27.add(lblNewLabel_44_1_2_1_1_1_1);
		
		JPanel panel_6_6_1_1_4_1_1_1 = new JPanel();
		panel_6_6_1_1_4_1_1_1.setBackground(SystemColor.textInactiveText);
		panel_6_6_1_1_4_1_1_1.setBounds(0, 108, 1904, 10);
		panel_27.add(panel_6_6_1_1_4_1_1_1);
		
		JLabel lblNewLabel_48_10_3_4_2 = new JLabel("15. Contribuye al enriquecimiento de los recursos del Centro de Acceso a la ");
		lblNewLabel_48_10_3_4_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_3_4_2.setBounds(10, 129, 837, 41);
		panel_27.add(lblNewLabel_48_10_3_4_2);
		
		JLabel lblNewLabel_48_10_3_4_2_1 = new JLabel("Informaci\u00F3n.\r");
		lblNewLabel_48_10_3_4_2_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_3_4_2_1.setBounds(46, 160, 837, 41);
		panel_27.add(lblNewLabel_48_10_3_4_2_1);
		
		JTextPane textPane_1_7_3_3_2 = new JTextPane();
		textPane_1_7_3_3_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_7_3_3_2.setBounds(44, 196, 637, 168);
		panel_27.add(textPane_1_7_3_3_2);
		
		JLabel lblNewLabel_48_10_3_4_2_2 = new JLabel("16. Contribuye al mejoramiento y actualizaci\u00F3n de su disciplina o de la materia que ");
		lblNewLabel_48_10_3_4_2_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_3_4_2_2.setBounds(10, 368, 837, 41);
		panel_27.add(lblNewLabel_48_10_3_4_2_2);
		
		JLabel lblNewLabel_48_10_3_4_2_2_1 = new JLabel("ense\u00F1a, a trav\u00E9s del dise\u00F1o de cursos nuevos, la preparaci\u00F3n de materiales ");
		lblNewLabel_48_10_3_4_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_3_4_2_2_1.setBounds(46, 396, 837, 41);
		panel_27.add(lblNewLabel_48_10_3_4_2_2_1);
		
		JLabel lblNewLabel_48_10_3_4_2_2_1_1 = new JLabel("educativos o de prontuarios, proyectos innovadores, entre otros.\r ");
		lblNewLabel_48_10_3_4_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_3_4_2_2_1_1.setBounds(46, 420, 837, 41);
		panel_27.add(lblNewLabel_48_10_3_4_2_2_1_1);
		
		JTextPane textPane_1_7_3_3_2_1 = new JTextPane();
		textPane_1_7_3_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_7_3_3_2_1.setBounds(46, 461, 637, 168);
		panel_27.add(textPane_1_7_3_3_2_1);
		
		JLabel lblNewLabel_48_10_3_4_2_2_2 = new JLabel("17. Est\u00E1 disponible para ense\u00F1ar cursos en diferentes modalidades de estudio (por");
		lblNewLabel_48_10_3_4_2_2_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_3_4_2_2_2.setBounds(10, 640, 837, 41);
		panel_27.add(lblNewLabel_48_10_3_4_2_2_2);
		
		JLabel lblNewLabel_48_10_3_4_2_2_2_1 = new JLabel("ejemplo, estudio independiente, contrato, cursos en l\u00EDnea, combinados, entre otros).");
		lblNewLabel_48_10_3_4_2_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_3_4_2_2_2_1.setBounds(46, 669, 837, 41);
		panel_27.add(lblNewLabel_48_10_3_4_2_2_2_1);
		
		JTextPane textPane_1_7_3_3_2_1_1 = new JTextPane();
		textPane_1_7_3_3_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_7_3_3_2_1_1.setBounds(46, 721, 637, 168);
		panel_27.add(textPane_1_7_3_3_2_1_1);
		
		JLabel lblNewLabel_48_10_3_4_2_3 = new JLabel("18. Trabaja con sus compa\u00F1eros en tareas de equipo cuando es necesario.");
		lblNewLabel_48_10_3_4_2_3.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_3_4_2_3.setBounds(951, 129, 837, 41);
		panel_27.add(lblNewLabel_48_10_3_4_2_3);
		
		JTextPane textPane_1_7_3_3_2_2 = new JTextPane();
		textPane_1_7_3_3_2_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_7_3_3_2_2.setBounds(1041, 181, 637, 168);
		panel_27.add(textPane_1_7_3_3_2_2);
		
		JLabel lblNewLabel_48_10_3_4_2_3_1_1 = new JLabel("del programa para el mejoramiento de los logros en el aprendizaje de los estudiantes.");
		lblNewLabel_48_10_3_4_2_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_3_4_2_3_1_1.setBounds(980, 396, 837, 41);
		panel_27.add(lblNewLabel_48_10_3_4_2_3_1_1);
		
		JTextPane textPane_1_7_3_3_2_2_1 = new JTextPane();
		textPane_1_7_3_3_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_7_3_3_2_2_1.setBounds(1041, 461, 637, 168);
		panel_27.add(textPane_1_7_3_3_2_2_1);
		
		JLabel lblNewLabel_48_10_3_4_2_3_1 = new JLabel("19. Evidencia en sus cursos el uso de los resultados del \u201Cassessment\u201D de los cursos y");
		lblNewLabel_48_10_3_4_2_3_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_3_4_2_3_1.setBounds(951, 368, 837, 41);
		panel_27.add(lblNewLabel_48_10_3_4_2_3_1);
		
		JLabel lblNewLabel_48_10_3_4_2_3_1_2 = new JLabel("20. Colabora con el fortalecimiento de los programas acad\u00E9micos, tales como");
		lblNewLabel_48_10_3_4_2_3_1_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_3_4_2_3_1_2.setBounds(951, 640, 837, 41);
		panel_27.add(lblNewLabel_48_10_3_4_2_3_1_2);
		
		JLabel lblNewLabel_48_10_3_4_2_3_1_2_1 = new JLabel("\u201Cassessment\u201D o acreditaci\u00F3n de los programas acad\u00E9micos, revisi\u00F3n de los \r");
		lblNewLabel_48_10_3_4_2_3_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_3_4_2_3_1_2_1.setBounds(980, 669, 837, 41);
		panel_27.add(lblNewLabel_48_10_3_4_2_3_1_2_1);
		
		JLabel lblNewLabel_48_10_3_4_2_3_1_2_1_1 = new JLabel("prontuarios, revisi\u00F3n curricular de los programas acad\u00E9micos, entre otras tareas.");
		lblNewLabel_48_10_3_4_2_3_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_3_4_2_3_1_2_1_1.setBounds(980, 692, 837, 41);
		panel_27.add(lblNewLabel_48_10_3_4_2_3_1_2_1_1);
		
		JTextPane textPane_1_7_3_3_2_2_1_1 = new JTextPane();
		textPane_1_7_3_3_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_7_3_3_2_2_1_1.setBounds(1041, 744, 637, 168);
		panel_27.add(textPane_1_7_3_3_2_2_1_1);
		
		JPanel panel_6_6_1_3_2 = new JPanel();
		panel_6_6_1_3_2.setBackground(SystemColor.textInactiveText);
		panel_6_6_1_3_2.setBounds(857, 115, 10, 832);
		panel_27.add(panel_6_6_1_3_2);
		
		JComboBox comboBox_23 = new JComboBox();
		comboBox_23.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_23.setBounds(740, 142, 94, 22);
		panel_27.add(comboBox_23);
		
		JComboBox comboBox_24 = new JComboBox();
		comboBox_24.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_24.setBounds(740, 433, 94, 22);
		panel_27.add(comboBox_24);
		
		JComboBox comboBox_25 = new JComboBox();
		comboBox_25.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_25.setBounds(740, 721, 94, 22);
		panel_27.add(comboBox_25);
		
		JComboBox comboBox_26 = new JComboBox();
		comboBox_26.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_26.setBounds(1776, 142, 94, 22);
		panel_27.add(comboBox_26);
		
		JComboBox comboBox_27 = new JComboBox();
		comboBox_27.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_27.setBounds(1776, 381, 94, 22);
		panel_27.add(comboBox_27);
		
		JComboBox comboBox_28 = new JComboBox();
		comboBox_28.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_28.setBounds(1776, 653, 94, 22);
		panel_27.add(comboBox_28);
		
		JPanel panel_30 = new JPanel();
		tabbedPane_5.addTab("Comentarios adicionales:", null, panel_30, null);
		panel_30.setLayout(null);
		
		JLabel lblNewLabel_44_1_2_1_1_1_1_1 = new JLabel(" Evaluaci\u00F3n del Director");
		lblNewLabel_44_1_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_44_1_2_1_1_1_1_1.setBounds(615, 0, 639, 97);
		panel_30.add(lblNewLabel_44_1_2_1_1_1_1_1);
		
		JPanel panel_6_6_1_1_4_1_1_1_1 = new JPanel();
		panel_6_6_1_1_4_1_1_1_1.setBackground(SystemColor.textInactiveText);
		panel_6_6_1_1_4_1_1_1_1.setBounds(0, 95, 1904, 10);
		panel_30.add(panel_6_6_1_1_4_1_1_1_1);
		
		JLabel lblNewLabel_48_10_3_4_2_4 = new JLabel("1. Fortalezas del evaluado");
		lblNewLabel_48_10_3_4_2_4.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_3_4_2_4.setBounds(746, 122, 252, 41);
		panel_30.add(lblNewLabel_48_10_3_4_2_4);
		
		JTextPane textPane_1_7_3_3_2_3 = new JTextPane();
		textPane_1_7_3_3_2_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_7_3_3_2_3.setBounds(332, 157, 1144, 212);
		panel_30.add(textPane_1_7_3_3_2_3);
		
		JLabel lblNewLabel_48_10_3_4_2_4_1 = new JLabel("2. \u00C1reas que debe mejorar:");
		lblNewLabel_48_10_3_4_2_4_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_3_4_2_4_1.setBounds(746, 370, 276, 41);
		panel_30.add(lblNewLabel_48_10_3_4_2_4_1);
		
		JTextPane textPane_1_7_3_3_2_3_1 = new JTextPane();
		textPane_1_7_3_3_2_3_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_7_3_3_2_3_1.setBounds(332, 408, 1144, 212);
		panel_30.add(textPane_1_7_3_3_2_3_1);
		
		JTextPane textPane_1_7_3_3_2_3_1_1 = new JTextPane();
		textPane_1_7_3_3_2_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_7_3_3_2_3_1_1.setBounds(332, 658, 1144, 265);
		panel_30.add(textPane_1_7_3_3_2_3_1_1);
		
		JLabel lblNewLabel_48_10_3_4_2_4_1_1 = new JLabel("Recomendaci\u00F3n para el Plan de Acci\u00F3n del profesor evaluado: ");
		lblNewLabel_48_10_3_4_2_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_48_10_3_4_2_4_1_1.setBounds(615, 619, 587, 41);
		panel_30.add(lblNewLabel_48_10_3_4_2_4_1_1);
		
		JTabbedPane tabbedPane_4 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Resultados", null, tabbedPane_4, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane_4.addTab("Resultados", null, panel_2, null);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnNewButton = new JButton("Print");
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(78)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(203)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 1231, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(281, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(23)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 852, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(63)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(83, Short.MAX_VALUE))
		);
		
		JTextArea textArea_7 = new JTextArea();
		scrollPane.setViewportView(textArea_7);
		panel_2.setLayout(gl_panel_2);
		
		JButton btnNewButton8 = new JButton("Print");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
		
		try {

			textArea_7.print();
			}
			catch (PrinterException e1)
			{
			e1.printStackTrace();
			}
			}
		});
		btnNewButton.setBounds(177, 459, 89, 23);
		tabbedPane.add(btnNewButton);
	}
	
	public void comboboxItems(String ID) {
		String bruh = "hola";
		String[] ap = new String[62];

		fileManager continueI = new fileManager();
		ap = continueI.combobox(ID);

		Unidadacademica_textField.setText(ap[0]);
		nombre_prof_textField.setText(ap[1]);
		rangoAcademico_comboBox.setSelectedItem(ap[2]);
		departamento_textField.setText(ap[3]);
		disiplina_textField.setText(ap[4]);
		objetivo_eval_comboBox.setSelectedItem(ap[5]) ;
		periodo_evaluado_textField.setText(ap[6]);
		jornada_comple_comboBox.setSelectedItem(ap[7]); 
		jornada_parcial_comboBox.setSelectedItem(ap[8]); 
		contrato_comboBox.setSelectedItem(ap[9]);
		codigo_textField.setText(ap[10]);
		tutulo_del_curso_textField.setText(ap[11]);
		modalidad_textField.setText(ap[12]);
		comboBox_11.setSelectedItem(ap[13]);

		if(ap[14] == "0") {
			parte1_perfil_de_estudiante_2_comboBox.setSelectedIndex(0);

		}
		else {
			parte1_perfil_de_estudiante_1_comboBox.setSelectedItem(ap[14]);
		}
		if(ap[15] == "0") {
			parte1_perfil_de_estudiante_2_comboBox.setSelectedIndex(0);

		}
		else {
			parte1_perfil_de_estudiante_2_comboBox.setSelectedItem(ap[15]);
		}


		if(ap[16] == "0") {
			parte2_estudi_3_comboBox.setSelectedIndex(0);

		}
		else {
			parte2_estudi_3_comboBox.setSelectedItem(ap[16]);
		}

		if(ap[17] == "0") {
			parte2_estudi_4_comboBox.setSelectedIndex(0);

		}
		else {
			parte2_estudi_4_comboBox.setSelectedItem(ap[17]);
		}

		if(ap[18] == "0") {
			parte3_estudi_5_comboBox.setSelectedIndex(0);

		}
		else {
			parte3_estudi_5_comboBox.setSelectedItem(ap[18]);
		}

		if(ap[19] == "0") {
			parte3_estudi_6_comboBox.setSelectedIndex(0);

		}
		else {
			parte3_estudi_6_comboBox.setSelectedItem(ap[19]);
		}

		if(ap[20] == "0") {
			parte3_estudi_7_comboBox.setSelectedIndex(0);

		}
		else {
			parte3_estudi_7_comboBox.setSelectedItem(ap[20]);
		}

		if(ap[21] == "0") {
			parte3_estudi_8_comboBox.setSelectedIndex(0);

		}
		else {
			parte3_estudi_8_comboBox.setSelectedItem(ap[21]);
		}

		if(ap[22] == "0") {
			parte3_estudi_9_comboBox.setSelectedIndex(0);

		}
		else {
			parte3_estudi_9_comboBox.setSelectedItem(ap[22]);
		}

		if(ap[23] == "0") {
			parte3_estudi_10_comboBox_3.setSelectedIndex(0);

		}
		else {
			parte3_estudi_10_comboBox_3.setSelectedItem(ap[23]);
		}

		if(ap[24] == "0") {
			parte3_estudi_11_comboBox_3.setSelectedIndex(0);

		}
		else {
			parte3_estudi_11_comboBox_3.setSelectedItem(ap[24]);
		}

		if(ap[25] == "0") {
			parte3_estudi_12_comboBox_3.setSelectedIndex(0);

		}
		else {
			parte3_estudi_12_comboBox_3.setSelectedItem(ap[25]);
		}

		if(ap[26] == "0") {
			parte3_desarollo_de_clase_13_comboBox.setSelectedIndex(0);

		}
		else {
			parte3_desarollo_de_clase_13_comboBox.setSelectedItem(ap[26]);
		}

		if(ap[27] == "0") {
			parte3_desarollo_de_clase_14_comboBox.setSelectedIndex(0);

		}
		else {
			parte3_desarollo_de_clase_14_comboBox.setSelectedItem(ap[27]);
		}

		if(ap[28] == "0") {
			parte3_desarollo_de_clase_15_comboBox_1_1.setSelectedIndex(0);

		}
		else {
			parte3_desarollo_de_clase_15_comboBox_1_1.setSelectedItem(ap[28]);
		}

		if(ap[29] == "0") {
			parte3_desarollo_de_clase_16_comboBox.setSelectedIndex(0);

		}
		else {
			parte3_desarollo_de_clase_16_comboBox.setSelectedItem(ap[29]);
		}

		if(ap[30] == "0") {
			parte3_desarollo_de_clase_17_comboBox_1_1.setSelectedIndex(0);

		}
		else {
			parte3_desarollo_de_clase_17_comboBox_1_1.setSelectedItem(ap[30]);
		}

		if(ap[31] == "0") {
			parte5_gerencia_18_comboBox_1.setSelectedIndex(0);

		}
		else {
			parte5_gerencia_18_comboBox_1.setSelectedItem(ap[31]);
		}

		if(ap[32] == "0") {
			parte5_gerencia_19_comboBox_1.setSelectedIndex(0);

		}
		else {
			parte5_gerencia_19_comboBox_1.setSelectedItem(ap[32]);
		}

		if(ap[33] == "0") {
			parte5_gerencia_20_comboBox_1.setSelectedIndex(0);

		}
		else {
			parte5_gerencia_20_comboBox_1.setSelectedItem(ap[33]);
		}

		if(ap[34] == "0") {
			parte5_gerencia_21_comboBox_1.setSelectedIndex(0);

		}
		else {
			parte5_gerencia_21_comboBox_1.setSelectedItem(ap[34]);
		}


		if(ap[35] == "0") {
			parte5_gerencia_22_comboBox_1.setSelectedIndex(0);

		}
		else {
			parte5_gerencia_22_comboBox_1.setSelectedItem(ap[35]);
		}

		if(ap[36] == "0") {
			parte5_gerencia_23_comboBox_1.setSelectedIndex(0);

		}
		else {
			parte5_gerencia_23_comboBox_1.setSelectedItem(ap[36]);
		}

		if(ap[37] == "0") {
			parte5_gerencia_24_comboBox_1.setSelectedIndex(0);

		}
		else {
			parte5_gerencia_24_comboBox_1.setSelectedItem(ap[37]);
		}

		if(ap[38] == "0") {
			parte5_gerencia_25_comboBox_1.setSelectedIndex(0);

		}
		else {
			parte5_gerencia_25_comboBox_1.setSelectedItem(ap[38]);
		}

		if(ap[39] == "0") {
			parte5_gerencia_26_comboBox_1.setSelectedIndex(0);

		}
		else {
			parte5_gerencia_26_comboBox_1.setSelectedItem(ap[39]);
		}

		if(ap[40] == "0") {
			parte5_gerencia_27_comboBox.setSelectedIndex(0);

		}
		else {
			parte5_gerencia_27_comboBox.setSelectedItem(ap[40]);
		}

//		if(ap[41] == "0") {
//			parte5_gerencia_28_comboBox.setSelectedIndex(0);
//
//		}
//		else {
//			parte5_gerencia_28_comboBox.setSelectedItem(ap[41]);
//		}
//
//		if(ap[42] == "0") {
//			parte5_gerencia_29_comboBox.setSelectedIndex(0);
//
//		}
//		else {
//			parte5_gerencia_29_comboBox.setSelectedItem(ap[42]);
//		} 

		////////////////////////////Instrument 3//////////////////////////////////////
		if(ap[60] == "0") {
			comboBox.setSelectedIndex(0); 

		}
		else {
			comboBox.setSelectedItem(ap[60]); 
		}
		if(ap[61] == "0") {
			comboBox_1.setSelectedIndex(0);

		}
		else {
			comboBox_1.setSelectedItem(ap[61]);
		}


		if(ap[62] == "0") {
			comboBox_3.setSelectedIndex(0); 

		}
		else {
			comboBox_3.setSelectedItem(ap[62]);
		}

		if(ap[63] == "0") {
			comboBox_3_1.setSelectedIndex(0);

		}
		else {
			comboBox_3_1.setSelectedItem(ap[63]);
		}

		if(ap[64] == "0") {
			comboBox_4.setSelectedIndex(0); 

		}
		else {
			comboBox_4.setSelectedItem(ap[64]);
		}

		if(ap[65] == "0") {
			comboBox_4_1.setSelectedIndex(0); 

		}
		else {
			comboBox_4_1.setSelectedItem(ap[65]);
		}

		if(ap[66] == "0") {
			comboBox_5.setSelectedIndex(0); 

		}
		else {
			comboBox_5.setSelectedItem(ap[66]);
		}

		if(ap[67] == "0") {
			comboBox_6.setSelectedIndex(0); 

		}
		else {
			comboBox_6.setSelectedItem(ap[67]);
		}

		if(ap[68] == "0") {
			comboBox_7.setSelectedIndex(0);

		}
		else {
			comboBox_7.setSelectedItem(ap[68]);
		}

		if(ap[69] == "0") {
			comboBox_9.setSelectedIndex(0);

		}
		else {
			comboBox_9.setSelectedItem(ap[69]);
		}

		if(ap[70] == "0") {
			comboBox_10.setSelectedIndex(0);

		}
		else {
			comboBox_10.setSelectedItem(ap[70]);
		}

		if(ap[71] == "0") {
			comboBox_5_1.setSelectedIndex(0);

		}
		else {
			comboBox_5_1.setSelectedItem(ap[71]);
		}

		if(ap[72] == "0") {
			comboBox_5_2.setSelectedIndex(0);

		}
		else {
			comboBox_5_2.setSelectedItem(ap[72]);
		}

		if(ap[73] == "0") {
			comboBox_5_3.setSelectedIndex(0);

		}
		else {
			comboBox_5_3.setSelectedItem(ap[73]);
		}

		if(ap[74] == "0") {
			comboBox_5_4.setSelectedIndex(0);

		}
		else {
			comboBox_5_4.setSelectedItem(ap[74]);
		}

		if(ap[75] == "0") {
			comboBox_5_5.setSelectedIndex(0);

		}
		else {
			comboBox_5_5.setSelectedItem(ap[75]);
		}

		if(ap[76] == "0") {
			comboBox_5_1_1.setSelectedIndex(0);

		}
		else {
			comboBox_5_1_1.setSelectedItem(ap[76]);
		}

		if(ap[77] == "0") {
			comboBox_5_1_2.setSelectedIndex(0);

		}
		else {
			comboBox_5_1_2.setSelectedItem(ap[77]);
		}

		if(ap[78] == "0") {
			comboBox_5_1_3.setSelectedIndex(0);

		}
		else {
			comboBox_5_1_3.setSelectedItem(ap[78]);
		}

		if(ap[79] == "0") {
			comboBox_5_1_4.setSelectedIndex(0);

		}
		else {
			comboBox_5_1_4.setSelectedItem(ap[79]);
		}
	}
}