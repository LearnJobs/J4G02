package com.test.thread;

public class TestThread extends Thread{
	
	public void run() {
		System.out.println("Hello World");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThread th = new TestThread();
		th.start();

	}

}
