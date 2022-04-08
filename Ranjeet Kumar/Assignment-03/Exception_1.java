package ExceptionHandling.java;

public class Exception_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value1,value2,add,sub,mul,div;
		value1 = 10;
		value2 = 0;
		
		
		add = value1 +value2;
		System.out.println("Addition is:"+add);
		
		
		sub = value1 - value2;
		System.out.println("Subtraction is:"+sub);
		
		try {
			div = value1/ value2;
			System.out.println("Division is:"+div);
		}catch(ArithmeticException e) {
			System.out.println("Number is not divided by zero");
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//			System.err.println("Can not divided by zero");
	
		}
		
		mul = value1*value2;
		System.out.println("Multipication is:"+mul);

	}

}


