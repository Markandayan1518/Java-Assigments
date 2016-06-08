package com.infy.runnableinterface;

//Creating thread class by implementing Runnable interface
class MyThread implements Runnable {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread Name  :"
					+ Thread.currentThread().getName());
		}
	}
}

public class UserInterface {
	public static void main(String args[]) {
		MyThread m1 = new MyThread();
		Thread t = new Thread(m1);
		t.start();
	}
}
