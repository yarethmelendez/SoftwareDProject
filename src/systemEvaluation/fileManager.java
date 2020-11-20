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
			//Scanner scanner = new Scanner(new File ("C:\\Users\\biowo\\git\\softwareDesignProject\\Software Design\\DesignProject\\credencials.csv"));
			
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

}
