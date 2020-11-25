package systemEvaluation;

import java.io.IOException;

public class ValenciasRubrica{
	ValenciasRango rango; // Determina que rango se usa
	double[] total;

	ValenciasRubrica(int choice) throws IOException{
		switch(choice) {
		case 1:
			auxiliar aux = new auxiliar();
			break;
		case 2:
			asociado aso = new asociado();
			total = aso.CalidadDocente();
			break;
		case 3:
			catedratico cat = new catedratico();
			break;
		}
	}
}

class asociado{
	DataView dv;
	double A,B,C,D; // Factor influencia del Instrumento
	ExternalValues Pa = new ExternalValues();
	ExternalValues Pb = new ExternalValues();
	ExternalValues Pc = new ExternalValues();
	ExternalValues Pd = new ExternalValues();
	ExternalValues Pe = new ExternalValues();
	ExternalValues Pf = new ExternalValues();
	ExternalValues Pg = new ExternalValues();
	ExternalValues Ph = new ExternalValues();
	
	double[] CalidadDocente()  throws IOException{
		dv = new DataView();
		double result[] = new double[8];
		A = 0.25;
		B = 0.25;
		C = 0.25;
		D = 0.25;
		
		int M = dv.ObSums()[0];
		int N = dv.ObSums()[1];
		
		//////////////////Dominio de la disciplina////////////////////
		Pa.I1 = dv.ISum(22,31)/9;
		Pa.I1A = dv.ISum(21,27)/6;
		Pa.I1P = (M/((M + N)*Pa.I1))+(N/((M+N)*Pa.I1A));
		
		Pa.I1 *= Pa.I1P-1;
		Pa.I1A *= Pa.I1P-1;
		Pa.I2 = dv.ISum(46,62);
		Pa.I3 = ((dv.ISum(63,68)/6)*0.75);
		Pa.I3A = ((dv.ISum(63,66)/4)*0.75);
		Pa.I4 = dv.RNum(98)*0.75;
		Pa.puntuacionMaxima = 15;
		
		Pa.puntuacion = ((A*Pa.I1)+(B*Pa.I2)+(C*Pa.I3)+(D*Pa.I4))*(Pa.puntuacionMaxima / 3);
		//////////////////////////////////////////////////////////////
		result[0] = Pa.puntuacion;
		
		//////////Habilidad para organizar el contenido...///////////
		Pb.I1 = (dv.RNum(23)+dv.RNum(27)+dv.RNum(34))/3;
		Pb.I1A = (dv.RNum(23)+dv.RNum(25)+dv.RNum(27)+dv.RNum(28)+dv.RNum(40))/5;
		Pb.I1P = (M/((M + N)*Pb.I1))+(N/((M+N)*Pb.I1A));
		
		Pb.I1 *= Pb.I1P-1;
		Pb.I1A *= Pb.I1P-1;
		Pb.I2 = dv.ISum(46,62);
		Pb.I3 = (dv.ISum(46,62)/5)*0.75;
		Pb.I3A = (dv.ISum(67,76)/10)*0.75;
		Pb.puntuacionMaxima = 10;
		
		Pb.puntuacion = ((A*Pa.I1)+(B*Pa.I2)+(C*Pa.I3)*(Pb.puntuacionMaxima / 3)) / (1-D);
		//////////////////////////////////////////////////////////////
		result[1] = Pb.puntuacion;
		
		////////Conocimiento de los desarrollos actuales...//////////
		Pc.I2 = dv.ISum(46,62);
		Pc.I3 = (dv.ISum(67,68)/2)*0.75;
		Pc.I3A = 0;
		Pc.I4 = dv.RNum(98)*0.75;
		
		Pc.puntuacionMaxima = 10;
		Pc.puntuacion = ((((B*Pc.I2)+(C*Pa.I3)+(D*Pc.I4))*(Pc.puntuacionMaxima / 3))/(1-A));
		//////////////////////////////////////////////////////////////
		result[2] = Pc.puntuacion;
		
		////////Habilidad para relacionar la disciplina...//////////
		Pd.I1 = dv.RNum(31);
		Pd.I1A = dv.RNum(27);
		Pd.I1P = (M / ((M + N)*Pd.I1)) + (N / ((M + N) * Pd.I1A));
		
		Pd.I1 *= Pd.I1P - 1;
		Pd.I1A *= Pd.I1P - 1;
		Pd.I2 = dv.ISum(46,62);
		Pd.I3 = dv.ISum(65,66)*0.75;
		Pd.I3A = (dv.RNum(64)+dv.RNum(65)+dv.RNum(66))*0.75;
		Pd.puntuacionMaxima = 6;
		
		Pd.puntuacion = ((A*Pd.I1*(Pd.puntuacionMaxima / 3))+(B*Pd.I2)*(C*Pd.I3*(Pd.puntuacionMaxima / 3))) / (1-D);
		//////////////////////////////////////////////////////////////
		result[3] = Pd.puntuacion;
		
		//////////Habilidad para promover y ampliar...////////////////
		Pe.I1 = (dv.RNum(21)+dv.RNum(23)+dv.RNum(31)+dv.RNum(33))/4;
		Pe.I1A = (dv.RNum(22)+dv.RNum(25)+dv.RNum(28)+dv.RNum(29))/4;
		Pe.I1P = (M/(M+N)*Pe.I1)+(N/(M+N)*Pe.I1A);
		
		Pe.I1 *= Pe.I1P - 1;
		Pe.I1A *= Pe.I1P - 1;
		Pe.I2 = dv.ISum(46,62);
		Pe.I3 = dv.ISum(74,78)*0.75;
		Pe.I3A = dv.ISum(77,81)*0.75;
		Pe.I4 = dv.RNum(98)*0.75;
		Pe.puntuacionMaxima = 7;
		
		Pe.puntuacion = ((A*Pe.I1)+(B*Pe.I2)+(C*Pe.I3)+(D*Pe.I4))*(Pe.puntuacionMaxima / 3);
		//////////////////////////////////////////////////////////////
		result[4] = Pe.puntuacion;
		
		/////////Habilidad para desarrollar y utilizar.../////////////
		Pf.I1 = (dv.RNum(26)+dv.RNum(30)+dv.RNum(39))/3;
		Pf.I1A = (dv.RNum(28)+dv.RNum(32)+dv.RNum(33)+dv.RNum(38))/4;
		Pf.I1P = (M / ((M + N)*Pd.I1)) + (N / ((M + N) * Pd.I1A));
		
		Pf.I1 *= Pf.I1P - 1;
		Pf.I1A *= Pf.I1P - 1;
		Pf.I2 = dv.ISum(46,62);
		Pf.I3 = dv.ISum(79,82)*0.75;
		Pf.I3A = ((dv.RNum(67)+dv.RNum(69)+dv.RNum(70)+dv.RNum(71)+dv.RNum(75)+dv.ISum(78,81))/9)*0.75;
		Pf.I4 = (dv.RNum(98)+dv.RNum(101)+dv.RNum(102))*0.75;
		Pf.puntuacionMaxima = 9;
		
		Pf.puntuacion = ((A*Pf.I1)+(B*Pf.I2)+(C*Pf.I3)+(D*Pf.I4))*(Pf.puntuacionMaxima / 3);
		//////////////////////////////////////////////////////////////
		result[5] = Pf.puntuacion;
		
		double I1g = (M/(M+N)*Pg.I1)+(N/(M+N)*Pg.I1A);
		double I1h = (M/(M+N)*Ph.I1)+(N/(M+N)*Ph.I1A);
		double I4 = (Pg.I4 + Ph.I4)/2;
		
		//////Disponibilidad y eficacia en la orientacion...//////////
		Pg.I1 = (dv.RNum(41)+dv.RNum(44)+dv.RNum(45)/3);
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Instrumento 1h
		double I1C = (dv.ISum(19,20)/2);
		Ph.I1 = (((I1C-2) < 2 ? 2 : (I1C-2))*4)+(((dv.RNum(29)+dv.ISum(36,38)+dv.RNum(40)+dv.RNum(42))/6)/2);
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		Pg.I1A = (dv.RNum(29)+dv.RNum(30)+dv.RNum(31)+dv.RNum(37)/4);
		Pg.I1P = (Pg.I1 + Ph.I1)/2;
		
		Pg.I1 *= Pg.I1P - 1;
		Pg.I1A *= Pg.I1P - 1;
		Pg.I2 = dv.ISum(46,62);
		Pg.I3 = 0;
		Pg.I3A = dv.RNum(74)*0.75;
		Pg.I4 = dv.ISum(83, 84)*0.75;
		Pg.puntuacionMaxima = 8;
		
		Pg.puntuacion = ((A*I1g)+(B*Pg.I2)+(C*Pg.I3)+(D*I4))*(Pg.puntuacionMaxima / 3);
		//////////////////////////////////////////////////////////////
		result[6] = Pg.puntuacion;
		
		///////Posecion de los atributos de integridad.../////////////
		Ph.I1A = (((I1C-2) < 2 ? 2 : (I1C-2))*4)+(((dv.RNum(31)+dv.RNum(34)+dv.RNum(35)+dv.RNum(36))/4)/2);
		Ph.I1P = (Pg.I1 + Ph.I1)/2;
		
		Ph.I1 *= Ph.I1P - 1;
		Ph.I1A *= Ph.I1P - 1;
		Ph.I2 = dv.ISum(46,62);
		Ph.I3 = dv.RNum(75)*0.75;
		Ph.I3A = (dv.RNum(73)+dv.RNum(74)+dv.RNum(76))*0.75;
		Ph.I4 = ((dv.RNum(85)+dv.RNum(86)+dv.ISum(88,93)+dv.RNum(95)+dv.RNum(96)+dv.RNum(100)+dv.RNum(102))/11)*0.75;
		Ph.puntuacionMaxima = 8;
		
		Ph.puntuacion = ((A*I1h)+(B*Ph.I2)+(C*Ph.I3)+(D*I4))*(Ph.puntuacionMaxima / 3);
		//////////////////////////////////////////////////////////////
		result[7] = Ph.puntuacion;
		
		return result;
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