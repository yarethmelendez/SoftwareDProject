// Data reader testing / New file structure testing -Kelvin

package systemEvaluation;
import java.io.*;

public class DataView {
	File file = new File("./instrumentos.csv");
	String data[][]; // Data holder
	DataView() throws IOException{
		int sum = -1;
		FileReader freader = new FileReader(file);
		BufferedReader counter = new BufferedReader(freader); // counts observations
		String test;
		String splitter[]; // Split lines
		
		
		while(counter.readLine() != null) // Count observations
			sum++;
		data = new String[sum][103];
		
		FileReader freader2 = new FileReader(file); // Reopen file
		BufferedReader reader = new BufferedReader(freader2);
		
		while(reader.readLine() != null) { // Iterate lines
			for(int i = 0; i < data.length; i++) {
				test = reader.readLine(); // Read line
				splitter = test.split(",",103); // Split line
				for(int j = 0; j < 103; j++) {
					data[i][j] = splitter[j]; // Assign values
				}
			}
		}
	}
	
	int[] ObSums() {
		int[] MN = {0,0}; // Online / Local surveys
		
		for(int i = 0; i < data.length; i++) {
			if(data[i][16].equals("TRUE")) 
				MN[0]++;
			else
				MN[1]++;
		}
		
		return MN;
	}
	
	int ISum(int start,int end) { // Sums specific questions
		int sum = 0;

		for(int i = 0; i < data.length;i++) {
			for(int j = start; j < end; j++) { 
				sum += Integer.parseInt(data[i][j]); // Convert string to int
			}
		}
		return sum;
	}
	
	int RNum(int num) { // Sum a single question
		int sum = 0;
		int k = num;
		for(int i = 0; i < data.length;i++) {
			sum += Integer.parseInt(data[i][k]); // Convert string to int
		}
		return sum;
	}
}