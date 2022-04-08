package ExceptionHandling.java;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class Exception_Q_5_Five  implements java.io.Serializable{

	public String name;
	public int SSN;
	public int number;
	public String address;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception_Q_5_Five e = new Exception_Q_5_Five();
		e.name = "Reyan Ali";
		e.address = "Phokka Kuan, Ambehta Peer";
		e.SSN = 11122333;
		e.number = 101;

		try {
			FileOutputStream fileOut = new FileOutputStream("D:\\a.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in D:\\a.txt");
		} catch (IOException i) {
			i.printStackTrace();
		}

	}
}



