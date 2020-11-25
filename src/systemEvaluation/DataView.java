// Data reader testing / New file structure testing -Kelvin

package systemEvaluation;
import java.util.*;
import java.io.*;

public class DataView {
	File file = new File("./dummydata.csv");
	
	DataView() throws IOException{
		FileReader freader = new FileReader(file);
		BufferedReader reader = new BufferedReader(freader);
		String test;
		String splitter[]; // Split lines
		String dummy[][] = new String[5][104]; // test dummy string
		while(reader.readLine() != null) { // Iterate lines
			for(int i = 0; i < 5; i++) {
				test = reader.readLine(); // Read line
				splitter = test.split(",",104); // Split line
				for(int j = 0; j < 104; j++) {
					dummy[i][j] = splitter[j]; // Assign values
				}
			}
		}
	}
	
	void ListOb(String[][] data) {
		
	}
}