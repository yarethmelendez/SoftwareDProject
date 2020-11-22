package systemEvaluation;

public class ValenciasRubrica{
	ValenciasRango rango; // Determina que rango se usa

	ValenciasRubrica(int choice){
		switch(choice) {
		case 1:
			auxiliar aux = new auxiliar();
			break;
		case 2:
			asociado aso = new asociado();
			break;
		case 3:
			catedratico cat = new catedratico();
			break;
		}
	}
}

class asociado{
	double A,B,C,D; // Factor influencia del Instrumento
	ExternalValues Pa = new ExternalValues();
	ExternalValues Pb = new ExternalValues();
	ExternalValues Pc = new ExternalValues();
	ExternalValues Pd = new ExternalValues();
	ExternalValues Pe = new ExternalValues();
	ExternalValues Pf = new ExternalValues();
	ExternalValues Pg = new ExternalValues();
	ExternalValues Ph = new ExternalValues();
	
	void CalidadDocente() {
		A = 0.25;
		B = 0.25;
		C = 0.25;
		D = 0.25;
		
		//////////////////Dominio de la disciplina////////////////////
		Pa.I1 = 0;
		Pa.I1A = 0;
		Pa.I2 = 0;
		Pa.I3 = 0;
		Pa.I3A = 0;
		Pa.I4 = 0;
		
		Pa.M = 0;
		Pa.N = 0;
		Pa.puntuacionMaxima = 15;
		Pa.I1P = (Pa.M/((Pa.M + Pa.N)*Pa.I1))+(Pa.N/((Pa.M+Pa.N)*Pa.I1A));
		Pa.puntuacion = ((A*Pa.I1)+(B*Pa.I2)+(C*Pa.I3)+(D*Pa.I4))*(Pa.puntuacionMaxima / 3);
		//////////////////////////////////////////////////////////////
		
		//////////Habilidad para organizar el contenido...///////////
		Pb.I1 = 0;
		Pb.I1A = 0;
		Pb.I2 = 0;
		Pb.I3 = 0;
		Pb.I3A = 0;
		
		Pb.M = 0;
		Pb.N = 0;
		Pb.puntuacionMaxima = 10;
		Pb.I1P = (Pa.M/((Pa.M + Pa.N)*Pa.I1))+(Pa.N/((Pa.M+Pa.N)*Pa.I1A));
		Pb.puntuacion = ((A*Pa.I1)+(B*Pa.I2)+(C*Pa.I3)*(Pb.puntuacionMaxima / 3)) / (1-D);
		//////////////////////////////////////////////////////////////
		
		////////Conocimiento de los desarrollos actuales...//////////
		Pc.I2 = 0;
		Pc.I3 = 0;
		Pc.I3A = 0;
		Pc.I4 = 0;
		
		Pc.puntuacionMaxima = 10;
		Pc.puntuacion = ((((B*Pc.I2)+(C*Pa.I3)+(D*Pc.I4))*(Pc.puntuacionMaxima / 3))/(1-A));
		//////////////////////////////////////////////////////////////
		
		////////Habilidad para relacionar la disciplina...//////////
		Pd.I1 = 0;
		Pd.I1A = 0;
		Pd.I2 = 0;
		Pd.I3 = 0;
		Pd.I3A = 0;
		
		Pd.M = 0;
		Pd.N = 0;
		Pd.puntuacionMaxima = 6;
		Pd.I1P = (Pd.M / ((Pd.M + Pd.N)*Pd.I1)) + (Pd.N / ((Pd.M + Pd.N) * Pd.I1A));
		Pd.puntuacion = ((A*Pd.I1*(Pd.puntuacionMaxima / 3))+(B*Pd.I2)*(C*Pd.I3*(Pd.puntuacionMaxima / 3))) / (1-D);
		//////////////////////////////////////////////////////////////
		
		//////////Habilidad para promover y ampliar...////////////////
		Pe.I1 = 0;
		Pe.I1A = 0;
		Pe.I2 = 0;
		Pe.I3 = 0;
		Pe.I3A = 0;
		Pe.I4 = 0;
		
		Pe.M = 0;
		Pe.N = 0;
		Pe.puntuacionMaxima = 7;
		Pe.I1P = (Pe.M/(Pe.M+Pe.N)*Pe.I1)+(Pe.N/(Pe.M+Pe.N)*Pe.I1A);
		Pe.puntuacion = ((A*Pe.I1)+(B*Pe.I2)+(C*Pe.I3)+(D*Pe.I4))*(Pe.puntuacionMaxima / 3);
		//////////////////////////////////////////////////////////////
		
		/////////Habilidad para desarrollar y utilizar.../////////////
		Pf.I1 = 0;
		Pf.I1A = 0;
		Pf.I2 = 0;
		Pf.I3 = 0;
		Pf.I4 = 0;
		
		Pf.M = 0;
		Pf.N = 0;
		Pf.puntuacionMaxima = 9;
		Pf.I1P = (Pd.M / ((Pd.M + Pd.N)*Pd.I1)) + (Pd.N / ((Pd.M + Pd.N) * Pd.I1A));
		Pf.puntuacion = ((A*Pf.I1)+(B*Pf.I2)+(C*Pf.I3)+(D*Pf.I4))*(Pf.puntuacionMaxima / 3);
		//////////////////////////////////////////////////////////////
		
		double I1g = (Pg.M/(Pg.M+Pg.N)*Pg.I1)+(Pg.N/(Pg.M+Pg.N)*Pg.I1A);
		double I1h = (Ph.M/(Ph.M+Ph.N)*Ph.I1)+(Ph.N/(Pg.M+Ph.N)*Ph.I1A);
		double I4 = (Pg.I4 + Ph.I4)/2;
		
		//////Disponibilidad y eficacia en la orientacion...//////////
		Pg.I1 = 0;
		Pg.I1A = 0;
		Pg.I2 = 0;
		Pg.I3 = 0;
		Pg.I4 = 0;
		
		Pg.M = 0;
		Pg.N = 0;
		Pg.I1P = (Pg.I1 + Ph.I1)/2;
		Pg.puntuacion = ((A*I1g)+(B*Pg.I2)+(C*Pg.I3)+(D*I4))*(Pg.puntuacionMaxima / 3);
		//////////////////////////////////////////////////////////////
		
		///////Posecion de los atributos de integridad.../////////////
		Ph.I1 = 0;
		Ph.I1A = 0;
		Ph.I2 = 0;
		Ph.I3 = 0;
		Ph.I4 = 0;
		
		Ph.M = 0;
		Ph.N = 0;
		Ph.I1P = (Pg.I1 + Ph.I1)/2;
		Ph.puntuacion = ((A*I1h)+(B*Ph.I2)+(C*Ph.I3)+(D*I4))*(Ph.puntuacionMaxima / 3);
		//////////////////////////////////////////////////////////////
	}
}

class auxiliar{
	
}

class catedratico{
	
}

class ExternalValues{
	int M; // Cantidad de evaluaciones I1
	int N; // Cantidad de evaliaciones I1A
	double I1P; // Ecuacion I1
	double I1,I1A,I2,I3,I3A,I4; // Promedio instrumentos
	double puntuacionMaxima;
	double puntuacion;
}