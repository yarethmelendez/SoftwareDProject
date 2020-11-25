package systemEvaluation;

import java.io.FileNotFoundException;
import java.io.IOException;

public class DataViewTest {

	public static void main(String[] args) throws IOException {
		ValenciasRubrica vr = new ValenciasRubrica(2);
		System.out.println(vr.total[7]);
	}

}
