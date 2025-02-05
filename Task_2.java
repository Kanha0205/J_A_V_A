//package comd.basic;

import java.security.cert.X509Certificate;
import java.util.zip.ZipEntry;
public class Task_2 {
	public static void main(String[] arges) {
		double inch = 0 , foot = 0, centimeter = 0, meter = 0;
		
		double distance = 32.99; // kilometer
	
          //kilometer = 1000;
		
	         // meter 
             meter =(distance*1000);
             //inch
             inch = (distance*39700.1);
             //centimeter
             centimeter = (distance*100000);
             //foot
             foot = (distance * 3280.84);
             
             System.out.println("Diffrence bitween to citys is: "+distance);	
             System.out.println("conter kilomiter to meter, centimiter, inch, foot");
             System.out.println("in meter: "+meter);
             System.out.println("in inch: "+inch);
             System.out.println("in centimiter: "+centimeter);
             System.out.println("in foot: "+foot);
}
}
