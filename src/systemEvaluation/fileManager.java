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

	public String[] combobox(String ID, String op1, String op2, String op3 , String op4 ) {
		
		String[] ops;
		File instru;
		int found = 0;
		
	String[] ap = null;

		try {
			instru = new File("./credencials.csv");
			Scanner scanner = new Scanner(instru);
			//Scanner scanner = new Scanner(new File ("C:\\Users\\biowo\\git\\softwareDesignProject\\Software Design\\DesignProject\\credencials.csv"));
			
			while(scanner.hasNextLine() && found != 1) {
				String data = scanner.nextLine();
				 ops = data.split(",", 20);
				System.out.print("reading ");
//				Id= params[0];
//				pass = params[1];
				
				if (ops[0].trim().equals(ID) && ops[2].trim().equals("part1") )
				{
					ap[0] = ops[3];
					
					ap[5] = ops[4];
					
					if(ap[0] == "1") {
						ap[1] = "2";
						ap[2] = "3";
						ap[3] = "4";
						ap[4] = "N/A";
					}
					if(ap[0] == "2") {
						ap[1] = "1";
						ap[2] = "3";
						ap[3] = "4";
						ap[4] = "N/A";
					}
					
					if(ap[0] == "3") {
						ap[1] = "1";
						ap[2] = "2";
						ap[3] = "4";
						ap[4] = "N/A";
					}
					
					if(ap[0] == "4") {
						ap[1] = "1";
						ap[2] = "2";
						ap[3] = "3";
						ap[4] = "N/A";
					}
					
					if(ap[0] == "N/A") {
						ap[1] = "1";
						ap[2] = "2";
						ap[3] = "3";
						ap[4] = "4";
					}
					
					
					if(ap[5] == "1") {
						ap[6] = "2";
						ap[7] = "3";
						ap[8] = "4";
						ap[9] = "N/A";
					}
					if(ap[5] == "2") {
						ap[6] = "1";
						ap[7] = "3";
						ap[8] = "4";
						ap[9] = "N/A";
					}
					
					if(ap[5] == "3") {
						ap[6] = "1";
						ap[7] = "2";
						ap[8] = "4";
						ap[9] = "N/A";
					}
					
					if(ap[5] == "4") {
						ap[6] = "1";
						ap[7] = "2";
						ap[8] = "3";
						ap[9] = "N/A";
					}
					
					if(ap[5] == "N/A") {
						ap[6] = "1";
						ap[7] = "2";
						ap[8] = "3";
						ap[9] = "4";
					}
				}
				else if (ops[0].trim().equals(ID) && ops[2].trim().equals("part2")) {
					
					ap[10]= ops[3];
					ap[15]= ops[4];
					
					if(ap[10] == "1") {
						ap[11] = "2";
						ap[12] = "3";
						ap[13] = "4";
						ap[14] = "N/A";
					}
					if(ap[10] == "2") {
						ap[11] = "1";
						ap[12] = "3";
						ap[13] = "4";
						ap[14] = "N/A";
					}
					
					if(ap[10] == "3") {
						ap[11] = "1";
						ap[12] = "2";
						ap[13] = "4";
						ap[14] = "N/A";
					}
					
					if(ap[10] == "4") {
						ap[11] = "1";
						ap[12] = "2";
						ap[13] = "3";
						ap[14] = "N/A";
					}
					
					if(ap[10] == "N/A") {
						ap[11] = "1";
						ap[12] = "2";
						ap[13] = "3";
						ap[14] = "4";
					}
					
					
					if(ap[15] == "1") {
						ap[16] = "2";
						ap[17] = "3";
						ap[18] = "4";
						ap[19] = "N/A";
					}
					if(ap[15] == "2") {
						ap[16] = "1";
						ap[17] = "3";
						ap[18] = "4";
						ap[19] = "N/A";
					}
					
					if(ap[15] == "3") {
						ap[16] = "1";
						ap[17] = "2";
						ap[18] = "4";
						ap[19] = "N/A";
					}
					
					if(ap[15] == "4") {
						ap[16] = "1";
						ap[17] = "2";
						ap[18] = "3";
						ap[19] = "N/A";
					}
					
					if(ap[15] == "N/A") {
						ap[16] = "1";
						ap[17] = "2";
						ap[18] = "3";
						ap[19] = "4";
					}
					
					
				}
				else if (ops[0].trim().equals(ID) && ops[2].trim().equals("part3")) {
					
					ap[20]= ops[3];
					ap[25]= ops[4];
					ap[30]= ops[5];
					ap[35]= ops[6];
					ap[40]= ops[7];
					ap[45]= ops[8];
					ap[50]= ops[9];
					ap[55]= ops[10];
					
					if(ap[20] == "1") {
						ap[21] = "2";
						ap[22] = "3";
						ap[23] = "4";
						ap[24] = "N/A";
					}
					if(ap[20] == "2") {
						ap[21] = "1";
						ap[22] = "3";
						ap[23] = "4";
						ap[24] = "N/A";
					}
					
					if(ap[20] == "3") {
						ap[21] = "1";
						ap[22] = "2";
						ap[23] = "4";
						ap[24] = "N/A";
					}
					
					if(ap[20] == "4") {
						ap[21] = "1";
						ap[22] = "2";
						ap[23] = "3";
						ap[24] = "N/A";
					}
					
					if(ap[20] == "N/A") {
						ap[21] = "1";
						ap[22] = "2";
						ap[23] = "3";
						ap[24] = "4";
					}
					
					if(ap[25] == "1") {
						ap[26] = "2";
						ap[27] = "3";
						ap[28] = "4";
						ap[29] = "N/A";
					}
					if(ap[25] == "2") {
						ap[26] = "1";
						ap[27] = "3";
						ap[28] = "4";
						ap[29] = "N/A";
					}
					
					if(ap[25] == "3") {
						ap[26] = "1";
						ap[27] = "2";
						ap[28] = "4";
						ap[29] = "N/A";
					}
					
					if(ap[25] == "4") {
						ap[26] = "1";
						ap[27] = "2";
						ap[28] = "3";
						ap[29] = "N/A";
					}
					
					if(ap[25] == "N/A") {
						ap[26] = "1";
						ap[27] = "2";
						ap[28] = "3";
						ap[29] = "4";
					}
					
					if(ap[30] == "1") {
						ap[31] = "2";
						ap[32] = "3";
						ap[33] = "4";
						ap[34] = "N/A";
					}
					if(ap[30] == "2") {
						ap[31] = "1";
						ap[32] = "3";
						ap[33] = "4";
						ap[34] = "N/A";
					}
					
					if(ap[30] == "3") {
						ap[31] = "1";
						ap[32] = "2";
						ap[33] = "4";
						ap[34] = "N/A";
					}
					
					if(ap[30] == "4") {
						ap[31] = "1";
						ap[32] = "2";
						ap[33] = "3";
						ap[34] = "N/A";
					}
					
					if(ap[30] == "N/A") {
						ap[31] = "1";
						ap[32] = "2";
						ap[33] = "3";
						ap[34] = "4";
					}
					
					if(ap[35] == "1") {
						ap[36] = "2";
						ap[37] = "3";
						ap[38] = "4";
						ap[39] = "N/A";
					}
					if(ap[35] == "2") {
						ap[36] = "1";
						ap[37] = "3";
						ap[38] = "4";
						ap[39] = "N/A";
					}
					
					if(ap[35] == "3") {
						ap[36] = "1";
						ap[37] = "2";
						ap[38] = "4";
						ap[39] = "N/A";
					}
					
					if(ap[35] == "4") {
						ap[36] = "1";
						ap[37] = "2";
						ap[38] = "3";
						ap[39] = "N/A";
					}
					
					if(ap[35] == "N/A") {
						ap[36] = "1";
						ap[37] = "2";
						ap[38] = "3";
						ap[39] = "4";
					}
					
					if(ap[40] == "1") {
						ap[41] = "2";
						ap[42] = "3";
						ap[43] = "4";
						ap[44] = "N/A";
					}
					if(ap[40] == "2") {
						ap[41] = "1";
						ap[42] = "3";
						ap[43] = "4";
						ap[44] = "N/A";
					}
					
					if(ap[40] == "3") {
						ap[41] = "1";
						ap[42] = "2";
						ap[43] = "4";
						ap[44] = "N/A";
					}
					
					if(ap[40] == "4") {
						ap[41] = "1";
						ap[42] = "2";
						ap[43] = "3";
						ap[44] = "N/A";
					}
					
					if(ap[40] == "N/A") {
						ap[41] = "1";
						ap[42] = "2";
						ap[43] = "3";
						ap[44] = "4";
					}
					
					if(ap[45] == "1") {
						ap[46] = "2";
						ap[47] = "3";
						ap[48] = "4";
						ap[49] = "N/A";
					}
					if(ap[45] == "2") {
						ap[46] = "1";
						ap[47] = "3";
						ap[48] = "4";
						ap[49] = "N/A";
					}
					
					if(ap[45] == "3") {
						ap[46] = "1";
						ap[47] = "2";
						ap[48] = "4";
						ap[49] = "N/A";
					}
					
					if(ap[45] == "4") {
						ap[46] = "1";
						ap[47] = "2";
						ap[48] = "3";
						ap[49] = "N/A";
					}
					
					if(ap[45] == "N/A") {
						ap[46] = "1";
						ap[47] = "2";
						ap[48] = "3";
						ap[49] = "4";
					}
					
					if(ap[50] == "1") {
						ap[51] = "2";
						ap[52] = "3";
						ap[53] = "4";
						ap[54] = "N/A";
					}
					if(ap[50] == "2") {
						ap[51] = "1";
						ap[52] = "3";
						ap[53] = "4";
						ap[54] = "N/A";
					}
					
					if(ap[50] == "3") {
						ap[51] = "1";
						ap[52] = "2";
						ap[53] = "4";
						ap[54] = "N/A";
					}
					
					if(ap[50] == "4") {
						ap[51] = "1";
						ap[52] = "2";
						ap[53] = "3";
						ap[54] = "N/A";
					}
					
					if(ap[50] == "N/A") {
						ap[51] = "1";
						ap[52] = "2";
						ap[53] = "3";
						ap[54] = "4";
					}
					
					if(ap[55] == "1") {
						ap[56] = "2";
						ap[57] = "3";
						ap[58] = "4";
						ap[59] = "N/A";
					}
					if(ap[55] == "2") {
						ap[56] = "1";
						ap[57] = "3";
						ap[58] = "4";
						ap[59] = "N/A";
					}
					
					if(ap[55] == "3") {
						ap[56] = "1";
						ap[57] = "2";
						ap[58] = "4";
						ap[59] = "N/A";
					}
					
					if(ap[55] == "4") {
						ap[56] = "1";
						ap[57] = "2";
						ap[58] = "3";
						ap[59] = "N/A";
					}
					
					if(ap[55] == "N/A") {
						ap[56] = "1";
						ap[57] = "2";
						ap[58] = "3";
						ap[59] = "4";
					}
					
				}
				else if (ops[0].trim().equals(ID) && ops[2].trim().equals("part3.2")) {
					
					ap[60]= ops[3];
					ap[65]= ops[4];
					ap[70]= ops[5];
					ap[75]= ops[6];
					ap[80]= ops[7];
					
					
					if(ap[60] == "1") {
						ap[61] = "2";
						ap[62] = "3";
						ap[63] = "4";
						ap[64] = "N/A";
					}
					if(ap[60] == "2") {
						ap[61] = "1";
						ap[62] = "3";
						ap[63] = "4";
						ap[64] = "N/A";
					}
					
					if(ap[60] == "3") {
						ap[61] = "1";
						ap[62] = "2";
						ap[63] = "4";
						ap[64] = "N/A";
					}
					
					if(ap[60] == "4") {
						ap[61] = "1";
						ap[62] = "2";
						ap[63] = "3";
						ap[64] = "N/A";
					}
					
					if(ap[60] == "N/A") {
						ap[61] = "1";
						ap[62] = "2";
						ap[63] = "3";
						ap[64] = "4";
					}
					
					if(ap[65] == "1") {
						ap[66] = "2";
						ap[67] = "3";
						ap[68] = "4";
						ap[69] = "N/A";
					}
					if(ap[65] == "2") {
						ap[66] = "1";
						ap[67] = "3";
						ap[68] = "4";
						ap[69] = "N/A";
					}
					
					if(ap[65] == "3") {
						ap[66] = "1";
						ap[67] = "2";
						ap[68] = "4";
						ap[69] = "N/A";
					}
					
					if(ap[65] == "4") {
						ap[66] = "1";
						ap[67] = "2";
						ap[68] = "3";
						ap[69] = "N/A";
					}
					
					if(ap[65] == "N/A") {
						ap[66] = "1";
						ap[67] = "2";
						ap[68] = "3";
						ap[69] = "4";
					}
					
					if(ap[70] == "1") {
						ap[71] = "2";
						ap[72] = "3";
						ap[73] = "4";
						ap[74] = "N/A";
					}
					if(ap[70] == "2") {
						ap[71] = "1";
						ap[72] = "3";
						ap[73] = "4";
						ap[74] = "N/A";
					}
					
					if(ap[70] == "3") {
						ap[71] = "1";
						ap[72] = "2";
						ap[73] = "4";
						ap[74] = "N/A";
					}
					
					if(ap[70] == "4") {
						ap[71] = "1";
						ap[72] = "2";
						ap[73] = "3";
						ap[74] = "N/A";
					}
					
					if(ap[70] == "N/A") {
						ap[71] = "1";
						ap[72] = "2";
						ap[73] = "3";
						ap[74] = "4";
					}
					
					if(ap[75] == "1") {
						ap[76] = "2";
						ap[77] = "3";
						ap[78] = "4";
						ap[79] = "N/A";
					}
					if(ap[75] == "2") {
						ap[76] = "1";
						ap[77] = "3";
						ap[78] = "4";
						ap[79] = "N/A";
					}
					
					if(ap[75] == "3") {
						ap[76] = "1";
						ap[77] = "2";
						ap[78] = "4";
						ap[79] = "N/A";
					}
					
					if(ap[75] == "4") {
						ap[76] = "1";
						ap[77] = "2";
						ap[78] = "3";
						ap[79] = "N/A";
					}
					
					if(ap[75] == "N/A") {
						ap[76] = "1";
						ap[77] = "2";
						ap[78] = "3";
						ap[79] = "4";
					}
					
					if(ap[80] == "1") {
						ap[81] = "2";
						ap[82] = "3";
						ap[83] = "4";
						ap[84] = "N/A";
					}
					if(ap[80] == "2") {
						ap[81] = "1";
						ap[82] = "3";
						ap[83] = "4";
						ap[84] = "N/A";
					}
					
					if(ap[80] == "3") {
						ap[81] = "1";
						ap[82] = "2";
						ap[83] = "4";
						ap[84] = "N/A";
					}
					
					if(ap[80] == "4") {
						ap[81] = "1";
						ap[82] = "2";
						ap[83] = "3";
						ap[84] = "N/A";
					}
					
					if(ap[80] == "N/A") {
						ap[81] = "1";
						ap[82] = "2";
						ap[83] = "3";
						ap[84] = "4";
					}
						
					
				}
			else if (ops[0].trim().equals(ID) && ops[2].trim().equals("part4")) {
				
				ap[85]= ops[3];
				ap[90]= ops[4];
				ap[95]= ops[5];
				ap[100]= ops[6];
				ap[105]= ops[7];
				ap[110]= ops[8];
				ap[115]= ops[9];
				ap[120]= ops[10];
				
				if(ap[85] == "1") {
					ap[86] = "2";
					ap[87] = "3";
					ap[88] = "4";
					ap[89] = "N/A";
				}
				if(ap[85] == "2") {
					ap[86] = "1";
					ap[87] = "3";
					ap[88] = "4";
					ap[89] = "N/A";
				}
				
				if(ap[85] == "3") {
					ap[86] = "1";
					ap[87] = "2";
					ap[88] = "4";
					ap[89] = "N/A";
				}
				
				if(ap[85] == "4") {
					ap[86] = "1";
					ap[87] = "2";
					ap[88] = "3";
					ap[89] = "N/A";
				}
				
				if(ap[85] == "N/A") {
					ap[86] = "1";
					ap[87] = "2";
					ap[88] = "3";
					ap[89] = "4";
				}
				
				if(ap[90] == "1") {
					ap[91] = "2";
					ap[92] = "3";
					ap[93] = "4";
					ap[94] = "N/A";
				}
				if(ap[90] == "2") {
					ap[91] = "1";
					ap[92] = "3";
					ap[93] = "4";
					ap[94] = "N/A";
				}
				
				if(ap[90] == "3") {
					ap[91] = "1";
					ap[92] = "2";
					ap[93] = "4";
					ap[94] = "N/A";
				}
				
				if(ap[90] == "4") {
					ap[91] = "1";
					ap[92] = "2";
					ap[93] = "3";
					ap[94] = "N/A";
				}
				
				if(ap[90] == "N/A") {
					ap[91] = "1";
					ap[92] = "2";
					ap[93] = "3";
					ap[94] = "4";
				}
				
				if(ap[95] == "1") {
					ap[96] = "2";
					ap[97] = "3";
					ap[98] = "4";
					ap[99] = "N/A";
				}
				if(ap[95] == "2") {
					ap[96] = "1";
					ap[97] = "3";
					ap[98] = "4";
					ap[99] = "N/A";
				}
				
				if(ap[95] == "3") {
					ap[96] = "1";
					ap[97] = "2";
					ap[98] = "4";
					ap[99] = "N/A";
				}
				
				if(ap[95] == "4") {
					ap[96] = "1";
					ap[97] = "2";
					ap[98] = "3";
					ap[99] = "N/A";
				}
				
				if(ap[95] == "N/A") {
					ap[96] = "1";
					ap[97] = "2";
					ap[98] = "3";
					ap[99] = "4";
				}
				
				if(ap[100] == "1") {
					ap[101] = "2";
					ap[102] = "3";
					ap[103] = "4";
					ap[104] = "N/A";
				}
				if(ap[100] == "2") {
					ap[101] = "1";
					ap[102] = "3";
					ap[103] = "4";
					ap[104] = "N/A";
				}
				
				if(ap[100] == "3") {
					ap[101] = "1";
					ap[102] = "2";
					ap[103] = "4";
					ap[104] = "N/A";
				}
				
				if(ap[100] == "4") {
					ap[101] = "1";
					ap[102] = "2";
					ap[103] = "3";
					ap[104] = "N/A";
				}
				
				if(ap[100] == "N/A") {
					ap[101] = "1";
					ap[102] = "2";
					ap[103] = "3";
					ap[104] = "4";
				}
				
				if(ap[105] == "1") {
					ap[106] = "2";
					ap[107] = "3";
					ap[108] = "4";
					ap[109] = "N/A";
				}
				if(ap[105] == "2") {
					ap[106] = "1";
					ap[107] = "3";
					ap[108] = "4";
					ap[109] = "N/A";
				}
				
				if(ap[105] == "3") {
					ap[106] = "1";
					ap[107] = "2";
					ap[108] = "4";
					ap[109] = "N/A";
				}
				
				if(ap[105] == "4") {
					ap[106] = "1";
					ap[107] = "2";
					ap[108] = "3";
					ap[109] = "N/A";
				}
				
				if(ap[105] == "N/A") {
					ap[106] = "1";
					ap[107] = "2";
					ap[108] = "3";
					ap[109] = "4";
				}
				
				if(ap[100] == "1") {
					ap[101] = "2";
					ap[102] = "3";
					ap[103] = "4";
					ap[104] = "N/A";
				}
				if(ap[100] == "2") {
					ap[101] = "1";
					ap[102] = "3";
					ap[103] = "4";
					ap[104] = "N/A";
				}
				
				if(ap[100] == "3") {
					ap[101] = "1";
					ap[102] = "2";
					ap[103] = "4";
					ap[104] = "N/A";
				}
				
				if(ap[100] == "4") {
					ap[101] = "1";
					ap[102] = "2";
					ap[103] = "3";
					ap[104] = "N/A";
				}
				
				if(ap[100] == "N/A") {
					ap[101] = "1";
					ap[102] = "2";
					ap[103] = "3";
					ap[104] = "4";
				}
				
				if(ap[115] == "1") {
					ap[116] = "2";
					ap[117] = "3";
					ap[118] = "4";
					ap[119] = "N/A";
				}
				if(ap[115] == "2") {
					ap[116] = "1";
					ap[117] = "3";
					ap[118] = "4";
					ap[119] = "N/A";
				}
				
				if(ap[115] == "3") {
					ap[116] = "1";
					ap[117] = "2";
					ap[118] = "4";
					ap[119] = "N/A";
				}
				
				if(ap[115] == "4") {
					ap[116] = "1";
					ap[117] = "2";
					ap[118] = "3";
					ap[119] = "N/A";
				}
				
				if(ap[115] == "N/A") {
					ap[116] = "1";
					ap[117] = "2";
					ap[118] = "3";
					ap[119] = "4";
				}
				
				if(ap[120] == "1") {
					ap[121] = "2";
					ap[122] = "3";
					ap[123] = "4";
					ap[124] = "N/A";
				}
				if(ap[120] == "2") {
					ap[121] = "1";
					ap[122] = "3";
					ap[123] = "4";
					ap[124] = "N/A";
				}
				
				if(ap[120] == "3") {
					ap[121] = "1";
					ap[122] = "2";
					ap[123] = "4";
					ap[124] = "N/A";
				}
				
				if(ap[120] == "4") {
					ap[121] = "1";
					ap[122] = "2";
					ap[123] = "3";
					ap[124] = "N/A";
				}
				
				if(ap[120] == "N/A") {
					ap[121] = "1";
					ap[122] = "2";
					ap[123] = "3";
					ap[124] = "4";
				}
				
				else if (ops[0].trim().equals(ID) && ops[2].trim().equals("part4.2")) {}
				ap[125]= ops[3];
				ap[130]= ops[4];
				
				if(ap[125] == "1") {
					ap[126] = "2";
					ap[127] = "3";
					ap[128] = "4";
					ap[129] = "N/A";
				}
				if(ap[125] == "2") {
					ap[126] = "1";
					ap[127] = "3";
					ap[128] = "4";
					ap[129] = "N/A";
				}
				
				if(ap[125] == "3") {
					ap[126] = "1";
					ap[127] = "2";
					ap[128] = "4";
					ap[129] = "N/A";
				}
				
				if(ap[125] == "4") {
					ap[126] = "1";
					ap[127] = "2";
					ap[128] = "3";
					ap[129] = "N/A";
				}
				
				if(ap[125] == "N/A") {
					ap[126] = "1";
					ap[127] = "2";
					ap[128] = "3";
					ap[129] = "4";
				}
				
				if(ap[130] == "1") {
					ap[131] = "2";
					ap[132] = "3";
					ap[133] = "4";
					ap[134] = "N/A";
				}
				if(ap[130] == "2") {
					ap[131] = "1";
					ap[132] = "3";
					ap[133] = "4";
					ap[134] = "N/A";
				}
				
				if(ap[130] == "3") {
					ap[131] = "1";
					ap[132] = "2";
					ap[133] = "4";
					ap[134] = "N/A";
				}
				
				if(ap[130] == "4") {
					ap[131] = "1";
					ap[132] = "2";
					ap[133] = "3";
					ap[134] = "N/A";
				}
				
				if(ap[130] == "N/A") {
					ap[131] = "1";
					ap[132] = "2";
					ap[133] = "3";
					ap[134] = "4";
				}
			}
		}
				scanner.close();
				
			
		}catch(Exception ex) {
			
			System.out.print("404 "+ ex);
		}
		
		
		return null;
		
	}
	
}