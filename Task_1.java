//package comd.basic;

import java.security.cert.X509Certificate;
import java.util.zip.ZipEntry;

public class Task_1 {
	public static void main(String[] arges) {
float total = 10000, y = 40, Z = 100, a = 40, b= 20;
float da, ha, inhand, expence;
da = ((total*a)/100);
ha = ((total*b)/100);
expence = (da+ha);
inhand = ((total*y)/100);
 
System.out.println("ramesh total salary: "+total);
System.out.println(" expenss = "+expence);
System.out.println("Ramesh gross salary is: "+inhand);
				
}
}