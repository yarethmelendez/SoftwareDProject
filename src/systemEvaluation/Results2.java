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
					Results2 frame = new Results2();
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

		MainMenu mm = new MainMenu();

		Evaluation e = new Evaluation();
		onlineEvaluation d = new onlineEvaluation();
		String[] fac = new String[162];
		fac = mm.gettype() == 1 ? e.getvalue() : d.getvalue();
		int i = 0;

		if(fac[2].equals("Rango Catedratico")) {
			i = 3;
		}

		else if(fac[2].equals("Rango Catedratico Asociado")) {
			i = 2;
		}

		else if(fac[2].equals("Rango Catedratico Auxiliar")) {
			i = 3;
		}

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
		txtrUniversidadInteramericanaDe.setEditable(false);
		txtrUniversidadInteramericanaDe.setFont(new Font("Arial", Font.PLAIN, 9));
		txtrUniversidadInteramericanaDe.setTabSize(20);
		txtrUniversidadInteramericanaDe.setText("                                                \r\n                                                        Universidad Interamericana de Puerto Rico\r\n   "
				+ "                                                                   Recinto de Bayam\u00F3n\r\n\r\n\r\n\r\n                           "
				+ "       VALENCIAS DE LOS SUBCRITERIOS DE EVALUACI\u00D3N DE FACULTAD\r\r\n \r\n\r\nProfesor: ___________________________________           "
				+ "           Departamento: ____________________________\r\n\r\nFecha:____________________________\r\n                 (MM/DD/YY)\r\n\r\n      "
				+ "                                                            "
				+ "   RANGO CATEDR\u00C1TICO \r\n_____________________________________________________________________________________________________________________________________________________\r\n "
				+ "I. Experiencia y Calidad Docente                    | Catedr\u00E1tico Valencia (63%) |   "
				+ " Puntuaci\u00F3n   obtenida\r\n_____________________________________________________________________________________________________________________________________________________\r\n"
				+ "a. ominio de la disciplina que ense\u00F1a.                                                  13                    "+vr.CalidadDocente(i,mm.gettype())[0]+"   "
				+ "   \r\n_______________________________________________________________________________________________________________________"
				+ "______________________________\r\nb. Habilidad para organizar el contenido \r                                                    "
				+ "                       \r\ny presentarlo en forma clara, l\u00F3gica                                                      10      "
				+ "              "+vr.CalidadDocente(i,mm.gettype())[1]+"                            \r\n e imaginativa.                                                                   "
				+ "                                                               \r\n________________________________________________________________"
				+ "_____________________________________________________________________________________\r\r\nc. Conocimiento de los desarrollos "
				+ "actuales de la disciplina.                12                  "+vr.CalidadDocente(i,mm.gettype())[2]+"      \r\n__________________________________________________"
				+ "___________________________________________________________________________________________________\r\r\nd. Habilidad para relac"
				+ "ionar la disciplina con otras esferas de              \r\nconocimiento.                                                         "
				+ "                               6                   "+vr.CalidadDocente(i,mm.gettype())[3]+"                                           \r\n________________________"
				+ "_____________________________________________________________________________________________________________________________\r\r\n"
				+ "e. Habilidad para promover y ampliar el inter\u00E9s del estudiante             \r\nen la disciplina.                              "
				+ "                                                        5                  "+vr.CalidadDocente(i,mm.gettype())[4]+"                                         \r\n___"
				+ "___________________________________________________________________________________________________________________________________"
				+ "_______________\r\r\nf. Habilidad para desarrollar y utilizar m\u00E9todos y estrategias               \r\nadecuadas, incluyendo el"
				+ " \u201Cassessment\u201D para una ense\u00F1anza                 9                 "+vr.CalidadDocente(i,mm.gettype())[5]+"\r\nefectiva.                          "
				+ "                                                       \r\n_________________________________________________________________________"
				+ "____________________________________________________________________________\r\r\ng. Disponibilidad y eficacia en la "
				+ "orientaci\u00F3n acad\u00E9mica del                                             \r\nestudiante.                                     "
				+ "                                                                                         \r\n                                       "
				+ "                                                                       8                   "+vr.CalidadDocente(i,mm.gettype())[6]+"\r\r\nh. Posesi\u00F3n de los atr"
				+ "ibutos de integridad, laboriosidad,                                                                    \r\nliberalidad y objetividad "
				+ "en la ense\u00F1anza.                                                                                           \r\n_________________"
				+ "____________________________________________________________________________________________________________________________________\r\n"
				+ "II. Servicio a la Instituci\u00F3n                                 | Catedr\u00E1tico Valencia (9%)\r|     Puntuaci\u00F3n "
				+ "  obtenida\r\n________________________________________________________________________________________________________________________"
				+ "_____________________________\r\na. Trabajo en comit\u00E9s de facultad a nivel departamental.                   2                   "
				+ "   "+vr.ServicioInstitucion(i,mm.gettype())[0]+"\r\n___________________________________________________________________________________________________________________________"
				+ "__________________________                                                                                                         \r\n"
				+ "b. Participaci\u00F3n y aportaci\u00F3n a reuniones de facultad y de                                             \r\ncomit\u00E9s a "
				+ "nivel de Recinto.                                                                                                                    "
				+ "\r\n                                                                                                          3                       "+vr.ServicioInstitucion(i,mm.gettype())[1]+" "
				+ "\r\nc. Servicio en comit\u00E9s y en organizaciones a nivel                                                             "
				+ " \r\ninstitucional.                                                                                                           "
				+ "                   \r\n______________________________________________________________________________________________________________"
				+ "_______________________________________\r\nd. Colaboraci\u00F3n en actividades estudiantiles.                                         "
				+ "                            \r\n                                                                                                        "
				+ "  2                     "+vr.ServicioInstitucion(i,mm.gettype())[2]+"\r\ne. Asistencia a actos oficiales                                                                   "
				+ "\r\n____________________________________________________________________________________________________________________________________"
				+ "_________________\r\nf. Designaci\u00F3n como director/a de departamento, presidente                                                    "
				+ "              \r\nde comit\u00E9 y otras.\r\n                                                                                           "
				+ "               2                       "+vr.ServicioInstitucion(i,mm.gettype())[3]+"\r\ng. Participaci\u00F3n en organismos de gobierno; tales como: el                            "
				+ "                                       \r\nSenado y el Consejo Universitario.\r\r\n______________________________________________________"
				+ "_______________________________________________________________________________________________\r\nIII. Servicio a la Comunidad           "
				+ "              | Catedr\u00E1tico Valencia (2%)|    Puntuaci\u00F3n obtenida       \r\n____________________________________________________"
				+ "_________________________________________________________________________________________________\r\na. Servicio en el campo profesional "
				+ "del profesor como                                 \r\nconsultor o investigador.                                \r\n                       "
				+ "                                                                                   2                        "+vr.ServicioComunidad(i,mm.gettype())+"\r\nb. Servicio como recurso:"
				+ " conferenciante de grupos de la                            \r\ncomunidad, participaci\u00F3n activa en gestiones pol\u00EDticas,\r\nreligiosa"
				+ "s o c\u00EDvicas.                              \r\n___________________________________________________________________________________________"
				+ "__________________________________________________________\r\nIV. Investigaci\u00F3n y Trabajo Creativo                            "
				+ "| Catedr\u00E1tico Valencia (14%) |   Puntuaci\u00F3n obtenida                       \r\n__________________________________________________"
				+ "___________________________________________________________________________________________________\r\na. Publicaciones                     "
				+ "                                                             5                               "+vr.InvestigacionTrabajo(i,mm.gettype())[0]+" \r\n______________________________________"
				+ "_______________________________________________________________________________________________________________\r\nb. Presentaciones y "
				+ "trabajos creativos relacionados con la                \r\ndisciplina que ense\u00F1a.                                                   "
				+ "                       5                              "+vr.InvestigacionTrabajo(i,mm.gettype())[1]+"  \r\n_________________________________________________________________________"
				+ "____________________________________________________________________________\r\nc. Propuestas dise\u00F1adas y presentadas.               "
				+ "                                                                                                                                           "
				+ "                  \r\nd. Concesi\u00F3n de ayudas para investigaci\u00F3n y proyectos.                    4                                "
				+ " "+vr.InvestigacionTrabajo(i,mm.gettype())[2]+"           \r\ne. Invenciones, patentes, labor art\u00EDstica y actuaci\u00F3n.                                                        "
				+ "          \r\n______________________________________________________________________________________________________________________________"
				+ "_______________________\r\nVI. Crecimiento y Desarrollo Profesional                     | Catedr\u00E1tico Valencia (12%) | Puntuaci\u00F3n "
				+ "obtenida                          \r\n______________________________________________________________________________________________________"
				+ "______________________________________________\r\na. Obtenci\u00F3n de premios, ayudas y becas.\r                                             "
				+ "                    \r\nb. Nombramiento como asesor/a en agencias de gobierno\r                                   \r\nestatal o federal.     "
				+ "                                                                             4                           "+vr.CrecimientoDesarrollo(i,mm.gettype())[0]+" \r\nc. Participaci\u00F3n"
				+ " activa en organizaciones profesionales.                                                              \r\n___________________________________"
				+ "__________________________________________________________________________________________________________________\r\nd. Recurso en conferencia "
				+ "y charlas.                                                    4                               "+vr.CrecimientoDesarrollo(i,mm.gettype())[1]+"\r\n___________________________________________"
				+ "__________________________________________________________________________________________________________\r\ne. Participaci\u00F3n en conferencias,"
				+ " congresos o institutos.                                                                \r\nf. Educaci\u00F3n post doctoral, educaci\u00F3n continua.  "
				+ "                               4                                 "+vr.CrecimientoDesarrollo(i,mm.gettype())[2]+"\r\n____________________________________________________________________________"
				+ "_________________________________________________________________________\r\n\r\n\r\n\r\n____________________________________________________________"
				+ "______________________________________________________\r\n|                      CRITERIOS                                         |                  "
				+ "VALENCIAS                      |               DEL PROFESOR         |\r\n---------------------------------------------------------------------"
				+ "-------------------------------------------------------------------------------------------------------------------------\r\n "
				+ "I. Experiencia y Calidad Docente                                                        63%                           "
				+ " _______________________________                                                  \r\n II. Servicio a la Instituci\u00F3n 11%   "
				+ "                                                        9%\r                              _______________________________       "
				+ "                                           \r\n III. Servicio a la Comunidad 2%                                                  "
				+ "         2%                             _______________________________                                                  "
				+ "\r\nIV. Investigaci\u00F3n y Trabajo Creativo 12%                                             14%                            "
				+ "_______________________________                                                 \r\nV. Crecimiento y Desarrollo Profesional 10%     "
				+ "                                  12%                            _______________________________                                     "
				+ "              \r\n___________________________________________________________________________________________________________________\r\n"
				+ "                                                                                  Evaluaci\u00F3n Promedio Final:"+vr.Total(i,mm.gettype())+" \r\n\r\n\r\n\r\nEl/la profesor/a"
				+ " ________________________________________________ cumple con los criterios requeridos para\r\nel Rango de Catedr\u00E1tico , seg\u00FAn consta en la"
				+ " Parte II, 2.2.4 del Manual de Facultad y cumple con los\r\ncriterios de Experiencia y Calidad Docente, Servicio a la Instituci\u00F3n y Servicio a la"
				+ " Comunidad, seg\u00FAn descritos en\r\nla Parte V, 5.6 y en las Gu\u00EDas para la Evaluaci\u00F3n del Personal Docente, correspondientes al rango que "
				+ "solicita.\r\n\n\r\nEste comit\u00E9 recomienda en forma ____________________ que se le otorgue a el/la ________________________________________ \r\nel "
				+ "ascenso en rango de Catedr\u00E1tico/a Auxiliar a  Catedr\u00E1tico/a Asociado/a.\r\n\r\n\r\n         Miembros del Comit\u00E9 de Evaluaci\u00F3n Sumativa:\r\n "
				+ "                     ___________________________________\r\n\r\n                      ___________________________________ \r\n                          \r\n    "
				+ "                 ___________________________________ \r\n\r\n                                                                                              "
				+ "              _______________________________________\r\n                                                                                                   "
				+ "                 Firma del/a Profesor/a Evaluado/a\r\n\r\n                                                                                                    "
				+ "       _______________________________________\r\n                                                                                                            "
				+ "                         Fecha\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\r\n");


		scrollPane.setViewportView(txtrUniversidadInteramericanaDe);

		JButton button = new JButton("New button");
		button.setBounds(0, 0, 0, 0);


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
		btnNewButton.setBounds(83, 68, 209, 54);
		contentPane.add(btnNewButton);
		contentPane.add(btnNewButton);
		contentPane.add(scrollPane);
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		contentPane.add(scrollPane);
		contentPane.add(button);

		JButton btnImprimirComentarios = new JButton("Imprimir Comentarios");
		btnImprimirComentarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (mm.gettype() == 1 ) 
				{


					Comentarios e;
					try {
						e = new Comentarios();
						e.setVisible(true);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}



				}
				else 
				{
					ComentariosOnline w = new ComentariosOnline();
					w.setVisible(true);

				}
			}
		});
		btnImprimirComentarios.setBounds(83, 157, 209, 54);
		contentPane.add(btnImprimirComentarios);
	}

}