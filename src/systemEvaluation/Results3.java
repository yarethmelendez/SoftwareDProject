package systemEvaluation;


import java.awt.Button;
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

public class Results3 extends JFrame {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Results3 frame = new Results3();
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
	
	public Results3() throws IOException {
		
		
			
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

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(550, 20, 770, 1000);
		ValenciasRubrica vr =new ValenciasRubrica();
		JButton btnNewButton = new JButton("Print");

		JTextArea txtrUniversidadInteramericanaDe = new JTextArea();
		txtrUniversidadInteramericanaDe.setEditable(false);
		txtrUniversidadInteramericanaDe.setFont(new Font("Arial", Font.PLAIN, 9));
		txtrUniversidadInteramericanaDe.setTabSize(20);
		txtrUniversidadInteramericanaDe.setText("                                                \r\n                                       "
				+ "                 Universidad Interamericana de Puerto Rico\r\n                                           "
				+ "                           Recinto de Bayam\u00F3n\r\n\r\n\r\n\r\n                                  "
				+ "VALENCIAS DE LOS SUBCRITERIOS DE EVALUACI\u00D3N DE FACULTAD\r\r\n \r\n\r\nProfesor: _______________"
				+ "____________________                      Departamento: ____________________________\r\n\r\nFecha:\r\n\r\n  "
				+ "                                                                   RANGO CATEDR\u00C1TICO AUXILIAR\r\r\n____"
				+ "_____________________________________________________________________________________________________________"
				+ "____________________________________\r\n I. Experiencia y Calidad Docente                    | Catedr\u00E1ti"
				+ "co Auxiliar Valencia (67%) |    Puntuaci\u00F3n   obtenida\r\n_________________________________________________"
				+ "____________________________________________________________________________________________________\r\na. omini"
				+ "o de la disciplina que ense\u00F1a.                                                 16                          "
				+ "  "+vr.CalidadDocente(i,mm.gettype())[0]+" \r\n______________________________________________________________________________________________________"
				+ "_______________________________________________\r\nb. Habilidad para organizar el contenido \r                   "
				+ "                                                        \r\ny presentarlo en forma clara, l\u00F3gica            "
				+ "                                           12                      "+vr.CalidadDocente(i,mm.gettype())[1]+"                        \r\n e imaginat"
				+ "iva.                                                                                                              "
				+ "                    \r\n__________________________________________________________________________________________"
				+ "___________________________________________________________\r\r\nc. Conocimiento de los desarrollos actuales de la "
				+ "disciplina.                 8                          "+vr.CalidadDocente(i,mm.gettype())[2]+"\r\n_________________________________________________"
				+ "____________________________________________________________________________________________________\r\r\nd. Habili"
				+ "dad para relacionar la disciplina con otras esferas de               6                          \r\nconocimiento.  "
				+ "                                                                                                                   "
				+ "   "+vr.CalidadDocente(i,mm.gettype())[3]+"        \r\n__________________________________________________________________________________________________"
				+ "___________________________________________________\r\r\ne. Habilidad para promover y ampliar el inter\u00E9s del es"
				+ "tudiante             6                           \r\nen la disciplina.                                               "
				+ "                                                                        "+vr.CalidadDocente(i,mm.gettype())[4]+"    \r\n___________________________________"
				+ "__________________________________________________________________________________________________________________\r\r\n"
				+ "f. Habilidad para desarrollar y utilizar m\u00E9todos y estrategias                9                               "
				+ ""+vr.CalidadDocente(i,mm.gettype())[5]+"\r\nadecuadas, incluyendo el \u201Cassessment\u201D para una ense\u00F1anza       \r\nefectiva.                   "
				+ "                                                              \r\n__________________________________________________"
				+ "___________________________________________________________________________________________________\r\r\ng. Disponibi"
				+ "lidad y eficacia en la orientaci\u00F3n acad\u00E9mica del                                             \r\nestudiante."
				+ "                                                                                                                      "
				+ "      \r\n                                                                                                            "
				+ "  10                             "+vr.CalidadDocente(i,mm.gettype())[6]+"\r\r\nh. Posesi\u00F3n de los atributos de integridad, laboriosidad,              "
				+ "                                                      \r\nliberalidad y objetividad en la ense\u00F1anza.              "
				+ "                                                                             \r\n______________________________________"
				+ "_______________________________________________________________________________________________________________\r\nII. "
				+ "Servicio a la Instituci\u00F3n                             | Catedr\u00E1tico Auxiliar Valencia (12%)\r|     Puntuaci\u00F3n"
				+ "   obtenida\r\n______________________________________________________________________________________________________________"
				+ "_______________________________________\r\na. Trabajo en comit\u00E9s de facultad a nivel departamental.                   3 "
				+ "                                "+vr.ServicioInstitucion(i,mm.gettype())[0]+"\r\n________________________________________________________________________________________"
				
				+ "_____________________________________________________________                                                                      "
				+ "                                   \r\nb. Participaci\u00F3n y aportaci\u00F3n a reuniones de facultad y de                       "
				+ "                      \r\ncomit\u00E9s a nivel de Recinto.                                                                     "
				+ "                                               \r\n                                                                            "
				+ "                              4                            " +vr.ServicioInstitucion(i,mm.gettype())[1]+"\r\nc. Servicio en comit\u00E9s y en organizaciones a nivel "
				+ "                                                             \r\ninstitucional.                                                   "
				+ "                                                                           \r\n_________________________________________________"
				+ "____________________________________________________________________________________________________\r\nd. Colaboraci\u00F3n en "
				+ "actividades estudiantiles.                                                                     \r\n                              "
				+ "                                                                            2                     "+vr.ServicioInstitucion(i,mm.gettype())[2]+"\r\ne. Asisten"
				+ "cia a actos oficiales                                                                   \r\n____________________________________"
				+ "_________________________________________________________________________________________________________________\r\nf. Designac"
				+ "i\u00F3n como director/a de departamento, presidente                                                                  \r\nde "
				+ "comit\u00E9 y otras.\r\n                                                                                                     "
				+ "     3                                   "+vr.ServicioInstitucion(i,mm.gettype())[3]+"\r\ng. Participaci\u00F3n en organismos de gobierno; tales como: el             "
				+ "                                                      \r\nSenado y el Consejo Universitario.\r\r\n____________________________"
				+ "_________________________________________________________________________________________________________________________\r\n"
				+ "III. Servicio a la Comunidad                        |    Catedr\u00E1tico Auxiliar Valencia (2%)   | Puntuaci\u00F3n obtenida "
				+ "      \r\n____________________________________________________________________________________________________________________"
				+ "_________________________________\r\na. Servicio en el campo profesional del profesor como                                "
				+ " \r\nconsultor o investigador.                                \r\n                                                          "
				+ "                                                2                                    "+vr.ServicioComunidad(i,mm.gettype())+"\r\nb. Servicio como recurso: "
				+ "conferenciante de grupos de la                            \r\ncomunidad, participaci\u00F3n activa en gestiones pol\u00ED"
				+ "ticas,\r\nreligiosas o c\u00EDvicas.                              \r\n_____________________________________________________"
				+ "________________________________________________________________________________________________\r\nIV. Investigaci\u00F3n y"
				+ " Trabajo Creativo             |     Catedr\u00E1tico Auxiliar Valencia (10%)  | Puntuaci\u00F3n obtenida                     "
				+ "  \r\n_______________________________________________________________________________________________________________________"
				+ "______________________________\r\na. Publicaciones                                                                             "
				+ "      2                                "+vr.InvestigacionTrabajo(i,mm.gettype())[0]+"r\n______________________________________________________________________________"
				+ "_______________________________________________________________________\r\nb. Presentaciones y trabajos creativos relacionados "
				+ "con la                 4                           "+vr.InvestigacionTrabajo(i,mm.gettype())[1]+"r\ndisciplina que ense\u00F1a.                     \r\n________"
				+ "_______________________________________________________________________________________________________________________________"
				+ "_____________\r\nc. Propuestas dise\u00F1adas y presentadas.                                                                    "
				+ "                                                                                                         \r\nd. Concesi\u00F3n de "
				+ "ayudas para investigaci\u00F3n y proyectos.                    4                                "+vr.InvestigacionTrabajo(i,mm.gettype())[2]+"        "
				+ "\r\ne. Invenciones, patentes, labor art\u00EDstica y actuaci\u00F3n.                                                 "
				+ "                 \r\n_________________________________________________________________________________________________"
				+ "____________________________________________________\r\nVI. Crecimiento y Desarrollo Profesional       |    "
				+ "Catedr\u00E1tico Auxiliar Valencia  (9%) |  Puntuaci\u00F3n obtenida                          \r\n______________"
				+ "_________________________________________________________________________________________________________________"
				+ "______________________\r\na. Obtenci\u00F3n de premios, ayudas y becas.\r                                      "
				+ "                           \r\nb. Nombramiento como asesor/a en agencias de gobierno\r                          "
				+ "          \r\nestatal o federal.                                                                                 "
				+ " 3                                "+vr.CrecimientoDesarrollo(i,mm.gettype())[0]+" \r\nc. Participaci\u00F3n activa en organizaciones profesionales.         "
				+ "                                                     \r\n__________________________________________________________"
				+ "___________________________________________________________________________________________\r\nd. Recurso en conferencia"
				+ " y charlas.                                                    3                              "+vr.CrecimientoDesarrollo(i,mm.gettype())[1]+"\r\n______________"
				+ "_________________________________________________________________________________________________________________________"
				+ "______________\r\ne. Participaci\u00F3n en conferencias, congresos o institutos.                                          "
				+ "                      \r\nf. Educaci\u00F3n post doctoral, educaci\u00F3n continua.                                 3     "
				+ "                              "+vr.CrecimientoDesarrollo(i,mm.gettype())[2]+"\r\n_____________________________________________________________________________________"
				+ "________________________________________________________________\r\n\r\n\r\n______________________________________________"
				+ "____________________________________________________________________\r\n|                      CRITERIOS                 "
				+ "                        |                  VALENCIAS                      |      DEL PROFESOR   |\r\n_____________________"
				+ "_____________________________________________________________________________________________                         \r\n"
				+ "I. Experiencia y Calidad Docente                                                    67%                                  "
				+ "_______________________                                           \r\nII. Servicio a la Instituci\u00F3n                  "
				+ "                                            12%\r                                  _______________________                "
				+ "                              \r\nIII. Servicio a la Comunidad                                                            "
				+ "2%                                   _______________________                                                \r\nIV. Invest"
				+ "igaci\u00F3n y Trabajo Creativo                                               10%                                  ________"
				+ "_______________                                              \r\nV. Crecimiento y Desarrollo Profesional                   "
				+ "                       9%                                   _______________________                                      "
				+ "          \r\n___________________________________________________________________________________________________________"
				+ "________\r\n                                                                                  "
				+ "Evaluaci\u00F3n Promedio Final:  "+vr.Total(i,mm.gettype())+" \r\n\r\n\r\n\r\nEl/la profesor/a ________________________________________________ "
				+ "cumple con los criterios requeridos para\r\nRango de Catedr\u00E1tico Auxiliar, seg\u00FAn consta en la Parte II, 2.2.2"
				+ " del Manual de Facultad y cumple con los\r\ncriterios de Experiencia y Calidad Docente, Servicio a la Instituci\u00F3n "
				+ "y Servicio a la Comunidad, seg\u00FAn descritos en\r\nla Parte V, 5.6 y en las Gu\u00EDas para la Evaluaci\u00F3n del "
				+ "Personal Docente, correspondientes al rango que solicita.\r\n\n\r\nEste comit\u00E9 recomienda en forma _______________"
				+ "_____ que se le otorgue a el/la ________________________________________ \r\nel ascenso en rango de Instructor/a a Cated"
				+ "r\u00E1tico/a Auxiliar.\r\n\r\n\r\n               Miembros del Comit\u00E9 de Evaluaci\u00F3n Sumativa:\r\n             "
				+ "      ___________________________________\r\n\r\n                   ___________________________________ \r\n        "
				+ "                 \r\n                   ___________________________________ \r\n\r\n                                "
				+ "                                                                                       ______________________________"
				+ "_________\r\n                                                                                                         "
				+ "                   Firma del/a Profesor/a Evaluado/a\r\n\r\n                                                           "
				+ "                                                               _______________________________________\r\n             "
				+ "                                                                                                                   "
				+ "                Fecha\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\r\n");
		
		
		scrollPane.setViewportView(txtrUniversidadInteramericanaDe);
		
		

		
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
		btnNewButton.setBounds(87, 63, 203, 54);
		contentPane.add(btnNewButton);
		contentPane.add(btnNewButton);
		contentPane.add(scrollPane);
		
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
		btnImprimirComentarios.setBounds(87, 156, 203, 54);
		contentPane.add(btnImprimirComentarios);
		
	}
}