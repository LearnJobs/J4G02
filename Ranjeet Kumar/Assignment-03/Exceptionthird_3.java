package ExceptionHandling.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Exceptionthird_3 {
	public static void main(String[] args) {
		File f = new File("d:\\a.txt");
		FileReader fr = null;
		
		try {
			FileReader fr1 = new FileReader(f); 
			while(fr1.read()!=-1) {
				
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			//fr1.close();
		}
		
		// TODO Auto-generated method stub

	}

}
