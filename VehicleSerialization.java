package co3;

import java.io.*;
import java.util.*;

class Vehicle implements Serializable {
    private static final long serialVersionUID = 1L;
    int vehicleId;
    String model;
    double rate;

    Vehicle(int vehicleId, String model, double rate) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Vehicle ID: " + vehicleId + ", Model: " + model + ", Rate: $" + rate;
    }
}

public class VehicleSerialization {
    public static void main(String[] args) {
        List<Vehicle> vehicles = Arrays.asList(
                new Vehicle(101, "Honda City", 2500),
                new Vehicle(102, "Hyundai i20", 1800)
        );

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("vehicles.dat"))) {
            oos.writeObject(vehicles);
            System.out.println("✅ Vehicles serialized to vehicles.dat successfully!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

