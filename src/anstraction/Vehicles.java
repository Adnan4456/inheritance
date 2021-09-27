package anstraction;

abstract class Vehicle {
    abstract void start();
}
class Car extends Vehicle{

    @Override
    void start() {
        System.out.println("Car has started...");
    }
}
class Scooter extends Vehicle{

    @Override
    void start() {
        System.out.println("Scooter has started...");
    }

    public static void main(String[] args) {

        Car c = new Car();
        c.start();

        Scooter scooter = new Scooter();
        scooter.start();

    }
}