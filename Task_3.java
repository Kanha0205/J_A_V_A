//package comd.basic;

import java.security.cert.X509Certificate;
import java.util.zip.ZipEntry;

public class Task_3 {
	public static void main(String[] arges) {
		
//		Question no.3
//		If the marks obtained by a student in five different subjects 
//		are input through the keyboard, find out the aggregate marks 
//		and percentage marks obtained by the student. Assume that 
//		the maximum marks that can be obtained by a student in each 
//		subject is 100.
		
	    double hindi = 76.5, science = 77.5, math =  45.2, physics = 62.7, outof = 100.0, percentage = 0, aggrigate_marks = 0;
	    
	    aggrigate_marks = ( hindi + science + math + physics );
	    percentage = ((aggrigate_marks*100)/500);
	    
	    
	    System.out.println("Name: kanha \n roll_no: 21 class: 12/B");
	    System.out.println("aggrigate_marks: "+aggrigate_marks);
	    System.out.println("Percentage: "+percentage);
	                  
	}
	}