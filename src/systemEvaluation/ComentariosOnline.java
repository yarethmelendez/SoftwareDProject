package systemEvaluation;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class ComentariosOnline extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComentariosOnline frame = new ComentariosOnline();
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
	public ComentariosOnline() {
		String[] values = new String[162];
		
		try {
			onlineEvaluation e = new onlineEvaluation();
			values = e.getvalue();
			//101 -119 intrumento 3 comentarios
			//121 - 143 instrumento 4 comentarios
			//144 - 161 instrumento 2 comentarios
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(633, 61, 802, 926);
		contentPane.add(scrollPane);
		
		JTextArea txtrParteVOtras = new JTextArea();
		txtrParteVOtras.setText("___________________________________________________________________________________________________________   "
				+ "                                       \r\n                                           Comentarios Evidendencia  \r\n__________"
				+ "__________________________________________________________________________________________________\r\na. Dominio de la discip"
				+ "lina que ense\u00F1a\r\nComentario:\r\n\r\n\r\n\r\n\r\n\r\nb. Habilidad para organizar el contenido y presentarlo en forma clara,"
				+ " l\u00F3gica e \r\nimaginativa\r\nComentario:\r\n\r\n\r\n\r\n\r\n\r\nc. Conocimiento de los desarrollos actuales de la disciplina\r\nComent"
				+ "ario:\r\n\r\n\r\n\r\n\r\nd. Habilidad para relacionar la disciplina con otras esferas del conocimiento\r\nComentario:\r\n\r\n\r\n\r\n\r\n"
				+ "e. Habilidad para promover y ampliar el inter\u00E9s del estudiante en la disciplina\r\nComentario:\r\n\r\n\r\n\r\n\r\n\r\nf. Habilidad para "
				+ "desarrollar y utilizar m\u00E9todos y estrategias adecuadas,incluyendo\r\n \u201Cassessment\u201D para una ense\u00F1anza efectiva\r\nComentar"
				+ "io:\r\n\r\n\r\n\r\n\r\n\r\n\r\ng. Disponibilidad y eficacia en la orientaci\u00F3n acad\u00E9mica del estudiante\r\nh. Posesi\u00F3n de los at"
				+ "ributos de integridad, laboriosidad, liberalidad y objetividad \r\nen la ense\u00F1anza\r\nComentario:\r\n\r\n\r\n\r\n\r\n\r\n                "
				+ "                    Instrumento I-A\r\nPARTE V: Otras Apreciaciones del Estudiante. Contesta las siguientes\r\npreguntas.\r\n\r\n25. \u00BFQu\u00E9 "
				+ "fue lo que m\u00E1s te gust\u00F3 del curso?\r\n\r\n\r\n\r\n\r\n26. \u00BFQu\u00E9 fue lo que menos te gust\u00F3 del curso?\r\n\r\n\r\n\r\n\r\n"
				+ "27. \u00BFTomar\u00EDas otro curso en l\u00EDnea con el mismo profesor o lo recomendar\u00EDas a un compa\u00F1ero?\r\nExplica.\r\n\r\n\r\n\r\n\r\n"
				+ "28. \u00BFQu\u00E9 sugerencias har\u00EDas para que el profesor mejore su ense\u00F1anza y participe m\u00E1s en tu\r\naprendizaje en esta modalidad?"
				+ " \r\n\r\n\r\n\r\n\r\n                                       Instrumento III-A\r\nEvaluaci\u00F3n de Facultad por el Comit\u00E9 Evaluador en Cursos "
				+ "Ofrecidos en L\u00EDnea\r\n\r\nCRITERIO I. DOMINIO DE LA DISCIPLINA Y SU RELACI\u00D3N CON OTRAS ESFERAS DEL\r\nCONOCIMIENTO\r\n\r\n1. Mediante la "
				+ "interacci\u00F3n con los estudiantes, el profesor demostr\u00F3 conocimiento suficiente\r\ndel tema evaluado.\r\nNota: El profesor puede mostrar "
				+ "evidencia de su conocimiento del tema evaluado y de\r\nla asignatura a trav\u00E9s de sus explicaciones en correos electr\u00F3nicos, orientaciones"
				+ " y\r\naclaraciones en foros de debates, comentarios en trabajos corregidos, comentarios y\r\nan\u00E1lisis de trabajos de asignaciones, trabajos o"
				+ " ejercicios de evaluaci\u00F3n, entre otros.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n2. Mediante la interacci\u00F3n con los estudiantes, "
				+ "el profesor integr\u00F3 conceptos o experiencias\r\nde otras disciplinas para enriquecer el tema evaluado.\r\nNota: Se trata de mostrar la transver"
				+ "salidad del conocimiento, relacionando el tema con\r\notras \u00E1reas del conocimiento con ocasi\u00F3n de las interacciones con los estudiantes. "
				+ "El\r\nprofesor propuso, si a su juicio aplica al tema evaluado, para su an\u00E1lisis o consideraci\u00F3n:\r\nnoticias, acontecimientos, problemas "
				+ "o experiencias reales o simuladas relacionadas\r\ncon el tema evaluado. Esto puede tener lugar en el foro, en mensajes, actividades,\r\nasignaciones,"
				+ " enlaces a documentos, entre otros.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n\r\n3. El profesor resalt\u00F3 la utilidad del tema para otros cursos"
				+ " o \u00E1reas del conocimiento.\r\nNota: Se trata de la aplicaci\u00F3n \u00FAtil de los conocimientos adquiridos para otros temas o\r\n\u00E1reas"
				+ " de conocimiento. El profesor puede evidenciar esto mediante el contenido\r\ntem\u00E1tico, mensajes, foros de discusi\u00F3n, entre otros.\r\n"
				+ "Comentarios:\r\n\r\n\r\n\r\n\r\n\r\n\r\n4. El profesor facilit\u00F3 que los estudiantes relacionen el tema con sus experiencias\r\npersonales "
				+ "o el mundo del trabajo.\r\nNota: Siempre que aplique, el profesor promueve que los estudiantes aporten sus\r\nexperiencias, analicen situaciones"
				+ " reales o simuladas y las compartan con las ideas\r\ndesarrolladas y adquiridas en el aprendizaje.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n"
				+ "CRITERIO II. GESTI\u00D3N DE LA DOCENCIA\r\n5. El profesor ejerci\u00F3 la docencia como un gu\u00EDa o facilitador de los estudiantes, mediante "
				+ "la\r\ncomunicaci\u00F3n e interacci\u00F3n con los mismos, as\u00ED como en las diversas actividades\r\ndocentes.\r\nNota: El profesor puede "
				+ "evidenciar esta funci\u00F3n mediante las diversas actividades\r\ndocentes y la frecuencia de sus interacciones en foros, mensajes, entre otros"
				+ ".\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n\r\n6. En su interacci\u00F3n con los estudiantes, el profesor utiliz\u00F3 un lenguaje que correspon"
				+ "de\r\ncon el nivel de los estudiantes en el curso.\r\nNota: Es un lenguaje \u00FAtil, propio de la disciplina y eficaz para comprender los con"
				+ "ceptos.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n\r\n7. El profesor promovi\u00F3 la comunicaci\u00F3n e interacci\u00F3n estudiante-estudiante"
				+ ".\r\nNota: Este criterio se pone de manifiesto porque el profesor puede:\r\n\u2022 Organizar actividades de comunicaci\u00F3n\r\n\u2022 Solicitar "
				+ "la participaci\u00F3n de los estudiantes inactivos\r\n\u2022 Animar los foros, debates y actividades similares\r\n\u2022 Provocar reacciones e "
				+ "interacciones de los estudiantes, entre otras.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n\r\n8. El profesor foment\u00F3 la comunicaci\u00F3n e "
				+ "interacci\u00F3n estudiante-profesor.\r\nNota: Este criterio se pone de manifiesto porque el profesor podr\u00EDa:\r\n\u2022 Organizar activi"
				+ "dades de comunicaci\u00F3n\r\n\u2022 Solicitar la participaci\u00F3n de los estudiantes inactivos\r\n\u2022 Animar los foros, debates y activ"
				+ "idades similares\r\n\u2022 Propiciar y facilitar las comunicaciones de los estudiantes con el profesor\r\n\u2022 Provocar reacciones e inter"
				+ "acciones con los estudiantes.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n\r\n9. El profesor planific\u00F3 la distribuci\u00F3n del tiempo de form"
				+ "a tal que los estudiantes pueden\r\ncumplir con los objetivos establecidos.\r\nNota: El profesor utiliza el calendario, o facilita a los estudi"
				+ "antes un plan de trabajo de\r\nacuerdo con el contenido tem\u00E1tico del curso.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n\r\n10. El profesor inf"
				+ "orm\u00F3 a los estudiantes del tiempo estimado para responder a los mensajes,\r\npara informar sobre los resultados de los ex\u00E1menes, asi"
				+ "gnaciones y otros trabajos\r\ncorregidos; aunque el dise\u00F1o del curso pueda incluir algo sobre esto.\r\nNota: El profesor utiliza anuncios"
				+ ", el correo electr\u00F3nico y el prontuario para establecer\r\nlas fechas y cumplir con los plazos establecidos.\r\nComentarios"
				+ ":\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n11. El profesor inform\u00F3 a los estudiantes de los resultados de las actividades realizadas po"
				+ "r\r\naquellos no m\u00E1s tarde de dos semanas de haber sido entregados durante el semestre o\r\nsu equivalente en los diversos"
				+ " t\u00E9rminos acad\u00E9micos. (Art\u00EDculo II del Reglamento General\r\nde Estudiantes).\r\nNota: El profesor puede mostrar "
				+ "que utiliza anuncios, el correo electr\u00F3nico o el registro\r\nde notas para establecer las fechas y cumplir con los plazos "
				+ "establecidos.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n\r\n12. El profesor respondi\u00F3 en el tiempo establecido, los mensajes,"
				+ " las preguntas y las\r\nconsultas de los estudiantes, que se recibieron mediante el correo electr\u00F3nico.\r\nNota: Con "
				+ "relaci\u00F3n a los plazos establecidos, el tiempo de respuesta no debe superar\r\ndos d\u00EDas laborables.\r\nComentario"
				+ "s:\r\n\r\n\r\n\r\n\r\n\r\n\r\n13. El profesor utiliz\u00F3 las herramientas disponibles en la plataforma y present\u00F3 "
				+ "el contenido\r\ndel curso en forma organizada y coherente.\r\nNota: Este criterio se evaluar\u00E1 independientemente del "
				+ "dise\u00F1o del curso. El profesor\r\ntiene libertad acad\u00E9mica (Art\u00EDculo 4.1 de la Parte IV del Manual de la Facu"
				+ "ltad) para\r\nreorganizar el curso de acuerdo a su experiencia y para el beneficio del estudiante.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n\r\n14. "
				+ "El profesor mantuvo un clima de confianza y respeto\r\nNota: En sus comunicaciones con los alumnos el profesor siempre es respetuoso,\r\namable "
				+ "y facilita las tareas de aprendizaje de los estudiantes. El profesor puede\r\nevidenciar esto con mensajes de correo electr\u00F3nico, mensajes"
				+ " en foros, debates,\r\ncorrecciones de trabajos, evaluaciones; en general, en todas sus comunicaciones con\r\nlos estudiantes. En caso de haber "
				+ "surgido situaciones de conflicto real o aparente, el\r\nprofesor pudo resolverlas en un clima de confianza, prudencia, serenidad y"
				+ " respeto.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n\r\nCRITERIO III. PROMOCI\u00D3N DEL INTER\u00C9S DEL ESTUDIANTE POR LA "
				+ "ASIGNATURA\r\n15. El profesor facilit\u00F3 la discusi\u00F3n para complementar, aclarar o enriquecer el tema.\r\nNota: "
				+ "El profesor promueve actividades de interacci\u00F3n sobre asuntos, experiencias o\r\nacontecimientos que ayuden al "
				+ "estudiante a interesarse por el tema.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n16. "
				+ "El profesor promovi\u00F3 la b\u00FAsqueda de informaci\u00F3n o experiencias para "
				+ "enriquecer el\r\nconocimiento.\r\nNota: El profesor organiza foros, trabajos en equipo"
				+ " y otras actividades orientadas a la\r\nb\u00FAsqueda e investigaci\u00F3n de informaci\u00F3n por parte de los estudiantes "
				+ "en internet, Centro\r\nde Acceso a la Informaci\u00F3n (CAI) y cualquier otro recurso. Los estudiantes pueden\r\ndebatir "
				+ "sobre estas informaciones para fortalecer y aumentar sus conocimientos\r\nindividuales.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n"
				+ "17. El profesor foment\u00F3 el pensamiento cr\u00EDtico.\r\nNota: El profesor utiliza las herramientas interactivas disponibles"
				+ " en la plataforma para\r\nfomentar el pensamiento cr\u00EDtico de los estudiantes.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n "
				+ "CRITERIO IV. DESARROLLO Y USO DE M\u00C9TODOS Y ESTRATEGIAS DE ENSE\u00D1ANZA\r\n\r\n18. El profesor aport\u00F3 recursos de apoyo"
				+ " adicionales para enriquecer el tema evaluado.\r\nNota: Aparte de los materiales did\u00E1cticos recogidos en el dise\u00F1o del "
				+ "curso, el profesor\r\naporta alg\u00FAn recurso adicional para enriquecer el contenido de la unidad (art\u00EDculos,\r\nhiperv\u00EDnculos"
				+ ", v\u00EDdeos, gr\u00E1ficos, entre otros).\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\n19. El profesor utiliz\u00F3 diferentes recursos de"
				+ " ense\u00F1anza para facilitar el aprendizaje. Por\r\nejemplo: trabajo colaborativo, v\u00EDdeos, presentaciones, seminarios y conferen"
				+ "cias a\r\ntrav\u00E9s de la web, entre otros.\r\nComentarios:\r\n\r\n\r\n\r\n\r\n\r\nPromedio General ____________ ");
		scrollPane.setViewportView(txtrParteVOtras);
		JButton btnNewButton = new JButton("Imprimir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {

					txtrParteVOtras.print();
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