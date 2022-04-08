package Assignment5_2.java;

public class Main implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main obj=new Main();
		Thread thread =new Thread(obj);
		thread.start();

	}
public void run() {
	System.out.println("hello India");
}
}
