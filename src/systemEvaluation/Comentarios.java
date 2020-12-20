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
import java.io.IOException;
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
	 * @throws IOException 
	 */
	public Comentarios() throws IOException  {
		
		Evaluation e = new Evaluation();
		

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
		txtrComentariosEvidendencia.setText("___________________________________________________________________________________________________________                                          \r\n                                           Comentarios Evidendencia  \r\n____________________________________________________________________________________________________________\r\na. Dominio de la disciplina que ense\u00F1a\r\nComentario:\r\n\r\n\r\n\r\n\r\n\r\nb. Habilidad para organizar el contenido y presentarlo en forma clara, l\u00F3gica e \r\nimaginativa\r\nComentario:\r\n\r\n\r\n\r\n\r\n\r\nc. Conocimiento de los desarrollos actuales de la disciplina\r\nComentario:\r\n\r\n\r\n\r\n\r\nd. Habilidad para relacionar la disciplina con otras esferas del conocimiento\r\nComentario:\r\n\r\n\r\n\r\n\r\ne. Habilidad para promover y ampliar el inter\u00E9s del estudiante en la disciplina\r\nComentario:\r\n\r\n\r\n\r\n\r\n\r\nf. Habilidad para desarrollar y utilizar m\u00E9todos y estrategias adecuadas,incluyendo\r\n \u201Cassessment\u201D para una ense\u00F1anza efectiva\r\nComentario:\r\n\r\n\r\n\r\n\r\n\r\n\r\ng. Disponibilidad y eficacia en la orientaci\u00F3n acad\u00E9mica del estudiante\r\nh. Posesi\u00F3n de los atributos de integridad, laboriosidad, liberalidad y objetividad \r\nen la ense\u00F1anza\r\nComentario:\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n                                             Instrumento 3: Visita al sal\u00F3n de clase\r\n_______________________________________________________________________________________________________\r\n                                  CRITERIO I. DOMINIO DE LA DISCIPLINA\r\n----------------------------------------------------------------------------------------------------------------------\r\n\r\n1. Domina el tema discutido en clase.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n2. Usa ejemplos o ejercicios relacionados con el tema de la clase.\r\nComentarios:\r\n\r\n\r\n\r\n3. Integra conceptos o experiencias de otras disciplinas para enriquecer la clase.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n4. Relaciona la utilidad del tema con otros cursos o \u00E1reas del conocimiento.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n\r\n5. Presenta el tema en forma actualizada.\r\nComentarios:\r\n\r\n\r\n\r\n6. Incorpora en la clase las nuevas tendencias de la disciplina.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n______________________________________________________________________________________________________\r\n               CRITERIO II. ORGANIZACI\u00D3N Y PRESENTACI\u00D3N DEL CONTENIDO\r\n------------------------------------------------------------------------------------------------------------------------\r\n\r\n7. Presenta el material de la clase en forma organizada y coherente.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n8. Utiliza el vocabulario propio de la materia.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n9. Cumple con los objetivos establecidos para la clase.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n\r\n10. Utiliza el tiempo de la clase de acuerdo con los objetivos establecidos y las actividades\r\nplanificadas.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n11. Resume los conceptos discutidos en clase.\r\nComentarios:\r\n\r\n______________________________________________________________________________________________________\r\n                     CRITERIO III. PROMOCI\u00D3N DEL INTER\u00C9S DEL ESTUDIANTE\r\n----------------------------------------------------------------------------------------------------------------------\r\n\r\n12. Estimula la participaci\u00F3n de los estudiantes en la clase.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n13. Mantiene un clima de confianza y respeto.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n\r\n14. Facilita relacionar el contenido de la clase con las experiencias del estudiante en su\r\ndiario vivir.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n15. Promueve la discusi\u00F3n para complementar, aclarar o enriquecer la clase.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n16. Promueve en los estudiantes la b\u00FAsqueda de informaci\u00F3n y otras experiencias\r\nque enriquezcan sus conocimientos y estimulen el pensamiento cr\u00EDtico.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n___________________________________________________________________________________________________________\r\n          CRITERIO IV. USO DE M\u00C9TODOS Y ESTRATEGIAS DE APOYO A LA ENSE\u00D1ANZA\r\n-------------------------------------------------------------------------------------------------------------------------\r\n\r\n17. Fomenta la colaboraci\u00F3n y el trabajo en equipo entre los estudiantes.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n18. Utiliza recursos de apoyo (pizarra, materiales educativos o tecnol\u00F3gicos) adecuados para\r\ndesarrollar la clase.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n19. Utiliza estrategias y m\u00E9todos que promueven el aprendizaje de los estudiantes.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n20. Utiliza estrategias para verificar si los estudiantes entienden el material durante el\r\ntranscurso de la clase.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n                                                Instrumento-4 : Evaluaci\u00F3n del Director\r\n_____________________________________________________________________________________________________________\r\n                                                       II. TAREAS ACAD\u00C9MICAS\r\n--------------------------------------------------------------------------------------------------------------------------------\r\n                                  I. RESPONSABILIDADES y DEBERES COMO FACULTAD:\r\n1. Cumple con las horas de oficina seg\u00FAn establecidas.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n2. Presenta evidencia sobre las diferentes formas en la que cumple con la consejer\u00EDa\r\nacad\u00E9mica ofrecida a sus estudiantes, seg\u00FAn definida en el Manual de la Facultad.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n3. Informa al Director del Departamento sobre sus ausencias.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n4. Informa al Director del Departamento c\u00F3mo repone sus ausencias.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n5. Contribuye a las deliberaciones de las reuniones de su Departamento.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n6. Colabora en las actividades que desarrolla el Departamento.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n7. Cumple con las normas y procedimientos de la Instituci\u00F3n. Somete dentro del\r\ntiempo establecido por la Universidad y la unidad acad\u00E9mica, los siguientes\r\ndocumentos: el cotejo de listas, el informe de estudiantes que nunca han asistido,\r\nlas calificaciones finales, la remoci\u00F3n de incompletos, la notificaci\u00F3n de extramuros,\r\nlos horarios de clase, entre otros, y sigue el calendario acad\u00E9mico.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n8. Atiende las indicaciones, memorandos y recomendaciones del personal gerencial\r\n(Director de Departamento, Decanos, y otros).\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n9. Est\u00E1 disponible para ofrecer cursos, seg\u00FAn las necesidades establecidas en el\r\nhorario de clases para la oferta acad\u00E9mica del t\u00E9rmino.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n\r\n10. Participa en comit\u00E9s departamentales, de la unidad acad\u00E9mica, institucional o en\r\norganismos universitarios cuando as\u00ED se le solicita.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n11. Asiste a las convocatorias de facultad, tales como actividades de reconocimientos\r\nacad\u00E9micos a estudiantes, el Servicio de Graduaci\u00F3n, la Graduaci\u00F3n, entre otros.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n12. Asiste a actividades de desarrollo profesional como congresos, seminarios, cursos\r\nde educaci\u00F3n continuada, entre otros.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n13. Mantiene un clima de respeto con los colegas y con los compa\u00F1eros de trabajo.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n14. Mantiene un clima de respeto con los estudiantes.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n_________________________________________________________________________________________________________\r\n                                              II. TAREAS ACAD\u00C9MICAS\r\n----------------------------------------------------------------------------------------------------------------------\r\n15. Contribuye al enriquecimiento de los recursos del Centro de Acceso a la\r\nInformaci\u00F3n.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n16. Contribuye al mejoramiento y actualizaci\u00F3n de su disciplina o de la materia que\r\nense\u00F1a, a trav\u00E9s del dise\u00F1o de cursos nuevos, la preparaci\u00F3n de materiales\r\neducativos o de prontuarios, proyectos innovadores, entre otros.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n17. Est\u00E1 disponible para ense\u00F1ar cursos en diferentes modalidades de estudio (por\r\nejemplo, estudio independiente, contrato, cursos en l\u00EDnea, combinados, entre\r\notros).\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n18. Trabaja con sus compa\u00F1eros en tareas de equipo cuando es necesario.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n19. Evidencia en sus cursos el uso de los resultados del \u201Cassessment\u201D de los cursos y\r\ndel programa para el mejoramiento de los logros en el aprendizaje de los\r\nestudiantes.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n20. Colabora con el fortalecimiento de los programas acad\u00E9micos, tales como\r\n\u201Cassessment\u201D o acreditaci\u00F3n de los programas acad\u00E9micos, revisi\u00F3n de los\r\nprontuarios, revisi\u00F3n curricular de los programas acad\u00E9micos, entre otras tareas.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n                         Promedio de la Evaluaci\u00F3n: ______________\r\n                         Puntuaci\u00F3n total de la Evaluaci\u00F3n: ___________\r\n\r\n\r\nComentarios adicionales:\r\n\r\n\r\n\r\n\r\n\r\n1. Fortalezas del evaluado\r\n\r\n\r\n\r\n\r\n2. \u00C1reas que debe mejorar:\r\n\r\n\r\n\r\n\r\n\r\nRecomendaci\u00F3n para el Plan de Acci\u00F3n del profesor evaluado: \r\n\r\n\r\n\r\n\r\n\r\n\r\n");
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
