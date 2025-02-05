
import java.security.cert.X509Certificate;
import java.util.function.BiConsumer;
import java.util.zip.ZipEntry;

public class Task_7 {
	public static void main(String[] arges) {
		
//		If a five-digit number is input through the keyboard, write a 
//		program to calculate the sum of its digits.
		

			
			int num = 12345;
			//sum of digit's
			
			int rem1 = num%10;
			num = num / 10;
			
			int rem2 = num%10;
			num = num / 10;         

			int rem3 = num%10;
			num = num / 10;         

			
			int rem4 = num%10;
			num = num / 10;         

			int rem5 = num%10;
			num = num / 10;
			
			int sum = rem1 + rem2 + rem3 + rem4 + rem5;

		System.out.println("Enter the number's : "+sum);
	}
	}