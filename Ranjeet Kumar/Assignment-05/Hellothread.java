package Assignment5_1.java;

public class Hellothread extends Thread{
	public static void main(String...strings) {
		Hellothread thread=new Hellothread();
		thread.start();
	}
	public void run() {
		System.out.println("Hello word...");
	}

}
