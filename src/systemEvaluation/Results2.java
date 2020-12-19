package systemEvaluation;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.IOException;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;

public class Results2 extends JFrame {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Results1 frame = new Results1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JPanel contentPane;

	public Results2() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		ValenciasRubrica vr =new ValenciasRubrica();
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(550, 20, 770, 1000);

		JButton btnNewButton = new JButton("Print");

		JTextArea txtrUniversidadInteramericanaDe = new JTextArea();
		txtrUniversidadInteramericanaDe.setFont(new Font("Arial", Font.PLAIN, 9));
		txtrUniversidadInteramericanaDe.setTabSize(20);
		txtrUniversidadInteramericanaDe.setText("                                                \r\n                                                        Universidad Interamericana de Puerto Rico\r\n     "
				+ "                                                                 Recinto de Bayam\u00F3n\r\n\r\n\r\n\r\n                                  "
				+ "VALENCIAS DE LOS SUBCRITERIOS DE EVALUACI\u00D3N DE FACULTAD\r\r\n \r\n\r\nProfesor: ___________________________________                    "
				+ "  Departamento: ____________________________\r\n\r\nFecha:\r\n\r\n                                                                   "
				+ "  RANGO CATEDR\u00C1TICO \r\n_____________________________________________________________________________________________________________________________________________________\r\n "
				+ "I. Experiencia y Calidad Docente                    | Catedr\u00E1tico Valencia (63%) |   "
				+ " Puntuaci\u00F3n   obtenida\r\n_____________________________________________________________________________________________________________________________________________________\r\n"
				+ "a. ominio de la disciplina que ense\u00F1a.                                                 13                     "+vr.CalidadDocente(3)[0]+ "     "
				+ "  \r\n_____________________________________________________________________________________________________________________________________________________\r\n"
				+ "b. Habilidad para organizar el contenido \r                                                                           \r\ny presentarlo en forma clara, l\u00F3gica        "
				+ "                                               10                    "+vr.CalidadDocente(3)[1]+"                            \r\n e imaginativa.                           "
				+ "                                                                                                       \r\n______________________________________________________"
			    + "_______________________________________________________________________________________________\r\r\nc. Conocimiento de los desarrollos actuales de la disciplina. "
		        + "               12                       "+vr.CalidadDocente(3)[2]+"      \r\n______________________________________________________________________________________"
	            + "_______________________________________________________________\r\r\nd. Habilidad para relacionar la disciplina con otras esferas de               6      "
	            + "                    "+vr.CalidadDocente(3)[3]+"\r\nconocimiento.                                                                                           "
			    + "                                       \r\n_______________________________________________________________________________________________________"
			    + "______________________________________________\r\r\ne. Habilidad para promover y ampliar el inter\u00E9s del estudiante             5             "
			    + "             " +vr.CalidadDocente(3)[4]+"\r\nen la disciplina.                                                                                    "
			    + "                                            \r\n__________________________________________________________________________________________"
				+ "___________________________________________________________\r\r\nf. Habilidad para desarrollar y utilizar m\u00E9todos y estrategias       "
				+ "         9                             "+vr.CalidadDocente(3)[5]+"\r\nadecuadas, incluyendo el \u201Cassessment\u201D para una ense\u00F1anza "
				+ "      \r\nefectiva.                                                                                 \r\n_____________________________"
			+ "________________________________________________________________________________________________________________________\r\r\n"
				+ "g. Disponibilidad y eficacia en la orientaci\u00F3n acad\u00E9mica del                                          "
				+ "   \r\nestudiante.                                                                                               "
				+ "                               \r\n                                                                               "
				+ "                               8                              "
				+ "  "+vr.CalidadDocente(3)[6]+"\r\r\nh. Posesi\u00F3n de los atributos de integridad, laboriosidad,     "
				+ "                                                              "
				+ " \r\nliberalidad y objetividad en la ense\u00F1anza.                     "
				+ "                                                                     "
				+ " \r\n________________________________________________________________"
				+ "______________________________________________________________________"
					+ "_______________\r\nII. Servicio a la Instituci\u00F3n                  "
				+ "           | Catedr\u00E1tico Valencia (9%)\r|     Puntuaci\u00F3n   "
			+ "obtenida\r\n____________________________________________________________"
			+ "_________________________________________________________________________"
			+ "________________\r\na. Trabajo en comit\u00E9s de facultad a nivel departamental. "
			+ "                  2                      "+vr.ServicioInstitucion(3)[0]+"\r\n_____"
																				+ "___________________________________________________________________________"
																				+ "_____________________________________________________________________       "
																				+ "                                                                                   "
																				+ "               \r\nb. Participaci\u00F3n y aportaci\u00F3n a reuniones de facultad y de   "
																				+ "                                          \r\ncomit\u00E9s a nivel de Recinto.           "
																				+ "                                                                                          "
																				+ "               \r\n                                                                       "
																				+ "                                   3                    "
																				+ "   "+vr.ServicioInstitucion(3)[1]+"\r\nc. Servicio en comit\u00E9s y en organizaciones a nivel  "
																						+ "                                                            \r\ninstitucional.            "
																						+ "                                                                                           "
																						+ "                       \r\n________________________________________________________________"
																						+ "_____________________________________________________________________________________\r\n"
																						+ "d. Colaboraci\u00F3n en actividades estudiantiles.                                       "
																						+ "                              \r\n                                                       "
																						+ "                                                   2                    "
																						+ "    "+vr.ServicioInstitucion(3)[2]+"\r\ne. Asistencia a actos oficiales    "
																								+ "                                                              "
																								+ " \r\n___________________________________________________________"
																								+ "_________________________________________________________________"
																								+ "_________________________\r\nf. Designaci\u00F3n como director/a de departamento, presidente"
																								+ "                                                                 "
																								+ " \r\nde comit\u00E9 y otras.\r\n                                          "
																								+ "                                                                2          "
																								+ "             " +vr.ServicioInstitucion(3)[3]+"\r\ng. Participaci\u00F3n en organismos de gobierno; tales como: el    "
																										+ "                                                               \r\nSenado y el Consejo"
																										+ " Universitario.\r\r\n____________________________________________________________________"
																										+ "_________________________________________________________________________________\r\nIII. "
																										+ "Servicio a la Comunidad                        |    Catedr\u00E1tico Valencia (2%)        "
																										+ " |            Puntuaci\u00F3n obtenida       \r\n__________________________________________"
																										+ "___________________________________________________________________________________________"
																										+ "________________\r\na. Servicio en el campo profesional del profesor como                  "
																										+ "               \r\nconsultor o investigador.                                \r\n           "
																										+ "                                                                                           "
																										+ "    2                             "+vr.ServicioComunidad(3)+"\r\nb. Servicio como recurso:"
																												+ " conferenciante de grupos de la                            "
																												+ "\r\ncomunidad, participaci\u00F3n activa en gestiones pol\u00EDticas,\r\nreligiosas o c\u00EDvicas."
																												+ "                              \r\n__________________________________________________________________"
																												+ "___________________________________________________________________________________\r\nIV. Investigaci"
																												+ "\u00F3n y Trabajo Creativo                           |     Catedr\u00E1tico Valencia (14%)   "
																												+ "    | Puntuaci\u00F3n obtenida                       \r\n______________________________________"
																												+ "_________________________________________________________________________________________________"
																												+ "______________\r\na. Publicaciones                                                                  "
																												+ "                 5                              "+vr.InvestigacionTrabajo(3)[0]+"  \r\n__________"
																														+ "________________________________________________________________________________________"
																														+ "___________________________________________________\r\n"
																														+ "b. Presentaciones y trabajos creativos relacionados con la "
																														+ "                5                                "
																														+ " "+vr.InvestigacionTrabajo(3)[1]+"  \r\ndisciplina que ense\u00F1a.   "
																																+ "                  \r\n_______________________________________"
																																+ "______________________________________________________________"
																																+ "________________________________________________\r\nc. Propuestas dise\u00F1adas y presentadas.                                                                                                                                                                           "
																																+ " \r\nd. Concesi\u00F3n de ayudas para investigaci\u00F3n y proyectos.                    4                                        "
																																+ ""+vr.InvestigacionTrabajo(3)[2]+"           \r\ne. Invenciones, patentes, labor art\u00EDstica y actuaci\u00F3n.                                 "
																																		+ "                                 \r\n_____________________________________________________________________________________________________________________________________________________\r\n"
																																		+ "VI. Crecimiento y Desarrollo Profesional                  |    Catedr\u00E1tico Valencia (12%)         | Puntuaci\u00F3n obtenida                        "
																																		+ "  \r\n_____________________________________________________________________________________________________________________________________________________\r\n"
																																		+ "a. Obtenci\u00F3n de premios, ayudas y becas.\r                                                                 \r\nb. Nombramiento como asesor/a en agencias de gobierno\r       "
																																		+ "                            \r\nestatal o federal.                                                                                  4                                "
																																		+ "" +vr.CrecimientoDesarrollo(3)[0]+ " \r\nc. Participaci\u00F3n activa en organizaciones profesionales.                                                         "
																																				+ "     \r\n_____________________________________________________________________________________________________________________________________________________\r\n"
																																				+ "d. Recurso en conferencia y charlas.                                                    4                             "
																																				+ "   "+vr.CrecimientoDesarrollo(3)[1]+"\r\n_____________________________________________________________________________________________________________________________________________________\r\n"
																																						+ "e. Participaci\u00F3n en conferencias, congresos o institutos.                                                                \r\nf. Educaci\u00F3n post doctoral, educaci\u00F3n continua.   "
																																						+ "                              4                                 "+vr.CrecimientoDesarrollo(3)[2]+" \r\n________________________________________________________________________"
																																								+ "_____________________________________________________________________________\r\n\r\n\r\n\r\n                          _______________________________________"
																																								+ "___________________________________________________________________________\r\n                          |                      CRITERIOS                     "
																																								+ "                    |                  VALENCIAS                      |               DEL PROFESOR         |\r\n                   "
																																								+ "       --------------------------------------------------------------------------------------------------------------------------------------"
																																								+ "--------------------------------------------------------\r\n                          | I. Experiencia y Calidad Docente                       "
																																								+ "                                 63%                                                                               |\r\n                       "
																																								+ "   | II. Servicio a la Instituci\u00F3n 11%                                                           9%\r                                       "
																																								+ "                                        |\r\n                          | III. Servicio a la Comunidad 2%                                         "
																																								+ "                  2%                                                                               |\r\n                         "
																																								+ " | IV. Investigaci\u00F3n y Trabajo Creativo 12%                                             14%                                 "
																																								+ "                                            |\r\n                          | V. Crecimiento y Desarrollo Profesional 10%          "
																																								+ "                               12%                                                                               |\r\n            "
																																								+ "              ___________________________________________________________________________________________________________________\r\n     "
																																								+ "                                                                                                                                          "
																																								+ "                        Evaluaci\u00F3n Promedio Final:"+vr.Total(3)+" \r\n\r\n\r\n\r\n                                    "
																																										+ "   El/la profesor/a ________________________________________________ cumple con los criterios requeridos para\r\n        "
																																										+ "                                el Rango de Catedr\u00E1tico Asociado, seg\u00FAn consta en la Parte II, 2.2.4 del Manual de Facultad y cumple con los\r\n    "
																																										+ "                                    criterios de Experiencia y Calidad Docente, Servicio a la Instituci\u00F3n y Servicio a la Comunidad, seg\u00FAn descritos en\r\n  "
																																										+ "                                      la Parte V, 5.6 y en las Gu\u00EDas para la Evaluaci\u00F3n del Personal Docente, correspondientes al rango que solicita.\r\n\n\r\n                              "
																																										+ "          Este comit\u00E9 recomienda en forma ____________________ que se le otorgue a el/la ________________________________________ \r\n                                  "
																																										+ "      el ascenso en rango de Catedr\u00E1tico/a Auxiliar a  Catedr\u00E1tico/a Asociado/a.\r\n\r\n\r\n                                         Miembros del Comit\u00E9 de Evaluaci\u00F3n Sumativa:\r\n   "
																																										+ "                                           ___________________________________\r\n\r\n                                              ___________________________________ \r\n                          \r\n  "
																																										+ "                                            ___________________________________ \r\n\r\n                                                                                                                     "
																																										+ "                           _______________________________________\r\n                                                                                                                                       "
																																										+ "         Firma del/a Profesor/a Evaluado/a\r\n\r\n                                                                                                                                         "
																																										+ "       _______________________________________\r\n                                                                                                                                          "
																																										+ "                            Fecha\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\r\n");
		scrollPane.setViewportView(txtrUniversidadInteramericanaDe);
		
		GroupLayout gl_panel_2 = new GroupLayout(contentPane);
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
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 1000, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(63)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(83, Short.MAX_VALUE))
		);

		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {


		try {

			txtrUniversidadInteramericanaDe.print();
			}
			catch (PrinterException e1)
			{
			e1.printStackTrace();
			}
			}
		});
		contentPane.setLayout(null);
		btnNewButton.setBounds(83, 68, 111, 54);
		contentPane.add(btnNewButton);
		contentPane.add(btnNewButton);
		contentPane.add(scrollPane);
	}

}