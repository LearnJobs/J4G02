package Assignment4.java;
import java.util.*;

public class ArraylistBooks {
	public static void main(String...strings) {
		ArrayList<String> book=new ArrayList<String>();
		book.add("Java");
		book.add("Python");
		book.add("Math");
		book.add("Physic");
		book.add("Chemistry");
		book.add("Hindi");
		Iterator itr=book.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
