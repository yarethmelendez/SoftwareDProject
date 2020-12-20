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
			//38-41
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
		txtrParteVOtras.setText("___________________________________________________________________________________________________________                                          \r\n                                           Comentarios Evidendencia  \r\n____________________________________________________________________________________________________________\r\n                                            "
				+ "   Calidad Docente:\r\na. Dominio de la disciplina que ense\u00F1a\r\nComentarios:\r\n\"+values(144)+\"\r\n\r\n\r\n"
				+ "b. Habilidad para organizar el contenido y presentarlo en forma\r\nclara, l\u00F3gica "
				+ "e imaginativa\r\nComentarios:\r\n\"+values(145)+\"\r\n\r\n\r\nc. Conocimiento de los desarrollos actuales de la "
				+ "disciplina\r\nComentarios:\r\n\"+values(146)+\"\r\n\r\n\r\nd. Habilidad para relacionar la disciplina con otras "
				+ "esferas del\r\nconocimiento\r\nComentarios:\r\n\"+values(147)+\"\r\n\r\n\r\ne. Habilidad para promover y ampliar"
				+ " el inter\u00E9s del estudiante en la\r\ndisciplina\r\nComentarios:\r\n\"+values(148)+\"\r\n\r\n\r\n\r\nf. "
				+ "Habilidad para desarrollar y utilizar m\u00E9todos y estrategias adecuadas,\r\nincluyendo \u201Cassessment\u201D "
				+ "para una ense\u00F1anza efectiva\r\nComentarios:\r\n\"+values(149)+\"\r\n\r\n\r\n\r\ng. Disponibilidad y eficacia "
				+ "en la orientaci\u00F3n acad\u00E9mica del estudiante\r\nh. Posesi\u00F3n de los atributos de integridad, laboriosidad,"
				+ " liberalidad y\r\nobjetividad en la ense\u00F1anza\r\nComentarios:\r\n\"+values(150)+\"\r\n\r\n\r\n\r\n\r\n\r\n       "
				+ "                        Servicio a la instituci\u00F3n Puntuaci\u00F3n\r\na. Participaci\u00F3n y aportaci\u00F3n a "
				+ "reuniones de facultad y de comit\u00E9s a nivel de\r\nRecinto.\r\nb. Servicio en comit\u00E9s y en organizaciones a "
				+ "nivel institucional\r\nComentarios:\r\n\"+values(151)+\"\r\n\r\n\r\n\r\nc. Colaboraci\u00F3n en actividades estudian"
				+ "tiles\r\nd. Asistencia a actos oficiales\r\nComentarios:\r\n\"+values(152)+\"\r\n\r\n\r\n\r\n\r\ne. Designaci\u00F3n "
				+ "como director/a de departamento, presidente de comit\u00E9 y otras\r\nf. Participaci\u00F3n en organismos de gobierno;"
				+ " tales como: el Senado y el Consejo\r\nUniversitario\r\nComentarios:\r\n\"+values(153)+\"\r\n\r\n\r\n\r\n           "
				+ "                        Servicio a la Comunidad \r\na. Servicio en el campo profesional del profesor como consultor "
				+ "o investigador\r\nb. Servicio como recurso: conferenciante de grupos de la comunidad, participaci\u00F3n\r\nactiva "
				+ "en gestiones pol\u00EDticas, religiosas o c\u00EDvicas\r\nComentarios:\r\n\"+values(154)+\"\r\n\r\n\r\n\r\n\r\n\r\n "
				+ "                                Investigaci\u00F3n y trabajo creativo \r\na. Publicaciones\r\nComentarios:\r\n"+values[155]+""
				+ "\r\n\r\n\r\n\r\nb. Presentaciones y trabajos creativos relacionados con la disciplina que ense\u00F1a\r\n"
				+ "Comentarios:\r\n"+values[156]+"\r\n\r\n\r\n\r\nc. Propuestas dise\u00F1adas y presentadas\r\nd. Concesi\u00F3n de ayudas "
				+ "para investigaci\u00F3n y proyectos\r\ne. Invenciones, patentes, labor art\u00EDstica y actuaci\u00F3n\r\nComentarios:"
				+ "\r\n\"+values(157)+\"\r\n\r\n\r\n\r\n\r\n                      Crecimiento y Desarrollo Profesional \r\na. Obtenci\u00F3n"
				+ " de premios, ayudas y becas\r\nb. Nombramiento como asesor/a en agencias del gobierno estatal o federal\r\nc. "
				+ "Participaci\u00F3n activa en organizaciones profesionales\r\nComentarios:\r\n\"+values(158)+\"\r\n\r\n\r\n\r\nd. "
				+ "Recurso en conferencias y charlas\r\nComentarios:\r\n\"+values(159)+\"\r\n\r\n\r\n\r\ne. Participaci\u00F3n en "
				+ "conferencias, congresos o institutos\r\nf. Educaci\u00F3n post doctoral, educaci\u00F3n continua\r\n"
				+ "Comentarios:\r\n\"+values(160)+\"\r\n\r\n\r\r\n\r\n______________________________________________________________"
				+ "______________________\r\n                                    Instrumento I-A\r\nPARTE V: Otras Apreciaciones del Estudiante."
				+ " Contesta las siguientes\r\npreguntas.\r\n\r\n25. \u00BFQu\u00E9 fue lo que m\u00E1s te gust\u00F3 del curso?"
				+ "\r\n\"+values(38)+\"\r\n\r\n\r\n\r\n26. \u00BFQu\u00E9 fue lo que menos te gust\u00F3 del curso?"
				+ "\r\n\"+values(39)+\"\r\n\r\n\r\n\r\n27. \u00BFTomar\u00EDas otro curso en l\u00EDnea con el mismo"
				+ " profesor o lo recomendar\u00EDas a un compa\u00F1ero?\r\nExplica.\r\n\"+values(40)+\"\r\n\r\n\r\n\r\n28."
				+ " \u00BFQu\u00E9 sugerencias har\u00EDas para que el profesor mejore su ense\u00F1anza y participe m\u00E1s"
				+ " en tu\r\naprendizaje en esta modalidad? \r\n\"+values(41)+\"\r\n\r\n\r\n_______________________________"
				+ "_____________________________________________________________________________\r\n                     "
				+ "                  Instrumento III-A\r\nEvaluaci\u00F3n de Facultad por el Comit\u00E9 Evaluador en Cursos Ofrecidos "
				+ "en L\u00EDnea\r\n\r\nCRITERIO I. DOMINIO DE LA DISCIPLINA Y SU RELACI\u00D3N CON OTRAS ESFERAS DEL\r\nCONOCIMIENTO\r\n\r\n"
				+ "1. Mediante la interacci\u00F3n con los estudiantes, el profesor demostr\u00F3 conocimiento suficiente\r\ndel tema evaluado."
				+ "\r\nNota: El profesor puede mostrar evidencia de su conocimiento del tema evaluado y de\r\nla asignatura a trav\u00E9s de"
				+ " sus explicaciones en correos electr\u00F3nicos, orientaciones y\r\naclaraciones en foros de debates, comentarios en trab"
				+ "ajos corregidos, comentarios y\r\nan\u00E1lisis de trabajos de asignaciones, trabajos o ejercicios de evaluaci\u00F3n, en"
				+ "tre otros.\r\nComentarios:\r\n\"+values(101)+\"\r\n\r\n\r\n\r\n\r\n\r\n\r\n2. Mediante la interacci\u00F3n con los estud"
				+ "iantes, el profesor integr\u00F3 conceptos o experiencias\r\nde otras disciplinas para enriquecer el tema evaluado.\r\nN"
				+ "ota: Se trata de mostrar la transversalidad del conocimiento, relacionando el tema con\r\notras \u00E1reas del conocimie"
				+ "nto con ocasi\u00F3n de las interacciones con los estudiantes. El\r\nprofesor propuso, si a su juicio aplica al tema eval"
				+ "uado, para su an\u00E1lisis o consideraci\u00F3n:\r\nnoticias, acontecimientos, problemas o experiencias reales o simulad"
				+ "as relacionadas\r\ncon el tema evaluado. Esto puede tener lugar en el foro, en mensajes, actividades,\r\nasignaciones, e"
				+ "nlaces a documentos, entre otros.\r\nComentarios:\r\n\"+values(102)+\"\r\n\r\n\r\n\r\n\r\n\r\n3. El profesor resalt\u00F3"
				+ " la utilidad del tema para otros cursos o \u00E1reas del conocimiento.\r\nNota: Se trata de la aplicaci\u00F3n \u00FAtil"
				+ " de los conocimientos adquiridos para otros temas o\r\n\u00E1reas de conocimiento. El profesor puede evidenciar esto medi"
				+ "ante el contenido\r\ntem\u00E1tico, mensajes, foros de discusi\u00F3n, entre otros.\r\nComentarios"
				+ ":\r\n"+values[103]+"\r\n\r\n\r\n\r\n\r\n4. El profesor facilit\u00F3 que los estudiantes relacionen"
						+ " el tema con sus experiencias\r\npersonales o el mundo del trabajo.\r\nNota: Siempre que aplique, "
						+ "el profesor promueve que los estudiantes aporten sus\r\nexperiencias, analicen situaciones reales "
						+ "o simuladas y las compartan con las ideas\r\ndesarrolladas y adquiridas en el aprendizaje.\r\nComen"
						+ "tarios:\r\n\"+values(104)+\"\r\n\r\n\r\n\r\n\r\n\r\n\r\nCRITERIO II. GESTI\u00D3N DE LA DOCENCIA\r\n"
						+ "5. El profesor ejerci\u00F3 la docencia como un gu\u00EDa o facilitador de los estudiantes, mediante"
						+ " la\r\ncomunicaci\u00F3n e interacci\u00F3n con los mismos, as\u00ED como en las diversas actividades"
						+ "\r\ndocentes.\r\nNota: El profesor puede evidenciar esta funci\u00F3n mediante las diversas actividad"
						+ "es\r\ndocentes y la frecuencia de sus interacciones en foros, mensajes, entre otros.\r\nComentario"
						+ "s:\r\n\"+values(105)+\"\r\n\r\n\r\n\r\n\r\n\r\n6. En su interacci\u00F3n con los estudiantes, el"
						+ " profesor utiliz\u00F3 un lenguaje que corresponde\r\ncon el nivel de los estudiantes en el curso"
						+ ".\r\nNota: Es un lenguaje \u00FAtil, propio de la disciplina y eficaz para comprender los concep"
						+ "tos.\r\nComentarios:\r\n\"+values(106)+\"\r\n\r\n\r\n\r\n\r\n\r\n7. El profesor promovi\u00F3 la"
						+ " comunicaci\u00F3n e interacci\u00F3n estudiante-estudiante.\r\nNota: Este criterio se pone de m"
						+ "anifiesto porque el profesor puede:\r\n\u2022 Organizar actividades de comunicaci\u00F3n\r\n\u2022 S"
						+ "olicitar la participaci\u00F3n de los estudiantes inactivos\r\n\u2022 Animar los foros, debates y a"
						+ "ctividades similares\r\n\u2022 Provocar reacciones e interacciones de los estudiantes, entre otras."
						+ "\r\nComentarios:\r\n\"+values(107)+\"\r\n\r\n\r\n\r\n\r\n\r\n8. El profesor foment\u00F3 la comunic"
						+ "aci\u00F3n e interacci\u00F3n estudiante-profesor.\r\nNota: Este criterio se pone de manifiesto po"
						+ "rque el profesor podr\u00EDa:\r\n\u2022 Organizar actividades de comunicaci\u00F3n\r\n\u2022 Solic"
						+ "itar la participaci\u00F3n de los estudiantes inactivos\r\n\u2022 Animar los foros, debates y activ"
						+ "idades similares\r\n\u2022 Propiciar y facilitar las comunicaciones de los estudiantes con el profe"
						+ "sor\r\n\u2022 Provocar reacciones e interacciones con los estudiantes.\r\nComenta"
						+ "rios:\r\n"+values[108]+"\r\n\r\n\r\n\r\n\r\n\r\n9. El profesor planific\u00F3 la distri"
								+ "buci\u00F3n del tiempo de forma tal que los estudiantes pueden\r\ncumplir con l"
								+ "os objetivos establecidos.\r\nNota: El profesor utiliza el calendario, o facilit"
								+ "a a los estudiantes un plan de trabajo de\r\nacuerdo con el contenido tem\u00E1tic"
								+ "o del curso.\r\nComentarios:\r\n\"+values(109)+\"\r\n\r\n\r\n\r\n\r\n\r\n10. El pro"
								+ "fesor inform\u00F3 a los estudiantes del tiempo estimado para responder a los mens"
								+ "ajes,\r\npara informar sobre los resultados de los ex\u00E1menes, asignaciones y o"
								+ "tros trabajos\r\ncorregidos; aunque el dise\u00F1o del curso pueda incluir algo sob"
								+ "re esto.\r\nNota: El profesor utiliza anuncios, el correo electr\u00F3nico y el pront"
								+ "uario para establecer\r\nlas fechas y cumplir con los plazos establecidos.\r\nComenta"
								+ "rios:\r\n\"+values(110)+\"\r\n\r\n\r\n\r\n\r\n\r\n\r\n11. El profesor inform\u00F3 a l"
								+ "os estudiantes de los resultados de las actividades realizadas por\r\naquellos no m\u00E1s ta"
								+ "rde de dos semanas de haber sido entregados durante el semestre o\r\nsu equivalente en los d"
								+ "iversos t\u00E9rminos acad\u00E9micos. (Art\u00EDculo II del Reglamento General\r\nde Estudian"
								+ "tes).\r\nNota: El profesor puede mostrar que utiliza anuncios, el correo electr\u00F3nico o e"
								+ "l registro\r\nde notas para establecer las fechas y cumplir con los plazos establecidos.\r\nCo"
								+ "mentarios:\r\n\"+values(111)+\"\r\n\r\n\r\n\r\n\r\n\r\n12. El profesor respondi\u00F3 en el tiemp"
								+ "o establecido, los mensajes, las preguntas y las\r\nconsultas de los estudiantes, que se recibier"
								+ "on mediante el correo electr\u00F3nico.\r\nNota: Con relaci\u00F3n a los plazos establecidos, "
								+ "el tiempo de respuesta no debe superar\r\ndos d\u00EDas laborables.\r\nCome"
								+ "ntarios:\r\n"+values[112]+"\r\n\r\n\r\n\r\n\r\n\r\n13. El profesor utiliz\u00F3 las her"
										+ "ramientas disponibles en la plataforma y present\u00F3 el contenido\r\ndel curso en "
										+ "forma organizada y coherente.\r\nNota: Este criterio se evaluar\u00E1 independientemen"
										+ "te del dise\u00F1o del curso. El profesor\r\ntiene libertad acad\u00E9mica (Art\u00EDculo "
										+ "4.1 de la Parte IV del Manual de la Facultad) para\r\nreorganizar el curso de acuerdo a su "
										+ "experiencia y para el beneficio del estudiante.\r\nComentarios:\r\n"+values[113]+"\r\n\r\n\r\n\r\n\r\n\r\n"
												+ "14. El profesor mantuvo un clima de confianza y respeto\r\nNota: En sus comunicaciones "
												+ "con los alumnos el profesor siempre es respetuoso,\r\namable y facilita las tareas de "
												+ "aprendizaje de los estudiantes.El profesor puede\r\nevidenciar esto con mensajes de "
												+ "correo electr\u00F3nico, mensajes en foros, debates,\r\ncorrecciones de trabajos,"
												+ " evaluaciones; en general, en todas sus comunicaciones con\r\nlos estudiantes. En"
												+ " caso de haber surgido situaciones de conflicto real o aparente, el\r\nprofesor "
												+ "pudo resolverlas en un clima de confianza, prudencia, serenidad y respeto.\r\nCo"
												+ "mentarios:\r\n\"+values(114)+\"\r\n\r\n\r\n\r\n\r\n\r\nCRITERIO "
												+ "III. PROMOCI\u00D3N DEL INTER\u00C9S DEL ESTUDIANTE POR LA ASIGNA"
												+ "TURA\r\n15. El profesor facilit\u00F3 la discusi\u00F3n para comp"
												+ "lementar, aclarar o enriquecer el tema.\r\nNota: El profesor prom"
												+ "ueve actividades de interacci\u00F3n sobre asuntos, experiencias"
												+ " o\r\nacontecimientos que ayuden al estudiante a interesarse por "
												+ "el tema.\r\nComentarios:\r\n\"+values(115)+\"\r\n\r\n\r\n\r\n\r\n"
												+ "16. El profesor promovi\u00F3 la b\u00FAsqueda de informaci\u00F3n o "
												+ "experiencias para enriquecer el\r\nconocimiento.\r\nNota: El profesor"
												+ " organiza foros, trabajos en equipo y otras actividades orientadas a "
												+ "la\r\nb\u00FAsqueda e investigaci\u00F3n de informaci\u00F3n por par"
												+ "te de los estudiantes en internet, Centro\r\nde Acceso a la Informac"
												+ "i\u00F3n (CAI) y cualquier otro recurso. Los estudiantes pueden\r\nde"
												+ "batir sobre estas informaciones para fortalecer y aumentar sus conoc"
												+ "imientos\r\nindividuales.\r\nComentarios:\r\n\"+values(116)+\"\r\n\r\n\r\n\r\n\r\n17. "
												+ "El profesor foment\u00F3 el pensamiento cr\u00EDtico.\r\nNota: El profesor utiliza la"
												+ "s herramientas interactivas disponibles en la plataforma para\r\nfomentar el pensamien"
												+ "to cr\u00EDtico de los estudiantes.\r\nComentarios:\r\n\"+values(117)+\"\r\n\r\n\r\n\r\n\r\n "
												+ "CRITERIO IV. DESARROLLO Y USO DE M\u00C9TODOS Y ESTRATEGIAS DE ENSE\u00D1ANZA\r\n\r\n18."
												+ " El profesor aport\u00F3 recursos de apoyo adicionales para enriquecer el tema evalua"
												+ "do.\r\nNota: Aparte de los materiales did\u00E1cticos recogidos en el dise\u00F1o d"
												+ "el curso, el profesor\r\naporta alg\u00FAn recurso adicional para enriquecer el con"
												+ "tenido de la unidad (art\u00EDculos,\r\nhiperv\u00EDnculos, v\u00EDdeos, gr\u00E1fi"
												+ "cos, entre otros).\r\nComentarios:\r\n\"+values(118)+\"\r\n\r\n\r\n\r\n\r\n19. El pr"
												+ "ofesor utiliz\u00F3 diferentes recursos de ense\u00F1anza para facilitar el aprendiza"
												+ "je. Por\r\nejemplo: trabajo colaborativo, v\u00EDdeos, presentaciones, seminarios y c"
												+ "onferencias a\r\ntrav\u00E9s de la web, entre otros.\r\nCome"
												+ "ntarios:\r\n"+values[119]+"\r\n\r\n                         "
														+ "                   Instrumento IV\r\n________________"
														+ "______________________________________________________"
														+ "__________________________\r\nI. RESPONSABILIDADES y DE"
														+ "BERES COMO FACULTAD:\r\n1. Cumple con las horas de oficin"
														+ "a seg\u00FAn estab"
														+ "lecidas.\r\nComentari"
														+ "os:\r\n"+values[121]+"\r\n\r\n\r\n\r\n\r\n\r\n2. Pre"
																+ "senta evidencia sobre las diferentes formas"
																+ " en la que cumple con la consejer\u00EDa\r\nacad\u00E9mica ofrecida"
																+ " a sus estudiantes, seg\u00FAn definida en el Manual de la Facultad."
																+ "\r\nComentarios:\r\n\"+values(122)+\"\r\n\r\n\r\n\r\n\r\n3. Informa"
																+ " al Director del Departamento sobre sus ausencias.\r\nComentarios"
																+ ":\r\n"+values[123]+"\r\n\r\n\r\n\r\n\r\n4. Informa al Director del "
																		+ "Departamento c\u00F3mo repone sus ausencias.\r\nComentarios:"
																		+ "\r\n\"+values(124)+\"\r\n\r\n\r\n\r\n\r\n5. Contribuye a las"
																		+ " deliberaciones de las reuniones de su Departamento.\r\nComent"
																		+ "arios:\r\n\"+values(125)+\"\r\n\r\n\r\n\r\n\r\n6. Colabora en "
																		+ "las actividades que desarrolla el Departamento.\r\nComentarios"
																		+ ":\r\n\"+values(126)+\"\r\n\r\n\r\n\r\n\r\n7. Cumple con las n"
																		+ "ormas y procedimientos de la Instituci\u00F3n. Somete dentro de"
																		+ "l\r\ntiempo establecido por la Universidad y la unidad acad\u00E9mica, "
																		+ "los siguientes\r\ndocumentos: el cotejo de listas, el informe de estudi"
																		+ "antes que nunca han asistido,\r\nlas calificaciones finales, la remoci\u00F3n "
																		+ "de incompletos, la notificaci\u00F3n de extramuros,\r\nlos horarios de clase, "
																		+ "entre otros, y sigue el calendario acad\u00E9mico.\r\nComentari"
																		+ "os:\r\n"+values[127]+"\r\n\r\n\r\n\r\n\r\n8. Atiende las indica"
																				+ "ciones, memorandos y recomendaciones del personal gere"
																				+ "ncial\r\n(Director de Departamento, Decanos, y otros).\r\nComent"
																				+ "arios:\r\n\"+values(128)+\"\r\n\r\n\r\n\r\n\r\n\r\n9. Est\u00E1 disponi"
																				+ "ble para ofrecer cursos, seg\u00FAn las necesidades estableci"
																				+ "das en el\r\nhorario de clases para la oferta acad\u00E9mica del t\u00E9rmino.\r\nComent"
																				+ "arios:\r\n"+values[129]+"\r\n\r\n\r\n\r\n\r\n\r\n10. Participa en comit\u00E9s departa"
																						+ "mentales, de la unidad acad\u00E9mica, institucional o en\r\norganismos univer"
																						+ "sitarios cuando as\u00ED se le solicita.\r\nComentarios:\r\n"+values[130]+"\r\n\r\n\r\n\r\n\r\n\r\n"
																								+ "11. Asiste a las convocatorias de facultad, tales como actividades de reconocimientos\r\nac"
																								+ "ad\u00E9micos a estudiantes, el Servicio de Graduaci\u00F3n, la Graduaci\u00F3n, entre otr"
																								+ "os.\r\nComentarios:\r\n\"+values(131)+\"\r\n\r\n\r\n\r\n\r\n\r\n12. Asiste a actividades "
																								+ "de desarrollo profesional como congresos, seminarios, cursos\r\nde educaci\u00F3n contin"
																								+ "uada, entre otros.\r\nComentarios:\r\n\"+values(132)+\"\r\n\r\n\r\n\r\n\r\n\r\n13. "
																								+ "Mantiene un clima de respeto con los colegas y con los compa\u00F1eros de "
																								+ "trabajo.\r\nComentarios:\r\n\"+values(133)+\"\r\n\r\n\r\n\r\n\r\n14."
																								+ " Mantiene un clima de respeto con los estudiantes.\r\nComen"
																								+ "tarios:\r\n"+values[134]+"\r\n\r\n\r\n\r\n______________________________"
																										+ "______________________________________________________________"
																										+ "__________\r\n                            "
																										+ "  II. TAREAS ACAD\u00C9MICAS\r\n15. Contribu"
																										+ "ye al enriquecimiento de los recursos del Cen"
																										+ "tro de Acceso a la\r\nInformaci\u00F3n.\r\nComentari"
																										+ "os:\r\n"+values[135]+"\r\n\r\n\r\n\r\n\r\n\r\n\r\n16. Contribu"
																												+ "ye al mejoramiento y actualizaci\u00F3n de su disciplina o"
																												+ "de la materia que\r\nense\u00F1a, a trav\u00E9s del dise\u00F1o de"
																												+ " cursos nuevos, la preparaci\u00F3n de materiales\r\neducativos o "
																												+ "de prontuarios, proyectos innovadores, entre otros.\r\nComentar"
																												+ "ios:\r\n\"+values(136)+\"\r\n\r\n\r\n\r\n\r\n17. Est\u00E1 di"
																												+ "sponible para ense\u00F1ar cursos en diferentes modalidades de "
																												+ "estudio (por\r\nejemplo, estudio independiente, contrato, curso"
																												+ "s en l\u00EDnea, combinados, entre\r\notros).\r\nComentarios:\r\n"+values[137]+"\r\n\r\n\r\n\r\n\r\n"
																														+ "18. Trabaja con sus compa\u00F1eros en tareas de equipo cuando es necesario.\r\n"
																														+ "Comentarios:\r\n\"+values(138)+\"\r\n\r\n\r\n\r\n\r\n19. Evidencia en sus cursos "
																														+ "el uso de los resultados del \u201Cassessment\u201D de los cursos y\r\ndel "
																														+ "programa para el mejoramiento de los logros en el aprendizaje de los\r\nestu"
																														+ "diantes.\r\nComentarios:\r\n\"+values(139)+\"\r\n\r\n\r\n\r\n\r\n\r\n"
																														+ "20. Colabora con el fortalecimiento de los programas acad\u00E9micos, "
																														+ "tales como\r\n\u201Cassessment\u201D o acreditaci\u00F3n de los programas"
																														+ " acad\u00E9micos, revisi\u00F3n de los\r\nprontuarios, revisi\u00F3n "
																														+ "curricular de los programas acad\u00E9micos, entre otras tareas.\r\nCom"
																														+ "entarios:\r\n\"+values(140)+\"\r\n\r\n\r\nComentarios adicionales:\r\n1. "
																														+ "Fortalezas del evaluado:\r\n\"+values(141)+\"\r\n\r\n\r\n\r\n\r\n2."
																														+ " \u00C1reas que debe mejorar:\r\n\"+values(142)+\"\r\n\r\n\r\nRecomendaci\u00F3n"
																														+ " para el Plan de Acci\u00F3n del profesor evaluado:\r\n\"+values(143)+\"\r\n");
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