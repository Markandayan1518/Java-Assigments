package Assigments5;

abstract class Vehicle {
	private int number;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public abstract void start();
	public abstract void stop();
}

class Car extends Vehicle {
	public void start() {
		System.out.println("Car is started");
		System.out.println("Car Number is " +
				getNumber());
	}

	public void stop() {
		System.out.println("Car is stopped");
		System.out.println("Car Number is " +
				getNumber());
	}
}

class Bike extends Vehicle {
	public void start() {
		System.out.println("Bike is started");
		System.out.println("Bike Number is " +
				getNumber());
	}

	public void stop() {
		System.out.println("Bike is stopped");
		System.out.println("Bike Number is " +
				getNumber());
	}
}

public class AbstractTester {
	public static void main(String args[]) {
		Vehicle vehicle = new Car();
		vehicle.setNumber(1000);
		vehicle.start();
		vehicle.stop();
		System.out.println("\n\n\t**For Bike Object**\n");
		vehicle = new Bike();
		vehicle.setNumber(1001);
		vehicle.start();
		vehicle.stop();
	}
}
