

	package Assignment4;

	public class Arithmetic {
		
		public static void main(String args[]) {
			try {
				int num1 = 30, num2 = 0;
				int output = num1 / num2;
				System.out.println("Result: " + output);
			}
			catch (ArithmeticException e) {
				System.out.println("ARITHMETIC EXCEPTION");
				System.out.println("Divide number by zero");
			}
		}
	}
