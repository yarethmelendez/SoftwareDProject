package systemEvaluation;

import java.io.IOException;

public class ValenciasRubrica{
	ValenciasRango rango; // Determina que rango se usa
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
	
	ValenciasRubrica(){
	}
	
	double[] CalidadDocente(int choice)  throws IOException{
		rango = new ValenciasRango(choice);
		dv = new DataView();
		double result[] = new double[7];
		A = 0.25;
		B = 0.25;
		C = 0.25;
		D = 0.25;
		
		int M = dv.ObSums()[0];
		int N = dv.ObSums()[1];
		
		//////////////////Dominio de la disciplina////////////////////
		Pa.I1 = dv.ISum(22,31) - 1;
		Pa.I1A = dv.ISum(21,27) - 1;
		
		//Pa.I1P = (M/((M + N)*(Pa.I1)))+(N/((M+N)*(Pa.I1A)));
		//Pa.I1 *= Pa.I1P;
		//Pa.I1A *= Pa.I1P;
		
		Pa.I2 = dv.RNum(46);
		Pa.I3 = (dv.ISum(63,68)-1)*0.75;
		Pa.I3 = Pa.I3 < 3 && Pa.I3 > 2 ? 3 : Pa.I3; // Change this
		Pa.I3A = (dv.ISum(63,66)-1)*0.75;
		Pa.I4 = dv.RNum(98)*0.75;
		
		Pa.puntuacion = ((A*Pa.I1)+(B*Pa.I2)+(C*Pa.I3)+(D*Pa.I4))*(rango.valen1A / 3);
		result[0] = Pa.puntuacion;
		//////////////////////////////////////////////////////////////
		
		//////////Habilidad para organizar el contenido...///////////
		Pb.I1 = ((dv.ISum(23,27)+dv.RNum(27)+dv.RNum(34)+dv.RNum(35))/4) - 1;
		Pb.I1A = (dv.RNum(23)+dv.RNum(25)+dv.RNum(27)+dv.RNum(28)+dv.RNum(40))/5;
		Pb.I1P = (M/((M + N))*Pb.I1)+(N/((M+N))*Pb.I1A);
		
		//Pb.I1 *= Pb.I1P;
		//Pb.I1A *= Pb.I1P-1;
		Pb.I2 = dv.RNum(47);
		Pb.I3 = dv.ISum(69,73)*0.75;
		Pb.I3 = Pb.I3 > 3 ? 4 : Pc.I3; // Change this
		Pb.I3A = dv.ISum(67,76)*0.75;
		
		Pb.puntuacion = (((A*Pb.I1)+(B*Pb.I2)+(C*Pb.I3))*(rango.valen1B / 3)) / (1-D);
		result[1] = Pb.puntuacion;
		//////////////////////////////////////////////////////////////
		
		////////Conocimiento de los desarrollos actuales...//////////
		Pc.I2 = dv.RNum(48);
		Pc.I3 = ((dv.RNum(67)+dv.RNum(68))/2)*0.75;
		Pc.I3 = Pc.I3 > 3 ? 4 : Pc.I3; // Change this
		Pc.I3A = 0;
		Pc.I4 = dv.RNum(98)*0.75;
		
		Pc.puntuacion = (((B*Pc.I2)+(C*Pc.I3)+(D*Pc.I4))*(rango.valen1C / 3))/(1-A);
		result[2] = Pc.puntuacion;
		//////////////////////////////////////////////////////////////
		
		////////Habilidad para relacionar la disciplina...//////////
		Pd.I1 = dv.RNum(31) - 1;
		Pd.I1A = dv.RNum(27) - 1;
		Pd.I1P = (M / ((M + N)*Pd.I1)) + (N / ((M + N) * Pd.I1A));
		
		//Pd.I1 *= Pd.I1P - 1;
		//Pd.I1A *= Pd.I1P - 1;
		Pd.I2 = dv.RNum(49);
		Pd.I3 = (dv.RNum(65)+dv.RNum(66));
		Pd.I3A = (dv.RNum(64)+dv.RNum(65)+dv.RNum(66))*0.75;
		
		Pd.puntuacion = ((A*Pd.I1*(rango.valen1D / 3))+(B*Pd.I2)*(C*Pd.I3*(rango.valen1D / 3))) / (1-D);
		result[3] = Pd.puntuacion;
		//////////////////////////////////////////////////////////////
		
		//////////Habilidad para promover y ampliar...////////////////
		Pe.I1 = ((dv.RNum(21)+dv.RNum(23)+dv.RNum(31)+dv.RNum(33))/4)-1;
		Pe.I1A = ((dv.RNum(22)+dv.RNum(25)+dv.RNum(28)+dv.RNum(29))/4)-1;
		Pe.I1P = (M/(M+N)*Pe.I1)+(N/(M+N)*Pe.I1A);
		
		//Pe.I1 *= Pe.I1P - 1;
		//Pe.I1A *= Pe.I1P - 1;
		Pe.I2 = dv.RNum(50);
		Pe.I3 = dv.ISum(74,78);
		Pe.I3A = dv.ISum(77,81);
		Pe.I4 = dv.RNum(98);
		
		Pe.puntuacion = ((A*Pe.I1)+(B*Pe.I2)+(C*Pe.I3)+(D*Pe.I4))*(rango.valen1E / 3);
		result[4] = Pe.puntuacion;
		//////////////////////////////////////////////////////////////
		
		/////////Habilidad para desarrollar y utilizar.../////////////
		Pf.I1 = ((dv.ISum(26,30)+dv.RNum(39))/2) - 1;
		Pf.I1A = ((dv.RNum(28)+dv.RNum(32)+dv.RNum(33)+dv.RNum(38))/4) - 1;
		Pf.I1P = (M / ((M + N)*Pd.I1)) + (N / ((M + N) * Pd.I1A));
		
		//Pf.I1 *= Pf.I1P - 1;
		//Pf.I1A *= Pf.I1P - 1;
		Pf.I2 = dv.RNum(51);
		Pf.I3 = dv.ISum(79,82)*0.75;
		Pf.I3A = (dv.RNum(67)+dv.RNum(69)+dv.RNum(70)+dv.RNum(71)+dv.RNum(75)+dv.ISum(78,81))*0.75;
		Pf.I4 = ((dv.RNum(98)+dv.RNum(101)+dv.RNum(102))/3)*0.75;
		
		Pf.puntuacion = ((A*Pf.I1)+(B*Pf.I2)+(C*Pf.I3)+(D*Pf.I4))*(rango.valen1F / 3);
		result[5] = Pf.puntuacion;
		//////////////////////////////////////////////////////////////
		
		//double I1g = (M/(M+N)*Pg.I1)+(N/(M+N)*Pg.I1A);
		//double I1h = (M/(M+N)*Ph.I1)+(N/(M+N)*Ph.I1A);
		
		//////Disponibilidad y eficacia en la orientacion...//////////
		Pg.I1 = ((dv.RNum(41)+dv.RNum(44)+dv.RNum(45))/3)-1;
		Pg.I1A = ((dv.RNum(29)+dv.RNum(30)+dv.RNum(31)+dv.RNum(37))/4)-1;
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Instrumento 1h
		double I1C = (dv.RNum(19)+dv.RNum(20))/2;
		Ph.I1 = (((I1C-2) < 2 ? 2 : (I1C-2))*4)+(((dv.RNum(29)+dv.ISum(36,38)+dv.RNum(40)+dv.RNum(42))/4)/2) - 1;
		Ph.I1A = (((I1C-2) < 2 ? 2 : (I1C-2))*4)+(((dv.RNum(31)+dv.RNum(34)+dv.RNum(35)+dv.RNum(36))/4)/2) - 1;
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		Pg.I1P = (Pg.I1 + Ph.I1)/2;
		
		//Pg.I1 *= Pg.I1P - 1;
		//Pg.I1A *= Pg.I1P - 1;
		Pg.I3 = 0;
		Pg.I3A = dv.RNum(74)*0.75;
		Pg.I4 = ((dv.RNum(83)+dv.RNum(84))/2)*0.75;
		//////////////////////////////////////////////////////////////
		
		///////Posecion de los atributos de integridad.../////////////
		//Ph.I1P = (Pg.I1 + Ph.I1)/2;
		//Ph.I1 *= Ph.I1P - 1;
		//Ph.I1A *= Ph.I1P - 1;
		
		Ph.I2 = dv.RNum(52);
		Ph.I3 = dv.RNum(75)*0.75;
		Ph.I3A = ((dv.RNum(73)+dv.RNum(74)+dv.RNum(76))/3)*0.75;
		Ph.I4 = ((dv.RNum(85)+dv.RNum(86)+dv.ISum(88,93)+dv.RNum(95)+dv.RNum(96)+dv.RNum(100)+dv.RNum(102))/7);
		double I4 = (Pg.I4 + Ph.I4)/2;
		double I1 = (Ph.I1 + Pg.I1)/2;
		
		System.out.println(Pg.I1);
		System.out.println(Ph.I1);
		System.out.println(I1);
		
		Ph.puntuacion = ((A*I1)+(B*Ph.I2)+(C*Ph.I3)+(D*I4))*(rango.valen1GH / 3);
		result[6] = Ph.puntuacion;
		System.out.println(result[6]);
		//////////////////////////////////////////////////////////////
		
		return result;
	}
	
	double[] ServicioInstitucion(int choice) throws IOException {
		rango = new ValenciasRango(choice);
		dv = new DataView();
		double result[] = new double[4];
		B = 0.8; // Autoevaluacion narrativa
		D = 0.2; // Evaluacion del director
		int M = dv.ObSums()[0];
		int N = dv.ObSums()[1];
		
		//////////Trabajo en comites de facultad...//////////////////
		Pa.I2 = dv.RNum(53);
		Pa.I4 = (dv.RNum(92) + dv.RNum(100)) * 0.75;
		
		Pa.puntuacion = (((B*Pa.I2)+(D*Pa.I4))/2)*(rango.valen2A/3);
		result[0] = Pa.puntuacion;
		////////////////////////////////////////////////////////////
		
		///////////Participacion y aportacion a reuniones...////////
		/////////Servicio en comites y en organizaciones.../////////
		
		Pb.I2 = dv.RNum(54);
		Pb.I4 = ((dv.RNum(87)+dv.RNum(88)+dv.RNum(93))/3)*0.75;
		
		Pc.I2 = dv.RNum(54);
		Pc.I4 = dv.RNum(92) * 0.75;
		
		Pc.I4 = (Pb.I4 + Pc.I4) / 2;
		
		Pc.puntuacion = ((B*Pc.I2)+(D*Pc.I4))*(rango.valen2BC/3);
		result[1] = Pc.puntuacion;
		////////////////////////////////////////////////////////////
		
		////////////Colaboracion en organizaciones...///////////////
		///////////Asistencia a actos oficiales/////////////////////
		Pd.I2 = dv.RNum(55);
		Pe.I2 = dv.RNum(55);
		Pe.I4 = dv.RNum(93)*0.75;
		
		Pe.puntuacion = ((B*Pe.I2)+(D*Pe.I4))*(rango.valen2DE/3);
		result[2] = Pe.puntuacion;
		////////////////////////////////////////////////////////////
		
		////////////Designacion como director/a...//////////////////
		////////Participacion en organismos de gobierno...//////////
		Pf.I2 = dv.RNum(56);
		Pg.I2 = dv.RNum(56);
		
		Pg.puntuacion = Pg.I2*(rango.valen2FG/3);
		result[3] = Pg.puntuacion;
		////////////////////////////////////////////////////////////
		
		return result;
	}
	
	double ServicioComunidad(int choice) throws IOException {
		rango = new ValenciasRango(choice);
		dv = new DataView();
		double result;
		B = 1.0; // Autoevaluacion narrativa
		int M = dv.ObSums()[0];
		int N = dv.ObSums()[1];
		
		Pa.I2 = dv.RNum(57);
		Pb.puntuacion = (B*Pa.I2)*(rango.valen3AB/3);
		result = Pb.puntuacion;
		
		return result;
	}
	
	double[] InvestigacionTrabajo(int choice) throws IOException {
		rango = new ValenciasRango(choice);
		dv = new DataView();
		double result[] = new double[3];
		B = 0.9; // Autoevaluacion narrativa
		D = 0.1; //Evaluacion del director
		int M = dv.ObSums()[0];
		int N = dv.ObSums()[1];
		
		Pa.I2 = dv.RNum(58);
		Pb.I2 = dv.RNum(59);
		Pc.I2 = dv.RNum(60);
		Pb.I4 = dv.RNum(98)*0.75;
		
		Pa.puntuacion = Pa.I2*(rango.valen4A/3);
		result[0] = Pa.puntuacion;
		
		Pb.puntuacion = ((B*Pb.I2)+(D*Pb.I4))*(rango.valen4B/3);
		result[1] = Pb.puntuacion;
		
		Pe.puntuacion = Pc.I2*(rango.valen4CDE/3);
		result[2] = Pe.puntuacion;
		
		return result;
	}
	
	double[] CrecimientoDesarrollo(int choice) throws IOException {
		rango = new ValenciasRango(choice);
		dv = new DataView();
		double result[] = new double[3];
		B = 0.9; // Autoevaluacion narrativa
		D = 0.1; //Evaluacion del director
		int M = dv.ObSums()[0];
		int N = dv.ObSums()[1];
		
		Pa.I2 = dv.RNum(61);
		Pd.I2 = dv.RNum(62);
		Pe.I2 = dv.RNum(62); // WARNING !!
		Pf.I4 = dv.RNum(94)*0.75;
		
		Pa.puntuacion = Pa.I2*(rango.valen5ABC/3);
		result[0] = Pa.puntuacion;
		
		Pd.puntuacion = Pd.I2*(rango.valen5D/3);
		result[1] = Pd.puntuacion;
		Pe.puntuacion = ((B*Pe.I2)+(D*Pf.I4))+(rango.valen5EF/3);
		Pe.puntuacion = Pe.puntuacion > 3 ? 3 : Pe.puntuacion; // Default to max value
		result[2] = Pe.puntuacion;
		
		return result;
	}
	
	double Total(int choice) throws IOException {
		
		double sum = 0;
		
		sum += CalidadDocente(choice)[0];
		sum += CalidadDocente(choice)[1];
		sum += CalidadDocente(choice)[2];
		sum += CalidadDocente(choice)[3];
		sum += CalidadDocente(choice)[4];
		sum += CalidadDocente(choice)[5];
		sum += CalidadDocente(choice)[6];
		
		sum += ServicioInstitucion(choice)[0];
		sum += ServicioInstitucion(choice)[1];
		sum += ServicioInstitucion(choice)[2];
		sum += ServicioInstitucion(choice)[3];
		
		sum += ServicioComunidad(choice);
		
		sum += InvestigacionTrabajo(choice)[0];
		sum += InvestigacionTrabajo(choice)[1];
		sum += InvestigacionTrabajo(choice)[2];
		
		sum += CrecimientoDesarrollo(choice)[0];
		sum += CrecimientoDesarrollo(choice)[1];
		sum += CrecimientoDesarrollo(choice)[2];
		
		return sum;
	}
}

class ExternalValues{
	int M; // Cantidad de evaluaciones I1
	int N; // Cantidad de evaliaciones I1A
	double I1P; // Ecuacion I1
	double I1,I1A,I2,I3,I3A,I4; // Promedio instrumentos
	double puntuacion;
}