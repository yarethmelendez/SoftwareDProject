package systemEvaluation;

import java.util.*;
import java.io.*;

public class fileManager {
	
	
	
	public int login(String IDT , String passT ) {
		//Scanner in=new Scanner(System.in);
		
		String Id = "";
		String pass = "";
		int found = 0;
		File loginCreds;
		Scanner scanner;
		
		
		try {
			loginCreds = new File("./credencials.csv");
			scanner = new Scanner(loginCreds);
			
			while(scanner.hasNextLine() && found != 1) {
				String data = scanner.nextLine();
				String[] params = data.split(",", 20);
				System.out.print("reading ");
				Id= params[0];
				pass = params[1];
				
				if (Id.trim().equals(IDT) && pass.trim().equals(passT))
				{
					System.out.print("i found it");
					found = 1;
				}
				
			}
				scanner.close();
				
			
		}catch(Exception ex) {
			
			System.out.print("404 "+ ex);
		}
		return found;
		
		
			
		}
	public int register(String IDT , String passT, String name , String lastName) {

		File registerCreds;
	

		try {
			registerCreds = new File("./credencials.csv");
			FileWriter fw = new FileWriter("./credencials.csv",true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			pw.println(IDT+","+passT+","+name+","+lastName);
			pw.flush();
			pw.close();
			
			
		}catch(Exception ex) {
			
			System.out.print("404 "+ ex);
		}
		return 0;
	}

	public String[] combobox(String ID) {
		
		String[] ops;
		File instru;
		int found = 0;
		
		
		String[] ap = new String[105] ;

		try {
			instru = new File("./instrumentos.csv");
			Scanner scanner = new Scanner(instru);
			
			while(scanner.hasNextLine()) {
				String data = scanner.nextLine();
				 ops = data.split(",", 105);
				System.out.print("reading ");
			
				if (ops[2].trim().equals(ID) && ops[0].trim().equals("FALSE") && ops[1].trim().equals("FALSE"))
				{
				//	System.out.print("\n im in!!!!!!!!!!!");
				

					int j = 3;
					for (int i = 0;i < 100; i++ ) {
						ap[i]  = ops[j];
						j++;
					//System.out.print("\n"+ap[i]+"\n");
					}
					//System.out.print("\n"+ap[28]+" soy 29 \n");
				}
		}
				scanner.close();
				
			
		}catch(Exception ex) {
			
			System.out.print("404 "+ ex);
		}
		
		
		return ap;
		
	}
	
}