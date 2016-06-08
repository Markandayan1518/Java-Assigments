package Assigments5.InterfaceTest;

interface Vehicle {

    void start();

    void stop();
}

class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car is started");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopped");
    }
}

class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bike is started");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopped");
    }
}

public class InterfaceTester {

    public static void main(String args[]) {
        Vehicle vehicle = new Car();
        vehicle.start();
        vehicle.stop();
        vehicle = new Bike();
        vehicle.start();
        vehicle.stop();
        
    }
}
