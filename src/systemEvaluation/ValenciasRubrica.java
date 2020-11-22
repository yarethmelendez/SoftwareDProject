package systemEvaluation;

public class ValenciasRubrica extends ExternalValues{
	ValenciasRango rango; // Determina que rango se usa
	
	// Calidad Docente
	ExternalValues CDa = new ExternalValues();
	ExternalValues CDb = new ExternalValues();
	ExternalValues CDc = new ExternalValues();
	ExternalValues CDd = new ExternalValues();
	ExternalValues CDe = new ExternalValues();
	ExternalValues CDf = new ExternalValues();
	ExternalValues CDg = new ExternalValues();
	ExternalValues CDh = new ExternalValues();

	ValenciasRubrica(int choice){
		switch(choice) {
		case 1:
			auxiliar();
			break;
		case 2:
			asociado();
			break;
		case 3:
			catedratico();
			break;
		}
	}
	
	void asociado() {
		
	}
	
	void auxiliar() {
		
	}
	
	void catedratico() {
		
	}
}

class ExternalValues{
	double A,B,C,D; // Factor influencia del Instrumento
	int M; // Cantidad de evaluaciones I1
	int N; // Cantidad de evaliaciones I1A
	double I1,I1A,I2,I3,I3A,I4; // Promedio instrumentos
	double puntiacion;
}