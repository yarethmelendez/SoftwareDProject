package systemEvaluation;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;

public class Results1 extends JFrame {

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

	public Results1() throws IOException {
		
		ValenciasRubrica vr =new ValenciasRubrica();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(550, 20, 770, 1000);

		JButton btnNewButton = new JButton("Print");

		JTextArea txtrUniversidadInteramericanaDe = new JTextArea();
		txtrUniversidadInteramericanaDe.setEditable(false);
		txtrUniversidadInteramericanaDe.setFont(new Font("Arial", Font.PLAIN, 9));
		txtrUniversidadInteramericanaDe.setTabSize(20);
		txtrUniversidadInteramericanaDe.setText("                                                \r\n                                                        Universidad Interamericana de Puerto Rico\r\n                                                                      Recinto de Bayam\u00F3n\r\n\r\n\r\n\r\n                                  VALENCIAS DE LOS SUBCRITERIOS DE EVALUACI\u00D3N DE FACULTAD\r\r\n \r\n\r\nProfesor: ___________________________________                      Departamento: ____________________________\r\n\r\nFecha:__________________________\r\n                     (MM/DD/YY)\r\n                                                                     RANGO CATEDR\u00C1TICO ASOCIADO\r\n_____________________________________________________________________________________________________________________________________________________\r\n I. Experiencia y Calidad Docente                        | Catedr\u00E1tico Asociado Valencia (65%) |    Puntuaci\u00F3n   obtenida\r\n_____________________________________________________________________________________________________________________________________________________\r\na. ominio de la disciplina que ense\u00F1a.                                                    15                                   0.0    \r\n_____________________________________________________________________________________________________________________________________________________\r\nb. Habilidad para organizar el contenido \r                                                                                 \r\ny presentarlo en forma clara, l\u00F3gica                                                       10                                    0.0                 \r\n e imaginativa.                                                                                                                                  \r\n_____________________________________________________________________________________________________________________________________________________\r\r\nc. Conocimiento de los desarrollos actuales de la disciplina.                 10                                    0.0 \r\n_____________________________________________________________________________________________________________________________________________________\r\r\nd. Habilidad para relacionar la disciplina con otras esferas de             \r\nconocimiento.                                                                                          6                                      0.0                                           \r\n_____________________________________________________________________________________________________________________________________________________\r\r\ne. Habilidad para promover y ampliar el inter\u00E9s del estudiante            \r\nen la disciplina.                                                                                        7                                     0.0                                         \r\n_____________________________________________________________________________________________________________________________________________________\r\r\n. Habilidad para desarrollar y utilizar m\u00E9todos y estrategias                 \r\nadecuadas, incluyendo el \u201Cassessment\u201D para una ense\u00F1anza                  9                                   0.0\r\nefectiva.                                                                                 \r\n_____________________________________________________________________________________________________________________________________________________\r\r\ng. Disponibilidad y eficacia en la orientaci\u00F3n acad\u00E9mica del                                       \r\nestudiante.                                                                                                                              \r\n                                                                                                                8                                      0.0\r\r\nh. Posesi\u00F3n de los atributos de integridad, laboriosidad,                                                                    \r\nliberalidad y objetividad en la ense\u00F1anza.                                                                                           \r\n_____________________________________________________________________________________________________________________________________________________\r\nII. Servicio a la Instituci\u00F3n                             | Catedr\u00E1tico Asociado Valencia (11%)\r|     Puntuaci\u00F3n obtenida\r\n_____________________________________________________________________________________________________________________________________________________\r\na. Trabajo en comit\u00E9s de facultad a nivel departamental.                      3                                      0.0 \r\n_____________________________________________________________________________________________________________________________________________________                                                                                                         \r\nb. Participaci\u00F3n y aportaci\u00F3n a reuniones de facultad y de                                             \r\ncomit\u00E9s a nivel de Recinto.                                                                                                                     \r\n                                                                                                             3                                      0.0\r\nc. Servicio en comit\u00E9s y en organizaciones a nivel                                                              \r\ninstitucional.                                                                                                                              \r\n_____________________________________________________________________________________________________________________________________________________\r\nd. Colaboraci\u00F3n en actividades estudiantiles.                                                                     \r\n                                                                                                          2                                          0.0 \r\ne. Asistencia a actos oficiales                                                                   \r\n_____________________________________________________________________________________________________________________________________________________\r\nf. Designaci\u00F3n como director/a de departamento, presidente                                                                  \r\nde comit\u00E9 y otras.\r\n                                                                                                          3                                          0.0 \r\ng. Participaci\u00F3n en organismos de gobierno; tales como: el                                                                   \r\nSenado y el Consejo Universitario.\r\r\n_____________________________________________________________________________________________________________________________________________________\r\nIII. Servicio a la Comunidad                               | Catedr\u00E1tico Asociado Valencia (2%) |    Puntuaci\u00F3n obtenida       \r\n_____________________________________________________________________________________________________________________________________________________\r\na. Servicio en el campo profesional del profesor como                                 \r\nconsultor o investigador.                                \r\n                                                                                                          2                                          0.0 \r\nb. Servicio como recurso: conferenciante de grupos de la                            \r\ncomunidad, participaci\u00F3n activa en gestiones pol\u00EDticas,\r\nreligiosas o c\u00EDvicas.                              \r\n_____________________________________________________________________________________________________________________________________________________\r\nIV. Investigaci\u00F3n y Trabajo Creativo                     | Catedr\u00E1tico Asociado Valencia (12%) |   Puntuaci\u00F3n obtenida                       \r\n_____________________________________________________________________________________________________________________________________________________\r\na. Publicaciones                                                                                   3                                         0.0 \r\n_____________________________________________________________________________________________________________________________________________________\r\nb. Presentaciones y trabajos creativos relacionados con la                  \r\ndisciplina que ense\u00F1a.                                                                         4                                         0.0\r\n_____________________________________________________________________________________________________________________________________________________\r\nc. Propuestas dise\u00F1adas y presentadas.                                                                                                                                                                            \r\nd. Concesi\u00F3n de ayudas para investigaci\u00F3n y proyectos.                   5                                          0.0 \r\ne. Invenciones, patentes, labor art\u00EDstica y actuaci\u00F3n.                                                                  \r\n_____________________________________________________________________________________________________________________________________________________\r\nVI. Crecimiento y Desarrollo Profesional           | Catedr\u00E1tico Asociado Valencia (10%) |   Puntuaci\u00F3n obtenida                          \r\n_____________________________________________________________________________________________________________________________________________________\r\na. Obtenci\u00F3n de premios, ayudas y becas.\r                                                                 \r\nb. Nombramiento como asesor/a en agencias de gobierno\r                                   \r\nestatal o federal.                                                                                  4                                        0.0 \r\nc. Participaci\u00F3n activa en organizaciones profesionales.                                                              \r\n_____________________________________________________________________________________________________________________________________________________\r\nd. Recurso en conferencia y charlas.                                                    3                                       0.0 \r\n_____________________________________________________________________________________________________________________________________________________\r\ne. Participaci\u00F3n en conferencias, congresos o institutos.                                                                \r\nf. Educaci\u00F3n post doctoral, educaci\u00F3n continua.                                 3                                       0.0 \r\n_____________________________________________________________________________________________________________________________________________________\r\n\r\n\r\n\r\n__________________________________________________________________________________________________________________\r\n               CRITERIOS                                         |                  VALENCIAS                      |          DEL PROFESOR         |\r\n__________________________________________________________________________________________________________________\r\nI. Experiencia y Calidad Docente                                                      65%                           _________________________                                           \r\nII. Servicio a la Instituci\u00F3n 11%                                                        11%\r                           _________________________                                              \r\nIII. Servicio a la Comunidad 2%                                                        2%                            _________________________                                             \r\nIV. Investigaci\u00F3n y Trabajo Creativo 12%                                         12%                           _________________________                                           \r\nV. Crecimiento y Desarrollo Profesional 10%                                   10%                           _________________________                                               \r\n___________________________________________________________________________________________________________________\r\n                                                                         Evaluaci\u00F3n Promedio Final: 0.0  \r\n\r\n\r\n\r\nEl/la profesor/a ________________________________________________ cumple con los criterios requeridos para\r\nel Rango de Catedr\u00E1tico Asociado, seg\u00FAn consta en la Parte II, 2.2.3 del Manual de Facultad y cumple con los\r\ncriterios de Experiencia y Calidad Docente, Servicio a la Instituci\u00F3n y Servicio a la Comunidad, seg\u00FAn descritos en\r\nla Parte V, 5.6 y en las Gu\u00EDas para la Evaluaci\u00F3n del Personal Docente, correspondientes al rango que solicita.\r\n\n\r\nEste comit\u00E9 recomienda en forma ____________________ que se le otorgue a el/la ________________________________________ \r\nel ascenso en rango de Catedr\u00E1tico/a Auxiliar a  Catedr\u00E1tico/a Asociado/a.\r\n\r\n\r\n       Miembros del Comit\u00E9 de Evaluaci\u00F3n Sumativa:\r\n            ___________________________________\r\n\r\n            ___________________________________ \r\n                          \r\n            ___________________________________ \r\n\r\n                                                                                                           _______________________________________\r\n                                                                                                                 Firma del/a Profesor/a Evaluado/a\r\n\r\n                                                                                                           _______________________________________\r\n                                                                                                                                     Fecha\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\r\n");
		scrollPane.setViewportView(txtrUniversidadInteramericanaDe);
		
		
		
		

		JButton btnNewButton8 = new JButton("Print");
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