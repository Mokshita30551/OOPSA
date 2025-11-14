// VehicleExample.java
interface Vehicle {
    void move();  // abstract method (by default public & abstract)
}

// Car class implementing Vehicle
class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("Car is moving on four wheels 🚗");
    }
}

// Bike class implementing Vehicle
class Bike implements Vehicle {
    @Override
    public void move() {
        System.out.println("Bike is moving on two wheels 🏍️");
    }
}

// Main class demonstrating polymorphism
public class VehicleExample {
    public static void main(String[] args) {
        // Create objects
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        // Store them in an array of Vehicle references
        Vehicle[] vehicles = { car, bike };

        System.out.println("=== Vehicle Movement Demonstration ===");
        // Loop through and invoke move() on each
        for (Vehicle v : vehicles) {
            v.move();  // Runtime polymorphism
        }
    }
}
