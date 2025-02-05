
import java.security.cert.X509Certificate;
import java.util.zip.ZipEntry;

import javax.swing.ToolTipManager;
import javax.swing.text.TabStop;

public class Task_8 {
	public static void main(String[] arges) {
//		In a town, the percentage of men is 52. The percentage of 
//		total literacy is 48. If total percentage of literate men is 35 of 
//		the total population, write a program to find the total number 
//		of illiterate men and women if the population of the town is 
//		80,000.
		
		int sum_town = 80000;
		int m =  ((80000 * 52)/100); 
     	int w =  ((80000 * 48)/100);
     	int lm = 28000; int lw; // literate woman
     	int ilm, ilw; // illiterate man and woman
     	int sum_lm_lw = ((8000 * 48)/100);
     	
     	System.out.println(""
     	        + "sum_town = 80000;\r\n"     			
     			+ "m =  ((80000 * 52)/100); \r\n"
     			+ "w =  ((80000 * 48)/100);\r\n"
     			+ "lm = 28000; int lw; // literate woman\r\n"
     			+ "ilm, ilw; // illiterate man and woman\r\n"
     			+ "sum_lm_lw = ((8000 * 48)/100)//sum of litrcy in a town");
     	          
     	
     	lw =(sum_lm_lw - lm);
     	System.out.println("Illitrate wiman : "+lm);
     	
     	
	}
	}