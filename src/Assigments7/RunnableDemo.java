package Assigments7;

//Creating thread class by implementing Runnable interface
class MyThread implements Runnable {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread Name  :"
					+ Thread.currentThread().getName());
		}
	}
}

public class RunnableDemo {
	public static void main(String args[]) {
		MyThread m1 = new MyThread();
		Thread t = new Thread(m1);
                t.setName("Zoho-Thread");
		t.start();
                
                MyThread m2 = new MyThread();
		Thread t1 = new Thread(m2);
                t1.setName("Mark-Thread");
		t1.start();
	}
}
