// Data reader testing / New file structure testing -Kelvin

package systemEvaluation;
import java.io.*;
import java.util.*;


public class DataView {
	File file = new File("./instrumentos.csv");
	File file2 = new File("./temp.csv"); // Holds non-deletable data
	String data[][]; // Data holder
	
	DataView() throws IOException{
		int sum = 0;
		FileReader freader = new FileReader(file);
		//BufferedReader counter = new BufferedReader(freader); // counts evaluations
		String test;
		String splitter[] = null; // Split lines
		Scanner counter ;
		counter = new Scanner(file);
		
		FileWriter writer = new FileWriter(file2);
		writer.write("header\n");
		
		while(counter.hasNextLine()) { // Count observations
			test = counter.nextLine();; // Read line
			splitter = test.split(",",165); // Split line
			//System.out.print("\n");
			//System.out.println(test+" yooooooo im the test you lil b \n ");
			if(splitter[0].equals("FALSE")) { // If not-deletable, add to temp
				sum++;
				writer.write(test+"\n");
			}
		}
		
		//counter.close();
		writer.close();
		data = new String[sum][165];
		System.out.println("Number of evals: "+data.length);
		
		/////////////////////////////////////////////////////////////////////
		
		FileReader freader2 = new FileReader(file2); // Reopen temp file
		BufferedReader reader = new BufferedReader(freader2);
		
		while(reader.readLine() != null) { // Iterate lines
			for(int i = 0; i < data.length; i++) {
				test = reader.readLine(); // Read line
				splitter = test.split(",",165); // Split line
				for(int j = 0; j < 165; j++) {
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
	int EvidenceCalc(int score) {
		
		if ((score) >= 3 || (score) > 2)
			score = 3;
		else if ((score) == 2 ||(score) > 1)
			score = 2;
		else if ((score) == 1 || (score) > 0)
			score = 1;
		else
			score = 0;
		
		return score;
	}
}