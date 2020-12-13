package systemEvaluation;

import java.io.FileNotFoundException;
import java.io.IOException;

@SuppressWarnings("unused")
public class DataViewTest {

	public static void main(String[] args) throws IOException {
		ValenciasRubrica vr = new ValenciasRubrica();
		System.out.println(vr.CalidadDocente(1));
	}

}
