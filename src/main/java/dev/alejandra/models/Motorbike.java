package dev.alejandra.models;

public class Motorbike extends Vehicle {
 
    public Motorbike(String brand, String licensePlate) {
        super(brand, licensePlate);
    }

    @Override
    public double calculateToll() {
        return 50.00;
    }
}
