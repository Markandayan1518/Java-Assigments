package Assigments5;

public class OverloadTester {
	public int add(int a, int b){
		int sum = a + b;
		return sum;
	}
	public double add(double a, double b){
		double sum = a + b;
		return sum;
	}
	public static void main(String args[]){
		OverloadTester tester = new OverloadTester();
		System.out.println("Addition of two Integers "
				+tester.add(10, 20));
		System.out.println("Addition of two double values "
				+ tester.add(20.0, 30.0));
	}
}


