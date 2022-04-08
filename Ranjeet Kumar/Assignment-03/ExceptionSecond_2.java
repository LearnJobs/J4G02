package ExceptionHandling.java;

public class ExceptionSecond_2 {
	public static void main(String[] args) {
		
		int div;
		
		try {
			int[] numbers = {20,0};
			int value1 = numbers[0];
			int value2 = numbers[3];
			div = value1/value2;
			System.out.println("Division is:"+div);
			
		}catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
			
		}catch(ArithmeticException arithmeticException) {
			System.out.println("Second element must be nonzero");
		}
	}

}
