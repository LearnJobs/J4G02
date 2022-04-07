  package Assingment2.java;

public class StringAssingment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 =new String("Hello there");
		String str2=new String("Hello   there");
		String str3=new String("java is most popular programming langauge");
		System.out.println("Check equal string..>"+str1.equals(str2));
		System.out.println("check equalsignoreCase...>"+str1.equalsIgnoreCase(str2));
		System.out.println("check compare to string method..>"+str1.compareTo(str2));
		System.out.println("check to Endswith method...>"+str1.endsWith(str2));
		System.out.println("check the startwith method..>"+str1.startsWith(str2));
		System.out.println("Welcome in java class"+str3.toUpperCase());
		
		

	}

}
