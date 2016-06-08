package Assigments7;
// Creating thread class by extending Thread class
class MyThreads extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(this.getName() + " is executing.");
			System.out.println("The value of i = " + i);
		}
	}
}

public class ThreadDemo {
	public static void main(String args[]) {
		MyThreads t1 = new MyThreads();
		t1.start();
		MyThreads t2 = new MyThreads();
		t2.start();
	}
}