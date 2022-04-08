package Assignment4_2.java;
import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<Integer , String>();
		map.put(1, "Ranjeet");
		map.put(2, "Lata");
		map.put(3, "Arun");
		map.put(4, "Divya");
		map.put(5, "Sweta");
		map.put(6, "Poonam");
		map.put(7, "Manjeet");
		map.put(8, "jac");
		map.put(9, "Rana");
		map.put(10, "Rajesh");
		map.put(11, "Rakesh");
		map.put(12, "Ramesh");
		System.out.println("Iterating Hashmap....");
		for(Map.Entry m:map.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
			
		}


	}

}
