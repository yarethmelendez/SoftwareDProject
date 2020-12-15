// Data reader testing / New file structure testing -Kelvin

package systemEvaluation;
import java.io.*;

public class DataView {
	File file = new File("./instrumentos.csv");
	File file2 = new File("./temp.csv"); // Holds non-deletable data
	String data[][]; // Data holder
	
	DataView() throws IOException{
		int sum = 0;
		FileReader freader = new FileReader(file);
		BufferedReader counter = new BufferedReader(freader); // counts evaluations
		String test;
		String splitter[] = null; // Split lines
		
		FileWriter writer = new FileWriter(file2);
		writer.write("header\n");
		
		while(counter.readLine() != null) { // Count observations
			test = counter.readLine(); // Read line
			splitter = test.split(",",145); // Split line
			if(splitter[0].equals("FALSE")) { // If not-deletable, add to temp
				sum++;
				writer.write(test+"\n");
			}
		}
		
		counter.close();
		writer.close();
		data = new String[sum][145];
		System.out.println("Number of evals: "+data.length);
		
		/////////////////////////////////////////////////////////////////////
		
		FileReader freader2 = new FileReader(file2); // Reopen temp file
		BufferedReader reader = new BufferedReader(freader2);
		
		while(reader.readLine() != null) { // Iterate lines
			for(int i = 0; i < data.length; i++) {
				test = reader.readLine(); // Read line
				splitter = test.split(",",145); // Split line
				for(int j = 0; j < 145; j++) {
					data[i][j] = splitter[j]; // Assign values
				}
			}
		}
		reader.close();
	}
	
	int[] ObSums() { // Separates online and local surveys
		int[] MN = {0,0}; // Online / Local surveys
		
		for(int i = 0; i < data.length; i++) {
			if(data[i][16].equals("Manual") && data[i][1].equals("TRUE")) 
				MN[0]++;
			else if(data[i][16].equals("Online") && data[i][1].equals("TRUE"))
				MN[1]++;
		}
		return MN;
	}
	
	int ISum(int start,int end) { // Sums a row of questions
		int sum = 0;
		int questions = (end+1) - start;

		for(int i = 0; i < data.length;i++) {
			for(int j = start; j <= end; j++) { 
				sum += Integer.parseInt(data[i][j]); // Convert string to int
			}
		}
		
		sum /= questions; // Get average by number of questions
		sum /= data.length; // Get average by number of evaluations
		return sum;
	}
	
	int RNum(int num) { // Sum a single question
		int sum = 0;
		int k = num;
		for(int i = 0; i < data.length;i++) {
			sum += Integer.parseInt(data[i][k]); // Convert string to int
		}
		
		sum /= data.length;
		return sum;
	}
}