package ExceptionHandling.java;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
public class ExceptionQ_4Fourth {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a file Name:");
		String Filename = sc.next();
		
		try {
			FileInputStream fis = new FileInputStream(Filename);
			FileOutputStream fos = new FileOutputStream(Filename+"Out");
			int  i = 0;
			while((fis.read()) !=-1) {
				fos.write(i);
			}
			
			fos.close();
			fis.close();
		}catch(FileNotFoundException e) {
			System.out.println("File does not exist");
			
			
		}catch(IOException e) {
			
		}

	}


}
