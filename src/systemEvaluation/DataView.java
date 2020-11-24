// Data reader testing / New file structure testing -Kelvin

package systemEvaluation;
import java.util.*;
import java.io.*;

public class DataView {
	FileReader dummy = new FileReader("./dummydata.csv");
	
	DataView(){
		try {
			int i = 0; // Iterator
			
			while(dummy.nextLine()) {
				String iterate = dummy.nextLine();
				i++;
			}
			
			String data[][] = new String[i][105]; // Holds data
			while(input.hasNextLine()) {
				String temp = input.nextLine(); // Hold line of data
				String[] splitter = temp.split(",",105); // Divide data
				System.out.print(splitter[0]+splitter[1]);
				data[0] = splitter; // Assign data to array
				System.out.println(data[0]);
			}
			i = 0; // Reset iteration
		}catch(Exception e){}
	}
}
