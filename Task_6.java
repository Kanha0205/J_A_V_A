
import java.nio.file.FileSystemNotFoundException;
import java.security.cert.X509Certificate;
import java.util.zip.ZipEntry;

public class Task_6 {
	public static void main(String[] arges) {
		
//		Two numbers are input through the keyboard into two 
//		locations C and D. Write a program to interchange the 
//		contents of C and D.
		
		int C = 67, D = 34;
				
 
		// old method //
//		System.out.println("before swiping value C "+C+" and D "+D);
//		int temporary = C;
//		C = D;
//		D = temporary;
//		System.out.println("after swiping value is:"+C+"&"+D);
		
		
		//new method
		System.out.println("before swiping value C "+C+" and D "+D);
C=C+D;
D=C-D;
C=C-D;
System.out.println("swipe the value C = "+C+" & D = "+D);
		
		
		
		

		
	}
	}