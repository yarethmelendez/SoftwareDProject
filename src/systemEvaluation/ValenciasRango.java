package systemEvaluation;

public class ValenciasRango extends ValenciasCapsule{

	ValenciasRango(int choice){
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
	
	void auxiliar() { // Catedratico auxiliar
		
		// Calidad docente
		valen1A = 16;
		valen1B = 12;
		valen1C = 8;
		valen1D = 6;
		valen1E = 6;
		valen1F = 9;
		valen1GH = 10;
		
		// Servicio a la institucion
		valen2A = 3;
		valen2BC = 4;
		valen2DE = 2;
		valen2FG = 3;
		
		// Servicio a la comunidad
		valen3AB = 2;
		
		// Investigacion y trabajo creativo
		valen4A = 2;
		valen4B = 4;
		valen4CDE = 4;
		
		// Crecimiento y desarrollo profesional
		valen5ABC = 3;
		valen5D = 3;
		valen5EF = 3;
	}
	
	void asociado() { // Catedratico asociado
		// Calidad docente
		valen1A = 15;
		valen1B = 10;
		valen1C = 10;
		valen1D = 6;
		valen1E = 7;
		valen1F = 9;
		valen1GH = 8;
		
		// Servicio a la institucion
		valen2A = 3;
		valen2BC = 3;
		valen2DE = 2;
		valen2FG = 3;
		
		// Servicio a la comunidad
		valen3AB = 2;
		
		// Investigacion y trabajo creativo
		valen4A = 3;
		valen4B = 4;
		valen4CDE = 5;
		
		// Crecimiento y desarrollo profesional
		valen5ABC = 4;
		valen5D = 3;
		valen5EF = 3;
	}
	
	void catedratico() { // Catedratico
		// Calidad docente
		valen1A = 13;
		valen1B = 10;
		valen1C = 12;
		valen1D = 6;
		valen1E = 5;
		valen1F = 9;
		valen1GH = 8;
		
		// Servicio a la institucion
		valen2A = 2;
		valen2BC = 3;
		valen2DE = 2;
		valen2FG = 2;
		
		// Servicio a la comunidad
		valen3AB = 2;
		
		// Investigacion y trabajo creativo
		valen4A = 5;
		valen4B = 5;
		valen4CDE = 4;
		
		// Crecimiento y desarrollo profesional
		valen5ABC = 4;
		valen5D = 4;
		valen5EF = 4;
	}
	
	
}
